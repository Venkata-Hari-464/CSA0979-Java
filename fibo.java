import java.io.*;
import java.util.*;
class fibo
 {
static int fib(int n)
{
if (n==0||n==1)
return 0;
else if(n==2)
return 1;
return fib(n - 1) + fib(n - 2);
}
public static void main(String args[])
{
int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of n : ");
 n=sc.nextInt();
System.out.println(fib(n));
}
}
