package Hashing;
import java.util.*;
import java.lang.*;
import java.io.*;

class ZeroSum {
	public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
        Integer testCases = in.nextInt();
        while (testCases--!=0){
            Integer sizeOfArray = in.nextInt();
            int[] array = new int[sizeOfArray];
            for(int i = 0 ;i< sizeOfArray;i++){
                array[i] = in.nextInt();
            }
            s(array);
        }
    }

    public static void s( int[] a){
        int c = 0;
        int s = 0;
        HashMap<Integer, Integer> ss = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < a.length; i++){
            s = s + a[i];
            if (s == 0)//if prefix sum is zero that means we encounter a zero sum subarray
                c++; //hence we increment the counter
            if(ss.containsKey(s)){//If map contains the sum. This means we have previously seen the sum
                c = c + ss.get(s);
                ss.put( s , ss.get(s) + 1);  //increment value of key
            }else {
                ss.put(s , 1); //put value as 1 for key s
            }
        }
        System.out.println(c);//print the answer
    }

}

S