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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProductGroupPromotionsApiImpl implements ProductGroupPromotionsApi {
    public Future<ApiResponse<ProductGroupPromotionResponse>> productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductGroupPromotionResponse>> productGroupPromotionsGet(String adAccountId, String productGroupPromotionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductGroupPromotionsList200Response>> productGroupPromotionsList(String adAccountId, List<String> productGroupPromotionIds, List<String> entityStatuses, String adGroupId, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductGroupPromotionResponse>> productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<ProductGroupAnalyticsResponseInner>>> productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) {
        return Future.failedFuture(new HttpException(501));
    }

}
