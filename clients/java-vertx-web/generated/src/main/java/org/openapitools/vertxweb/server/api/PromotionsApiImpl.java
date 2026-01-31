package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PromotionCreateRequest;
import org.openapitools.vertxweb.server.model.PromotionResponse;
import org.openapitools.vertxweb.server.model.PromotionUpdateRequest;
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
    public Future<ApiResponse<PromotionsResponse>> promotionsCreate(String adAccountId, List<PromotionCreateRequest> promotionCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> promotionsDelete(String adAccountId, String promotionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PromotionResponse>> promotionsGet(String adAccountId, String promotionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PromotionsList200Response>> promotionsList(String adAccountId, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PromotionsResponse>> promotionsUpdate(String adAccountId, List<PromotionUpdateRequest> promotionUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
