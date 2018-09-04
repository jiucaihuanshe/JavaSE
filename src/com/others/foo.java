package com.others;

public class foo {
	public static void main(String[] args) {
//		String s = null;
//		System.out.println("s="+s);
		//new Base().test();
//		System.out.println(89 >>1);
//		int i = 0xFFFFFFF1;
//		int j = ~i;
//		System.out.println(i);
//		System.out.println(j);
		
		int foo = (int) Math.max(1,2);
		int foo1 = (int) Math.min(1.2,1.3);
		int foo2 = (int) Math.abs(1.2);
		int foo3 = (int) Math.ceil(1.2);
		System.out.println(foo);
		System.out.println(foo1);
		System.out.println(foo2);
		System.out.println(foo3);
		
	}
}

class Base {
	void test() {
		System.out.println(6 + 6 + "(Result)");
	}
}


