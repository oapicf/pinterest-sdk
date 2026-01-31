package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerListUploadCreateRequest;
import org.openapitools.vertxweb.server.model.CustomerListUploadCreateResponse;
import org.openapitools.vertxweb.server.model.CustomerListUploadResponse;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CustomerListUploadsApi  {
    Future<ApiResponse<CustomerListUploadCreateResponse>> customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest);
    Future<ApiResponse<CustomerListUploadResponse>> customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId);
    Future<ApiResponse<CustomerListUploadResponse>> customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId);
}
