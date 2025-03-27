import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PipeAndFilter {

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Apply filters independently
        List<Integer> evenNumbers = applyFilter(input, n -> n % 2 == 0);
        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> oddNumbers = applyFilter(input, n -> n % 2 != 0);
        System.out.println("Odd Numbers: " + oddNumbers);

        List<Integer> primeNumbers = applyFilter(input, PipeAndFilter::isPrime);
        System.out.println("Prime Numbers: " + primeNumbers);

        List<Integer> multiplesOfFive = applyFilter(input, n -> n % 5 == 0);
        System.out.println("Multiples of 5: " + multiplesOfFive);
    }

    // Generic method to apply any filter
    private static List<Integer> applyFilter(List<Integer> input, Predicate<Integer> condition) {
        return input.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    // Check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
