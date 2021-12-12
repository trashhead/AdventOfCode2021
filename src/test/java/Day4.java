import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Day4 {
    //List<Integer> numbers = Arrays.asList(7, 4, 9, 5, 11, 17, 23, 2, 0, 14, 21, 24, 10, 16, 13, 6, 15, 25, 12, 22, 18, 20, 8, 19, 3, 26, 1);
    Day4Input day4Input = new Day4Input();
    List<Integer> numbers =day4Input.getNumbers();
    List<List<Integer>> rows = day4Input.getRows();

    private Board prepareBoards() {
        Board board = new Board();
        Grid grid = new Grid();
        for (int i = 0; i < this.rows.size(); i++) {

            grid.addRow(rows.get(i));
            if (i != 0 && (i + 1) % 5 == 0) {
                board.addGrid(grid);
                grid = new Grid();

            }
        }
        return board;
    }

    @Test
    public void part1() {
        Board board = prepareBoards();
        for (Integer n : numbers) {
            for (Grid grid : board.grids) {
                for (int j = 0; j < 5; j++) {
                    List<Integer> row = grid.matrix.get(j);
                    for (int i = 0; i < 5; i++) {
                        Integer m = row.get(i);
                        if (n.intValue() == m.intValue()) {
                            grid.checked.get(j).set(i, Boolean.TRUE);
                            if (checkIfBingo(grid)) {
                                System.out.println("BINGO!");
                                int sum = 0;
                                for (int k = 0; k < 5; k++) {
                                    List<Boolean> booleans = grid.checked.get(k);
                                    for (int l = 0; l < 5; l++) {
                                        if (booleans.get(l).booleanValue() == false) {
                                            sum += grid.matrix.get(k).get(l);
                                        }
                                    }
                                }
                                System.out.println("Sum: " + sum);
                                System.out.println("Result: " + (sum * n));
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean checkIfBingo(Grid grid) {
        for (int i = 0; i < 5; i++) {
            List<Boolean> booleans = grid.checked.get(i);
            if (grid.checked.get(i).indexOf(Boolean.FALSE) == -1) {
                return true;
            }
        }

            for (int j = 0; j < 5; j++) {
                if (grid.checked.get(0).get(j) == Boolean.TRUE &&
                        grid.checked.get(1).get(j) == Boolean.TRUE &&
                        grid.checked.get(2).get(j) == Boolean.TRUE &&
                        grid.checked.get(3).get(j) == Boolean.TRUE &&
                        grid.checked.get(4).get(j) == Boolean.TRUE) {
                    return true;
                }

        }
        return false;
    }

    @Test
    public void part2() {
        Board board = prepareBoards();
        Grid lastGridToScore = null;
        for (Integer n : numbers) {
            for (Grid grid : board.grids) {
                for (int j = 0; j < 5; j++) {
                    List<Integer> row = grid.matrix.get(j);
                    for (int i = 0; i < 5; i++) {
                        Integer m = row.get(i);
                        if (n.intValue() == m.intValue()) {
                            grid.checked.get(j).set(i, Boolean.TRUE);
                            if (checkIfBingo(grid)) {
                                System.out.println("BINGO!");
                                int sum = 0;
                                for (int k = 0; k < 5; k++) {
                                    List<Boolean> booleans = grid.checked.get(k);
                                    for (int l = 0; l < 5; l++) {
                                        if (booleans.get(l).booleanValue() == false) {
                                            sum += grid.matrix.get(k).get(l);
                                        }
                                    }
                                }
                                if(!grid.hasBingo) {
                                    System.out.println("Sum: " + sum);
                                    System.out.println("Result: " + (sum * n));
                                }
                                grid.hasBingo = true;

                            }
                        }
                    }
                }
            }
        }

    }

    private class Grid {
        boolean hasBingo = false;
        private List<List<Integer>> matrix = new ArrayList<>();
        private List<List<Boolean>> checked = new ArrayList<>();

        public Grid() {

        }

        public void addRow(List<Integer> row) {
            matrix.add(row);
            checked.add(Arrays.asList(false, false, false, false, false));
        }
    }

    private class Board {
        List<Grid> grids = new ArrayList<>();

        public void addGrid(Grid grid) {
            grids.add(grid);
        }
    }
}