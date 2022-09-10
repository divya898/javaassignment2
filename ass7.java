//7.Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1
import java.util.*;
class ass7{
public static void main(String[] args){
int no ;
System.out.println("enter a num");
Scanner sc = new Scanner(System.in);
no = sc.nextInt();
if (no<0){
no=no*(-1);
}
System.out.println("absno is " + no);
}
}

