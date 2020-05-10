package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.mockito.InjectMocks;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz subject = new FizzBuzzWhizz();

    @Test
    public void givenCountIsAMultipleOf3_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(6);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountIsAMultipleOf5_whenCountOff_shouldReturnBuzz(){
        String result = subject.countOff(10);
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void givenCountIsAMultipleOf7_whenCountOff_shouldReturnWhizz(){
        String result = subject.countOff(14);
        Assertions.assertThat(result).isEqualTo("Whizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5_whenCountOff_shouldReturnFizzBuzz(){
        String result = subject.countOff(15);
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void givenCountIsAMultipleOf3And7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(21);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf7And5_whenCountOff_shouldReturnBuzzWhizz(){
        String result = subject.countOff(35);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5ANd7_whenCountOff_shouldReturnFizzBuzzWhizz(){
        String result = subject.countOff(105);
        Assertions.assertThat(result).isEqualTo("FizzBuzzWhizz");
    }
}