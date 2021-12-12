package Day9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day9 {

    Day9Input day9Input = new Day9Input();


    @Test
    public void part1() {
        //List<List<Integer>> lowMap = new ArrayList<>();
        List<Integer> lowpoints = new ArrayList<>();
        for (int rows = 0; rows < day9Input.getInput().size(); rows++) {
            String row = day9Input.getInput().get(rows);
            for (int cols = 0; cols < row.length(); cols++) {
                int current = getPosition(rows, cols);
                List<Integer> adjacent = getAdjacent(rows, cols);
                Integer min = Collections.min(adjacent);
                if (current < min) {
                    System.out.println("Min: " + current);
                    lowpoints.add(current);
                }
            }
        }

        int sum = 0;
        for (int s : lowpoints) {
            sum += (s + 1);
        }
        System.out.println("Sum: " + sum);
    }

    private List<Integer> splitString(String row) {
        List<Integer> ret = new ArrayList<>();
        for (int cols = 0; cols < row.length(); cols++) {
            ret.add(Integer.parseInt(String.valueOf(row.charAt(cols))));
        }

        return ret;
    }

    public List<Integer> getAdjacent(int row, int col) {
        List<Integer> adjacent = new ArrayList<>();

        int current = getPosition(row, col);

        //up
        if (row > 0) {
            adjacent.add(getPosition(row - 1, col));
        }
        //left
        if (col > 0) {
            adjacent.add(getPosition(row, col - 1));
        }

        //right
        if (col < day9Input.getInput().get(0).length() - 1) {
            adjacent.add(getPosition(row, col + 1));
        }

        //down
        if (row < day9Input.getInput().size() - 1) {
            adjacent.add(getPosition(row + 1, col));
        }


        return adjacent;
    }

    public int getPosition(int r, int c) {
        String s = day9Input.getInput().get(r);
        return Integer.parseInt(String.valueOf(s.charAt(c)));
    }


    @Test
    public void part2() {
        List<List<CoordDay9>> map = prepareMap();
List<Integer> size = new ArrayList<>();
        for (int rows = 0; rows < map.size(); rows++) {
            List<CoordDay9> coordDay9s = map.get(rows);

            for (int cols = 0; cols < coordDay9s.size(); cols++) {
                CoordDay9 current = getPositionMap(rows, cols, map);
                int numberOf = getAdjacentMap(rows, cols, map);
                if(numberOf != 0){
                    System.out.println(numberOf);
                    size.add(numberOf);
                }

            }
        }

        List<Integer> threeBiggest = new ArrayList<>();
        Collections.sort(size);
        System.out.println("Result: "+(size.get(size.size()-1)*size.get(size.size()-2)*size.get(size.size()-3)));

    }

    public int getAdjacentMap(int row, int col,  List<List<CoordDay9>> map) {
        List<Integer> adjacent = new ArrayList<>();
        int numberOf = 0;
        CoordDay9 current = getPositionMap(row, col, map);
        if(current.loc == 9){
            return 0;
        }

        if(!current.taken){
            numberOf++;
            current.taken = true;
        }


        //up
        if (row > 0) {
            CoordDay9 up = getPositionMap(row-1, col, map);
            if(!up.taken) {
                numberOf = numberOf + getAdjacentMap(row - 1, col, map);
            }

        }
        //left
        if (col > 0) {
            CoordDay9 left = getPositionMap(row, col-1, map);
            if(!left.taken) {
                numberOf = numberOf + getAdjacentMap(row , col-1, map);
            }
        }

        //right
        if (col < day9Input.getInput().get(0).length() - 1) {
            CoordDay9 right = getPositionMap(row, col+1, map);
            if(!right.taken) {
                numberOf = numberOf + getAdjacentMap(row , col+1, map);
            }
        }

        //down
        if (row < day9Input.getInput().size() - 1) {
            CoordDay9 down = getPositionMap(row+1, col, map);
            if(!down.taken) {
                numberOf = numberOf + getAdjacentMap(row+1 , col, map);
            }
        }


        return numberOf;
    }

    private CoordDay9 getPositionMap(int rows, int cols, List<List<CoordDay9>> map) {
        List<CoordDay9> coordDay9s = map.get(rows);
        return coordDay9s.get(cols);
    }

    private List<List<CoordDay9>> prepareMap() {
        List<List<CoordDay9>> map = new ArrayList<>();
        for (int rows = 0; rows < day9Input.getInput().size(); rows++) {
            List<CoordDay9> mapRow = new ArrayList<>();
            String row = day9Input.getInput().get(rows);
            for (int cols = 0; cols < row.length(); cols++) {
                int current = getPosition(rows, cols);
                mapRow.add(new CoordDay9(current));
            }
            map.add(mapRow);
        }
        return map;
    }

}
