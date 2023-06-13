package com.hashset_session09;

public class Book {
	private String bName;
	private String bAuthor;
	private int bId;
	public Book(String bName, String bAuthor, int bId) {
		super();
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bId = bId;
	}
	
	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bAuthor == null) ? 0 : bAuthor.hashCode());
		result = prime * result + bId;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
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
		Book other = (Book) obj;
		if (bAuthor == null) {
			if (other.bAuthor != null)
				return false;
		} else if (!bAuthor.equals(other.bAuthor))
			return false;
		if (bId != other.bId)
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		return true;
	}

}
