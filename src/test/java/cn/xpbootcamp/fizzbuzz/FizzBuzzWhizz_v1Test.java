package cn.xpbootcamp.fizzbuzz;

import jdk.nashorn.internal.objects.annotations.Function;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizz_v1Test {

    private FizzBuzzWhizz_v1 subject = new FizzBuzzWhizz_v1();

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
        String result = subject.countOff(60);
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void givenCountIsAMultipleOf3And7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(21);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf7And5_whenCountOff_shouldReturnBuzzWhizz(){
        String result = subject.countOff(140);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5ANd7_whenCountOff_shouldReturnFizzBuzzWhizz() {
        String result = subject.countOff(210);
        Assertions.assertThat(result).isEqualTo("FizzBuzzWhizz");
    }

    @Test
    public void givenCountIsNotMultipleOf3_Or_5_Or_7_whenCountOff_shouldReturnCount(){
        String result = subject.countOff(1);
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    public void givenCountContains3_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(13);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountContains3_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(630);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountContains5_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnBuzzWhizz(){
        String result = subject.countOff(315);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void givenCountContains7_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(1470);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountContains7and3_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(2730);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountContains7and3_AlsoIsMultipleOf5and7_whenCountOff_shouldReturnFizz(){
        String result = subject.countOff(3710);
        Assertions.assertThat(result).isEqualTo("3710");
    }

    @Test
    public void givenCountContains7and5_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(1575);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountContains7and5an3_AlsoIsMultipleOf3and5and7_whenCountOff_shouldReturnFizzWhizz(){
        String result = subject.countOff(735);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

//    @Test
//    public void numberGenerator(){
//
//        for (int i = 1; i <= 10000; i++){
//            int num = 105 * i;
//            if (String.valueOf(num).contains("3") && String.valueOf(num).contains("5") && String.valueOf(num).contains("7")){
//                System.out.println(num);
//                break;
//        }
//        }
//    }




}