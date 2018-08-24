package com.others;

public class Child extends BaseDemo {
	void test() {
		System.out.print("Child.test()");
	}

	static public void main(String[] a) {
		Child anObj = new Child();
		BaseDemo baseObj = (BaseDemo) anObj;
		baseObj.test();
	}
}
