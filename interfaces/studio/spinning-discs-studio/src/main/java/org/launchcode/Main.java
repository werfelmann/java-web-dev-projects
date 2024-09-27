package org.launchcode;

public class Main {
    public static void main(String[] args) {
        DVD lordOfTheRings = new DVD(1600, 4.7, "movie", "The Lord of the Rings", "Fantasy");
        CD nirvana = new CD(500, 700, "music", "Smells Like Teen Spirit", "Grunge");
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        nirvana.play();
        lordOfTheRings.stop();
    }
}