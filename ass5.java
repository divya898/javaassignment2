/*
5.A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/
import java.util.*;
class ass5 {
public static void main(String[] args) {
    System.out.println("enter marks of student");
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
	if(marks<0){
	System.out.println("invalid no.");
	}	
    else if (marks<25){
        System.out.println("F");
    }
    else if (marks>25 && marks <= 45) {
        System.out.println("E");
    }
    else if (45>marks && 50 <= marks ){
        System.out.println("D");
    }
    else if (50>marks && 60 <= marks){
        System.out.println("C");

    }
    else if (60 > marks && 80 <= marks){
        System.out.println("B");

    }
    else if (marks > 80 ){
        System.out.println("A");

    }
}
}
