package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.Promotion;
import org.openapitools.vertxweb.server.model.PromotionBatchUpdate;
import org.openapitools.vertxweb.server.model.PromotionCreate;
import org.openapitools.vertxweb.server.model.PromotionsList200Response;
import org.openapitools.vertxweb.server.model.PromotionsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class PromotionsApiImpl implements PromotionsApi {
    public Future<ApiResponse<PromotionsResponse>> promotionsCreate(String adAccountId, List<PromotionCreate> promotionCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Promotion>> promotionsDelete(String promotionId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Promotion>> promotionsGet(String promotionId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PromotionsList200Response>> promotionsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PromotionsResponse>> promotionsUpdate(String adAccountId, List<PromotionBatchUpdate> promotionBatchUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

}
