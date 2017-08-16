package com.kairos.api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Images {
	private List<Image> images;

	@JsonGetter("images")
	public List<Image> getImages() {
		return images;
	}

	@JsonSetter("images")
	public void setImages(List<Image> images) {
		this.images = images;
	}

}
