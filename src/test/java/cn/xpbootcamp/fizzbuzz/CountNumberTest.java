package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberTest {

    @Test
    public void should_return_true_given_13_when_check_contain(){
        CountNumber countNumber = new CountNumber(13);
        boolean result = countNumber.contains(3);
        Assert.assertTrue(result);
    }

    @Test
    public void should_return_true_given_15_when_module_5(){
        CountNumber countNumber = new CountNumber(15);
        boolean result = countNumber.dividedBy(5);
        Assert.assertTrue(result);
    }
}
