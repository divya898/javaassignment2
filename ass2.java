//2.Take two int values from user and print greatest among them.
import java.util.*;
class ass2 {
public static void main(String[] args){
int no1 ,no2;
System.out.println("enter a 1st no.");
Scanner sc = new Scanner(System.in);
no1=sc.nextInt();
System.out.println("enter a 2nd no.");
Scanner cs = new Scanner(System.in);
no2=cs.nextInt();
if (no1>no2)
{
System.out.printf("%d no is greater" , no1 );
}
else{
System.out.printf("%d no is greater", no2);
}
}
}