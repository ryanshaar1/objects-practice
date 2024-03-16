import java.util.*;
public class ChildMain {

	public static Scanner reader= new Scanner(System.in);
	
	public static Child buildChild() {
		System.out.println("Enter the year you were born: ");
		int year = reader.nextInt();
		System.out.println("Enter your name: ");
		String name = reader.next();
		
		Child child= new Child(name, year);
		return child;
	}
	
	public static void year2000(Child[] yeladim) {
		int count=0;
		for(int i=0; i<10;i++) {
			if(yeladim[i].getYear()>2000)
				count++;
			
	}
		System.out.println("the number of kids that bron after the year 2000 is: "+ count);
	}
	
	public static void printOldKids(Child[] yeladim) {
		for(int i=0; i<10;i++) {
			if(yeladim[i].getYear()<2000)
				System.out.println("this kid born before the year 2000: "+ yeladim[i].getYear());

	}
		
	}
	
	
	public static void updateYear(Child[] yeladim) {
		for(int i=0; i<10;i++) {
			yeladim[i].setYear(yeladim[i].getYear()-1);

	}
		
	}
	
	
	public static void printSameYear(Child[] yeladim, int year) {
		for(int i=0; i<10;i++) {
			if(yeladim[i].getYear()==year)
				System.out.println("this kid born in : "+ yeladim[i].getYear());

	}
		
	}
	
	public static int firstTav(Child[] yeladim , char tav) {
		int count=0;
		for(int i=0; i<10;i++) {
			String s=yeladim[i].getName();
			if(s.charAt(1)==tav)
				count++;
				return count;

	}
		
	}
	
	public static int firstTavFirstKid(Child[] yeladim ) {
		int count=0;
		for(int i=0; i<10;i++) {
			String s1=yeladim[1].getName();
			String s2=yeladim[i].getName();
			if(s1.charAt(1)==s2.charAt(1))
				count++;
				return count;

	}
		
	}
	
	public static void main(String[] args) {
		Child[] yeladim = new Child[10];
		for(int i=0; i<yeladim.length;i++) {
			yeladim[i]=buildChild();
			
			
		}

	}
}
