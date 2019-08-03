package String;
/*Given a string str. The task is to find the maximum occurring character in the string str. 
 * If more than one character occurs maximum number of time then print the lexicographically 
 * smaller character.
 * 
 */
import java.io.*;
class MaximumOccuringcharacter
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     MaxOccur obj = new MaxOccur();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
/*This is a function problem.You only need to complete the function given below*/
class MaxOccur{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String S)
    {
        int max=0,temp=0;
        char c='a';
        int[] arr = new int[123];
        for(int i=0;i<S.length();i++)
        {
            int k=(int)S.charAt(i);
            arr[k]+=1;
            if(arr[k]>max)
            {
                max= arr[k];
                c = S.charAt(i);
            }
            else if(arr[k]==max)
            {
                if((int)c>k)
                {
                    c=(char)k;
                }
            }
        }
        return c;
    }
    
}
