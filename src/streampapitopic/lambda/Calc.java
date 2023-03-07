package streampapitopic.lambda;

@FunctionalInterface
public interface Calc 
{
	// 1) Dm's
	// 2) Mf's---abstract [Single]--Functional Interface
	// 3) static method
	// 4) default method
	// 5) private method

	// 1) NR-WA
	public abstract int addFun(int no1,int no2);
	
}
