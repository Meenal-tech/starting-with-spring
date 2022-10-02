
package com.spring.basics.springin5steps.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	@Autowired
	ComponentJDBC jdbcConnection;

	public ComponentJDBC getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJDBC jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
}
