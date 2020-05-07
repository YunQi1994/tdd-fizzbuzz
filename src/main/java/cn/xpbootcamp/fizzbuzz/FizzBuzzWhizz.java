package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz {
    private static boolean isMatch = false;

    public static void main(String[] args) {
        System.out.println("Start!!!");
    }

    public boolean fizz(int i) {
        if (i % 3 == 0){
            isMatch = true;
        }
        return isMatch;
    }

    public boolean buzz(int i) {
        if (i % 5 == 0){
            isMatch = true;
        }
        return isMatch;
    }

    public boolean whizz(int i) {
        if (i % 7 == 0){
            isMatch = true;
        }
        return isMatch;
    }

    public boolean fizzBuzzWhizz(int i) {
        if (i % 105 == 0){
            isMatch = true;
        }
        return isMatch;
    }

    public boolean fizzBuzz(int i) {
        if (i % 15 == 0){
            isMatch = true;
        }
        return isMatch;
    }

    public boolean fizzWhizz(int i) {
        if (i % 21 == 0){
            isMatch = true;
        }
        return isMatch;
    }

    public boolean buzzWhizz(int i) {
        if (i % 35 == 0){
            isMatch = true;
        }
        return isMatch;
    }
}
