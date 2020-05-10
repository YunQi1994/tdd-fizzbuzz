package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz_v1 {

    public String countOff(int i) {

        String saying = "";

        if (doesContain(i,7)){
            if (isMultipleOf(i,3)){
                saying = append(saying,"Fizz");
            }
            if (!doesContain(i,3)){
                if (isMultipleOf(i,7)){
                    saying = append(saying,"Whizz");
                }
            }
        }

        if (doesContain(i,5)){
            if (isMultipleOf(i,5)){
                saying = append(saying,"Buzz");
            }
            if (isMultipleOf(i,7)){
                saying = append(saying,"Whizz");
            }
        }

        if (doesContain(i,3) && !doesContain(i,5) && !doesContain(i,7)){
            saying = append(saying,"Fizz");
        }
        if (!doesContain(i,3) && !doesContain(i,5) && !doesContain(i,7)){
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

    private boolean doesContain(int count, int matcher){
        return intToString(count).contains(intToString(matcher));
    }

    private boolean isMultipleOf(int count, int divider){
        return count % divider == 0;
    }
}
