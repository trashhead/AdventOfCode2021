package Day13;

import com.advent.AdventUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Day13 {
    Day13Input day13Input = new Day13Input();

    @Test
    public void part1() {
        List<String> input = day13Input.getInput();
        List<List<String>> lists = prepareData(input);
        AdventUtil.printMatrix(lists, obj -> System.out.print(obj));

        //foldMatrix(lists, day13Input.getFold());


        //List<List<String>> lists1 = splitMatrix(lists, day13Input.getFold().get(0));
        //List<List<String>> lists2 = splitMatrix(lists1, day13Input.getFold().get(1));
        Temp temp = new Temp();
        temp.tempList = lists;

        day13Input.getFold().forEach(f -> {
            temp.tempList = splitMatrix(temp.tempList, f);
        });
        AtomicInteger i = new AtomicInteger();
        /*AdventUtil.matrixMap(lists1, obj -> {
            if(obj.equals("#")){
                i.getAndIncrement();
            }
        });*/

        System.out.println("Count: "+i.get());
    }


    private List<List<String>> splitMatrix(List<List<String>> lists, String f) {
        String[] split = f.split("=");
        if(split[0].equals("x")){
            return splitMatrixX(lists, Integer.parseInt(split[1]));
        }else{
            return splitMatrixY(lists, Integer.parseInt(split[1]));
        }
    }

    private List<List<String>> splitMatrixX(List<List<String>> lists, Integer split) {
        List<List<String>> split1 = new ArrayList<>();
        List<List<String>> split2 = new ArrayList<>();

        for (int i = 0; i < lists.size(); i++) {
            List<String> row = lists.get(i);
            List<String> rowSplit1 = new ArrayList<>();
            List<String> rowSplit2 = new ArrayList<>();
            for (int j = 0; j < row.size(); j++) {
                if(j < split){
                    rowSplit1.add(row.get(j));
                }else if(j > split){
                    rowSplit2.add(row.get(j));
                }
            }
            split1.add(rowSplit1);
            split2.add(rowSplit2);

        }
        //System.out.println("Left");
        //AdventUtil.printMatrix(split1, obj -> System.out.print(obj));
        //System.out.println("---Right");
        //AdventUtil.printMatrix(split2, obj -> System.out.print(obj));
        List<List<String>> mirroredMatrix = new ArrayList<>();

        getEmptyMatrix(mirroredMatrix, split2.get(0).size()-1, split2.size()-1);
        //AdventUtil.printMatrix(mirroredMatrix, obj -> System.out.print(obj));
        //System.out.println("---");
        //AdventUtil.printMatrix(mirroredMatrix, obj -> System.out.print(obj));
        //System.out.println("---");
        for (int i = 0; i < mirroredMatrix.size(); i++) {
            List<String> row = mirroredMatrix.get(i);
            for (int col = 0; col < row.size(); col++) {
                row.set(col, split2.get(i).get(row.size()-1-col));
            }
        }
        //System.out.println("Mirrored");
        //AdventUtil.printMatrix(mirroredMatrix, obj -> System.out.print(obj));
        //System.out.println("---");

        List<List<String>> smallerMatrix;
        List<List<String>> biggerMatrix;

        if(split1.get(0).size() > mirroredMatrix.get(0).size()){
            biggerMatrix = split1;
            smallerMatrix = mirroredMatrix;
        }else{
            biggerMatrix = mirroredMatrix;
            smallerMatrix = split1;
        }


        for (int i = 0; i < biggerMatrix.size(); i++) {
            List<String> smallRow = smallerMatrix.get(i);
            List<String> bigRow = biggerMatrix.get(i);
            for (int col = 0; col < smallRow.size(); col++) {
                if(smallRow.get(col).equals("#")) {
                    bigRow.set(bigRow.size()-smallRow.size()+col, smallRow.get(col));
                }
            }
        }
        System.out.println("---");
        AdventUtil.printMatrix(biggerMatrix, obj -> System.out.print(obj));

        return biggerMatrix;
    }

    private List<List<String>> splitMatrixY(List<List<String>> lists, Integer split) {
        List<List<String>> split1 = new ArrayList<>();
        List<List<String>> split2 = new ArrayList<>();

        for (int i = 0; i < lists.size(); i++) {
            if(i < split){
                split1.add(lists.get(i));
            }else if(i > split){
                split2.add(lists.get(i));
            }
        }
        List<List<String>> mirroredMatrix = new ArrayList<>();
        getEmptyMatrix(mirroredMatrix, split2.get(0).size()-1, split2.size()-1);
        //AdventUtil.printMatrix(split2, obj -> System.out.print(obj));
        //System.out.println("---");
       //AdventUtil.printMatrix(mirroredMatrix, obj -> System.out.print(obj));
        //System.out.println("---");
        for (int i = 0; i < mirroredMatrix.size(); i++) {
            List<String> row = mirroredMatrix.get(i);
            for (int col = 0; col < row.size(); col++) {
                row.set(col, split2.get(split2.size()-1-i).get(col));
            }
        }
        //AdventUtil.printMatrix(mirroredMatrix, obj -> System.out.print(obj));
        //System.out.println("---");

        List<List<String>> smallerMatrix;
        List<List<String>> biggerMatrix;

        if(split1.size() > mirroredMatrix.size()){
            biggerMatrix = split1;
            smallerMatrix = mirroredMatrix;
        }else{
            biggerMatrix = mirroredMatrix;
            smallerMatrix = split1;
        }

        /*if(split1.size() > mirroredMatrix.size()) {*/
            for (int i = biggerMatrix.size()-smallerMatrix.size(); i < biggerMatrix.size(); i++) {
                List<String> row = biggerMatrix.get(i);
                for (int col = 0; col < row.size(); col++) {
                    if(smallerMatrix.get(i).get(col).equals("#")) {
                        row.set(col, smallerMatrix.get(i).get(col));
                    }
                }
            }
        System.out.println("---");
            AdventUtil.printMatrix(biggerMatrix, obj -> System.out.print(obj));
        /*}/*else{
            for (int i = split1.size()-mirroredMatrix.size(); i < split1.size(); i++) {
                List<String> row = split1.get(i);
                for (int col = 0; col < row.size(); col++) {
                    row.set(col, mirroredMatrix.get(i).get(col));
                }
            }
        }*/

        return biggerMatrix;
    }

    private List<List<String>> prepareData(List<String> input) {
        List<List<String>> matrix = new ArrayList<>();
        List<Integer> xs = new ArrayList<>();
        List<Integer> ys = new ArrayList<>();
        for (String s : input) {
            List<Integer> row = new ArrayList<>();
            String[] split = s.split(",");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            xs.add(x);
            ys.add(y);
        }

        Integer maxX = Collections.max(xs);
        Integer maxY = Collections.max(ys);

        getEmptyMatrix(matrix, maxX, maxY);

        for (int i = 0; i < xs.size(); i++) {
            int x = xs.get(i);
            int y = ys.get(i);

            matrix.get(y).set(x, "#");
        }

        return matrix;
    }

    private void getEmptyMatrix(List<List<String>> matrix, Integer maxX, Integer maxY) {
        for (int i = 0; i < maxY + 1; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < maxX + 1; j++) {
                row.add(".");
            }
            matrix.add(row);
        }
    }

    private void markInMatrix(List<List<Integer>> matrix, int x, int y) {

    }

    private class Temp {
        List<List<String>> tempList;
    }
}
