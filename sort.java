import java.util.Scanner;
class sort
{
public static void main(String[] args)
{
int i,j,temp;
int arr[]={3,4,1,2,5,7,9,8,6,10};
for( i=0;i<arr.length;i++)
{
for(i=0;i<arr.length;i++)
{
for(j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
}
for(i=0;i<arr.length;i++)
{
System.out.println("second largest no is="+arr[8]);
break;
}
}
}

