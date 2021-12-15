package Day14;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Day14 {
    Day14Input day14Input = new Day14Input();

    @Test
    public void part1() {
        List<String> rules = day14Input.getInput();
        String template = day14Input.getTemplate();

        //List<String> pairs = findPairs(template);

        for (int i = 0; i < 10; i++) {
            String newPairs = "";
            List<String> pairs = findPairs(template);
            for (int i1 = 0; i1 < pairs.size(); i1++) {
                String pair = pairs.get(i1);
                String rule = findRule(pair, rules);
                newPairs += pair.charAt(0) + rule;
                if (i1 == pairs.size() - 1) {
                    newPairs += String.valueOf(pair.charAt(1));
                }
            }

            //System.out.println(newPairs);
            template = newPairs;
        }

        System.out.println(template);

        HashMap<String, Long> map = new HashMap<>();
        for (int i = 0; i < template.length(); i++) {
            String c = String.valueOf(template.charAt(i));
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1l);
            } else {
                map.put(c, 1l);
            }
        }

        System.out.println(map);


        Long max = Collections.max(map.values());
        Long min = Collections.min(map.values());
        System.out.println("Sum: " + (max - min));
    }

    private String findRule(String pair, List<String> rules) {
        for (int i = 0; i < rules.size(); i += 2) {
            if (pair.equals(rules.get(i))) {
                return rules.get(i + 1);
            }
        }

        return null;
    }

    private List<String> findPairs(String template) {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < template.length() - 1; i++) {
            pairs.add(template.substring(i, i + 2));
        }
        return pairs;
    }
}
