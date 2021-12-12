package Day8;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day8 {
    private Day8Input day8Input = new Day8Input();


    @Test
    public void part1() {
        int count = 0;
        for (int i = 0; i < day8Input.getOutput().size(); i++) {
            List<String> strings = day8Input.getOutput().get(i);
            for (String s : strings) {
                if (s.length() == 2 ||
                        s.length() == 3 ||
                        s.length() == 4 ||
                        s.length() == 7
                ) {
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
    }

    List<String> translation = new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null, null, null));

    @Test
    public void part2() {
        List<List<String>> signalPatterns = day8Input.getSignalPatterns();
        List<List<String>> output = day8Input.getOutput();
        int sum = 0;
        for (int i = 0; i < signalPatterns.size(); i++) {
            getStuff(signalPatterns.get(i));//Fix translations
            //getStuff(new ArrayList(Arrays.asList("acedgfb", "cdfbe", "gcdfa", "fbcad", "dab", "cefabd", "cdfgeb", "eafb", "cagedb", "ab")));
       // System.out.println("------");
            int outputNumbers = getOutputNumbers(output.get(i));
            sum+=outputNumbers;
            // getOutputNumbers(new ArrayList<>(Arrays.asList("cdfeb","fcadb", "cdfeb", "cdbaf")));
        }
        System.out.println("Sum: "+sum);
    }

    private int getOutputNumbers(List<String> strings) {
        String number = "";
        for (int i = 0; i < strings.size(); i++) {
            String out = strings.get(i);
            for (int j = 0; j < translation.size(); j++) {
                String trans = translation.get(j);
                if(trans.length() == out.length()) {
                    boolean found = true;
                    for (int k = 0; k < trans.length(); k++) {
                        if (!out.contains(String.valueOf(trans.charAt(k)))) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        number+=j;
                        break;
                    }
                }
            }
        }
        System.out.println(number);
        return Integer.parseInt(number);
    }


    private void getStuff(List<String> signalsOrig) {
        List<String> signals = new ArrayList<>(signalsOrig);
        find1(signals);
        find4(signals);
        find7(signals);
        find8(signals);
        find9(signals);
        find6(signals);
        find0(signals);
        find3(signals);

        find2(signals);

        /*for (int i = 0; i < translation.size(); i++) {
            System.out.println(translation.get(i) + ": " + i);
        }*/
        String deb = "";
    }

    private void find2(List<String> signals) {
        String signal4 = translation.get(4);
        for (String s : signals) {
            int countWrongs = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!signal4.contains(String.valueOf(s.charAt(i)))) {
                    countWrongs++;
                }
                /*if (!s.contains(String.valueOf(signal1.charAt(i)))) {
                    found = false;
                    break;
                }*/
            }
            if (countWrongs == 2) {
                translation.set(5, s);
            } else if (countWrongs == 3) {
                translation.set(2, s);
            }
            //System.out.println("Wrongs: " + countWrongs);
            /*if(found){
                translation.set(3, s);
                signals.remove(s);
                return;
            }*/
        }

    }

    private void find3(List<String> signals) {
        String signal1 = translation.get(1);
        for (String s : signals) {
            boolean found = true;
            for (int i = 0; i < signal1.length(); i++) {
                if (!s.contains(String.valueOf(signal1.charAt(i)))) {
                    found = false;
                    break;
                }
            }
            if (found) {
                translation.set(3, s);
                signals.remove(s);
                return;
            }
        }
    }

    private void find0(List<String> signals) {
        for (String s : signals) {
            if (s.length() == 6) {
                translation.set(0, s);
                signals.remove(s);
                return;
            }
        }
    }

    private void find6(List<String> signals) {
        String signal1 = translation.get(1);
        for (String s : signals) {
            if (s.length() == 6) {
                boolean found = true;
                for (int i = 0; i < signal1.length(); i++) {
                    if (!s.contains(String.valueOf(signal1.charAt(i)))) {
                        translation.set(6, s);
                        signals.remove(s);
                        return;
                    }
                }
            }
        }
    }

    private void find9(List<String> signals) {
        String signal4 = translation.get(4);

        for (String s : signals) {
            if (s.length() == 6) {
                boolean found9 = true;
                for (int i = 0; i < signal4.length(); i++) {
                    if (!s.contains(String.valueOf(signal4.charAt(i)))) {
                        found9 = false;
                        break;
                    }
                }
                if (found9) {
                    translation.set(9, s);
                    signals.remove(s);
                    return;
                }
            }
        }
    }

    private void find8(List<String> signals) {
        for (String s : signals) {
            if (s.length() == 7) {
                translation.set(8, s);
                signals.remove(s);
                break;
            }
        }
    }

    private void find7(List<String> signals) {
        for (String s : signals) {
            if (s.length() == 3) {
                translation.set(7, s);
                signals.remove(s);
                break;
            }
        }
    }

    private void find4(List<String> signals) {
        for (String s : signals) {
            if (s.length() == 4) {
                translation.set(4, s);
                signals.remove(s);
                break;
            }
        }
    }

    private void find1(List<String> signals) {
        for (String s : signals) {
            if (s.length() == 2) {
                translation.set(1, s);
                signals.remove(s);
                break;
            }
        }
    }

    private String getSignal(List<String> signals, int number) {
        for (String signal : signals) {
            if (signal.length() == number) {
                return signal;
            }
        }
        return null;
    }

}
