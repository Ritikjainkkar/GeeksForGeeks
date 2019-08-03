package String;

import java.util.*;
class RepetingLeftMostCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String str = sc.next();
            int index = new Repeatation().repeatedCharacter(str);
            if(index == -1)
                System.out.println("-1");
            else
                System.out.println(str.charAt(index));
        }
        sc.close();
    }
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Repeatation
{
    static int repeatedCharacter(String S)
    {
        int[] arr = new int[123];
        for(int i=0;i<S.length();i++)
            arr[S.charAt(i)]+=1;
        for(int i=0;i<S.length();i++)
        {
            if(arr[S.charAt(i)]>1)
                return i;
        }
        return -1;
    }
}
