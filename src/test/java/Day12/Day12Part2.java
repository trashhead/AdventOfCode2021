package Day12;

import com.advent.AdventUtil;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Day12Part2 {
    Day12Input day12Input = new Day12Input();

    @Test
    public void part1() {
        Path2 startPath = getStartPath(day12Input.getInput());


        List<List<Path2>> allPaths = new ArrayList<>();
        for (Path2 destination : startPath.destinations) {
            List<Path2> trail = new ArrayList<>();
            trail.add(startPath);
            List<List<Path2>> end = findEnd(destination, trail);
            allPaths.addAll(end);
        }

        System.out.println("Count: "+allPaths.size());
        /*AdventUtil.printMatrix(allPaths, obj -> {
            System.out.print(obj.caveName + ",");
        });*/

        //long sum = findEnd(startPath);

    }

    private List<List<Path2>> findEnd(Path2 startPath, List<Path2> originalTrail) {
        List<Path2> trail = new ArrayList<>(originalTrail);
        List<List<Path2>> trailsThatEnd = new ArrayList<>();
        if (startPath.caveName.equals(startPath.caveName.toLowerCase())) {//Is lower case
            Path2 path2InList = findPath2InList(trail, startPath.caveName);
            if (path2InList == null) {
                trail.add(startPath);
            } else {
                if(!findHashInTrail(trail) && !startPath.caveName.equals("start")){
                    Path2 newPath = new Path2(startPath.caveName+"#");
                    newPath.destinations = startPath.destinations;
                    trail.add(newPath);
                }else {
                    return new ArrayList<>();
                }
            }
        } else {
            trail.add(startPath);
        }

        if (startPath.caveName.equals("end")) {
            trailsThatEnd.add(trail);
        } else {
            for (Path2 destination : startPath.destinations) {
            /*List<List<Path2>> trails = new ArrayList<>();
            trails.addAll(Arrays.asList(trail));*/
                List<List<Path2>> destTrail = findEnd(destination, trail);
                //if(destTrail.get(destTrail.size()-1).caveName.equals("end")){
                trailsThatEnd.addAll(destTrail);
                //}
            }
        }
        return trailsThatEnd;
    }

    private boolean findHashInTrail(List<Path2> trails){
        for (Path2 trail : trails) {
            if(trail.caveName.contains("#")){
                return true;
            }
        }
        return false;
    }

    private Path2 getStartPath(List<String> input) {
        List<String> uniqueDestinations = new ArrayList<>();
        List<Path> paths = new ArrayList<>();
        input.forEach(pathStr -> {
            String[] startEnd = pathStr.split("-");
            uniqueDestinations.add(startEnd[0]);
            uniqueDestinations.add(startEnd[1]);
            paths.add(new Path(startEnd[0], startEnd[1]));
        });

        List<String> uniqueDestinations2 = new ArrayList<>(new HashSet<>(uniqueDestinations));
        List<Path2> collectUD = uniqueDestinations2.stream().map(ud -> new Path2(ud)).collect(Collectors.toList());

        collectUD.forEach(ud -> {
            paths.forEach(p -> {
                if (p.start.equals(ud.caveName)) {
                    ud.addDestination(findPath2InList(collectUD, p.end));
                } else if (p.end.equals(ud.caveName) && !p.start.equals("start")) {
                    ud.addDestination(findPath2InList(collectUD, p.start));
                }
            });
        });

        return findPath2InList(collectUD, "start");
    }

    private Path2 findPath2InList(List<Path2> paths, String destinationName) {
        for (Path2 path : paths) {
            if (path.caveName.equals(destinationName)) {
                return path;
            }
        }
        return null;
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
        String caveName;
        //Path2 parent;
        List<Path2> destinations = new ArrayList<>();

        public Path2(String caveName/*, Path2 parent*/) {
            this.caveName = caveName;
            /*this.parent = parent;*/
        }

        public void addDestination(Path2 dest) {
            boolean found = false;
            for (Path2 destination : destinations) {
                if (destination.caveName.equals(dest.caveName)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                destinations.add(dest);
            }
        }
    }
}
