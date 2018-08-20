package com.xml;

import org.xml.sax.helpers.DefaultHandler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

//解析config.xml
public class ConfigHandler extends DefaultHandler
{
	String className;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
	{
		super.startElement(uri, localName, qName, attributes);
		if ("bean".equals(qName))
		{
			for (int i = 0; i < attributes.getLength(); i++)
			{
				String name = attributes.getQName(i);
				if ("className".equals(name))
				{
					className = attributes.getValue(i);
				}
			}
		}
	}

}
