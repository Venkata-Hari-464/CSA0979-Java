import java.util.*;
import java.text.*;

 class StringOperations {

    public static void main(String[] args) {
        
        // i. Compare two strings lexicographically, ignoring case differences.
        String str1 = "Hello";
        String str2 = "hELLO";
        int result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result < 0) {
            System.out.println("String 1 is lexicographically smaller than String 2.");
        } else {
            System.out.println("String 2 is lexicographically smaller than String 1.");
        }
        
        // ii. Check whether a given string ends with the contents of another string.
        String mainStr = "Hello World";
        String suffixStr = "World";
        boolean endsWith = mainStr.endsWith(suffixStr);
        if (endsWith) {
            System.out.println("Main string ends with the given suffix string.");
        } else {
            System.out.println("Main string does not end with the given suffix string.");
        }
        
        // iii. Print current date and time in the specified format.
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println("Current date and time: " + formattedDate);
        
        // iv. Get the index of all the characters of the alphabet.
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = str.indexOf(ch);
            System.out.println("Index of " + ch + ": " + index);
        }
        
        // v. Replace each substring of a given string that matches the given regular expression with the given replacement.
        String inputStr = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.";
        String regexStr = "fox";
        String replacementStr = "cat";
        String outputStr = inputStr.replaceAll(regexStr, replacementStr);
        System.out.println("Output string: " + outputStr);
        
        // vi. Get a substring of a given string between two specified positions.
        String input = "Hello World";
        int startIndex = 1;
        int endIndex = 6;
        String output = input.substring(startIndex, endIndex);
        System.out.println("Substring: " + output);
        
        // vii. Trim any leading or trailing whitespace from a given string.
        String strToTrim = "   Hello World    ";
        String trimmedStr = strToTrim.trim();
        System.out.println("Trimmed string: " + trimmedStr);
        
        // viii. Convert all the characters in a string to lowercase.
        String inputString = "Hello World";
        String outputString = inputString.toLowerCase();
        System.out.println("Output string: " + outputString);
        
        // ix. Get the length of a given string.
        String lenStr = "Hello World";
        int length = lenStr.length();
        System.out.println("Length of the string: " + length);
        
        // x. Check whether two String objects contain the same data.
        String strA = "Hello World";
        String strB = "Hello World";
        boolean areEqual = strA.equals(strB);
        if (areEqual) {
            System.out.println("The two strings contain the same data.");
        } else {
            System.out.println("The two strings do not contain the same data.");
        }
    }
}
