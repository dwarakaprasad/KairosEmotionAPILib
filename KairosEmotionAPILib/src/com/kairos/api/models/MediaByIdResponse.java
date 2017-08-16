/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MediaByIdResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5483583471856696776L;
    private String id;
    private String statusCode;
    private String statusMessage;
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
    public String getStatusCode ( ) { 
        return this.statusCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status_code")
    public void setStatusCode (String value) { 
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
 
}
 