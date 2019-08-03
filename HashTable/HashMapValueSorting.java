package Hashing;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;
class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			    new Sorting().sortByFreq(arr, size);
			    System.out.println();
			n--;
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Sorting
{
    static void sortByFreq(int arr[], int n)
    {
        class comparator implements Comparator<Map.Entry<Integer,Integer>>
{

	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
	{
		if(o1.getValue() > o2.getValue())
			return -1;
		else if(o1.getValue() == o2.getValue())
			return 0;
		else if(o1.getValue() < o2.getValue())
			return 1;
		
		return Integer.MIN_VALUE;
	}
	
}
class Sorting
{
    static void sortByFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < n; i++)
		{
				int num = arr[i];
				
				if(map.containsKey(num))
				{
					map.put(num, map.get(num) + 1);
				}
				else
				{
					map.put(num, 0);
				}
		}
			
		List<Map.Entry<Integer,Integer>> set = new ArrayList<Map.Entry<Integer,Integer>> (map.entrySet());
		Collections.sort(set,new comparator());
		for(int i = 0;i<map.size();i++)
		{
			int count = set.get(i).getValue();
			while(count >= 0)
			{
					System.out.print(set.get(i).getKey() + " ");
					count -- ;
			}
		}
    }
}

    }
}