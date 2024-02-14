package com.tnsif.constructor;

public class Customer {
	private String name ;
	private String address;
	private int cid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		System.out.println("fdsf");
		return "Customerdemo [name=" + name + ", address=" + address + ", cid=" + cid + "]";
	}

}