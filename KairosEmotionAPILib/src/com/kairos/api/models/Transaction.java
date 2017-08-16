package com.kairos.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Transaction {
	private String status;
	private String gallery_name;
	private String confidence;
	private String subject_id;
	
	@JsonGetter("status")
	public String getStatus() {
		return status;
	}
	
	@JsonSetter("status")
	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonGetter("gallery_name")
	public String getGallery_name() {
		return gallery_name;
	}
	
	@JsonSetter("gallery_name")
	public void setGallery_name(String gallery_name) {
		this.gallery_name = gallery_name;
	}
	
	@JsonGetter("confidence")
	public String getConfidence() {
		return confidence;
	}
	
	@JsonSetter("confidence")
	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}
	
	@JsonGetter("subject_id")
	public String getSubject_id() {
		return subject_id;
	}
	
	@JsonSetter("subject_id")
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	
	
}
