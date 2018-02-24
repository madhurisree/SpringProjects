package com.info.threads;

public class MyThread extends Thread{
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("value one by one  :"+i);
		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		t1.start();
		t2.start();

	}

}
