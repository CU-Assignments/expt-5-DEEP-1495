import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringNumbers = new ArrayList<>();
        stringNumbers.add("10");
        stringNumbers.add("20");
        stringNumbers.add("30");
        stringNumbers.add("40");

        int sum = calculateSum(stringNumbers);
        System.out.println("The sum of the integers is: " + sum);
    }

    public static int calculateSum(List<String> stringNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : stringNumbers) {
            numbers.add(Integer.parseInt(str));
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        return sum;
    }
}
