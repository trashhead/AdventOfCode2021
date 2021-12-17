package Day16;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Day16Try2 {
    Day16Input day16Input = new Day16Input();

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
            bin = bin.replaceAll("0*$", "");;//Remove trailing zeros
            /*if(bin.length()%11 != 0){
                bin = bin.substring(0,bin.length()-bin.length()%11);
            }
            /*int packetSize = bin.length()/numberOfPacketsInt;*/
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
