package com.others;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

//观察类，是否编译错误
public class Q6db8 {
	int a;
	int b=0;
	static int c;
	public void m(){
		int d;
		int e=0;
		a++;
		b++;
		c++;
		//d++; d编译错误
		e++;
	}
	
	@Test
	public void n(){
		int x[] = new int[25];
		System.out.println(x[24]);	//0
		System.out.println(x.length);	//25
	}
	
	@Test
	public void b(){
		int j = 1;
		for(int i=0;i<10;i++){
			j=j++;
			//j=++j;
			//j=j+1;
			//j+=1;
			System.out.println(j);//11 11
		}
	}
	
	@Test
	public void v(){
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				if(i==j){
					continue;	//结束单次循环
				}
				System.out.println("i="+i+"j="+j);
			}
		}
	}
	
	/**
	 * 	String：适用于少量的字符串操作的情况
	 *	StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况
	 *	StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况
	 */
	@Test
	public void c(){
		String s = "abcde";
		StringBuffer s1 = new StringBuffer("abcde");
		if(s.equals(s1)){
			s1 =null;
		}
		if(s1.equals(s)){
			s =null;
		}
		//编译成功，运行成功
	}
	
	public static void main(String[] args) {
		Holder h = new Holder();
		h.held =100;
		h.bump(h);
		System.out.println(h.held); //101
	}
	
	/**
	 * SELECT * FROM t_ordertype t1 JOIN t_order t2 ON t1.typeid=t2.typeid JOIN t_orderitem t3 ON t2.orderid=t3.orderid
	 * WHERE t1.name='abc' AND t3.money_detail>60 AND t2.orderdate='2017-1-1'acc_item
	 * 
	 * SELECT * FROM acc_item WHERE charge>100 ORDER BY charge DESC, acct_id
	 */
	
	@Test
	public void x(){
		String str = "abc&com&cn";
		String[] s = str.split("&"); // \\. 点的话需要转义，不然无输出
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
}
class Holder{
	public int held;
	public void bump(Holder theHolder){
		theHolder.held++;
	}
}

