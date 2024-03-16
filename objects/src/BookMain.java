import java.util.*;
public class BookMain {
public static Scanner reader=new Scanner(System.in);
public static void main(String[] args) {
System.out.println("enter the book1 name");
String name = reader.next();
System.out.println("enter the book1 price");
double price = reader.nextDouble();
Book book1 = new Book(name, price);

System.out.println("enter the book2 name");
name = reader.next();
System.out.println("enter the book2 price");
price = reader.nextDouble();
Book book2 = new Book(name, price);

System.out.println("the book " + book1.getName() + "is: "+ book1.getPrice());
System.out.println("the book " + book2.getName() + "is: "+ book2.getPrice());
book1.editPrice(-5, 10);
book2.editPrice(5, 5);
System.out.println("the book " + book1.getName() + "new price is: "+ book1.getPrice());
System.out.println("the book " + book2.getName() + "new price is: "+ book2.getPrice());
double avg = (book1.getPrice() + book2.getPrice())/2;
System.out.println("The average of the books prices is: "+ avg);
}
}
