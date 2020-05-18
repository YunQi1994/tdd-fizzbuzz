package cn.xpbootcamp.fizzbuzz;

public class CountNumber {
    private final int currentNumber;
    private String outputString = "";

    public CountNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public boolean contains(int num) {
        return String.valueOf(currentNumber).contains(String.valueOf(num));
    }

    public boolean dividedBy(int num) {
        return currentNumber % num == 0;
    }

    public void append(String str) {
        outputString += str;
    }

    public String display(){
        return outputString.isEmpty() ? String.valueOf(currentNumber) : outputString;
    }
}
