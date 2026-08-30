package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionDeletionRequest;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestCreate;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionDeletionRequestsApiImpl implements ConversionDeletionRequestsApi {
    public Future<ApiResponse<ConversionDeletionRequest>> conversionDeletionRequestCreate(String adAccountId, ConversionDeletionRequestCreate conversionDeletionRequestCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionDeletionRequest>> conversionDeletionRequestDelete(String requestId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionDeletionRequest>> conversionDeletionRequestGet(String requestId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionDeletionRequestList200Response>> conversionDeletionRequestList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        return Future.failedFuture(new HttpException(501));
    }

}
