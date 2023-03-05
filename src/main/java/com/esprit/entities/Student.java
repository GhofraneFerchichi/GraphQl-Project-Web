package com.esprit.entities;

import java.util.Objects;



public class Student {
    private String cin;
    private String nompre;
    private String email;

    public Student(String cin, String nompre, String email) {
    	super();
        this.cin = cin;
        this.nompre = nompre;
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public String getNompre() {
        return nompre;
    }

    public String getEmail() {
        return email;
    }

	public void setCin(String cin) {
		this.cin = cin;
	}

	public void setNompre(String nompre) {
		this.nompre = nompre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nompre == null) ? 0 : nompre.hashCode());
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
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nompre == null) {
			if (other.nompre != null)
				return false;
		} else if (!nompre.equals(other.nompre))
			return false;
		return true;
	}
	
	
	
    
}
