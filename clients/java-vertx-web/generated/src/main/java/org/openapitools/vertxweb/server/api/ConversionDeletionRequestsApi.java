package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionDeletionRequest;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestCreate;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ConversionDeletionRequestsApi  {
    Future<ApiResponse<ConversionDeletionRequest>> conversionDeletionRequestCreate(String adAccountId, ConversionDeletionRequestCreate conversionDeletionRequestCreate);
    Future<ApiResponse<ConversionDeletionRequest>> conversionDeletionRequestDelete(String requestId, String adAccountId);
    Future<ApiResponse<ConversionDeletionRequest>> conversionDeletionRequestGet(String requestId, String adAccountId);
    Future<ApiResponse<ConversionDeletionRequestList200Response>> conversionDeletionRequestList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order);
}
