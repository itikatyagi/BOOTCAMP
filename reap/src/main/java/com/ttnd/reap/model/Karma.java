package com.ttnd.reap.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Karma {

	@Id
	private int karmaId;
	private String karmaName;
	
	public int getKarmaId() {
		return karmaId;
	}
	public void setKarmaId(int karmaId) {
		this.karmaId = karmaId;
	}
	public String getKarmaName() {
		return karmaName;
	}
	public void setKarmaName(String karmaName) {
		this.karmaName = karmaName;
	}
	
	
}
