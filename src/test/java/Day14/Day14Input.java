package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day14Input {
    private String template = "NNCB";
    private String templateReal = "SHHNCOPHONHFBVNKCFFC";
    private List<String> input = new ArrayList<>(Arrays.asList("CH", "B","HH", "N","CB", "H","NH", "C","HB", "C","HC", "B","HN", "C","NN", "C","BH", "H","NC", "B","NB", "B","BN", "B","BB", "N","BC", "B","CC", "N","CN", "C"));
    private List<String> inputReal = new ArrayList<>(Arrays.asList("HH", "K","PS", "P","BV", "H","HB", "H","CK", "F","FN", "B","PV", "S","KK", "F","OF", "C","SF", "B","KB", "S","HO", "O","NH", "N","ON", "V","VF", "K","VP", "K","PH", "K","FF", "V","OV", "N","BO", "K","PO", "S","CH", "N","FO", "V","FB", "H","FV", "N","FK", "S","VC", "V","CP", "K","CO", "K","SV", "N","PP", "B","BS", "P","VS", "C","HV", "H","NN", "F","NK", "C","PC", "V","HS", "S","FS", "S","OB", "S","VV", "N","VO", "P","KV", "F","SK", "O","BC", "P","BP", "F","NS", "P","SN", "S","NC", "N","FC", "V","CN", "S","OK", "B","SC", "N","HN", "B","HP", "B","KP", "B","CB", "K","KF", "C","OS", "B","BH", "O","PN", "K","VN", "O","KH", "F","BF", "H","HF", "K","HC", "P","NP", "H","KO", "K","CF", "H","BK", "O","OH", "P","SO", "F","BB", "F","VB", "K","SP", "O","SH", "O","PK", "O","HK", "P","CC", "V","NB", "O","NV", "F","OO", "F","VK", "V","FH", "H","SS", "C","NO", "P","CS", "H","BN", "V","FP", "N","OP", "N","PB", "P","OC", "O","SB", "V","VH", "O","KS", "B","PF", "N","KN", "H","NF", "N","CV", "K","KC", "B"));

    public List<String> getInput() {
        return input;
    }
    public String getTemplate() {
        return template;
    }
}
