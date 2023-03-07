package oops.polymorphism.cp;

// Function Overloadding - Mutiple Methods with Same Name ---->Same Class
//Polymorphism:- Ability to take more than one Form(method);
//--------------
//		Type's of Polymorphism
//		-----------------------
//1) CompileTime			2) RunTime
//   static Binding		   Dynamic Binding
//   early Binding		   Late Binding
//Ex:-			    Ex:-   Function	
//   Function 			   Overrdding
//   Overloadding	
//2) 				2) 
// Student s = new Student();		Person p = new Student();
//
// Person
//   |
//Student


//			Vehicle--getSpec()
//			   |
//	------------------------------------------------
//	|		   |			|
//       TW		  LMV		       HMV
//--getSpec()            --getSpec()           --getSpec()
//----------------------------------------------------------------------
			
//			RbiBank(getHomeLoanInterst())
//			   |
//	------------------------------------------------
//	|--8		   |--9			|--6
//  AxisBank		BankOfBaroda	       Sbi			
//getHomeLoanInterst()  getHomeLoanInterst()  getHomeLoanInterst()


//1) argument count
//
//2) excat DataType match---
//
//3) Type pramotion rule applay
//
//void addFun(int no1,int no2)
//{
//
//}
//void addFun(float no1,float no2)
//{
//
//}
//addFun(10,20);

public class TestApp1 
{
	// 1) By changing number of arguments
	void addFun() // Arjit
	{
		
	}
	void addFun(int no1,int no2)// rahul 
	{
		
	}
	void addFun(float no1,float no2)// by Arijit
	{
		
	}
	void addFun(int no1,int no2,int no3)// shreyanshi
	{
		
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun
		
	}
}
