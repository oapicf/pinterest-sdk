package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CustomerList;
import org.openapitools.server.api.model.CustomerListRequest;
import org.openapitools.server.api.model.CustomerListUpdateRequest;
import org.openapitools.server.api.model.CustomerListsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CustomerListsApi  {
    //customer_lists/create
    void customerListsCreate(String adAccountId, CustomerListRequest customerListRequest, Handler<AsyncResult<CustomerList>> handler);

    //customer_lists/get
    void customerListsGet(String adAccountId, String customerListId, Handler<AsyncResult<CustomerList>> handler);

    //customer_lists/list
    void customerListsList(String adAccountId, Integer pageSize, String order, String bookmark, Handler<AsyncResult<CustomerListsList200Response>> handler);

    //customer_lists/update
    void customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateRequest customerListUpdateRequest, Handler<AsyncResult<CustomerList>> handler);

}
