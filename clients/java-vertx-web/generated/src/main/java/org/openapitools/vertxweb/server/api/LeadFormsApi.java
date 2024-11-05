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

import java.util.List;
import java.util.Map;

public interface LeadFormsApi  {
    Future<ApiResponse<LeadFormResponse>> leadFormGet(String adAccountId, String leadFormId);
    Future<ApiResponse<LeadFormTestResponse>> leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest);
    Future<ApiResponse<LeadFormArrayResponse>> leadFormsCreate(String adAccountId, List<LeadFormCreateRequest> leadFormCreateRequest);
    Future<ApiResponse<LeadFormsList200Response>> leadFormsList(String adAccountId, Integer pageSize, String order, String bookmark);
    Future<ApiResponse<LeadFormArrayResponse>> leadFormsUpdate(String adAccountId, List<LeadFormUpdateRequest> leadFormUpdateRequest);
}
