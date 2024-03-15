package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountsCountryResponse;
import org.openapitools.server.api.model.BookClosedResponse;
import org.openapitools.server.api.model.DeliveryMetricsResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SingleInterestTargetingOptionResponse;

public final class ResourcesApiException extends MainApiException {
    public ResourcesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ResourcesApiException Resources_adAccountCountriesGet_200_Exception = new ResourcesApiException(200, "Success");
    public static final ResourcesApiException Resources_deliveryMetricsGet_200_Exception = new ResourcesApiException(200, "Success");
    public static final ResourcesApiException Resources_interestTargetingOptionsGet_200_Exception = new ResourcesApiException(200, "Success");
    public static final ResourcesApiException Resources_leadFormQuestionsGet_200_Exception = new ResourcesApiException(200, "Success");
    public static final ResourcesApiException Resources_metricsReadyStateGet_200_Exception = new ResourcesApiException(200, "Success");
    public static final ResourcesApiException Resources_targetingOptionsGet_200_Exception = new ResourcesApiException(200, "Success");
    

}