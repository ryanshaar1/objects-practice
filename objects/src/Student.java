import java.util.*;
public class Student {
private String name;
private int[] grades;

public void student(String name) {
	this.name = name;
}

public void setName(String name) {
	this.name = name;
}
public void setGrades(int grade1, int grade2) {
	if (grade1<40)
		this.grades[0]=0;
	else
		this.grades[0]=grade1;
	if (grade2<40)
		this.grades[1]=0;
	else
		this.grades[1]=grade2;
}
public String getName() {
	return this.name;
	
}
public int[] getGrades() {
	return this.grades;
}
public void addGrade(int num) {

	for(int i=0; i<grades.length;i++) {
		if(grades[i]==0) {
			this.grades[i]=num;
			return;
		}
	}
}
public int lowGrade() {
	if(this.grades[0]>this.grades[1])
		return this.grades[1]; 
	else//we can type only else because even if the grades are even we only need to return one of them
		return this.grades[0];
	
}
public int highGrade() {
	if(this.grades[0]<this.grades[1])
		return this.grades[1]; 
	else//we can type only else because even if the grades are even we only need to return one of them
		return this.grades[0];
}
public double avgGrades() {
return (this.grades[0]+this.grades[1])/2;
}
public double finalGrade() {
	double finalgrade=0;
	if(this.grades[0]<this.grades[1]) {
		finalgrade=this.grades[0]*0.1+this.grades[1]*0.9;
		return finalgrade;
	}
	else {
		finalgrade = avgGrades();
		return finalgrade;
	}
	}

		

}


