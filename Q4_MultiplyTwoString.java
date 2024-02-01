package Feb1_Assignment;
import java.util.Scanner;
public class Q4_MultiplyTwoString
{

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the string1");
//        String str1 = sc.next();
//        System.out.println("enter the string2");
//        String str2 = sc.next();
//        int n = str1.length();
//        int m = str2.length();


    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1");
        String str1 = sc.next();
        System.out.println("enter the string2");
        String str2 = sc.next();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = str1.length();
        int m = str2.length();
        int ans =0 ;
        int pow =1;
        for(int i = n-1 ;i>=0 ;i--)
        {
            int prod = 0;
            int pr = 0 , carry =0 ,rem=0, p=1;
            for(int j = m-1 ;j>=0;j--){
                 pr = (arr1[i] - '0') * (arr2[j] - '0');
//                pr = Character.getNumericValue(arr1[i]) *    Character.getNumericValue(arr2[j])   ;
                rem = pr + carry;
                carry = rem/10;
                rem = rem%10;
                prod = prod +(rem*p);
                p= p*10;

            }
             rem= carry;
            prod = prod + rem * p;
         ans = ans + prod*pow;
           pow = pow * 10;
        }
        System.out.println(ans);
    }


    }



