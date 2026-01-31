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

import java.util.List;
import java.util.Map;

public interface PromotionsApi  {
    Future<ApiResponse<PromotionsResponse>> promotionsCreate(String adAccountId, List<PromotionCreateRequest> promotionCreateRequest);
    Future<ApiResponse<Void>> promotionsDelete(String adAccountId, String promotionId);
    Future<ApiResponse<PromotionResponse>> promotionsGet(String adAccountId, String promotionId);
    Future<ApiResponse<PromotionsList200Response>> promotionsList(String adAccountId, Integer pageSize, String order, String bookmark);
    Future<ApiResponse<PromotionsResponse>> promotionsUpdate(String adAccountId, List<PromotionUpdateRequest> promotionUpdateRequest);
}
