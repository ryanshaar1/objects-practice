import java.util.*;
public class Child {
private String name;
private int year;


public Child(String name2, int year2) {
	// TODO Auto-generated constructor stub
}
public void setName(String name) {
	this.name = name;
}
public void setYear(int year) {
	this.year = year;
}
public String getName() {
	return this.name;
}
public int getYear() {
	return this.year;
}
public boolean equalsYears(int year) {
	if(this.year==year) {
		return true;
	
	}
	else
		return false;
}
public void child(String name, int year) {
	this.name=name;
	this.year=year;
}
public String toString() {
	System.out.println("the child " + this.name + "born in the year" + this.year);
}
}
