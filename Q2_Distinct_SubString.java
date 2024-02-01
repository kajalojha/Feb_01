package Feb1_Assignment;
import java.util.Arrays;
import java.util.Scanner;
//Distinct Substrings
//Problem statement
//You are given a string 'S' of length 'N' consisting of lowercase English letters. You want all substrings of the string
// 'S' to be distinct. You are allowed to change characters at some positions to some other lowercase English letters.
//
//You have to find the minimum number of changes required to make all the substrings of the string distinct or return -1
// if you can't make it.
//
//A substring is a contiguous subsegment of a string. For example, "acab" is a substring of "abacaba" (it starts in position
// 3 and ends in position 6), but "aa" or "d" aren't substrings of this string.
//
//
//Hint:
//Think about substrings of length one.
//For Example:-
//Let 'N' = 3, 'S' = "aac".
//You can change characters at index 2 to some other character (1-based indexing).
//Like 'S' = "abc".
//All substrings of 'S' are "a", "b", "c", "ab", "bc", "abc", all of which are distinct.
//So the answer is 1.
//Sample Input 1:-
//        2
//        3
//abc
//4
//xxyz
//Sample Output 1:-
//        0
//        1
//Explanation of sample input 1:-
//First test case:-
//No changes are required.
//So the answer is 0.
//
//Second test case:-
//You can change the character at index 1 to some other character (1-based indexing).
//Like 'S'="bxyz".
//So the answer is 1.
public class Q2_Distinct_SubString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        int count = 0 ;
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
         str = String.valueOf(ch);
        System.out.println(str);
        for(int i=1 ;i<str.length();i++)
        {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i-1);
            if(c1==c2)
            {
                count++;
            }
//            System.out.println(count);
        }
        System.out.println(count);

    }
}
