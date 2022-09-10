//3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

import java.util.*;
class ass3 {
public static void main(String[] args){
int total_cost , quantity,purchaseamt,discount;
System.out.println("enter a quantity");
Scanner sc = new Scanner(System.in);
quantity=sc.nextInt();
purchaseamt=quantity*100;
if (purchaseamt>1000)
{
discount=(10/100)*purchaseamt;
total_cost=purchaseamt-discount;
System.out.println(total_cost);
}
else
{
System.out.println(purchaseamt);
}																			
}
}