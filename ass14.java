//3.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
//INPUT : 1234        OUTPUT : 4321
//INPUT : 5982        OUTPUT : 2895


import java.util.Scanner;  
public class ass14 
{  
public static void reverseNumber(int number)   
{  
if (number < 10)   
{   
System.out.println(number);  
return;  
}  
else   
{  
System.out.print(number % 10);  
reverseNumber(number/10);  
}  
}  
public static void main(String args[])  
{  
System.out.print("Enter the number that you want to reverse: ");  
Scanner sc = new Scanner(System.in);  
int num = sc.nextInt();  
System.out.print("The reverse of the given number is: ");  
reverseNumber(num);  
}  
}  
