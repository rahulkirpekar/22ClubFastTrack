package collectiontopic.listtopic;

import java.util.Vector;
import java.util.ListIterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Vector list = new Vector();
		list.add(true);//boolean---0   \\<---itr
		list.add('R');// character---1
		list.add(12);//integer----2
		list.add("Rahul");//String---3
		list.add(12L);//Long--4
		list.add(13.43f);// Float--5
		list.add(13.43);// Double--6
		Student s = new Student(1, "rahul", 12);
		list.add(s);//---7 / size---8
//		System.out.println("list.size() - " + list.size());
//		System.out.println("list.get(4) - " + list.get(4));
//		for (int i = 0; i <list.size(); i++) 
//		{
//			Object obj = list.get(i);
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		// For Each , Advanced for loop / Enhanced For Loop
//		for (Object obj : list) 
//		{
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		// Iterator way
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) 
//		{
//			Object obj = itr.next();
//			if (obj instanceof Student)    
//			{                              
//				s = (Student)obj;          
//				s.disp();                  
//			} else                         
//			{                              
//				System.out.println(obj);   
//			}                              
//		}
		
		
		// ListIterator Way
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			if (obj instanceof Student)    
			{                              
				s = (Student)obj;          
				s.disp();                  
			} else                         
			{                              
				System.out.println(obj);   
			}                              
		}
		System.out.println("--------------------");
		while(itr.hasPrevious()) 
		{
			Object obj = itr.previous();
			if (obj instanceof Student)    
			{                              
				s = (Student)obj;          
				s.disp();                  
			} else                         
			{                              
				System.out.println(obj);   
			}                              
		}
	}
}
