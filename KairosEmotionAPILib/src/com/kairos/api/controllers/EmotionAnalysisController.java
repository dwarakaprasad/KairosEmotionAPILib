/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.kairos.api.http.client.HttpClient;
import com.kairos.api.http.client.HttpContext;
import com.kairos.api.http.request.HttpRequest;
import com.kairos.api.http.response.HttpResponse;
import com.kairos.api.http.response.HttpStringResponse;
import com.kairos.api.http.client.APICallBack;
import com.kairos.api.*;
import com.kairos.api.models.*;

public class EmotionAnalysisController extends BaseController {
	/**
	 * Initialize the base controller using the given http client
	 */
	public EmotionAnalysisController() {
		super();
	}

	/**
	 * Initialize the base controller using the given http client
	 *
	 * @param _client
	 *            The given http client
	 */
	public EmotionAnalysisController(HttpClient _client) {
		super(_client);
	}

	public void createMediaAsyncNew(final String source, final String subjectId, final String galName, final APICallBack<MediaResponse> callBack) throws JsonProcessingException {
		// the base uri for api requests
		String baseUri = Configuration.baseUri;

		// prepare query string for API call
		StringBuilder queryBuilder = new StringBuilder(baseUri);
		queryBuilder.append("/enroll");

		// process query parameters
		String httpBody = APIHelper.serialize(new HashMap<String, Object>() {
			private static final long serialVersionUID = 5592177449459876050L;
			{
				put("image", source);
				put("subject_id", subjectId);
				put("gallery_name", galName);
			}
		});
		// validate and preprocess url
		String queryUrl = APIHelper.cleanUrl(queryBuilder);

		// load all headers for the outgoing API request
		Map<String, String> headers = new HashMap<String, String>() {
			private static final long serialVersionUID = 5558009453856858199L;
			{
				put("user-agent", "APIMATIC 2.0");
				put("accept", "application/json");
				put("Content-Type", Configuration.contentType);

			}
		};

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.postBody(queryUrl, headers, httpBody);

		// Custom Authentication to be added for authorization
		CustomAuthUtility.appendCustomAuthParams(request);

		clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
			public void onSuccess(HttpContext context, HttpResponse response) {
				try {
					// Error handling using HTTP status codes
					int responseCode = response.getStatusCode();
					if ((responseCode < 200) || (responseCode > 206)) // [200,206]
																		// =
																		// HTTP
																		// OK
						throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

					// extract result from the http response
					MediaResponse result = APIHelper.deserialize(((HttpStringResponse) response).getBody(),
							new TypeReference<MediaResponse>() {
							});

					// let the caller know of the success
					callBack.onSuccess(context, result);
				} catch (APIException error) {
					// let the caller know of the error
					callBack.onFailure(context, error);
				} catch (IOException ioException) {
					// let the caller know of the caught IO Exception
					callBack.onFailure(context, ioException);
				} catch (Exception exception) {
					// let the caller know of the caught Exception
					callBack.onFailure(context, exception);
				}
			}

			public void onFailure(HttpContext context, Throwable error) {
				// let the caller know of the failure
				callBack.onFailure(context, error);
			}
		});
	}

	/**
	 * Create a new media object to be processed.
	 * 
	 * @param source
	 *            Optional parameter: The source URL of the media.
	 * @return Returns the MediaResponse response from the API call
	 */
	public void createMediaAsync(final String source, final APICallBack<MediaResponse> callBack) {
		// the base uri for api requests
		String baseUri = Configuration.baseUri;

		// prepare query string for API call
		StringBuilder queryBuilder = new StringBuilder(baseUri);
		queryBuilder.append("/media");

		// process query parameters
		APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
			private static final long serialVersionUID = 5592177449459876050L;
			{
				put("source", source);
			}
		});
		// validate and preprocess url
		String queryUrl = APIHelper.cleanUrl(queryBuilder);

		// load all headers for the outgoing API request
		Map<String, String> headers = new HashMap<String, String>() {
			private static final long serialVersionUID = 5558009453856858199L;
			{
				put("user-agent", "APIMATIC 2.0");
				put("accept", "application/json");
				put("Content-Type", Configuration.contentType);

			}
		};

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.post(queryUrl, headers, null);

		// Custom Authentication to be added for authorization
		CustomAuthUtility.appendCustomAuthParams(request);

		// invoke request and get response
		Runnable responseTask = new Runnable() {
			public void run() {
				// make the API call
				clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
					public void onSuccess(HttpContext context, HttpResponse response) {
						try {
							// Error handling using HTTP status codes
							int responseCode = response.getStatusCode();
							if ((responseCode < 200) || (responseCode > 206)) // [200,206]
																				// =
																				// HTTP
																				// OK
								throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

							// extract result from the http response
							MediaResponse result = APIHelper.deserialize(((HttpStringResponse) response).getBody(),
									new TypeReference<MediaResponse>() {
									});

							// let the caller know of the success
							callBack.onSuccess(context, result);
						} catch (APIException error) {
							// let the caller know of the error
							callBack.onFailure(context, error);
						} catch (IOException ioException) {
							// let the caller know of the caught IO Exception
							callBack.onFailure(context, ioException);
						} catch (Exception exception) {
							// let the caller know of the caught Exception
							callBack.onFailure(context, exception);
						}
					}

					public void onFailure(HttpContext context, Throwable error) {
						// let the caller know of the failure
						callBack.onFailure(context, error);
					}
				});
			}
		};

		// execute async using thread pool
		APIHelper.getScheduler().execute(responseTask);
	}

	/**
	 * Returns the results of a specific uploaded piece of media.
	 * 
	 * @param id
	 *            Required parameter: The id of the media you are looking for
	 *            the results from.
	 * @return Returns the LinkedHashMap<String, Object> response from the API
	 *         call
	 */
	public void getMediaByIdAsync(final String id, final APICallBack<LinkedHashMap<String, Object>> callBack) {
		// the base uri for api requests
		String baseUri = Configuration.baseUri;

		// prepare query string for API call
		StringBuilder queryBuilder = new StringBuilder(baseUri);
		queryBuilder.append("/media/{id}");

		// process template parameters
		APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
			private static final long serialVersionUID = 4694189853381207733L;
			{
				put("id", id);
			}
		});
		// validate and preprocess url
		String queryUrl = APIHelper.cleanUrl(queryBuilder);

		// load all headers for the outgoing API request
		Map<String, String> headers = new HashMap<String, String>() {
			private static final long serialVersionUID = 5083762583128655230L;
			{
				put("user-agent", "APIMATIC 2.0");
				put("accept", "application/json");
				put("Content-Type", Configuration.contentType);

			}
		};

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.get(queryUrl, headers, null);

		// Custom Authentication to be added for authorization
		CustomAuthUtility.appendCustomAuthParams(request);

		// invoke request and get response
		Runnable responseTask = new Runnable() {
			public void run() {
				// make the API call
				clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
					public void onSuccess(HttpContext context, HttpResponse response) {
						try {
							// Error handling using HTTP status codes
							int responseCode = response.getStatusCode();
							if ((responseCode < 200) || (responseCode > 206)) // [200,206]
																				// =
																				// HTTP
																				// OK
								throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

							// extract result from the http response
							LinkedHashMap<String, Object> result = APIHelper
									.deserialize(((HttpStringResponse) response).getBody());

							// let the caller know of the success
							callBack.onSuccess(context, result);
						} catch (APIException error) {
							// let the caller know of the error
							callBack.onFailure(context, error);
						} catch (Exception exception) {
							// let the caller know of the caught Exception
							callBack.onFailure(context, exception);
						}
					}

					public void onFailure(HttpContext context, Throwable error) {
						// let the caller know of the failure
						callBack.onFailure(context, error);
					}
				});
			}
		};

		// execute async using thread pool
		APIHelper.getScheduler().execute(responseTask);
	}

	/**
	 * Delete media results. It returns the status of the operation.
	 * 
	 * @param id
	 *            Required parameter: The id of the media.
	 * @return Returns the MediaByIdResponse response from the API call
	 */
	public void deleteMediaByIdAsync(final String id, final APICallBack<MediaByIdResponse> callBack) {
		// the base uri for api requests
		String baseUri = Configuration.baseUri;

		// prepare query string for API call
		StringBuilder queryBuilder = new StringBuilder(baseUri);
		queryBuilder.append("/media/{id}");

		// process template parameters
		APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
			private static final long serialVersionUID = 5518198718504696287L;
			{
				put("id", id);
			}
		});
		// validate and preprocess url
		String queryUrl = APIHelper.cleanUrl(queryBuilder);

		// load all headers for the outgoing API request
		Map<String, String> headers = new HashMap<String, String>() {
			private static final long serialVersionUID = 5161672196737724601L;
			{
				put("user-agent", "APIMATIC 2.0");
				put("accept", "application/json");
				put("Content-Type", Configuration.contentType);

			}
		};

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.delete(queryUrl, headers, null);

		// Custom Authentication to be added for authorization
		CustomAuthUtility.appendCustomAuthParams(request);

		// invoke request and get response
		Runnable responseTask = new Runnable() {
			public void run() {
				// make the API call
				clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
					public void onSuccess(HttpContext context, HttpResponse response) {
						try {
							// Error handling using HTTP status codes
							int responseCode = response.getStatusCode();
							if ((responseCode < 200) || (responseCode > 206)) // [200,206]
																				// =
																				// HTTP
																				// OK
								throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

							// extract result from the http response
							MediaByIdResponse result = APIHelper.deserialize(((HttpStringResponse) response).getBody(),
									new TypeReference<MediaByIdResponse>() {
									});

							// let the caller know of the success
							callBack.onSuccess(context, result);
						} catch (APIException error) {
							// let the caller know of the error
							callBack.onFailure(context, error);
						} catch (IOException ioException) {
							// let the caller know of the caught IO Exception
							callBack.onFailure(context, ioException);
						} catch (Exception exception) {
							// let the caller know of the caught Exception
							callBack.onFailure(context, exception);
						}
					}

					public void onFailure(HttpContext context, Throwable error) {
						// let the caller know of the failure
						callBack.onFailure(context, error);
					}
				});
			}
		};

		// execute async using thread pool
		APIHelper.getScheduler().execute(responseTask);
	}

}