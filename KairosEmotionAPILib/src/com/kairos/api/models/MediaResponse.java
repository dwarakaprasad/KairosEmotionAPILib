/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MediaResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5049721204222582975L;
    private String id;
    private int statusCode;
    private String statusMessage;
    private String transaction;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status_code")
    public int getStatusCode ( ) { 
        return this.statusCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status_code")
    public void setStatusCode (int value) { 
        this.statusCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status_message")
    public String getStatusMessage ( ) { 
        return this.statusMessage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status_message")
    public void setStatusMessage (String value) { 
        this.statusMessage = value;
    }

    @JsonGetter("transaction")
    public String getTransaction() {
		return transaction;
	}

    @JsonSetter("transaction")
    public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
 
}
 