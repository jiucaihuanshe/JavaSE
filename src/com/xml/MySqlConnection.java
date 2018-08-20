package com.xml;

public class MySqlConnection implements IConnection
{

	@Override
	public void open()
	{
		System.out.println("MySqlConnection Open");
		
	}

}
