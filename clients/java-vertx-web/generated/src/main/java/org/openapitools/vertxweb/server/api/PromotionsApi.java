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

import java.util.List;
import java.util.Map;

public interface PromotionsApi  {
    Future<ApiResponse<PromotionsResponse>> promotionsCreate(String adAccountId, List<PromotionCreate> promotionCreate);
    Future<ApiResponse<Promotion>> promotionsDelete(String promotionId, String adAccountId);
    Future<ApiResponse<Promotion>> promotionsGet(String promotionId, String adAccountId);
    Future<ApiResponse<PromotionsList200Response>> promotionsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order);
    Future<ApiResponse<PromotionsResponse>> promotionsUpdate(String adAccountId, List<PromotionBatchUpdate> promotionBatchUpdate);
}
