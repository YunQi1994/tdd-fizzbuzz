package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.mockito.InjectMocks;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz subject = new FizzBuzzWhizz();

    @Test
    public void fizz_WhenCountIsAMultipleOf3_ShouldReturnTrue(){
        boolean result = subject.fizz(6);
        assertTrue(result);
    }

    @Test
    public void buzz_WhenCountIsAMultipleOf5_ShouldReturnTrue(){
        boolean result = subject.buzz(10);
        assertTrue(result);
    }

    @Test
    public void whizz_WhenCountIsAMultipleOf7_ShouldReturnTrue(){
        boolean result = subject.whizz(14);
        assertTrue(result);
    }

    @Test
    public void fizzBuzz_WhenCountIsAMultipleOf3and5_ShouldReturnTrue(){
        boolean result = subject.fizzBuzz(15);
        assertTrue(result);
    }

    @Test
    public void fizzWhizz_WhenCountIsAMultipleOf3and7_ShouldReturnTrue(){
        boolean result = subject.fizzWhizz(21);
        assertTrue(result);
    }

    @Test
    public void buzzWhizz_WhenCountIsAMultipleOf7and5_ShouldReturnTrue(){
        boolean result = subject.buzzWhizz(35);
        assertTrue(result);
    }

    @Test
    public void FizzBuzzWhizz_WhenCountIsAMultipleOf3and5and7_ShouldReturnTrue(){
        boolean result = subject.fizzBuzzWhizz(105);
        assertTrue(result);
    }
}