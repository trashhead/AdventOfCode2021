package Day12;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Day12 {
    Day12Input day12Input = new Day12Input();

    @Test
    public void part1(){
        List<Path> paths = preparePart1Data(day12Input.getInput());
        List<Path> startPaths = findStartPaths(paths);

        startPaths.forEach(p->{
            List<Path> possiblePaths = findPossiblePaths(p, paths);
            findPaths(p, paths, p.getStart());
        });

    }

    private String findPaths(Path path, List<Path> possiblePaths, String startToEndPath) {
        possiblePaths.forEach(p->{
            //List<Path> possiblePaths = findPossiblePaths(p, paths);

        });
        return "pooop";
    }

    private List<Path> findPossiblePaths(Path start, List<Path> paths){
        List<Path> possiblePaths = new ArrayList<>();
        paths.forEach(p->{
            if(start.getEnd().equals(p.getStart())){
                possiblePaths.add(p);
            }
        });

        return possiblePaths;
    }

    private List<Path> findStartPaths(List<Path> paths) {
        List<Path> startPaths = new ArrayList<>();
        paths.forEach(p->{
            if(p.getStart().equals("start")){
                startPaths.add(p);
            }
        });

        return startPaths;
    }

    private List<Path> preparePart1Data(List<String> input) {
        List<Path> paths = new ArrayList<>();
        input.forEach(pathStr->{
            String[] startEnd = pathStr.split("-");
            Path path = new Path(startEnd[0], startEnd[1]);
            paths.add(path);
        });

        Path2 startPath = new Path2("start", null);
        List<Path> startPaths = findStartPaths(paths);


        buildCaveMap(paths, startPath);
        /*paths.forEach(p->{
            if(p.getStart().equals("Start")){
                startPath.destinations.add(new Path2)
            }
        });*/

        return paths;
    }

    private void buildCaveMap(List<Path> paths, Path2 startPath) {
        paths.forEach(p->{
            if(p.getStart().equals(startPath.start)){
                if(startPath.parent == null || (startPath.parent != null && !startPath.parent.start.equals(p.getStart()))) {
                    startPath.destinations.add(new Path2(p.getEnd(), startPath));
                }
            }else if(startPath.start.equals(p.getEnd())){
                if(startPath.parent == null || (startPath.parent != null && !startPath.parent.start.equals(p.getEnd()))) {
                    startPath.destinations.add(new Path2(p.getStart(), startPath));
                }

            }
        });

        startPath.destinations.forEach(d->{
            buildCaveMap(paths, d);
        });
    }

    @Data
    private class Path {
        boolean visited = false;
        String start;
        String end;

        public Path(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }


    private class Path2 {
        boolean visited = false;
        String start;
        Path2 parent;
        List<Path2> destinations = new ArrayList<>();

        public Path2(String start, Path2 parent) {
            this.start = start;
            this.parent = parent;
        }
    }
}
