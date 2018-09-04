package com.singleton;

/**
 * 类的外部运行直接构建此类对象
 * 类的外部只能通过静态方法访问此对象
 * @author wangchaofan
 *
 */
public class SingletonTest {
	
}

class Singleton01{
	private Singleton01(){}
	private static Singleton01 instance;
	public static Singleton01 getInstance(){
		if(instance==null){
			instance=new Singleton01();
		}
		return instance;
	}
}
//多线程并发执行出现线程安全问题

class Singleton02{
	private Singleton02(){}
	private static Singleton02 instance;
	public static synchronized Singleton02 getInstance(){
		if(instance==null){
			instance = new Singleton02();
		}
		return instance;
	}
}
//性能问题

class Singleton03{
	private Singleton03(){}
	private static Singleton03 instance;
	public static Singleton03 getInstance(){
		if(instance == null){
			synchronized(Singleton03.class){
				if(instance==null){
					instance = new Singleton03();
				}
			}
		}
		return instance;
	}
}
//线程安全+效率  只适用于大对象，稀少用

//适用于频繁访问(小对象频繁用)
class Singleton04{
	private Singleton04(){}
	private static final Singleton04 instance = new Singleton04();
	public static Singleton04 getInstance(){
		return instance;
	}
}
//问题：假如对象比较大，类加载时候就创建了此类对象，假如不使用，就可能长时间占用资源

class Singleton05{
	private Singleton05(){}
	static class Lazy{
		public static final Singleton05 instance = new Singleton05();
	}
	public static Singleton05 getInstance(){
		return Lazy.instance;
	}
}
//何时需要何时加载