/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.models;

import java.util.*;

public class MediaResponseBuilder {
    //the instance to build
    private MediaResponse mediaResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MediaResponseBuilder() {
        mediaResponse = new MediaResponse();
    }

    public MediaResponseBuilder id(String id) {
        mediaResponse.setId(id);
        return this;
    }

    public MediaResponseBuilder statusCode(int statusCode) {
        mediaResponse.setStatusCode(statusCode);
        return this;
    }

    public MediaResponseBuilder statusMessage(String statusMessage) {
        mediaResponse.setStatusMessage(statusMessage);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MediaResponse build() {
        return mediaResponse;
    }
}