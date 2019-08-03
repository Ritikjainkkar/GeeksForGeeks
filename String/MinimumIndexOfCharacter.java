package String;
/*
 * Given a string str and another string patt. Find the character in patt that is present at the 
 * minimum index in str. If no character of patt is present in str then print ‘No character 
 * present’.
 */
import java.util.*;
//Position this line where user code will be pasted.
class MinimumIndexOfCharacter {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    new solve().solution(s1, s2);
		    System.out.println();
		}
		sc.close();
	}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static void solution(String s1, String s2)
    {
        int[] a= new int[200];
        for(int i=0;i<s2.length();i++)
        {
            a[s2.charAt(i)]+=1;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(a[s1.charAt(i)]>0)
            {
                System.out.print(s1.charAt(i));
                break;
            }
            if(i==s1.length()-1)
                System.out.print("No character present");
        }
    }
}
