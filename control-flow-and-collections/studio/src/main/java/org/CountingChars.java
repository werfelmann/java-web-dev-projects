package org.launchcode;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {

//        String myString = "If the product of two terms is zero then common sense says at least one of the two terms" +
//                " has to be zero to start with. So if you move all the terms over to one side, you can put the" +
//                " quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you've done that, it's pretty straightforward from there.";
        String myString = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        myString = input.nextLine().toLowerCase();

        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();


        for (Character c : charactersInString) {

            if (!Character.isLetter(c)) {
                continue;
            }
            if (charMap.containsKey(c)) {
//                charMap.replace(c, charMap.get(c) + 1);
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }


        }
        for (Map.Entry<Character, Integer> c : charMap.entrySet()) {
            System.out.println(c.getKey() + ":" + c.getValue());

        }
//        System.out.println(charMap);
    }
}