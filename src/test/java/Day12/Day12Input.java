package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day12Input {
    private List<String> input0 = new ArrayList<>(Arrays.asList("start-A","start-b","A-c","A-b","b-d","A-end","b-end"));
    private List<String> input1 = new ArrayList<>(Arrays.asList("dc-end","HN-start","start-kj","dc-start","dc-HN","LN-dc","HN-end","kj-sa","kj-HN","kj-dc"));
    private List<String> input2 = new ArrayList<>(Arrays.asList("fs-end","he-DX","fs-he","start-DX","pj-DX","end-zg","zg-sl","zg-pj","pj-he","RW-he","fs-DX","pj-RW","zg-RW","start-pj","he-WI","zg-he","pj-fs","start-RW"));
    private List<String> inputReal = new ArrayList<>(Arrays.asList("yb-start","de-vd","rj-yb","rj-VP","OC-de","MU-de","end-DN","vd-end","WK-vd","rj-de","DN-vd","start-VP","DN-yb","vd-MU","DN-rj","de-VP","yb-OC","start-rj","oa-MU","yb-de","oa-VP","jv-MU","yb-MU","end-OC"));

    public List<String> getInput() {
        return inputReal;
    }
}
