package com.thoughtworks.iamcoach.guessnumber;

import java.util.Random;

public class AnswerGenerator {
    Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generate() {

        String result = "";

        int element = random.nextInt(10);

        while (result.length() < 4){

            if(!result.contains(element+"")){
                result += element;
            }else{
                element = random.nextInt(10);
            }
        }

        return result;
    }
}
