package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerListUpload;
import org.openapitools.vertxweb.server.model.CustomerListUploadCreateRequest;
import org.openapitools.vertxweb.server.model.CustomerListUploadCreateResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CustomerListUploadsApiImpl implements CustomerListUploadsApi {
    public Future<ApiResponse<CustomerListUploadCreateResponse>> customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerListUpload>> customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerListUpload>> customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId) {
        return Future.failedFuture(new HttpException(501));
    }

}
