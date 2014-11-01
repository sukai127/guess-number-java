package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class AnswerGeneratorTest{

    private AnswerGenerator answerGenerator;
    private String result;

    @Before
    public void init(){
       answerGenerator = new AnswerGenerator();
    }

    @Test
    public void should_result_length_be_4(){

        result = answerGenerator.generate();

        assertThat(result.length()).isEqualTo(4);

    }

    @Test
    public void should_result_is_no_repeate(){

        result = answerGenerator.generate();
        boolean isRepeate = false;
        String temp = "";

        for (int i = 0; i < result.length(); i++){
           if(temp.contains(result.charAt(i)+"")){
               isRepeate = true;
           }else {
               temp += result.charAt(i);
           }
        }

        assertThat(isRepeate).isEqualTo(false);
    }

    @Test
    public void should_result_all_is_number(){

        result = answerGenerator.generate();
        boolean isNumber = false;

        for (int i = 0; i < result.length(); i++){
            int temp = (int)(result.charAt(i));
            if(temp>=48&&temp<=57){
                isNumber = true;
            }
        }

        assertThat(isNumber).isEqualTo(true);
    }

    @Test
    public void should_result_is_not_equals(){
        result = answerGenerator.generate();
        String result1 = answerGenerator.generate();

        assertThat(result.equals(result1)).isEqualTo(false);
    }
}
