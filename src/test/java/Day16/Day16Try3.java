package Day16;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Day16Try3 {
    Day16Input day16Input = new Day16Input();
    boolean first = true;

    @Test
    public void part1() {
        String input = day16Input.getInput();
        String bin = hexToBin(input);
        System.out.println(bin);

        parsePacket(bin);

        System.out.println("Sum: "+versionSum);
    }

    @Test
    public void subpacket1(){
        parsePacket("11010001010");
    }

    @Test
    public void subpacket2(){
        parsePacket("001010100000000001101010000000000000101111010001111000");
    }
    @Test
    public void subpacket3(){
        parsePacket("101010000000000000101111010001111000");
    }

    @Test
    public void firstSubPacketEndOperator2(){
        parsePacket("000000000000000001011000010001010101100010");
    }

    @Test
    public void firstLiteralOchFirstSubPacketEndOperator2(){
        parsePacket("00101100010");
    }

    private long versionSum = 0;

    private void parsePacket(String bin) {
        String version = bin.substring(0,3);
        String type = bin.substring(3, 3+3);
        int versionInt = binToDec(version);
        int typeInt = binToDec(type);
        bin = bin.substring(6);

        versionSum+=versionInt;

        System.out.println("Version: "+version+", Type: "+type);
        System.out.println("Version: "+versionInt+", Type: "+typeInt);

        if(typeInt == 4){
            parseLiteral(version, type, bin);
        }else{
            parseOperator(version, type, bin);
        }

    }

    private void parseOperator(String version, String type, String bin) {
        System.out.println("---Operator packet---");
        String lengthTypeId = bin.substring(0,1);
        bin = bin.substring(1);
        int lengthTypeIdInt = binToDec(lengthTypeId);
        System.out.println("Length type ID: "+lengthTypeIdInt);
        if(lengthTypeIdInt == 0){
            //15
            String numberOfBits = bin.substring(0,15);
            int numberOfBitsInt = binToDec(numberOfBits);
            System.out.println("Number of bits: "+numberOfBitsInt);
            bin = bin.substring(15);

            int numberOfPackets = numberOfBitsInt/11;
            for (int i = 0; i < numberOfPackets; i++) {
                String packet = null;
                if(i == numberOfPackets-1){
                    //packet = bin.substring(0,11+(numberOfBitsInt%11));
                    packet = bin.substring(0,bin.length());
                    //bin = bin.substring(11+(numberOfBitsInt%11));
                    bin = bin.substring(bin.length());
                }else{
                     packet = bin.substring(0,11);
                    bin = bin.substring(11);
                }
                System.out.println("Subpacket"+i+": "+packet);
                parsePacket(packet);
            }
        }else{
            String numberOfPackets = bin.substring(0,11);
            int numberOfPacketsInt = binToDec(numberOfPackets);
            bin = bin.substring(11);
            if(first) {
                //bin = bin.replaceAll("0*$", "");;//Remove trailing zeros
                first = false;
            }

            int packetSize = bin.length()/numberOfPacketsInt;

            System.out.println("Number of packets: "+numberOfPacketsInt);
            for (int i = 0; i < numberOfPacketsInt; i++) {
                String packet = bin.substring(0,packetSize);
                parsePacket(packet);
                bin = bin.substring(packetSize);
            }
        }
    }

    private int parseLiteral(String version, String type, String bin) {
        try {
            System.out.println("---Literal packet---");
            String literal = "";
            //String firstChar = bin.substring(0,1);
            while (bin.charAt(0) == '1'/*bin.substring(0, 5).charAt(0) == '1'*/) {
                literal += getLiteralPart(bin);//bin.substring(1, 5);
                bin = bin.substring(5);
            }

            literal += getLiteralPart(bin);//bin.substring(1, 5);
            //bin.substring(5); //Dont need to remove last, not used anymore anyways

            System.out.println("Literal: " + literal);
            System.out.println("Literal: " + binToDec(literal));
            return binToDec(literal);
        }catch(Exception e){
            System.out.println("Error");
            return -1;
        }
    }

    private String getLiteralPart(String bin){
        if(bin.length() >= 5){
            return bin.substring(1,5);
        }else{
            String padded = bin.substring(1);
            String formatPad = "%" + ( 4) + "s";
            padded = String.format(formatPad, padded).replace(" ", "0");

            return padded;
        }
    }

    private int binToDec(String version) {
        return Integer.parseInt(version, 2);
    }


    @Test
    public void part2() {


    }
    private String hexToBin(String s) {
        String s1 = new BigInteger(s, 16).toString(2);
        String formatPad = "%" + (s.length() * 4) + "s";
        return String.format(formatPad, s1).replace(" ", "0");
    }

}
/*
*
* C:\Users\veriksso\.jdks\adopt-openjdk-11.0.10\bin\java.exe -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:59419,suspend=y,server=n -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:C:\Users\veriksso\.IntelliJIdea2019.3\system\captureAgent\debugger-agent.jar -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.5\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.5\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.5\plugins\junit\lib\junit-rt.jar;D:\Code\AdventOfCode2021\target\test-classes;D:\Code\AdventOfCode2021\target\classes;C:\Users\veriksso\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\veriksso\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\veriksso\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.8.2\junit-jupiter-api-5.8.2.jar;C:\Users\veriksso\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;C:\Users\veriksso\.m2\repository\org\junit\platform\junit-platform-commons\1.8.2\junit-platform-commons-1.8.2.jar;C:\Users\veriksso\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\veriksso\.m2\repository\org\projectlombok\lombok\1.18.22\lombok-1.18.22.jar;C:\Users\veriksso\.m2\repository\com\google\code\gson\gson\2.8.9\gson-2.8.9.jar;C:\Users\veriksso\.m2\repository\org\junit\platform\junit-platform-launcher\1.8.2\junit-platform-launcher-1.8.2.jar;C:\Users\veriksso\.m2\repository\org\junit\platform\junit-platform-engine\1.8.2\junit-platform-engine-1.8.2.jar;C:\Users\veriksso\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.8.2\junit-jupiter-engine-5.8.2.jar;C:\Users\veriksso\.m2\repository\org\junit\vintage\junit-vintage-engine\5.8.2\junit-vintage-engine-5.8.2.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 Day16.Day16Try3,part1
Connected to the target VM, address: '127.0.0.1:59419', transport: 'socket'

01100010000000001000000000000000000101100001000101010110001011001000100000000010000100011000111000110100
Version: 011, Type: 000
Version: 3, Type: 0
---Operator packet---
Length type ID: 1
Number of packets: 2
Version: 000, Type: 000
Version: 0, Type: 0
---Operator packet---
Length type ID: 0
Number of bits: 22
Subpacket0: 00010001010
Version: 000, Type: 100
Version: 0, Type: 4
---Literal packet---
Literal: 1010
Literal: 10
Subpacket1: 1011000101
Version: 101, Type: 100
Version: 5, Type: 4
---Literal packet---
Literal: 0101
Literal: 5
Version: 100, Type: 100
Version: 4, Type: 4
---Literal packet---
Literal: 1000
Literal: 8
Sum: 12

Disconnected from the target VM, address: '127.0.0.1:59419', transport: 'socket'

Process finished with exit code 0

* */