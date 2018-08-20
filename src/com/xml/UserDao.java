package com.xml;

public class UserDao
{
	public static void main(String[] args)
	{
		IConnection connection = Factory.newInstance();
		connection.open();
	}
}
