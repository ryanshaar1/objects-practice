
import java.util.*;
public class Book {
private String name;
private double price;

public Book(String name, double price) {
	this.setName(name);
	this.setPrice(price);
}
public void setName(String name) {
	this.name=name;
}
public void setPrice(double price) {
	if(price<0)
		this.price=0;
	else
		this.price=price;
}
public String getName() {
	return this.name;
}
public double getPrice() {
	return this.price;
}
public void editPrice(int num, double percent) {
	double newPrice=this.price;
	if(num<0)
		newPrice=this.price-this.price*percent/100;
	else
		newPrice=this.price+this.price*percent/100;
	
	this.price = newPrice;
}


}
