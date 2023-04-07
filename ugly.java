import java.util.*;
import java.io.*;
public class ugly {
 public static void main(String args[]) {
 int inputNumber;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number :");
 inputNumber=sc.nextInt();
 boolean check = true;
 for(int i = 2; i<=inputNumber; i++) {
 if(i!=2&&i!=3&&i!=5) {
 if(inputNumber%i==0&&checkPrime(i)) {
 check = false;
 break;
 }
 }
 }
 if(check) {
 System.out.println(inputNumber+" is an ugly number");
 } else {
 System.out.println(inputNumber+" is Not an ugly number");
 }
 }
 static boolean checkPrime(int number)
  {
    boolean flag = true;
 for(int i = 2; i<=number/2; i++) {
 if(number%i==0) {
 flag = false;
 break;
 }
 }
 return flag;
 }
}

