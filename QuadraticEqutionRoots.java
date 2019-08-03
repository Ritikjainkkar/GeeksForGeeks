import java.util.Scanner;

class roots
{
	double a,b,c,temp_a,temp_b,temp_c,cot;
	Scanner scr = new Scanner(System.in);
	public int fist()
	{
		int itration=0;
		itration = scr.nextInt();
		return itration;
	}
	public void secound()
	{
		a = scr.nextFloat();
		b = scr.nextFloat();
		c = scr.nextFloat();
		if((b*b - (4*a*c))<0)
		{
			System.out.println("imaginary");
		}
		else
			root();
	}
	public void root()
	{
		temp_a = Math.floor((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
		temp_b = Math.floor((-b - Math.sqrt(b*b - 4*a*c))/(2*a));
		System.out.println((int)temp_a+" "+(int)temp_b);
	}
}
public class QuadraticEqutionRoots 
{
	public static void main(String[] args)
	{
		int itration=0;
		roots rot = new roots();
		itration = rot.fist();
		while(itration>0)
		{
			rot.secound();
			itration--;
		}
	}
}
