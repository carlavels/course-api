package com.cooral.springpractice.topic;

public class Topic {

	private String id, name, description;
	
	public Topic() {
		// No arg Constructor
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
