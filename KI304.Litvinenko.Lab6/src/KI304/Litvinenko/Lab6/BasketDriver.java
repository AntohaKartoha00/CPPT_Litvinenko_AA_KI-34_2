package KI304.Litvinenko.Lab6;
import java.util.ArrayList;

//Програма-драйвер
public class BasketDriver {
    public static void main(String[] args) {
        // Створюємо кошик
        Basket<Item> basket = new Basket<>();

        // Додаємо продукти та книги в кошик
      
        basket.addItem(new Product("Orange", 150));
        basket.addItem(new Book("Java Programming", 500));
        basket.addItem(new Book("Python Basics", 320));
        basket.addItem(new Book("Python Basics", 320));
        basket.addItem(new Book("Python Basics", 320));
       
        System.out.println(basket.getItems().stream().filter(item -> item instanceof Product).count() > basket.getItems().stream().filter(item -> item instanceof Book).count());
        // Виводимо всі елементи в кошику
        basket.printItems();

        // Знаходимо максимальний елемент
        Item maxItem = basket.findMax();
        System.out.println("The largest item is: ");
        maxItem.print();

        // Видаляємо елемент за індексом
        basket.removeItem(1);
        basket.printItems();
    }
}
