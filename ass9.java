//9.Modify the above question to allow student to sit if he/she has medical cause.
// Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.*;

class ass9{

public static void main(String[] args){

double no_of_class_held,no_of_class_attend,attendance;

System.out.println("enter no of class held");

Scanner cs = new Scanner(System.in);

no_of_class_held=cs.nextDouble();

System.out.println("enter no of class attend");

Scanner sc = new Scanner(System.in);

no_of_class_attend=sc.nextDouble();

attendance = (no_of_class_attend/no_of_class_held)*100;

if (attendance>75.0){

System.out.println("you can attend the exam because your attendance is " + attendance);


}

else{
System.out.println("Do you have any medical issue");
Scanner sc1 = new Scanner(System.in);
char medical = sc1.next().charAt(0);
if (medical=='y' || medical=='Y'){
System.out.println("you are elligible for exam because you have a medical issue");
}
else{
System.out.println("you are not elligible for exam");
}
} 

}

}