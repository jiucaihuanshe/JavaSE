package com.singleton;

public class SingletonDemo1 {
	//饿汉式：在类初始化时，已经自行实例化
	//私有的默认构造函数
	private SingletonDemo1(){}
	//已经自行实例化
	private static final SingletonDemo1 single = new SingletonDemo1();
	//静态工厂方法
	public static SingletonDemo1 getInstance(){
		return single;
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(SingletonDemo1.getInstance().hashCode());
	}
}
