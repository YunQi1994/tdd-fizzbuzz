package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz subject = new FizzBuzzWhizz();

    @Test
    public void givenCountIsAMultipleOf3_whenCountOff_shouldReturnFizz() {
        String result = subject.countOff(6);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void givenCountIsAMultipleOf5_whenCountOff_shouldReturnBuzz() {
        String result = subject.countOff(10);
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void givenCountIsAMultipleOf7_whenCountOff_shouldReturnWhizz() {
        String result = subject.countOff(14);
        Assertions.assertThat(result).isEqualTo("Whizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5_whenCountOff_shouldReturnFizzBuzz() {
        String result = subject.countOff(60);
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void givenCountIsAMultipleOf3And7_whenCountOff_shouldReturnFizzWhizz() {
        String result = subject.countOff(21);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf7And5_whenCountOff_shouldReturnBuzzWhizz() {
        String result = subject.countOff(140);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void givenCountIsAMultipleOf3And5ANd7_whenCountOff_shouldReturnFizzBuzzWhizz() {
        String result = subject.countOff(210);
        Assertions.assertThat(result).isEqualTo("FizzBuzzWhizz");
    }

    @Test
    public void givenCountIsNotMultipleOf3_Or_5_Or_7_whenCountOff_shouldReturnCount() {
        String result = subject.countOff(1);
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_say_Fizz_given_number_contains_3_when_countOff() {
        String result = subject.countOff(13);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_3_and_is_multiple_of_5_7_when_countOff() {
        String result = subject.countOff(630);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_5_and_is_multiple_of_3_5_7_when_countOff() {
        String result = subject.countOff(105);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_5_3_and_is_multiple_of_3_5_7_when_countOff() {
        String result = subject.countOff(315);
        Assertions.assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_7_and_is_multiple_of_3_5_7_when_countOff() {
        String result = subject.countOff(1470);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_7_3_and_is_multiple_of_3_5_7_when_countOff() {
        String result = subject.countOff(2730);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_7_5_and_is_multiple_of_3_5_7_when_countOff() {
        String result = subject.countOff(1575);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_say_Fizz_given_number_contains_7_5_3_and_is_multiple_of_3_5_7_when_countOff() {
        String result = subject.countOff(735);
        Assertions.assertThat(result).isEqualTo("FizzWhizz");
    }




    @Test
    public void numberGenerator() {
        for (int i = 1; i <= 10000; i++) {
            int num = 105 * i;
            if (String.valueOf(num).contains("5") && String.valueOf(num).contains("3") && String.valueOf(num).contains("7")) {
                System.out.println(num);
                break;
            }
        }
    }

    @Test
    public void fizzBuzz_whenInputAllValue_shouldPass() throws IOException {
        String fileName = this.getClass().getClassLoader().getResource("input.txt").getPath();

        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String line = null;
        int index = 0;
        while ((line = input.readLine()) != null) {
            line = line.replaceAll("\"", "");
            String[] arrays = line.split(",");
            System.out.println(++index + " Processing line:" + line);
            Assert.assertEquals(subject.countOff(Integer.valueOf(arrays[0])), arrays[1].trim());
        }
    }

}