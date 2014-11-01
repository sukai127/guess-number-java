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

    @Test
    public void should_result_is_0A0B(){
        String result = compareNumber.compare("1234","5678");
        assertThat(result).isEqualTo("0A0B");
    }

    @Test
    public void should_result_is_2A2B(){
        String result = compareNumber.compare("1234","1432");
        assertThat(result).isEqualTo("2A2B");
    }

    @Test
    public void should_result_is_0A4B(){
        String result = compareNumber.compare("1234","4321");
        assertThat(result).isEqualTo("0A4B");
    }


}
