package Day14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Day14Part2 {
    Day14Input day14Input = new Day14Input();

    @Test
    public void part2() {
        List<String> rules = day14Input.getInput();
        String template = day14Input.getTemplate();

        HashMap<String, Long> rulesHash = generateEmptyRuleSet(rules);
        HashMap<String, Long> sumHash = new HashMap<>();

        for (int i = 1; i < rules.size() - 1; i+=2) {
            String rule = rules.get(i);
            sumHash.put(rule, Long.valueOf(template.chars().filter(value -> value == rule.charAt(0)).count()));
        }



        //Populate hash
        List<String> pairs = findPairs(template);
        for (String pair : pairs) {
            rulesHash.put(pair, rulesHash.get(pair)+1);

        }

        for (int i = 0; i < 40; i++) {

            HashMap<String, Long> tempRules = generateEmptyRuleSet(rules);
            rulesHash.forEach((pair, aLong) -> {
                if(aLong != 0) {
                    String rule = findRule(pair, rules);
                    String newPair = pair.charAt(0) + rule + pair.charAt(1);
                    List<String> pairs2 = findPairs(newPair);
                    tempRules.put(pairs2.get(0), tempRules.get(pairs2.get(0)) + aLong);
                    tempRules.put(pairs2.get(1), tempRules.get(pairs2.get(1)) + aLong);
                    rulesHash.put(pair, 0l);

                    sumHash.put(rule, sumHash.get(rule)+1*aLong);

                }
            });

            tempRules.forEach((s, aLong) -> {
                rulesHash.put(s, rulesHash.get(s)+aLong);
            });
            System.out.println(sumHash);

        }

        Long max = Collections.max(sumHash.values());
        Long min = Collections.min(sumHash.values());
        System.out.println("Max: "+max);
        System.out.println("Sum: " + (max - min));
    }

    private HashMap<String, Long> generateEmptyRuleSet(List<String> rules) {
        HashMap<String, Long> rulesHash = new HashMap<>();
        for (int i = 0; i < rules.size() - 1; i+=2) {
            rulesHash.put(rules.get(i), 0l);
        }
        return rulesHash;
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
