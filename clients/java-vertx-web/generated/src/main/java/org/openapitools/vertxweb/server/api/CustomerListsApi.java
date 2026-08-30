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

import java.util.List;
import java.util.Map;

public interface CustomerListsApi  {
    Future<ApiResponse<CustomerList>> customerListsCreate(String adAccountId, CustomerListCreate customerListCreate);
    Future<ApiResponse<CustomerList>> customerListsGet(String adAccountId, String customerListId);
    Future<ApiResponse<CustomerListsList200Response>> customerListsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean excludeNca);
    Future<ApiResponse<CustomerList>> customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody);
}
