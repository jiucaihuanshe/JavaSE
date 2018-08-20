package com.others;

public class InterviewSubject {
	public static void main(String[] args) {
		//1. 主流的关系型数据库有Oracle、DB2、Microsoft SQL Server、Microsoft Access、MySQL
		//非关系型数据库有NoSql，Cloudant。 
		//临时性键值存储（memcached、Redis）、永久性键值存储（ROMA、Redis）、面向文档的数据库（MongoDB、CouchDB）、面向列的数据库（Cassandra、HBase）

		//2. volatile关键字能保证线程安全吗？不能
		/* volatile是不能保证线程安全的，它只是保证了数据的可见性，不会再缓存，每个线程都是从主存中读到的数据，而不是从缓存中读取的数据.
		 * volatile是一种轻量级的同步机制，它主要有两个特性：一是保证共享变量对所有线程的可见性；二是禁止指令重排序优化。
		 * 同时需要注意的是，volatile对于单个的共享变量的读/写具有原子性，但是像num++这种复合操作，volatile无法保证其原子性
		 */
		
		//3.不通过构造函数也能创建对象吗？能
		//Java创建对象的几种方式： 
		//(1) 用new语句创建对象，这是最常见的创建对象的方法。 
		//(2) 运用反射手段,调用java.lang.Class或者java.lang.reflect.Constructor类的newInstance()实例方法。 
		//(3) 调用对象的clone()方法。 
		//(4) 运用反序列化手段，调用java.io.ObjectInputStream对象的 readObject()方法。
		
	}
}
