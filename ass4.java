//4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
import java.util.*;
class ass4 {
public static void main(String[] args)
{
int year_of_service,your_salary,bonus;
System.out.println("enter your year of service");
Scanner sc = new Scanner(System.in);
year_of_service=sc.nextInt();
System.out.println("enter your salary");
Scanner cs = new Scanner(System.in);
your_salary=cs.nextInt();
if (year_of_service > 5)
{
System.out.println("you bonus is");
bonus=(your_salary/100)*5;
System.out.println(bonus);
}
else{
System.out.println("no bonus for you");
}
}
}
