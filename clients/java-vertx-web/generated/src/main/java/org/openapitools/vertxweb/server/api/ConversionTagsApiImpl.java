package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionEventResponse;
import org.openapitools.vertxweb.server.model.ConversionTagCreate;
import org.openapitools.vertxweb.server.model.ConversionTagListResponse;
import org.openapitools.vertxweb.server.model.ConversionTagResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PageVisitConversionTagsGet200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionTagsApiImpl implements ConversionTagsApi {
    public Future<ApiResponse<ConversionTagResponse>> conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionTagResponse>> conversionTagsGet(String adAccountId, String conversionTagId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionTagListResponse>> conversionTagsList(String adAccountId, Boolean filterDeleted) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Map<String, List<ConversionEventResponse>>>> ocpmEligibleConversionTagsGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PageVisitConversionTagsGet200Response>> pageVisitConversionTagsGet(String adAccountId, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

}
