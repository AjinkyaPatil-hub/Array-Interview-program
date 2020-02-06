package com.ajay.sortMapByValueEmp;

public class Employee {

	private int id;
	private String name;
	private String desg;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	
}
