package com.java.learning;

public class Patients {
	private int ID;
	private String Name;
	private int ssn;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Patients [ID=" + ID + ", Name=" + Name + ", ssn=" + ssn + "]";
	}

	
}
