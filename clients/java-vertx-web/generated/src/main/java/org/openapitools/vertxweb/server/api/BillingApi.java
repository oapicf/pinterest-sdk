package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsCreditRedeemRequest;
import org.openapitools.vertxweb.server.model.AdsCreditRedeemResponse;
import org.openapitools.vertxweb.server.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.vertxweb.server.model.BillingProfilesGet200Response;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SSIOAccountResponse;
import org.openapitools.vertxweb.server.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.vertxweb.server.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.vertxweb.server.model.SSIOEditInsertionOrderRequest;
import org.openapitools.vertxweb.server.model.SSIOEditInsertionOrderResponse;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.vertxweb.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.vertxweb.server.model.SsioOrderLinesGetByAdAccount200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BillingApi  {
    Future<ApiResponse<AdsCreditRedeemResponse>> adsCreditRedeem(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest);
    Future<ApiResponse<AdsCreditsDiscountsGet200Response>> adsCreditsDiscountsGet(String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<BillingProfilesGet200Response>> billingProfilesGet(String adAccountId, Boolean isActive, String bookmark, Integer pageSize);
    Future<ApiResponse<SSIOAccountResponse>> ssioAccountsGet(String adAccountId);
    Future<ApiResponse<SSIOCreateInsertionOrderResponse>> ssioInsertionOrderCreate(String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest);
    Future<ApiResponse<SSIOEditInsertionOrderResponse>> ssioInsertionOrderEdit(String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest);
    Future<ApiResponse<SsioInsertionOrdersStatusGetByAdAccount200Response>> ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<SSIOInsertionOrderStatusResponse>> ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId);
    Future<ApiResponse<SsioOrderLinesGetByAdAccount200Response>> ssioOrderLinesGetByAdAccount(String adAccountId, String bookmark, Integer pageSize, String pinOrderId);
}
