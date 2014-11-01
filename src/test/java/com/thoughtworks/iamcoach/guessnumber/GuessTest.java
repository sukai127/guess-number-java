package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    private Guess guess;
    @Before
    public void init(){
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");
        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("1234","1243")).thenReturn("2A2B");
        guess = new Guess(answerGenerator,compareNumber);
    }

    @Test
    public void should_return_correct_result(){
        assertThat(guess.judge("1243")).isEqualTo("2A2B");
    }
}
