/* 
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
import java.util.*;
class ass8{
public static void main(String[] args){
double no_of_class_held,no_of_class_attend,attendance;
System.out.println("enter no of class held");
Scanner cs = new Scanner(System.in);
no_of_class_held=cs.nextDouble();
System.out.println("enter no of class attend");
Scanner sc = new Scanner(System.in);
no_of_class_attend=sc.nextDouble();
attendance = (no_of_class_attend/no_of_class_held)*100;
if (attendance<75.0){
System.out.println("you are not allowed to sit in the exam because your attendance is " + attendance);
}
else{
System.out.println("you can attend the exam because your attendance is " + attendance);
} 
}
}