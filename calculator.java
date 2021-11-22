import java.lang.*;
public class calculator{
	public static void main(String[] args)
	{
		int result = sum(6,8);
		int div = division(10,30);

		System.out.println(result);
		System.out.println(div);
	}
	static int sum(int x,int y)
	{
		return x+y;
	}

	static int division(int x,int y)
	{
		return y/x;
	}
	
}