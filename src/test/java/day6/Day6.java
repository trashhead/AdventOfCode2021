package day6;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Day6 {
    private Day6Input day6Input = new Day6Input();

    @Test
    public void part1() {

        for (int days = 0; days < 176; days++) {
            List<Integer> newFishes = new ArrayList();
            for (int i = 0; i < day6Input.list.size(); i++) {
                int timer = day6Input.list.get(i);
                if (timer == 0) {
                    day6Input.list.set(i, 6);
                    newFishes.add(8);
                } else {
                    day6Input.list.set(i, timer - 1);
                }
            }
            //System.out.println("Fishes: "+day6Input.list.size());
            //System.out.println("Days: "+days);
            day6Input.list.addAll(newFishes);
        }

        System.out.println("Count: " + day6Input.list.size());
    }

    @Test
    public void part11() {


        List<Long> agesCount = Arrays.asList(0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l);
        for (int age : day6Input.list) {
            Long count = agesCount.get(age);
            agesCount.set(age, count + 1);
        }

        for (int days = 0; days < 256; days++) {
            List<Long> newFishes = new ArrayList();

            Long countZ = agesCount.get(0);
            Collections.rotate(agesCount, -1);

            agesCount.set(6,agesCount.get(6)+countZ);
        }
        System.out.println("AgesCount: "+agesCount.stream().reduce((a,b)->a+b).get());
    }
}
