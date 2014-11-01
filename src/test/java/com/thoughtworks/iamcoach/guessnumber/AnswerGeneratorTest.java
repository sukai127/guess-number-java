package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest{

    private AnswerGenerator answerGenerator;
    private String result;

    @Before
    public void init(){

        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1,2,3,4);

        answerGenerator = new AnswerGenerator(random);
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

        assertThat(result).isEqualTo("1234");
    }
}
