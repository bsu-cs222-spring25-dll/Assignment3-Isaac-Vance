package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }
    public String countTo(int max) {

        StringBuilder result = new StringBuilder();
        for (int x = 0; x <= max; x++) {
            result.append(x);
            if (x < max) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
