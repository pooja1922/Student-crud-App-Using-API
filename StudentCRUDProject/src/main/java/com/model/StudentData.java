package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentData {
	@Id
	private int rno;
	private String name;
	private float marks;
	private long mono;
	private String address;

	/**
	 * @return the rno
	 */
	public int getRno() {
		return rno;
	}

	/**
	 * @param rno the rno to set
	 */
	public void setRno(int rno) {
		this.rno = rno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}

	/**
	 * @return the mono
	 */
	public long getMono() {
		return mono;
	}

	/**
	 * @param mono the mono to set
	 */
	public void setMono(long mono) {
		this.mono = mono;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + ", mono=" + mono + ", address=" + address
				+ "]";
	}

}
