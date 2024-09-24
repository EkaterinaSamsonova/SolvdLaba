package library.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LamdaFunctions {

    public static void main (String[] args){
        IntSupplier intSupplier = () -> 1;
        System.out.println(intSupplier.getAsInt());

        Consumer<Integer> intConsumer = a -> System.out.println(a);
        intConsumer.accept(2);

        Function<Integer, Double> halfFunction = a -> a / 2.0;
        System.out.println(halfFunction.apply(3));

        Predicate<Integer> lesserThanPredicate = i -> (i < 10);
        System.out.println(lesserThanPredicate.test(4));

        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println(unaryOperator.apply(2));
    }
}
