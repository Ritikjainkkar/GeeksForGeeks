package String;
/* Given a string S of lowercase aplhabets, 
 * check if it is isogram or not. An Isogram is a string in which no letter occurs more than
 *  once.
 */
/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class CheckStringIsIsogramOrNot
 {
     //Position this line where user code will be pasted.
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            System.out.println(isIsogram(data)?"1":"0");
            
        }
	 }
 }
/*This is a function problem.You only need to complete the function given below*/
//This is a function problem
static boolean isIsogram(String data)
{
    int[] a = new int[150];
    for(int i=0;i<data.length();i++)
    {
        int num=(int)data.charAt(i);
        if(a[num]==0)
            a[num]+=1;
        else
            return false;
    }
    return true;
}