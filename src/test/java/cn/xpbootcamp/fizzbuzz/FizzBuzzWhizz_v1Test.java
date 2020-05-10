package cn.xpbootcamp.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizz_v1Test {

    private FizzBuzzWhizz_v1 subject = new FizzBuzzWhizz_v1();

    @Test
    public void givenCountIsAMultipleOf3_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(6);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountIsAMultipleOf5_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnBuzz(){
        String result = subject.countOff(10);
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void givenCountIsAMultipleOf7_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnWhizz(){
        String result = subject.countOff(14);
        Assertions.assertThat(result).isEqualTo("Whizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnFizzBuzz(){
        String result = subject.countOff(15);
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void givenCountIsAMultipleOf3And7_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(21);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf7And5_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnBuzzWhizz(){
        String result = subject.countOff(35);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5ANd7_AndNotContain3_Or_5_Or_7_whenCountOff_shouldReturnFizzBuzzWhizz(){
        String result = subject.countOff(105);
        Assertions.assertThat(result).isEqualTo("FizzBuzzWhizz");
    }

    @Test
    public void givenCountContains3_whenCountOff_shouldReturnFizzBuzzWhizz(){
        String result = subject.countOff(13);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountContains3_AlsoIsAMultipleOf3_Or_5_Or_7_whenCountOff_shouldReturnFizzOnly(){
        String result = subject.countOff(315);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountContains5_whenCountOff_shouldReturnCount(){
        String result = subject.countOff(51);
        Assertions.assertThat(result).isEqualTo("51");
    }

    @Test
    public void givenCountContains5And3_whenCountOff_shouldReturnCount(){
        String result = subject.countOff(53);
        Assertions.assertThat(result).isEqualTo("53");
    }

    @Test
    public void givenCountContains5And3_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnBuzzWhizz(){
        String result = subject.countOff(315);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void givenCountContains7_AlsoIsMultipleOf3And5And7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(735);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountContains7and3_AlsoIsNotMultipleOf3_Or_5_Or_7_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(73);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountContains7and5_AlsoIsNotMultipleOf3_Or_5_Or_7_whenCountOff_shouldReturnCount(){
        String result = subject.countOff(57);
        Assertions.assertThat(result).isEqualTo("57");
    }

}