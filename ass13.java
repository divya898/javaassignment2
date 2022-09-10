/*
2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
*/
import java.util.*;
class ass13{
public static void main(String[] args){
System.out.println("enter your age");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
System.out.println("enter your gender");
Scanner cs = new Scanner(System.in);
char sex = cs.next().charAt(0);
System.out.println("are you married");
Scanner sc1 = new Scanner(System.in);
char marital = sc1.next().charAt(0);

if (age<20 || age>60){
System.out.println("ERROR");}
else if (sex == 'f' || sex == 'F'){
System.out.println("you can only work in urban area");}
else if ((sex=='m'|| sex=='M') && (age >= 20 && age < 40)){
System.out.println("you can work anywhere");
} 
else if ((sex == 'm' || sex == 'M') && (age >= 40 && age <=60 )){
System.out.println("you can only work in urban area");}
}
}
