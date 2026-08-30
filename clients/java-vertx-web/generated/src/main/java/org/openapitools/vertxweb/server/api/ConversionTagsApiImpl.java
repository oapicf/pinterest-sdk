package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionEventResponse;
import org.openapitools.vertxweb.server.model.ConversionTag;
import org.openapitools.vertxweb.server.model.ConversionTagCreate;
import org.openapitools.vertxweb.server.model.ConversionTagsList200Response;
import org.openapitools.vertxweb.server.model.PageVisitConversionTagsGet200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionTagsApiImpl implements ConversionTagsApi {
    public Future<ApiResponse<ConversionTag>> conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionTag>> conversionTagsGet(String adAccountId, String conversionTagId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionTagsList200Response>> conversionTagsList(String adAccountId, Boolean filterDeleted) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Map<String, List<ConversionEventResponse>>>> ocpmEligibleConversionTagsGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PageVisitConversionTagsGet200Response>> pageVisitConversionTagsGet(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        return Future.failedFuture(new HttpException(501));
    }

}
