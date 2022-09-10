//10.
//If
//x = 2
//y = 5
//z = 0
//then find values of the following expressions:
//a. x == 2
//b. x != 5
//c. x != 5 && y >= 5
//d. z != 0 || x == 2
//e. !(y < 10)

class ass10{
public static void main(String[] args){
int x=2,y=5,z=0;
if (x==2){
System.out.println("true");
}
else{
System.out.println("false");
}
if (x!=5){
System.out.println("true");
}
else{
System.out.println("false");
}
if (x!=5 && y>=5){
System.out.println("true");
}
else{
System.out.println("false");
}

if (z != 0 || x == 2){
System.out.println("true");
}
else{
System.out.println("false");
}

if (!(y < 10)){
System.out.println("true");
}
else{
System.out.println("false");
}



}
}
