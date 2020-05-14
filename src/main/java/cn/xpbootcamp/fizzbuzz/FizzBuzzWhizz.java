package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz {

    public String countOff(int i) {
        CurrentStudent student = new CurrentStudent(i);
        if (student.numberContains(3) && !student.numberContains(5)) {
            return "Fizz";
        }
        if (student.dividedBy(3) && (!student.numberContains(5) || student.numberContains(7))) {
            student.append("Fizz");
        }
        if (student.dividedBy(5) && !student.numberContains(7)) {
            student.append("Buzz");
        }
        if (student.dividedBy(7)) {
            student.append("Whizz");
        }
        return student.sayNumber() ? student.toString() : student.sayWords();
    }

}
