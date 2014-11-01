package com.thoughtworks.iamcoach.guessnumber;

public class Guess {

    private AnswerGenerator answerGenerator;
    private CompareNumber compareNumber;

    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answerGenerator = answerGenerator;
        this.compareNumber = compareNumber;
    }

    public String judge(String input) {
        return compareNumber.compare(answerGenerator.generate(),input);
    }
}
