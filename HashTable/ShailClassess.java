import java.util.Scanner;
class geter
{
	int itration;
	Scanner scr = new Scanner(System.in);
	public int Terms()
	{
		itration = scr.nextInt();
		return itration;
	}
	class input 
	{
		Scanner scr = new Scanner(System.in);
		long num1=0,num2=0,result1=0,result2=0;
		long[] dig1=new long[100];
		long[] dig2=new long[100];
		public void getNumterms()
		{
			num1 = scr.nextInt();
			num2 = scr.nextInt();
		}
		public void getdig()
		{
			for(int i=0;i<num1;i++)
			{
				dig1[i] = scr.nextLong();
				result1 = result1 + dig1[i];
			}
			System.out.println(result1);
			for(int i=0;i<num2;i++)
			{
				dig2[i] = scr.nextLong();
				result2 = result2 + dig2[i];
			}
			System.out.println(result2);
		}
		public void findColum()
		{
			if(result1 >= result2)
			{
				System.out.println("C1");
			}
			else
			{
				System.out.println("C2");
			}
		}

	}

}
public class ShailClassess 
{
	public static void main(String[] args) 
	{
		int t=0;
		geter get = new geter();
		t = get.Terms();
		geter.input i = get.new input();
		while(t>0)
		{
			i.getNumterms();
			i.getdig();
			i.findColum();
		}
	}
}
