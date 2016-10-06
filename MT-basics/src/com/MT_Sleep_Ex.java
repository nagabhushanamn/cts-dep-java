package com;

import java.util.concurrent.TimeUnit;

public class MT_Sleep_Ex {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " step-1");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " step-2");
	}

}
