package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz {

    public String countOff(int number) {
        CountNumber countNumber = new CountNumber(number);
        if (countNumber.contains(3) && !countNumber.contains(5)) {
            return "Fizz";
        }
        if (countNumber.dividedBy(3) && (!countNumber.contains(5) || countNumber.contains(7))) {
            countNumber.append("Fizz");
        }
        if (countNumber.dividedBy(5) && !countNumber.contains(7)) {
            countNumber.append("Buzz");
        }
        if (countNumber.dividedBy(7)) {
            countNumber.append("Whizz");
        }
        return countNumber.display();
    }

}
