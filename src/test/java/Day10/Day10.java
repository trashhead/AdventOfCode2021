package Day10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Day10 {
    Day10Input day10Input = new Day10Input();

    @Test
    public void part1(){
        long sum = 0;
        List<String> input = day10Input.getInput();
        for(int row = 0 ; row< input.size() ; row++){
            List<String> openChars = new ArrayList<>();
            String s = input.get(row);
            for(int col = 0; col < s.length() ; col++) {
                String c = String.valueOf(s.charAt(col));
                if(isOpening(c)){
                    openChars.add(c);
                }else{
                    String lastChar = openChars.get(openChars.size() - 1);
                    if(isCorrectClosingChar(lastChar, c)){
                        openChars.remove(openChars.size()-1);
                    }else{
                        System.out.println("Error on line: "+row);
                        sum+=getValue(c);
                        break;
                    }
                }
            }
        }

        System.out.println("Sum: "+sum);
    }

    @Test
    public void part2(){
        List<String> input = day10Input.getInput();
        List<Long> sumList = new ArrayList<>();
        removeCorruptRows(input);

        for(int row = 0 ; row< input.size() ; row++) {
            List<String> openChars = new ArrayList<>();
            String s = input.get(row);
            for (int col = 0; col < s.length(); col++) {
                String c = String.valueOf(s.charAt(col));
                if(isOpening(c)){
                    openChars.add(c);
                }else{
                    String lastChar = openChars.get(openChars.size() - 1);
                    if(isCorrectClosingChar(lastChar, c)){
                        openChars.remove(openChars.size()-1);
                    }
                }
            }
            long sum = calculateScore(openChars);
            sumList.add(sum);
            //System.out.println("OpenChars: "+openChars);
        }

        System.out.println(sumList);
        List<Long> listWithoutDuplicates = new ArrayList<>(
                new HashSet<>(sumList));
        Collections.sort(listWithoutDuplicates);
        System.out.println("Middle: "+ listWithoutDuplicates.get(listWithoutDuplicates.size()/2));

    }

    private long calculateScore(List<String> openChars) {
        Collections.reverse(openChars);
        long value = 0;
        for(int i = 0 ; i < openChars.size() ; i++){
            String s = openChars.get(i);
            String closingChar = getClosingChar(s);
            value = value*5;
            value+=getPart2Value(closingChar);
        }

        return value;
    }

    private void removeCorruptRows(List<String> input) {
        List<Integer> brokenRows = new ArrayList<>();
        for(int row = 0 ; row< input.size() ; row++){
            List<String> openChars = new ArrayList<>();
            String s = input.get(row);
            for(int col = 0; col < s.length() ; col++) {
                String c = String.valueOf(s.charAt(col));
                if(isOpening(c)){
                    openChars.add(c);
                }else{
                    String lastChar = openChars.get(openChars.size() - 1);
                    if(isCorrectClosingChar(lastChar, c)){
                        openChars.remove(openChars.size()-1);
                    }else{
                        //System.out.println("Error on line: "+row);
                        brokenRows.add(row);
                        break;
                    }
                }
            }
        }
        Collections.reverse(brokenRows);
        for(int b:brokenRows){
            input.remove(b);
        }
    }


    private boolean isOpening(String c){
        if(c.equals("{") || c.equals("<") || c.equals("(") || c.equals("[")){
            return true;
        }else{
            return false;
        }
    }

    private boolean isCorrectClosingChar(String openingChar, String closingChar){
        if(openingChar.equals("{") && closingChar.equals("}")){
            return true;
        }else if(openingChar.equals("(") && closingChar.equals(")")){
            return true;
        }else if(openingChar.equals("[") && closingChar.equals("]")){
            return true;
        }else if(openingChar.equals("<") && closingChar.equals(">")){
            return true;
        }else{
            return false;
        }
    }

    private int getPart2Value(String c){
        if(c.equals(")")){
            return 1;
        }else if (c.equals("]")) {
            return 2;
        }else if (c.equals("}")) {
            return 3;
        }else if (c.equals(">")) {
            return 4;
        }
        System.out.println("ERROR");
        return 0;
    }

    private String getClosingChar(String c){
        if(c.equals("(")){
            return ")";
        }else if (c.equals("[")) {
            return "]";
        }else if (c.equals("{")) {
            return "}";
        }else if (c.equals("<")) {
            return ">";
        }

        return null;
    }

    private int getValue(String c){
        if(c.equals(")")){
            return 3;
        }else if (c.equals("]")) {
            return 57;
        }else if (c.equals("}")) {
            return 1197;
        }else if (c.equals(">")) {
            return 25137;
        }
        System.out.println("ERROR");
        return 0;
    }
}
