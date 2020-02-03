package com.ajay.builderDesignpattern;

public class PersonBuilder {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public PersonBuilder setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public Person build() {
		return new Person(id, name);
				
	}
	
}
