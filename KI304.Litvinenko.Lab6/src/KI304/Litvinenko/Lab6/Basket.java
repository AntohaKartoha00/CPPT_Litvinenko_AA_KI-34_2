package KI304.Litvinenko.Lab6;


import java.util.ArrayList;

// Параметризований клас Кошик
public class Basket<T extends Item> {
    private ArrayList<T> items;

    public Basket() {
        items = new ArrayList<>();
    }
    
    public ArrayList<T> getItems() {
        return items;
    }
    
    // Метод для додавання елемента в кошик
    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added: " + item.getName());
    }

    // Метод для видалення елемента з кошика за індексом
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            System.out.println("Item removed: " + items.get(index).getName());
            items.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Метод для пошуку максимального елемента за розміром
    public T findMax() {
        if (items.isEmpty()) {
            return null;
        }
        T max = items.get(0);
        for (T item : items) {
            if (item.getSize() > max.getSize()) {
                max = item;
            }
        }
        return max;
    }

    // Метод для друку всіх елементів у кошику
    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("The basket is empty.");
        } else {
            System.out.println("Items in the basket:");
            for (T item : items) {
                item.print();
            }
        }
    }
}
