/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.http.client;

import com.kairos.api.http.request.HttpRequest;
import com.kairos.api.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * GETTER for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * GETTER for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getRespone() {
        return _response;
    }
}