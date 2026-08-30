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

import java.util.List;
import java.util.Map;

public interface ConversionTagsApi  {
    Future<ApiResponse<ConversionTag>> conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate);
    Future<ApiResponse<ConversionTag>> conversionTagsGet(String adAccountId, String conversionTagId);
    Future<ApiResponse<ConversionTagsList200Response>> conversionTagsList(String adAccountId, Boolean filterDeleted);
    Future<ApiResponse<Map<String, List<ConversionEventResponse>>>> ocpmEligibleConversionTagsGet(String adAccountId);
    Future<ApiResponse<PageVisitConversionTagsGet200Response>> pageVisitConversionTagsGet(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order);
}
