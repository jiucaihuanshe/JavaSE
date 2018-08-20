package com.others;

import java.util.UUID;

public class DemoMain
{
	public static void hi() {
		System.out.println("hi");
	}
	public static void main(String[] args)
	{
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	
	}
}
