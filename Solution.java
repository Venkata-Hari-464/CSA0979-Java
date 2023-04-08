import java.io.*;
import java.util.*;
public class Solution 
{  
    public static void main(String[] args) {  
        String str1, str2;  
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first string : ");
        str1=sc.nextLine(); 
        System.out.println("Enter the Second string : ");
        str2=sc.nextLine(); 
        if(str1.length() != str2.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else { 
            str1 = str1.concat(str1);  
                          if(str1.indexOf(str2) != -1)  
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  
    }  
}
