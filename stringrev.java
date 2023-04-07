import java.util.*; 
import java.io.*; 
class stringrev 
{ 
 public static void main(String[] args) 
 { 
 
 String a,b=""; 
 char c; 
 int d=0; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the string:"); 
 a=sc.next(); 
 d=a.length(); 
 
 for(int j=d-1;j>=0;j--) 
 { 
 b=b+a.charAt(j); 
 
 }
System.out.println("The Reverse of the string is:"+ b); 
 
} 
} 