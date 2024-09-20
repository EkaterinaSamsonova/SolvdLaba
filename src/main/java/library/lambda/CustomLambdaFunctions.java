package library.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomLambdaFunctions {

    public static <T extends Number> double sum(List<T> numbers, Function<T, Double> mapper) {
        return numbers.stream().map(mapper).reduce(0.0, (aDouble, aDouble2) -> aDouble + aDouble2);
    }

    public static <T> List<T> filter(List<T> list, Predicate<? super T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public static <T> List<T> generateList(int count, Supplier<T> supplier) {
        return Stream.generate(supplier).limit(count).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        double intSum = sum(numbers, integer -> Double.valueOf(integer));
        System.out.println("Sum of integers: " + intSum);

        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> randomIntegers = generateList(5, () -> (int) (Math.random() * 100));
        System.out.println("Random integers: " + randomIntegers);
    }
}
