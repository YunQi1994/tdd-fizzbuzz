package cn.xpbootcamp.fizzbuzz;

public class CurrentStudent {
    private final int currentNumber;
    private String outputString = "";

    public CurrentStudent(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public boolean numberContains(int num) {
        return String.valueOf(currentNumber).contains(String.valueOf(num));
    }

    public boolean dividedBy(int num) {
        return currentNumber % num == 0;
    }

    public String toString() {
        return String.valueOf(currentNumber);
    }

    public void append(String str) {
        outputString += str;
    }

    public boolean sayNumber(){
        return outputString.length() == 0;
    }

    public String sayWords() {
        return this.outputString;
    }
}
