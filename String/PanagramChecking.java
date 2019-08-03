package String;
/*
 * Given a string check if it is Pangram 
 * or not. A pangram is a sentence containing every letter in the English Alphabet.
 */
import java.io.*;
//Position this line where user code will be pasted.
class PanagramChecking 
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new solve().checkPanagram (s)==true?1:0);
	  }
	  
	 }
}
/*This is a function problem.You only need to complete the function given below*/
class solve
{
    public static boolean checkPanagram  (String s)
    {
        s = s.toLowerCase();
        if(s.length()<26)
            return false;
        int[] a=new int[200];
        for(int i=0;i<s.length();i++)
            a[s.charAt(i)]+=1;
        for(int i=97;i<123;i++)
        {
            if(a[i]>0)
                continue;
            else
                return false;
        }
        return true;
    }
}