package Day15;


import com.advent.AdventUtil;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Day15Try2 {
    Day15Input day15Input = new Day15Input();

    @Test
    public void part1() {
        List<String> input = day15Input.getInput();
        List<List<Node>> matrix = prepareData2(input);

        Graph graph = new Graph();
        AdventUtil.matrixMap(matrix, node -> {
            List<Node> adjacentInMatrix = AdventUtil.findSimpleAdjacentInMatrix(node.getY(), node.getX(), matrix);
            for (int i = 0; i < adjacentInMatrix.size(); i++) {
                node.addDestination(adjacentInMatrix.get(i), Integer.parseInt(adjacentInMatrix.get(i).getName()));
            }

            graph.addNode(node);
        });

        calculateShortestPathFromSource(graph, matrix.get(0).get(0));

        Node endNode = matrix.get(matrix.size() - 1).get(matrix.get(0).size() - 1);
        System.out.println(endNode.getDistance());
    }

    @Test
    public void part2() {
        List<String> input = day15Input.getInput();
        List<List<Node>> matrix = prepareDataPart2(input);

        Graph graph = new Graph();
        AdventUtil.matrixMap(matrix, node -> {
            List<Node> adjacentInMatrix = AdventUtil.findSimpleAdjacentInMatrix(node.getY(), node.getX(), matrix);
            for (int i = 0; i < adjacentInMatrix.size(); i++) {
                node.addDestination(adjacentInMatrix.get(i), Integer.parseInt(adjacentInMatrix.get(i).getName()));
            }

            graph.addNode(node);
        });

        calculateShortestPathFromSource(graph, matrix.get(0).get(0));

        Node endNode = matrix.get(matrix.size() - 1).get(matrix.get(0).size() - 1);
        System.out.println(endNode.getDistance());

    }

    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode,
                                                 Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    private List<List<Node>> prepareData2(List<String> input) {
        List<List<Node>> matrix = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            String row = input.get(i);
            List<Node> rowList = new ArrayList<>();
            for (int j = 0; j < row.length(); j++) {
                int weight = Integer.parseInt(String.valueOf(row.charAt(j)));
                Node node = new Node(weight + "");
                node.setX(j);
                node.setY(i);
                rowList.add(node);
            }
            matrix.add(rowList);

        }
        return matrix;
    }

    private List<List<Node>> prepareDataPart2(List<String> input) {
        List<String> newInput = new ArrayList<>();

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < input.size(); i++) {
                String stringRow = input.get(i);
                String newString = "";
                for (int col = 0; col < 5; col++) {
                    for (int c = 0; c < stringRow.length(); c++) {
                        int weight = Integer.parseInt(String.valueOf(stringRow.charAt(c)));
                        int newWeight = weight + col+row;
                        if(newWeight > 9){
                            newWeight = newWeight-9;
                        }
                        newString += (newWeight) + "";
                    }
                }
                newInput.add(newString);
            }
        }

        return prepareData2(newInput);
    }


    public class Graph {

        private Set<Node> nodes = new HashSet<>();

        public void addNode(Node nodeA) {
            nodes.add(nodeA);
        }

        public Set<Node> getNodes() {
            return nodes;
        }

        public void setNodes(Set<Node> nodes) {
            this.nodes = nodes;
        }
// getters and setters
    }


    public class Node {
        private int x;
        private int y;
        private String name;

        private List<Node> shortestPath = new LinkedList<>();

        private Integer distance = Integer.MAX_VALUE;

        Map<Node, Integer> adjacentNodes = new HashMap<>();

        public void addDestination(Node destination, int distance) {
            adjacentNodes.put(destination, distance);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Node(String name) {
            this.name = name;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Node> getShortestPath() {
            return shortestPath;
        }

        public void setShortestPath(List<Node> shortestPath) {
            this.shortestPath = shortestPath;
        }

        public Integer getDistance() {
            return distance;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public Map<Node, Integer> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
            this.adjacentNodes = adjacentNodes;
        }
    }
}
