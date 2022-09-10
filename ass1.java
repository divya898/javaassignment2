//1.Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.*;
class ass1{
public static void main(String[] args){
int length,breath;
System.out.println("enter a length");
Scanner sc = new Scanner(System.in);
length= sc.nextInt();
System.out.println("enter a breath");
Scanner cs = new Scanner(System.in);
breath= cs.nextInt();
if (length==breath)
{
System.out.println("it is a square");
} 
else
{
System.out.println("it is not a square it is rectangle");
}

}

}