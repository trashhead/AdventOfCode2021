import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Day5 {

    private Day5DemoInput day5DemoInput = new Day5DemoInput();

    @Test
    public void part1() {
        SingleCoord largestXandY = findLargestXandY(day5DemoInput.coords);
        System.out.println(new Gson().toJson(largestXandY));
        List<List<Integer>> emptyCoordMap = getEmptyCoordMap(largestXandY);
        printMap(emptyCoordMap);
        drawInMap(day5DemoInput.coords, emptyCoordMap);
        printMap(emptyCoordMap);
        int overlaps = calculateNrOverlaps(emptyCoordMap);
        System.out.println("Result: "+overlaps);
    }

    private int calculateNrOverlaps(List<List<Integer>> emptyCoordMap) {
        int overlaps = 0;
        for (List<Integer> c : emptyCoordMap) {
            for (int i : c) {
                if (i >= 2) {
                    overlaps++;
                }
            }
        }
        return overlaps;
    }

    private void drawInMap(List<Day5DemoInput.Coord> coords, List<List<Integer>> emptyCoordMap) {
        for (Day5DemoInput.Coord c : coords) {
            if (c.x1 == c.x2 || c.y1 == c.y2) {
                drawHorizonlVerticalLines(c, emptyCoordMap);
            }
        }
    }

    private void drawHorizonlVerticalLines(Day5DemoInput.Coord c, List<List<Integer>> emptyCoordMap) {
        System.out.println("Coord: " + new Gson().toJson(c));
        List<SingleCoord> lineCoords = new ArrayList<>();
        if (c.x1 == c.x2) {//vertikal
            lineCoords.add(new SingleCoord(c.x1, c.y1));
            int diff = Math.abs(c.y1 - c.y2);
            if (c.y1 < c.y2) {//Nedåt
                for (int i = 0; i < diff; i++) {
                    lineCoords.add(new SingleCoord(c.x1, c.y1 + (i + 1)));
                }
            } else {//Uppåt
                for (int i = 0; i < diff; i++) {
                    lineCoords.add(new SingleCoord(c.x1, c.y1 - (i + 1)));
                }
            }
        } else {//horizontell
            lineCoords.add(new SingleCoord(c.x1, c.y1));
            int diff = Math.abs(c.x1 - c.x2);
            if (c.x1 < c.x2) {//Höger
                for (int i = 0; i < diff; i++) {
                    lineCoords.add(new SingleCoord(c.x1 + (i + 1), c.y1));
                }
            } else {//Vänster
                for (int i = 0; i < diff; i++) {
                    lineCoords.add(new SingleCoord(c.x1 - (i + 1), c.y1));
                }
            }
        }
        System.out.println("Line: " + new Gson().toJson(lineCoords));
        for (SingleCoord sc : lineCoords) {
            List<Integer> row = emptyCoordMap.get(sc.y);
            row.set(sc.x, row.get(sc.x) + 1);
        }

    }

    private void printMap(List<List<Integer>> emptyCoordMap) {
        for (List<Integer> e : emptyCoordMap) {
            System.out.println(new Gson().toJson(e));
        }
    }

    private List<List<Integer>> getEmptyCoordMap(SingleCoord largestCoord) {
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i <= largestCoord.y; i++) {
            List<Integer> cols = new ArrayList<>();
            for (int j = 0; j <= largestCoord.x; j++) {
                cols.add(0);
            }
            rows.add(cols);
        }
        return rows;
    }

    private SingleCoord findLargestXandY(List<Day5DemoInput.Coord> coords) {
        int largestY = 0;
        int largestX = 0;

        for (Day5DemoInput.Coord c : coords) {
            if (c.x1 > largestX) {
                largestX = c.x1;
            }
            if (c.x2 > largestX) {
                largestX = c.x2;
            }
            if (c.y1 > largestY) {
                largestY = c.y1;
            }
            if (c.y2 > largestY) {
                largestY = c.y2;
            }
        }
        return new SingleCoord(largestX, largestY);
    }


    @Test
    public void part2() {
        //Day5DemoInput.Coord coord = new Day5DemoInput.Coord(1,1 , 3,3);
        Day5DemoInput.Coord coord = new Day5DemoInput.Coord(9,7 ,7,9);
        //y=kx+m


        SingleCoord largestXandY = findLargestXandY(day5DemoInput.coords);
        System.out.println(new Gson().toJson(largestXandY));
        List<List<Integer>> emptyCoordMap = getEmptyCoordMap(largestXandY);
        printMap(emptyCoordMap);
        drawAllInMap(day5DemoInput.coords, emptyCoordMap);
        printMap(emptyCoordMap);
        int overlaps = calculateNrOverlaps(emptyCoordMap);
        System.out.println("Result: "+overlaps);
    }

    private void drawAllInMap(List<Day5DemoInput.Coord> coords, List<List<Integer>> emptyCoordMap) {
        for (Day5DemoInput.Coord c : coords) {
            //if (c.x1 == c.x2 || c.y1 == c.y2) {
                drawAllLines(c, emptyCoordMap);
            //}
        }
    }

    private void drawAllLines(Day5DemoInput.Coord c, List<List<Integer>> emptyCoordMap) {
        System.out.println("Coord: " + new Gson().toJson(c));
        List<SingleCoord> lineCoords = new ArrayList<>();
        if (c.x1 == c.x2) {//vertikal
            lineCoords.add(new SingleCoord(c.x1, c.y1));
            int diff = Math.abs(c.y1 - c.y2);
            if (c.y1 < c.y2) {//Nedåt
                for (int i = 0; i < diff; i++) {
                    lineCoords.add(new SingleCoord(c.x1, c.y1 + (i + 1)));
                }
            } else {//Uppåt
                for (int i = 0; i < diff; i++) {
                    lineCoords.add(new SingleCoord(c.x1, c.y1 - (i + 1)));
                }
            }
        } else {//horizontell
            int m = (c.y2-c.y1)/(c.x2-c.x1);
            int b = c.y1-m*c.x1;

            for(int x = Math.min(c.x1, c.x2) ; x <= Math.max(c.x1, c.x2) ; x++){
                //System.out.println("x: "+x+ ", y: "+(m*x+b));
                lineCoords.add(new SingleCoord(x, (m*x+b)));
            }
        }
        System.out.println("Line: " + new Gson().toJson(lineCoords));
        for (SingleCoord sc : lineCoords) {
            List<Integer> row = emptyCoordMap.get(sc.y);
            row.set(sc.x, row.get(sc.x) + 1);
        }

    }

    private class SingleCoord {
        public final int x;
        public final int y;

        public SingleCoord(int x, int y) {

            this.x = x;
            this.y = y;
        }
    }
}