package String;

/*Given a string str containing alphanumeric characters.
 *The task is to calculate sum of all the numbers present in the string.
 * 
 */

import java.util.*;
import java.io.*;
class SumOfNumberInString  {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        SumNumbers obj = new SumNumbers();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}
/*This is a function problem.You only need to complete the function given below*/

class SumNumbers{
    // Function to find the sum of all
    // the numbers in the given string s
    public static long findSum(String s)
    {
        String[] str = s.split("[a-z]");
        long sum=0;
        for(int i = 0; i < str.length; i++)
        {
            if(!str[i].equals(""))
                sum = sum+ Integer.parseInt(str[i]);
        }
        return sum;
        
    }
    
}