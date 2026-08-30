package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.ProductGroupAnalyticsItems;
import org.openapitools.vertxweb.server.model.ProductGroupPromotion;
import org.openapitools.vertxweb.server.model.ProductGroupPromotions;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionsCreate;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionsList200Response;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionsUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.ReportingColumnSync;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProductGroupPromotionsApiImpl implements ProductGroupPromotionsApi {
    public Future<ApiResponse<ProductGroupPromotions>> productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductGroupPromotion>> productGroupPromotionsGet(String adAccountId, String productGroupPromotionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductGroupPromotionsList200Response>> productGroupPromotionsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> productGroupPromotionIds, List<EntityStatus> entityStatuses, String adGroupId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductGroupPromotions>> productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<ProductGroupAnalyticsItems>>> productGroupsAnalytics(LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) {
        return Future.failedFuture(new HttpException(501));
    }

}
