package String;
/*Ishaan is playing with strings these days. He has found a new string. He wants to modify it
 *  as per the following rules :
The string should not have three consecutive same characters (Refer example for explanation).
He can add any number of characters anywhere in the string. Find the minimum number of 
characters which Ishaan must insert in the string.
 * 3
aabbbcc
aaaaa
abcddee
Output : 
1
2
0
 */
import java.util.*;
class ModifiedString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            String a = "";
            a = sc.next();
            System.out.println(new solve().modified(a));
        }
    }
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static long modified(String a)
    {
        int n = a.length();
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            char c = a.charAt(i);
            if((c==a.charAt(i+1))&&(c==a.charAt(i+2)))
            {
                i++;
                count++;
            }
        }
        return count;
    }
}