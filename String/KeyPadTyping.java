package String;
/*
 * You are given a string S of alphabet characters and the task is to find its matching decimal 
 * representation as on the shown keypad. Output the decimal representation corresponding to 
 * the string. For ex:  
 * if you are given “amazon” then its corresponding decimal representation will be 262966.
 */
import java.io.*;
class KeyPadTyping
 {
    static int[] a = new int[124];
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int k=2;
        char c;
	     for(int i=97;i<123;k++)
	     {
	         if(k==7 || k==9)
	         {
	             int times =4;
	             while(times-->0 && i<123)
	             {
	                 a[i++]=k;
	             }
	         }
	         else
	         {
	             int time=3;
	             while(time-->0 && i<123)
	             {
	                 a[i++]=k;
	             }
	         }
	     }
        while(tc-->0)
        {
            String s1 = br.readLine();
            check(s1);
        }
	 }
	 public static void check(String s1)
	 {
	     for(int i=0;i<s1.length();i++)
	     {
	         int c=(int)s1.charAt(i);
	         System.out.print(a[c]);
	     }
	     System.out.println();
	 }
}