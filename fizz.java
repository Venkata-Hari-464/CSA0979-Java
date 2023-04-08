import java.util.*;
class fizz
{
public static void main(String[] args)
{
 try
 {
int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value");
 n=sc.nextInt();
if (n%5==0 && n%3==0)
System.out.println("FizzBuzz");
else if (n%5==0)
System.out.println("Buzz");
else if (n%3==0)
System.out.println("Fizz");
else
 System.out.println("Enter a number divisible by 3 or 5");
}
 catch(Exception e)
 {
 System.out.println("Due to character exception");
 }
}
}
