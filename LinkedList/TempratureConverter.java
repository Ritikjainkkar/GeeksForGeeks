import java.util.Scanner;

class converter
{
	int temp,result,cot;
	Scanner scr = new Scanner(System.in);
	public int fist()
	{
		int itration=0;
		itration = scr.nextInt();
		return itration;
	}
	public void secound()
	{
		temp = scr.nextInt();
	}
	public int convert()
	{
		result = (temp*9)/5;
		return (result+32);
	}
}
public class TempratureConverter 
{
	public static void main(String[] args)
	{
		int itration=0,result=0;
		converter con = new converter();
		itration = con.fist();
		while(itration>0)
		{
			con.secound();
			result=con.convert();
			System.out.println(result);
			itration--;
		}
	}
}
