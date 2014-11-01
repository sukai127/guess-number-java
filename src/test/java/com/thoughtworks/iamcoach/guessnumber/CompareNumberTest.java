package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CompareNumberTest {
    @Test
    public void should_result_length_is_4(){

        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("xxxx","xxxx");

        assertThat(result.length()).isEqualTo(4);
    }
}
