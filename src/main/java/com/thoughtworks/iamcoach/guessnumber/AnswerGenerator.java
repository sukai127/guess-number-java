package com.thoughtworks.iamcoach.guessnumber;

public class AnswerGenerator {
    public String generate() {

        String result = "";

        int element = (int)(Math.random()*10);

        while (result.length() < 4){

            if(!result.contains(element+"")){
                result += element;
            }else{
                element = (int)(Math.random()*10);
            }
        }

        return result;
    }
}
