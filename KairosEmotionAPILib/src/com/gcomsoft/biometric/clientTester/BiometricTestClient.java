package com.gcomsoft.biometric.clientTester;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kairos.api.controllers.VerifyImageController;
import com.kairos.api.http.client.APICallBack;
import com.kairos.api.http.client.HttpContext;
import com.kairos.api.models.Image;
import com.kairos.api.models.Images;
import com.kairos.api.models.MediaEnrollResponse;

public class BiometricTestClient {
	
	private final static String SUBJECT_NAME = "DEMOSUB";
	private final static String GALLERY_NAME = "DEMOGALLERY";
	private final static String SRC_IMG = "http://images.catchnews.com/upload/2016/05/28/rajinikanth-kabali-music-on-think_730x419.jpg";
	private final static String COMP_IMG = "http://img.dtnext.in.s3.amazonaws.com/Images/Article/201706240028030040_Rajini-set-to-float-new-party-say-sources_SECVPF.gif";

	public static void main(String[] args) throws JsonProcessingException {
		
		VerifyImageController verifyController = new VerifyImageController();
		
		verifyController.enrollReferenceImage(SRC_IMG
				, SUBJECT_NAME, GALLERY_NAME, new APICallBack<MediaEnrollResponse>() {
        public void onSuccess(HttpContext context, MediaEnrollResponse response) {
            System.out.println(response.getFace_id());
            
            if(null != response.getImages() && response.getImages().size() > 0) {
            	System.out.println(response.getImages().get(0).getTransaction().getConfidence());
            	System.out.println("Image enrolled successfully");
            }
        }
        
        public void onFailure(HttpContext context, Throwable error) {
        	System.out.println(context.getRequest().getQueryUrl());
        	error.printStackTrace();
        }
		});
		
		verifyController.matchImage(COMP_IMG
				, SUBJECT_NAME, GALLERY_NAME, new APICallBack<Images>() {
        public void onSuccess(HttpContext context, Images response) {
                        
            if(null != response.getImages() && response.getImages().size() > 0) {
            	System.out.println(response.getImages().get(0).getTransaction().getConfidence());
            	if(Double.valueOf(response.getImages().get(0).getTransaction().getConfidence()) > 0.9) {
            		System.out.println("Excellent match");
            	} else if(Double.valueOf(response.getImages().get(0).getTransaction().getConfidence()) > 0.85) {
            		System.out.println("Great match");
            	} else if(Double.valueOf(response.getImages().get(0).getTransaction().getConfidence()) > 0.7) {
            		System.out.println("Good Match");
            	} else if(Double.valueOf(response.getImages().get(0).getTransaction().getConfidence()) > 0.5) {
            		System.out.println("Average Match");
            	} else {
            		System.out.println("Not matched");
            	}
            }
        }
        
        public void onFailure(HttpContext context, Throwable error) {
        	System.out.println(context.getRequest().getQueryUrl());
        	error.printStackTrace();
        }
		});
		
	}

}
