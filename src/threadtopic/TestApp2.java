package threadtopic;
// TestApp2 -- Object--thread
// 1) By extending "Thread class"
public class TestApp2 extends Thread
{
	@Override
	public void run() 
	{
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("Hi I am Daemon Thread : " + Thread.currentThread().getName());
		} else 
		{
			for (int i = 1; i <=5; i++) 
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println("Task - "+ i +" - "+Thread.currentThread().getId()+ " - " + Thread.currentThread().getName());
			}
		}
	}
	// JVM---main thread
	public static void main(String[] args) 
	{
		TestApp2 thread1 = new TestApp2();
		TestApp2 thread2 = new TestApp2();
		TestApp2 thread3 = new TestApp2();
		TestApp2 thread4 = new TestApp2();
		TestApp2 thread5 = new TestApp2();
		
		thread1.setName("DhirajSir");
		thread2.setName("TejasSir");
		thread3.setName("MadhusudhanSir");
		thread4.setName("SameerSir");
		thread5.setName("RahulSir");
		
		
		//start();----"Thread class"---thread1---object--"Thread"---CallStack--Parralle executioin

//		try 
//		{
//			thread1.join(2000);
//		} catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		
//		thread1.start();// Thread-0 // IllegalThreadStatException
		thread1.setDaemon(true);
		
		thread1.start();// Thread-0 
		thread2.start();// Thread-1 
		thread3.start();// Thread-2 
		thread4.start();// Thread-3 
		thread5.start();// Thread-4 
	}
}
