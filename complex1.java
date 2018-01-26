class complex1
{
int real;
int imag;
complex1(int real,int imag)
{
this.real=real;
this.imag=imag;
}
void display()
{
System.out.println("complex no is="+this.real+"+"+this.imag+"i");
}
public static void main(String[] args)
{
complex1 c=new complex1(2,5);
c.display();
}
}
