/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api;

import com.kairos.api.http.request.HttpRequest;

public class CustomAuthUtility {
    /**
    * Appends the necessary Custom Authentication credentials for making this authorized call
    * @param	request	The out going request to access the resource
    */
    public static void appendCustomAuthParams(HttpRequest request) {
        // TODO: Add your custom authentication here
		// The following properties are available to use
		//     Configuration.contentType
		//     Configuration.appId
		//     Configuration.appKey
		// 
		// ie. Add a header through:
		request.getHeaders().put("app_id", Configuration.appId);
		request.getHeaders().put("app_key", Configuration.appKey);
    }
}