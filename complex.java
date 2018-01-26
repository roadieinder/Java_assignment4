class complex
{
int r,i;
complex () 
{
}
complex(int real,int imag)
{
r=real;
i=imag;
}
complex add(complex c1,complex c2)
{
complex s=new complex();
s.r=c1.r+c2.r;
s.i=c1.i+c2.i;
return s;
}
public static void main(String[] args)
{
complex c1=new complex(1,2);
complex c2=new complex(3,4);
complex c3=new complex();
c3=c3.add(c1,c2);
System.out.println("sum="+c3.r+"+"+c3.i+"i");
}
}