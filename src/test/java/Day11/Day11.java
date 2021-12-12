package Day11;

import com.advent.AdventUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Day11 {
    Day11Input day11Input = new Day11Input();

    @Test
    public void part1(){
        List<List<Octupus>> octupuses = prepareData(day11Input.getInput());
        int width = octupuses.get(0).size();
        //flashOctupuses(octupuses);
        printOctupuses(octupuses);
        long totalSum = 0;
        for (int step = 0; step < 100; step++) {
            increaseEnergy(octupuses);

            long sum = flashOctupuses(octupuses);
            totalSum+=sum;
            resetOctupuses(octupuses);
            printOctupuses(octupuses);
        }
        System.out.println("Sum: "+totalSum);
    }

    @Test
    public void part0(){
        List<List<Octupus>> octupuses = prepareData(day11Input.getInput());
        octupuses.forEach(l->{
            l.forEach(o->{
                if(o.getEnergy()==4) {
                    System.out.println("HEJ");
                    return;

                }
            });
        });
        System.out.println("FINISH");
    }

    @Test
    public void part2(){
        List<List<Octupus>> octupuses = prepareData(day11Input.getInput());
        int width = octupuses.get(0).size();
        //flashOctupuses(octupuses);
        printOctupuses(octupuses);
        int count = 0;
        while(count < 1000){
            count++;
            increaseEnergy(octupuses);

            flashOctupuses(octupuses);
            resetOctupuses(octupuses);
            printOctupuses(octupuses);
            boolean found = checkIfAllZeros(octupuses);
            if(found){
                break;
            }

        }
        System.out.println("Count: "+count);
    }

    private boolean checkIfAllZeros(List<List<Octupus>> octupuses) {
        int width = octupuses.get(0).size();
        for (int row = 0; row < octupuses.size(); row++) {
            for (int col = 0; col < width; col++) {
                Octupus octupus = octupuses.get(row).get(col);
                if(octupus.getEnergy() != 0l) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetOctupuses(List<List<Octupus>> octupuses) {
        int width = octupuses.get(0).size();
        for (int row = 0; row < octupuses.size(); row++) {
            for (int col = 0; col < width; col++) {
                Octupus octupus = octupuses.get(row).get(col);
                if(octupus.getEnergy() > 9) {
                    octupus.setEnergy(0);
                    octupus.setHasFlashed(false);
                }
            }
        }
    }

    private void increaseEnergy(List<List<Octupus>> octupuses) {
        octupuses.forEach(l->l.stream().forEach(i->i.setEnergy(i.getEnergy()+1)));
    }

    private void printOctupuses(List<List<Octupus>> octupuses) {
        AdventUtil.printMatrix(octupuses, o-> System.out.print(o.getEnergy()));
    }

    private long flashOctupuses(List<List<Octupus>> octupuses) {
        long flashOccured = 0;
        int width = octupuses.get(0).size();

            for (int row = 0; row < octupuses.size(); row++) {
                for (int col = 0; col < width; col++) {
                    Octupus octupus = octupuses.get(row).get(col);
                    if(octupus.getEnergy() > 9 && !octupus.isHasFlashed()){
                        octupus.setHasFlashed(true);
                        flashOccured++;
                        List<Octupus> adjacentOctupus = AdventUtil.findAdjacentInMatrix(row, col, octupuses);
                        for (int i = 0; i < adjacentOctupus.size(); i++) {
                            Octupus adjacentOcto = adjacentOctupus.get(i);
                            //if(adjacentOcto.getEnergy() != 9){
                                adjacentOcto.setEnergy(adjacentOcto.getEnergy()+1);

                            //}
                        }
//                        octupus.setEnergy(0);
                    }
                }
            }
        long sum = 0;
        if(flashOccured > 0){
            sum = flashOctupuses(octupuses);
        }
        return flashOccured+sum;
    }

    private List<List<Octupus>> prepareData(List<Long> input) {
        List<List<Octupus>> rows = new ArrayList<>();
        for(int i = 0 ; i < input.size() ; i++){
            List<Octupus> cols = new ArrayList<>();
            String r = String.valueOf(input.get(i));
            for(int j = 0 ; j < r.length() ; j++){
                Octupus octupus = new Octupus();
                octupus.setEnergy(Long.valueOf(String.valueOf(r.charAt(j))));
                cols.add(octupus);
            }
            rows.add(cols);
        }

        return rows;
    }
}
