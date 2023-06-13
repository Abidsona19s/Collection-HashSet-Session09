package com.hashset_session09;

public class Student {
	private String stName;
	private int stRollNo;
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStRollNo() {
		return stRollNo;
	}
	public void setStRollNo(int stRollNo) {
		this.stRollNo = stRollNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stName == null) ? 0 : stName.hashCode());
		result = prime * result + stRollNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stName == null) {
			if (other.stName != null)
				return false;
		} else if (!stName.equals(other.stName))
			return false;
		if (stRollNo != other.stRollNo)
			return false;
		return true;
	}
	

}
