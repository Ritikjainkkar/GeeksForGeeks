package Hashing;
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class SubarrayRangeWithSum
{
	public static void main (String[] args)
	 {
  	 Scanner sc=new Scanner(System.in);
  	 int t=sc.nextInt();
  	 while(t-->0)
  	 {
  	        int n = sc.nextInt();
  		    int arr[] = new int[n];
  		    for(int i=0;i<n;i++)
  		    {
  		        arr[i] = sc.nextInt();
  		    }
  		    int sum = sc.nextInt();
  		    System.out.println(new sumRange().subArraySum(arr, n, sum));
  		    
  		}
	}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class sumRange
{
  static int subArraySum(int arr[], int n, int sum)
  {
    int mod[] = new int[n];
    mod[0] = arr[0];
    
    // storing the prefix sum
    for(int i=1;i<mod.length;i++)
    {
  	 mod[i] = arr[i] + mod[i-1];
    }
  
      HashMap<Integer,Integer> hm = new HashMap();
  	  int count = 0;
      hm.put(0,1);
      
      // iterate over the array
      // and check if you can find the mod[i] - sum
      // if it is there in hash, then add the count of that
      for(int i=0;i<mod.length;i++)
  	{
  		  int find = mod[i] - sum;
  		 if(hm.containsKey(find))
  		  {
  		      int v = hm.get(find);
  		      count+=v;
  		  }
  		  else if(find == 0)
  		  {
  		      count+=1;
  		  }
  		  if(hm.containsKey(mod[i]))
  		  {
  		    int v = hm.get(mod[i]);
  		     hm.put(mod[i],v+1);
  		  }
  		 else
  		 {
  		    hm.put(mod[i],1);
  		  }
  	}
  	return count;
  }
}
