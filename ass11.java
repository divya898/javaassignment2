//11.Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.*;
class ass11{
public static  void main(String[] args){
System.out.println("enter a charecter");
Scanner sc = new Scanner(System.in);
char alpha = sc.next().charAt(0);
if (alpha >= 'a' &&  alpha <='z'){
System.out.println("you entered lowercase charecter"); 
}
else {
System.out.println("you entered uppercase charecter");
}
}
}