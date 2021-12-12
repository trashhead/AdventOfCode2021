package Day7;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Day7 {

    private Day7Input day7Input = new Day7Input();

    @Test
    public void part1() {
        Collections.sort(day7Input.positions);
        Set<Integer> uniquePositions = new HashSet<>(day7Input.positions);
        int min = day7Input.positions.get(0);
        int max = day7Input.positions.get(day7Input.positions.size()-1);


        HashMap<Integer, Integer> fuelConsumptions = new HashMap<>();
        //Iterator<Integer> uniqueIter = uniquePositions.iterator();
        //while(uniqueIter.hasNext()) {
        for(int j = min ; j < max ; j++) {
            //int currentFuelCalc = uniqueIter.next();
            int currentFuelCalc = j;
            for (int i = 0; i < day7Input.positions.size(); i++) {
                int currentCrab = day7Input.positions.get(i);
                int fuelConsumption = Math.abs(currentCrab - currentFuelCalc);

                if (fuelConsumptions.containsKey(currentFuelCalc)) {
                    fuelConsumptions.put(currentFuelCalc, fuelConsumptions.get(currentFuelCalc) + fuelConsumption);
                } else {
                    fuelConsumptions.put(currentFuelCalc, fuelConsumption);
                }
            }
        }
        //}

        Iterator<Map.Entry<Integer, Integer>> iterator = fuelConsumptions.entrySet().iterator();
        Integer min2 = null;
        while(iterator.hasNext()){
            Integer value = iterator.next().getValue();
            if(min2  == null){
                min2 = value;
            }else{
                if(value < min2){
                    min2 = value;
                }
            }

        }

        System.out.println("FuelConsumptions: "+fuelConsumptions);
        System.out.println("Min: "+min2);
    }




    @Test
    public void part2() {
        Collections.sort(day7Input.positions);
        int min = Collections.min(day7Input.positions);
        int max = Collections.max(day7Input.positions);

        Map<Integer, Integer> fuelConsumptions = new HashMap<>();
        for(int j = min ; j < max ; j++) {
            int currentFuelCalc = j;
            for (int i = 0; i < day7Input.positions.size(); i++) {
                int currentCrab = day7Input.positions.get(i);
                int abs = Math.abs(currentCrab - currentFuelCalc);
                int fuelConsumption = abs*(abs+1)/2;

                if (fuelConsumptions.containsKey(currentFuelCalc)) {
                    fuelConsumptions.put(currentFuelCalc, fuelConsumptions.get(currentFuelCalc) + fuelConsumption);
                } else {
                    fuelConsumptions.put(currentFuelCalc, fuelConsumption);
                }
            }
        }

        System.out.println("FuelConsumptions: "+fuelConsumptions);
        System.out.println("Min: "+Collections.min(fuelConsumptions.values()));
    }
}
