package com.ttnd.reap.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Service {

	@Id @GeneratedValue
	private int serviceId;
	private String serviceName;

	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Practice> practice=new ArrayList<Practice>();
	

	public Collection<Practice> getPractice() {
		return practice;
	}

	public void setPractice(Collection<Practice> practice) {
		this.practice = practice;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
