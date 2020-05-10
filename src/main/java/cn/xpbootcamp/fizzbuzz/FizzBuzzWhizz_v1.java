package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz_v1 {

    public String countOff(int i) {

        String saying = "";

        if (intToString(i).contains("5")){
            if (isMultipleOf(i,5)){
                saying = append(saying,"Buzz");
            }
            if (isMultipleOf(i,7)){
                saying = append(saying,"Whizz");
            }
        }

        if (intToString(i).contains("3") && !String.valueOf(i).contains("5")){
            saying = append(saying,"Fizz");
        }
        if (!String.valueOf(i).contains("3") && !String.valueOf(i).contains("5")){
            if (isMultipleOf(i,3)){
                saying = append(saying,"Fizz");
            }
            if (isMultipleOf(i,5)){
                saying = append(saying,"Buzz");
            }
            if (isMultipleOf(i,7)){
                saying = append(saying,"Whizz");
            }
        }

        return saying.length() == 0 ? String.valueOf(1) : saying;
    }

    private String append(String str, String appending){
        return str + appending;
    }

    private String intToString(int i){
        return String.valueOf(i);
    }

    private boolean isMultipleOf(int a, int b){
        boolean result = false;
        if (a%b == 0){
            result = true;
        }
        return result;
    }
}
