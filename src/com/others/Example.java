package com.others;

public class Example {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch);
	}

	public void change(String str, char ch[]) {
		//System.out.println(str);
		str = "test ok";
		//System.out.println(str);
		ch[0] = 'g';
	}
}
