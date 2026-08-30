package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerList;
import org.openapitools.vertxweb.server.model.CustomerListCreate;
import org.openapitools.vertxweb.server.model.CustomerListUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.CustomerListsList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CustomerListsApiImpl implements CustomerListsApi {
    public Future<ApiResponse<CustomerList>> customerListsCreate(String adAccountId, CustomerListCreate customerListCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerList>> customerListsGet(String adAccountId, String customerListId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerListsList200Response>> customerListsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean excludeNca) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerList>> customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
