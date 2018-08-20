package com.others;

//public class NULL {
//	public static void haha() {
//		System.out.println("haha");
//	}
//
//	/*public static void main(String[] args) {
//		// ((NULL) null).haha();
//		((DemoMain) null).hi();
//	}*/
//}

class NULL {
	static int value = 0;

	static int inc() {
		return value++;
	}

	static int dec() {
		return value--;
	}

	static int getResult() {
		try {
			int r1=inc();
		} finally {
			int r2=dec();
			return r2;
		}
	}

	public static void main(String[] args) {
		int r3=getResult();
		System.out.println(r3);
		System.out.println(value);
	}
}
