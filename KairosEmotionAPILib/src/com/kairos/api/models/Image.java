package com.kairos.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Image {
	
	private Transaction transaction;

	@JsonGetter("transaction")
	public Transaction getTransaction() {
		return transaction;
	}

	@JsonSetter("transaction")
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
