import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> (x == 0 || y == 0)?  0 : x / y; //Возникла ошибка деления на 0
    //Решение: сделать тернарный оператор с проверкой двух переменных на ноль, где истина - возвращает 0, лож - делит переменные

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; //Ошибка с переменной abs не возникла, переменная корректно возвращает модуль числа.

    Predicate<Integer> isPsitive = x -> x > 0;

    Consumer<Integer> println = System.out::println;


}
