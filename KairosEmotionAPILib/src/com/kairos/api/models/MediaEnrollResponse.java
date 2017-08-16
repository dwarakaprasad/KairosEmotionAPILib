/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MediaEnrollResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5049721204222582975L;
    
    private String face_id;
    private List<Image> images;
    
    @JsonGetter("face_id")
    public String getFace_id() {
		return face_id;
	}
	
    @JsonSetter("face_id")
    public void setFace_id(String face_id) {
		this.face_id = face_id;
	}
	
	@JsonGetter("images")
	public List<Image> getImages() {
		return images;
	}
	
	 @JsonSetter("images")
	public void setImages(List<Image> images) {
		this.images = images;
	}
 
}
 