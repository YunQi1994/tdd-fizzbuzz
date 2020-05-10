package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz_v1 {

    public String countOff(int i) {
        String saying = "";
        if (isMultipleOf(i,3)){
            saying = saying + "Fizz";
        }
        if (isMultipleOf(i,5)){
            saying = saying + "Buzz";
        }
        if (isMultipleOf(i,7)){
            saying = saying + "Whizz";
        }
        if (String.valueOf(i).contains("3")){
            saying = saying + "Fizz";
        }
        return saying.length() == 0 ? String.valueOf(1) : saying;
    }

    private boolean isMultipleOf(int a, int b){
        boolean result = false;
        if (a%b == 0){
            result = true;
        }
        return result;
    }
}
