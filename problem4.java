import java.util.*;

public class MultipleCounter {
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers, List<Integer> divisors) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int d : divisors) {
            int count = 0;
            for (int num : numbers) {
                if (num % d == 0) {
                    count++;
                }
            }
            result.put(d, count);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        List<Integer> divisors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Integer, Integer> output = countMultiples(numbers, divisors);

        System.out.println(output);
    }
}
output:
{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}
