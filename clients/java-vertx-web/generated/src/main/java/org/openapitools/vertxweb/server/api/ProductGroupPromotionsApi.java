package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionCreateRequest;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionResponse;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionsList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ProductGroupPromotionsApi  {
    Future<ApiResponse<ProductGroupPromotionResponse>> productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest);
    Future<ApiResponse<ProductGroupPromotionResponse>> productGroupPromotionsGet(String adAccountId, String productGroupPromotionId);
    Future<ApiResponse<ProductGroupPromotionsList200Response>> productGroupPromotionsList(String adAccountId, List<String> productGroupPromotionIds, List<String> entityStatuses, String adGroupId, Integer pageSize, String order, String bookmark);
    Future<ApiResponse<ProductGroupPromotionResponse>> productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest);
    Future<ApiResponse<List<ProductGroupAnalyticsResponseInner>>> productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
}
