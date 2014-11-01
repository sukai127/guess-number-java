package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessIntegratedTest {
    private Guess guess;
    @Before
    public void init(){
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1,2,3,4);
        guess = new Guess(new AnswerGenerator(random),new CompareNumber());
    }
    @Test
    public void judgeTest(){
        String result = guess.judge("1234");
        assertThat(result).isEqualTo("4A0B");
    }
}
