package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class IsomorphicString {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Isomorphic obj = new Isomorphic();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
/*This is a function problem.You only need to complete the function given below*/
class Isomorphic{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String S1,String S2)
    {
        int[] h = new int[150];
        int[] h1 = new int[150];
        if(S1.length()!=S2.length())
            return false;
        for(int i=0;i<S1.length();i++)
        {
            int c = (int)S1.charAt(i);
            int c1 = (int)S2.charAt(i);
             if(h[c]!=0)
             {
                if(h[c]==c1)
                    continue;
                else
                    return false;
             }
             else
             {
                h[c]=c1;
                if(h1[c1]!=0)
                    return false;
                h1[c1]=c;
             }
        }
        return true;
    }
}
