package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest;
import org.openapitools.server.api.model.ProductGroupPromotionResponse;
import org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductGroupPromotionsApi  {
    //product_group_promotions/create
    void productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest, Handler<AsyncResult<ProductGroupPromotionResponse>> handler);

    //product_group_promotions/get
    void productGroupPromotionsGet(String adAccountId, String productGroupPromotionId, Handler<AsyncResult<ProductGroupPromotionResponse>> handler);

    //product_group_promotions/list
    void productGroupPromotionsList(String adAccountId, List<String> productGroupPromotionIds, List<String> entityStatuses, String adGroupId, Integer pageSize, String order, String bookmark, Handler<AsyncResult<ProductGroupPromotionsList200Response>> handler);

    //product_group_promotions/update
    void productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest, Handler<AsyncResult<ProductGroupPromotionResponse>> handler);

    //product_groups/analytics
    void productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<ProductGroupAnalyticsResponseInner>>> handler);

}
