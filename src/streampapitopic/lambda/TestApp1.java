package streampapitopic.lambda;

public class TestApp1 implements Calc
{
	@Override
	public int addFun(int no1,int no2) 
	{
		return (no1+no2);
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		int ans = obj.addFun(10,20);
		System.out.println("Addition : " + ans);
	}
}
