package streampapitopic.lambda;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		
//		Calc calc =		() ->
//						{
//							System.out.println("Addition : " + (10+20));
//						};

//		Calc calc =		(no1,no2) -> System.out.println("Addition : " + (no1+no2));
						
//		Calc calc =	(no1,no2) ->
//					{
//						return (no1+no2);
//					};

		Calc calc =	(no1,no2) -> (no1+no2);

		int ans = calc.addFun(10,20);
		
		System.out.println("Addition : " + ans);
	}
}
