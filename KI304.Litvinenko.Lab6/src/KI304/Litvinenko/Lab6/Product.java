package KI304.Litvinenko.Lab6;

//Клас для продуктів (Item 1)
class Product implements Item {
 private String name;
 private int size;

 public Product(String name, int size) {
     this.name = name;
     this.size = size;
 }

 public int getSize() {
     return size;
 }

 public String getName() {
     return name;
 }

 public void print() {
     System.out.println("Product: " + name + ", Size: " + size);
 }
}