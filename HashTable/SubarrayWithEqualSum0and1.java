package Hashing;

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
{
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] a = new int[n];
	       for(int i=0;i<n;i++) {
	           a[i] = in.nextInt();
	       }
	       System.out.println(new countsubArray().countSubarrWithEqualZeroAndOne(a, n));
	   }
	 }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class countsubArray
{
  static int countSubarrWithEqualZeroAndOne(int a[], int n)
  {
      HashMap<Integer,Integer> hm = new HashMap<>();
      int sum =0;
	       int flag=0;
	       for(int i=0;i<n;i++){
	           if(a[i] == 0){
	               a[i] =-1;
	           }
	           sum = sum+a[i];
	           if(sum == 0){
	               flag++;
	           }
	           if(hm.containsKey(sum))
	           flag += hm.get(sum);
	           if(!hm.containsKey(sum))
	           hm.put(sum,1);
	           else{
	               int x =hm.get(sum);
	               hm.put(sum,x+1);
	           }
	       }
	       return flag;
  }
}
