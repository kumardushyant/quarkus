package com.example.config;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class InMemoryConfigSource implements ConfigSource {

	private Map<String, String> properties = new HashMap<String, String>();

	public InMemoryConfigSource() {
		properties.put("greeting.message", "ola");
	}

	@Override
	public Map<String, String> getProperties() {
		// ....
		// file source
		// database source
		// REST endpoint e.g spring config server
		// kubernetes configMap
		return properties;
	}

	@Override
	public String getValue(String propertyName) {
		return properties.get(propertyName);
	}

	@Override
	public String getName() {
		return "InMemory config properties";
	}
	
	@Override
	public int getOrdinal() {
		return 600;
	}
	

}
