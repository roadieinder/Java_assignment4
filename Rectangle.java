import java.util.Scanner;
class Rectangle
{
int CalculateArea()
{
int length,width;
System.out.println("Enter the value of length");
length=new Scanner(System.in).nextInt();
System.out.println("Enter the value of width");
width=new Scanner(System.in).nextInt();
int area=length*width;
return area;
}
public static void main(String[] args)
{
Rectangle r=new Rectangle();
System.out.println("Area of Rectangle="+r.CalculateArea());
}
}








