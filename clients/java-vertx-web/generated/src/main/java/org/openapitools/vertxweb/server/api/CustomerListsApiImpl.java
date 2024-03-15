package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerList;
import org.openapitools.vertxweb.server.model.CustomerListRequest;
import org.openapitools.vertxweb.server.model.CustomerListUpdateRequest;
import org.openapitools.vertxweb.server.model.CustomerListsList200Response;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CustomerListsApiImpl implements CustomerListsApi {
    public Future<ApiResponse<CustomerList>> customerListsCreate(String adAccountId, CustomerListRequest customerListRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerList>> customerListsGet(String adAccountId, String customerListId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerListsList200Response>> customerListsList(String adAccountId, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerList>> customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateRequest customerListUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
