package com.xml;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Factory
{
	public static IConnection newInstance()
	{
		// xml解析的两种主流方式
		// 1.dom4j 占内存大
		// 2.sax 占内存小
		try
		{
			Class classInfo = Factory.class;
			InputStream inputStream = classInfo.getResourceAsStream("/com/xml/config.xml");
			ConfigHandler configHandler = new ConfigHandler();
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxParserFactory.newSAXParser();
			saxParser.parse(inputStream, configHandler);
			System.out.println(configHandler.className);
			String className = configHandler.className;
			// 运行时加载类信息
			Class connectionClass = Class.forName(className);
			//反射创建对象
			Object object = connectionClass.newInstance();
			IConnection connection = (IConnection) object;
			return connection;
		} catch (Exception e)
		{
		}
		return null;
	}
}
