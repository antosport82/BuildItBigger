package com.example.javajoke;

import java.util.ArrayList;
import java.util.Random;

public class JavaJoke {

    public String getJoke() {
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("Q: What did the thermometer say to the other thermometer?" +
                "\nA: You make my temperature rise.");
        jokes.add("Q: What do you call a cow that can play a musical instrument?" +
                "\nA: A moo-sician.");
        jokes.add("Q: What did Beethoven say to Johann Sebastian when he was helping him parallel park?" +
                "\nA: Bach it up.");
        jokes.add("Boy: Do you have a date for Valentine's Day?" +
                "\nGirl: Yes, February 14th.");
        jokes.add("Patient: Doctor, doctor, I get heartburn every time I eat birthday cake." +
                "\nDoctor: Try taking the candles off.");
        jokes.add("I get plenty of exercise – jumping to conclusions, pushing my luck, and dodging deadlines.");

        Random random = new Random();
        int number = random.nextInt(jokes.size());
        return jokes.get(number);
    }}