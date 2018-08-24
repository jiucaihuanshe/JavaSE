package com.others;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class empJDBC {
	public static void main(String[] args) throws Exception {
		// int empno = 7521;
		// String ename = "hello' or '1'='1";
		// Connection con = JDBCUtils.getConn();
		// Statement stmt = con.createStatement();
		// ResultSet rs = stmt.executeQuery("select count(*) from emp where
		// empno="+empno+" and ename='"+ename+"'");
		// rs.next();
		// System.out.println(rs.getInt(1));
		
		//new Z();
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}

class Z {
	Z() {
		Z alias1 = this;
		Z alias2 = this;
		synchronized (alias1) {
			try {
				alias2.wait(); //程序在此处等待了，没有另一个线程调用notify()来解锁，所以一直等待中
				System.out.println("DONE WAITING");
			} catch (InterruptedException e) {
				System.out.println("IN TEEEUPTED");
			} catch (Exception e) {
				System.out.println("OTHER EXCEPTION");
			} finally {
				System.out.println("FINALLY");
			}
		}
		System.out.println("ALL DONE");
	}
}