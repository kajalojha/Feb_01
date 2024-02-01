package Feb1_Assignment;
import java.util.*;
//Total Strings
//
//Problem statement
//You are given a positive integer 'N'. Your task is to find the number of strings of length ‘N’ that can be
// formed using only the characters ‘a’, ‘b’ and ‘c’. The strings formed should be such that the number of
// ‘b’ and ‘c’ in the string is at most 1 and 2, respectively.
//
//        Example:
//Let’s say N = 2. The strings of length 2, which satisfy the given constraints are:
// “aa”, “ab”, “ac”, “ba”, “bc”, “ca”, “cb”, “cc”. Hence, the output is 8.
//
//Sample Input 1:
//        2
//        2
//        3
//Sample Output 1:
//        8
//        19
//Explanation 1:
//For the first test case, refer to the example explained before.
//
//For the second test case, N = 3. The strings of length 3, which satisfy the given constraints
// are: “aaa”, “aab”, “aac”, “aba”, “abc”, “aca”, “acb”, “acc”, and so on.
// There are a total of 19 possible strings.
public class Q5_Total_Strings
{
    public static  void permute(char[] ar, int fi){
        if(fi==ar.length-1){
            System.out.println(ar);
            return;
        }
        for(int i = fi ;i<ar.length ;i++)
        {
             swap (ar,i,fi);
             permute(ar , fi+1);
             swap(ar,i,fi);
        }
    }
    static  void swap(char[] ar ,int i , int fi){
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.next();
        permute(str.toCharArray(), 0);



    }
}
