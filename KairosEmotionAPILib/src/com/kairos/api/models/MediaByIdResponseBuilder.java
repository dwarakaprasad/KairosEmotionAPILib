/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.models;

import java.util.*;

public class MediaByIdResponseBuilder {
    //the instance to build
    private MediaByIdResponse mediaByIdResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MediaByIdResponseBuilder() {
        mediaByIdResponse = new MediaByIdResponse();
    }

    public MediaByIdResponseBuilder id(String id) {
        mediaByIdResponse.setId(id);
        return this;
    }

    public MediaByIdResponseBuilder statusCode(String statusCode) {
        mediaByIdResponse.setStatusCode(statusCode);
        return this;
    }

    public MediaByIdResponseBuilder statusMessage(String statusMessage) {
        mediaByIdResponse.setStatusMessage(statusMessage);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MediaByIdResponse build() {
        return mediaByIdResponse;
    }
}