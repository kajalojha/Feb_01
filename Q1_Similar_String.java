package Feb1_Assignment;
import javax.swing.*;
import java.util.*;
//.Similar Strings
//Problem statement
//You are given two strings, ‘A’ and ‘B’ each of length ‘N’. Your task is to print 1 if ‘A’ is similar to ‘B’.
//
//Note :
//String ‘A’ is said to be similar to string ‘B’ if and only if
//        1. ‘A’ is equal to ‘B’.
//        2. Divide both ‘A’ and ‘B’ into two – two strings ‘A1’, ‘A2’ , ‘B1’ and ‘B2’ such that both of them('A1' and 'A2') have same size. Then at least one of the following must hold true:
//a. ‘A1’ is similar to ‘B1’ and ‘A2’ is similar to ‘B2’.
//b. ‘A1’ is similar to ‘B2’ and ‘A2’ is similar to ‘B1’.
//
//Sample Input 1 :
//        2
//aa aa
//ab ba
//Sample Output 1 :
//        1
//        1
//Explanation Of Sample Input 1 :
//Test Case 1 :
//Given A = “aa” and B = “aa”
//Here A and B are equal. So A is similar to B.

public class Q1_Similar_String
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1");
        String str1 = sc.nextLine();
        System.out.println("enter the 2");
        String str2 = sc.nextLine();
        int n = str1.length();
         n = str2.length();
         if(str1.length()!= str2.length())
         {
             System.out.println("size of strings are not equal");

         }else{
             String a1 = "";
             String a2 = "";
             String b1 = "";
             String b2 = "";
             int start = 0 ;int end = n ;
             int mid =0;
             mid = (start+end)/2;
             for(int i=start ;i<mid;i++)
             {
                 a1 = a1+str1.charAt(i);
                 b1 = b1 + str2.charAt(i);
             }
             System.out.println(a1);
             System.out.println(b1);
             for(int i = mid ; i<n;i++)
             {
                 a2 = a2+str1.charAt(i);
                 b2 = b2 + str2.charAt(i);

             }
             System.out.println(a2);
             System.out.println(b2);

             if(a1.equals(b1) && a2.equals(b2) || a1.equals(b2) && a2.equals(b1))
             {
                 System.out.println("strings are equal");
             }
             else
             {
                 System.out.println("Strings are not equal");
             }

         }





    }
}
