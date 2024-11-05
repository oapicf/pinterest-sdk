package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.LeadFormArrayResponse;
import org.openapitools.vertxweb.server.model.LeadFormCreateRequest;
import org.openapitools.vertxweb.server.model.LeadFormResponse;
import org.openapitools.vertxweb.server.model.LeadFormTestRequest;
import org.openapitools.vertxweb.server.model.LeadFormTestResponse;
import org.openapitools.vertxweb.server.model.LeadFormUpdateRequest;
import org.openapitools.vertxweb.server.model.LeadFormsList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LeadFormsApiImpl implements LeadFormsApi {
    public Future<ApiResponse<LeadFormResponse>> leadFormGet(String adAccountId, String leadFormId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormTestResponse>> leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormArrayResponse>> leadFormsCreate(String adAccountId, List<LeadFormCreateRequest> leadFormCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormsList200Response>> leadFormsList(String adAccountId, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormArrayResponse>> leadFormsUpdate(String adAccountId, List<LeadFormUpdateRequest> leadFormUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
