public class typecasting {
  
public static void main(String[] args) {
  

//Widening Casting(lower datatype to upper datatype)
int a = 10;

double d = a;   //Automatically converted to double

System.out.println(d);

//Narrowing casting(upper dataype to lower data type)
double d1 = 10.5;

int i = (int) d1;   //Manually converting to int

System.out.println(i);

int b = 257;

byte c = (byte) b;   // output will be 1 because of modular arithmetic

System.out.println(c);


}

}
