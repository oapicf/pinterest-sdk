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

import java.util.List;
import java.util.Map;

public interface ConversionTagsApi  {
    Future<ApiResponse<ConversionTagResponse>> conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate);
    Future<ApiResponse<ConversionTagResponse>> conversionTagsGet(String adAccountId, String conversionTagId);
    Future<ApiResponse<ConversionTagListResponse>> conversionTagsList(String adAccountId, Boolean filterDeleted);
    Future<ApiResponse<Map<String, List<ConversionEventResponse>>>> ocpmEligibleConversionTagsGet(String adAccountId);
    Future<ApiResponse<PageVisitConversionTagsGet200Response>> pageVisitConversionTagsGet(String adAccountId, Integer pageSize, String order, String bookmark);
}
