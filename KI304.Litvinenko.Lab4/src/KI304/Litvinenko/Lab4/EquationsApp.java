package KI304.Litvinenko.Lab4; 

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EquationsApp {

  
    public double calculate(double x) throws ArithmeticException {
        double denominator = Math.sin(3 * x - 1);
        
        if (denominator == 0) {
            throw new ArithmeticException("Ділення на нуль: sin(3x - 1) = 0");
        }
        
        return (x - 4) / denominator;
    }

    public static void main(String[] args) {
    	EquationsApp calculator = new EquationsApp();
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();  
        
        try {
            
            double result = calculator.calculate(x);
            
            
            try {
            	FileWriter writer = new FileWriter("result.txt");
                writer.write("Результат для x = " + x + ": " + result);
                System.out.println("Обчислення успішне. Результат: " + result);
                System.out.println("Результат записано у файл result.txt");
               
                
            } catch (IOException e) {
                System.err.println("Помилка при записі у файл: " + e.getMessage());
                
            }
          
		
        } catch (ArithmeticException e) {
            System.err.println("Помилка у математичних обчисленнях: " + e.getMessage());
        } finally {
            scanner.close();
            
        }
    }
}
