package com.spring.basics.springin5steps.xml;

public class XmlPersonDao {
	
	XmlJdbcConnection xmlJdbcConnection;
	// use the name of the instance in the xml for autowiring.

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}
    
	
}
