package org.launchcode;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a search term for an excerpt from Alice in Wonderland: ");
        String searchTerm = input.nextLine();

        String searchTermLower = searchTerm.toLowerCase();
        boolean searchResults = alice.toLowerCase().contains(searchTermLower);
        int wordIndex = alice.toLowerCase().indexOf(searchTermLower);
        int wordLength = searchTerm.length();
        String aliceModified = alice.replace(searchTerm.toLowerCase(), "");

        if (searchResults) {
            System.out.println(searchTerm + " is found in the text.");
            System.out.println("The word is found at index " + wordIndex + " and is " + wordLength + " characters long.");
            System.out.println(aliceModified);
        } else {
            System.out.println(searchTerm + " is not found in the text.");
        }


    }
}
