package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CompareNumberTest {

    private CompareNumber compareNumber;
    @Before
    public void init(){
        compareNumber = new CompareNumber();
    }

    @Test
    public void should_result_length_is_4(){
        String result = compareNumber.compare("xxxx","xxxx");

        assertThat(result.length()).isEqualTo(4);
    }

    @Test
    public void should_result_is_4A0B_when_input_isOk(){
        String result = compareNumber.compare("1234","1234");
        assertThat(result).isEqualTo("4A0B");
    }
}
