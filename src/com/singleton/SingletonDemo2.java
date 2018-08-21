package com.singleton;

public class SingletonDemo2 {
	//懒汉式
	private SingletonDemo2(){}
	private static SingletonDemo2 single = null;
	public synchronized static SingletonDemo2 getInstance(){
		if(single==null){
			single = new SingletonDemo2();
		}
		return single;
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}