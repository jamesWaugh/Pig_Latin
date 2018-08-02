package pig_latin;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.*;

public class Pig_Latin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input line to convert to pig latin:");
        String s = scan.nextLine();
        String[] split = s.split(" ");
        String finalS = "";
        int counter = 0;
        for (String newS : split) {
            if (newS.equals("i")) {
                if (counter == 0) {
                    finalS += "i-way";
                } else {
                    finalS += " i-way";
                }
            } else if (newS.equals("a")) {
                if (counter == 0) {
                    finalS += "a-way";
                } else {
                    finalS += " a-way";
                }
            } else if ((newS.charAt(0) == 't' || newS.charAt(0) == 's' || newS.charAt(0) == 'c' || newS.charAt(0) == 'T' || newS.charAt(0) == 'S' || newS.charAt(0) == 'C') && (newS.charAt(1) == 'h' || newS.charAt(1) == 'c' || newS.charAt(1) == 'k' || newS.charAt(1) == 'm' || newS.charAt(1) == 'p' || newS.charAt(1) == 't' || newS.charAt(1) == 'n' || newS.charAt(1) == 'q') && (newS.charAt(2) == 'r' || newS.charAt(2) == 'u')) {
                String tempS = "";
                for (int i = 0; i < newS.length(); i++) {
                    if (i != 0 && i != 1 && i != 2) {
                        if (i == 3 && Character.isUpperCase(newS.charAt(0))) {
                            tempS += toUpperCase(newS.charAt(i));
                        } else {
                            tempS += newS.charAt(i);
                        }
                    }
                }
                tempS += toLowerCase(newS.charAt(0)) + "" + newS.charAt(1) + "" + newS.charAt(2) + "ay";
                if (counter == 0) {
                    finalS += tempS;
                    counter++;
                } else {
                    finalS += " " + tempS;
                }
            } else if ((newS.charAt(0) == 't' || newS.charAt(0) == 's' || newS.charAt(0) == 'c' || newS.charAt(0) == 'T' || newS.charAt(0) == 'S' || newS.charAt(0) == 'C') && (newS.charAt(1) == 'h' || newS.charAt(1) == 'c' || newS.charAt(1) == 'k' || newS.charAt(1) == 'm' || newS.charAt(1) == 'p' || newS.charAt(1) == 't' || newS.charAt(1) == 'n')) {
                String tempS = "";
                for (int i = 0; i < newS.length(); i++) {
                    if (i != 0 && i != 1) {
                        if (i == 2 && Character.isUpperCase(newS.charAt(0))) {
                            tempS += toUpperCase(newS.charAt(i));
                        } else {
                            tempS += newS.charAt(i);
                        }
                    }
                }
                tempS += toLowerCase(newS.charAt(0)) + "" + newS.charAt(1) + "ay";
                if (counter == 0) {
                    finalS += tempS;
                    counter++;
                } else {
                    finalS += " " + tempS;
                }
            } else {
                String tempS = "";
                for (int i = 0; i < newS.length(); i++) {
                    if (i != 0) {
                        if (i == 1 && Character.isUpperCase(newS.charAt(0))) {
                            tempS += toUpperCase(newS.charAt(i));
                        } else {
                            tempS += newS.charAt(i);
                        }
                    }
                }
                tempS += toLowerCase(newS.charAt(0)) + "ay";
                if (counter == 0) {
                    finalS += tempS;
                    counter++;
                } else {
                    finalS += " " + tempS;
                }
            }
        }
        System.out.println(finalS);
    }

}
