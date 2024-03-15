package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CustomerList;
import org.openapitools.server.api.model.CustomerListRequest;
import org.openapitools.server.api.model.CustomerListUpdateRequest;
import org.openapitools.server.api.model.CustomerListsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class CustomerListsApiException extends MainApiException {
    public CustomerListsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final CustomerListsApiException CustomerLists_customerListsCreate_200_Exception = new CustomerListsApiException(200, "Success");
    public static final CustomerListsApiException CustomerLists_customerListsGet_200_Exception = new CustomerListsApiException(200, "Success");
    public static final CustomerListsApiException CustomerLists_customerListsList_200_Exception = new CustomerListsApiException(200, "Success");
    public static final CustomerListsApiException CustomerLists_customerListsUpdate_200_Exception = new CustomerListsApiException(200, "Success");
    

}