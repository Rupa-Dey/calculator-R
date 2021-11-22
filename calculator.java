import java.lang.*;
public class calculator{
	public static void main(String[] args)
	{
		int result = sum(6,8);
		int div = division(10,30);
		int sub = subtraction(12,5);

		System.out.println(result);
		System.out.println(div);
		system.out.println(sub);
	}
	static int sum(int x,int y)
	{
		return x+y;
	}
	static int division(int x,int y)
	{
		return y/x;
	}
	static int subtraction(int x,int y)
	{
		return x-y;
	}

	
}