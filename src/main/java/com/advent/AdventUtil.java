package com.advent;

import java.util.ArrayList;
import java.util.List;
/*
* Rotate matrix
* split matrix
* flip matrix
* parse matrix, int and string
*
*
* */
public class AdventUtil {
    public static <T> List<T> findAdjacentInMatrix(int row, int col, List<List<T>> matrix) {
        List<T> adjacent = new ArrayList<T>();
        int width = matrix.get(0).size();
        if(row > 0){//up
            adjacent.add(matrix.get(row-1).get(col));
        }
        if(col < width-1){//right
            adjacent.add(matrix.get(row).get(col+1));
        }
        if(row < matrix.size()-1){//down
            adjacent.add(matrix.get(row+1).get(col));
        }
        if(col> 0){//left
            adjacent.add(matrix.get(row).get(col-1));
        }
        if(row > 0 && col > 0){//topleft
            adjacent.add(matrix.get(row-1).get(col-1));
        }
        if(col < width-1 && row > 0){//topright
            adjacent.add(matrix.get(row-1).get(col+1));
        }
        if(row < matrix.size()-1 && col < width-1){//bottomright
            adjacent.add(matrix.get(row+1).get(col+1));
        }
        if(row < matrix.size()-1 && col> 0){//bottomleft
            adjacent.add(matrix.get(row+1).get(col-1));
        }

        return adjacent;
    }

    public static <T> List<T> findSimpleAdjacentInMatrix(int row, int col, List<List<T>> matrix) {
        List<T> adjacent = new ArrayList<T>();
        int width = matrix.get(0).size();
        if(row > 0){//up
            adjacent.add(matrix.get(row-1).get(col));
        }
        if(col < width-1){//right
            adjacent.add(matrix.get(row).get(col+1));
        }
        if(row < matrix.size()-1){//down
            adjacent.add(matrix.get(row+1).get(col));
        }
        if(col> 0){//left
            adjacent.add(matrix.get(row).get(col-1));
        }

        return adjacent;
    }

    public static <T> void printMatrix(List<List<T>> matrix, OnColCallback<T> colCallback){
        matrix.forEach(r->{
            r.forEach(o-> colCallback.onColCallback(o));
            System.out.println();
        });
        System.out.println();
    }

    public static <T> void printMatrix(List<List<T>> matrix){
        matrix.forEach(r->{
            r.forEach(o-> System.out.print(o));
            System.out.println();
        });
        System.out.println();
    }

    public static <T> void matrixMap(List<List<T>> matrix, OnColCallback<T> colCallback){
        matrix.forEach(l->{
            l.forEach(t -> colCallback.onColCallback(t));
        });
    }
    public static <T> void matrixMap(List<List<T>> matrix, OnColCallbackWithCoords<T> colCallback){
        for (int y = 0; y < matrix.size(); y++) {
            List<T> ts = matrix.get(y);
            for (int x = 0; x < ts.size(); x++) {
                T t = ts.get(x);
                colCallback.onColCallback(x, y, t);
            }
        }
    }
}
