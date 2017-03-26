package com.app;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Thread_even_odd {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();

		Thread2 t2= new Thread2();

		t2.start();

	}

}


class Thread1 extends Thread{


	public void run() {
		for (int i = 5; i <=10; i++) {
				if (i%2==0) {
					System.out.print("\t"+i);

				}
		}
		
		System.out.println();

	}
}


class Thread2 extends Thread
{
	public void run() {
		for (int i = 5; i <=10; i++) {
			if (i%2!=0) {
				System.out.print("\t"+i);
			}
			
		}
		
		
		
	}	


}