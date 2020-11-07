import java.util.*;

class Book {
  String name, author;
  int price, pages;

  Book(String name, String author, int price, int pages) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.pages = pages;
  }

  void Input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter NAme of Book");
    name = sc.nextLine();
    System.out.println("Enter name of author\n");
    author = sc.nextLine();
    System.out.println("Enter number of pages of ");
    pages = sc.nextInt();
    System.out.println("Enter Price \n");
    price = sc.nextInt();
  }

  public String toString() {
    return (
      "name : " +
      name +
      "\n author :  " +
      author +
      "\n price :  " +
      price +
      "\n no of pages :  " +
      pages
    );
  }

  public static void main(String args[]) {
    Scanner ss = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF BOOKS");
    int n = ss.nextInt();
    Book b[] = new Book[n];
    for (int i = 0; i < n; i++) {
      System.out.println("ENTER THE DETAILS OF BOOK" + (i + 1));
      b[i] =  Book();
      b[i].input();
    }
    for (int i = 0; i < n; i++) {
      System.out.println("THE DETAILS OF BOOK" + (i + 1));
      System.out.println(b[i]);
    }
  }
}
