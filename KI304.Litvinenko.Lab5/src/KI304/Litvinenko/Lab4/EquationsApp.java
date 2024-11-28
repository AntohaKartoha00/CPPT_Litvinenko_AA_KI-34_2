package KI304.Litvinenko.Lab4;

public class EquationsApp {

   
    public String calculate(double x) {
        try {
            double denominator = Math.sin(3 * x - 1);
            if (denominator == 0) {
                throw new ArithmeticException("Ділення на нуль: sin(3x - 1) = 0");
            }
            double result = (x - 4) / denominator;
            return "Результат для x = " + x + ": " + result;
        } catch (ArithmeticException e) {
            return "Помилка у математичних обчисленнях: " + e.getMessage();
        }
    }
}
