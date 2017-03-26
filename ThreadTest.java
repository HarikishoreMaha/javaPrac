package com.app;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Thread11 t1 = new Thread11();
		Thread12 t2= new Thread12();
		t1.start();
		t1.sleep(5000);
		t2.start();
	}

}


class Thread11 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
			if (i==0) {
				//System.out.print("not en even number not an odd number");
				}
			else if (i%2==0) {
				System.out.print("\t"+i);
				
			}
		}System.out.println();
	}
}

class Thread12 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i%2!=0) {
				
				System.out.print("\t"+i);
				
			}
			
		}
		
	}
}