package com.thoughtworks.iamcoach.guessnumber;

public class CompareNumber {

    public String compare(String answer, String input) {
        int numberA = 0;
        int numberB = 0;

        for(int i = 0; i < answer.length(); i++){
            if(answer.charAt(i) == input.charAt(i)){
                numberA++;
            }else if(input.contains(answer.charAt(i)+"")){
                numberB++;
            }
        }
        return numberA+"A"+numberB+"B";
    }

}
