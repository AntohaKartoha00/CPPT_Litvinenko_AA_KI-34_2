package KI304.Litvinenko.Lab6;

//Клас для книг (Item 2)
class Book implements Item {
 private String title;
 private int pages;

 public Book(String title, int pages) {
     this.title = title;
     this.pages = pages;
 }

 public int getSize() {
     return pages;
 }

 public String getName() {
     return title;
 }

 public void print() {
     System.out.println("Book: " + title + ", Pages: " + pages);
 }
}
