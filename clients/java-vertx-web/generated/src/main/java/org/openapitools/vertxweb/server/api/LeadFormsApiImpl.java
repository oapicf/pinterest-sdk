package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LeadForm;
import org.openapitools.vertxweb.server.model.LeadFormBatchUpdate;
import org.openapitools.vertxweb.server.model.LeadFormCreate;
import org.openapitools.vertxweb.server.model.LeadFormTest;
import org.openapitools.vertxweb.server.model.LeadFormTestCreate;
import org.openapitools.vertxweb.server.model.LeadFormsCreate200Response;
import org.openapitools.vertxweb.server.model.LeadFormsList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LeadFormsApiImpl implements LeadFormsApi {
    public Future<ApiResponse<LeadForm>> leadFormGet(String leadFormId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormTest>> leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestCreate leadFormTestCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormsCreate200Response>> leadFormsCreate(String adAccountId, List<LeadFormCreate> leadFormCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormsList200Response>> leadFormsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadFormsCreate200Response>> leadFormsUpdate(String adAccountId, List<LeadFormBatchUpdate> leadFormBatchUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

}
