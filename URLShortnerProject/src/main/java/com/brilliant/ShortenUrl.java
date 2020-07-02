package com.brilliant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShortenUrl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer u_id;
	private String full_url;
	private String short_url;
	
	ShortenUrl(){}
	ShortenUrl(String full_url, String short_url){
		this.full_url = full_url;
		this.short_url = short_url;
	}
	
	public String getFull_url() {
		return full_url;
	}

	public void setFull_url(String full_url) {
		this.full_url = full_url;
	}

	public String getShort_url() {
		return short_url;
	}

	public void setShort_url(String short_url) {
		this.short_url = short_url;
	}

}
