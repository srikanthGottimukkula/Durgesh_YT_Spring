package com.srikanth.standAlone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> names;
	
	private Map<String,Integer> fees;
	
	private Properties properties;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", fees=" + fees + ", properties=" + properties + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
