package com.ttnd.reap.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Recognize {
	@Id
	@GeneratedValue
	private int recognizeId;
	private Date date;
	private String reason;
	private String receiverEmail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="karma_Id")
	private Karma karma;
	
	public Karma getKarma() {
		return karma;
	}
	
	public void setKarma(Karma karma) {
		this.karma = karma;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sender_Email")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Badge_ID")
	private Badge badge;*/

	

	/*public Badge getBadge() {
		return badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}*/


	public int getRecognizeId() {
		return recognizeId;
	}

	public void setRecognizeId(int recognizeId) {
		this.recognizeId = recognizeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	

}
