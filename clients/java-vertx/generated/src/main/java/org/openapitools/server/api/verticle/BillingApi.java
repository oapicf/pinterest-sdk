package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdsCreditRedeemRequest;
import org.openapitools.server.api.model.AdsCreditRedeemResponse;
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.server.api.model.BillingProfilesGet200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SSIOAccountResponse;
import org.openapitools.server.api.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.server.api.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.server.api.model.SSIOEditInsertionOrderRequest;
import org.openapitools.server.api.model.SSIOEditInsertionOrderResponse;
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BillingApi  {
    //ads_credit/redeem
    void adsCreditRedeem(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest, Handler<AsyncResult<AdsCreditRedeemResponse>> handler);

    //ads_credits_discounts/get
    void adsCreditsDiscountsGet(String adAccountId, String bookmark, Integer pageSize, Handler<AsyncResult<AdsCreditsDiscountsGet200Response>> handler);

    //billing_profiles/get
    void billingProfilesGet(String adAccountId, Boolean isActive, String bookmark, Integer pageSize, Handler<AsyncResult<BillingProfilesGet200Response>> handler);

    //ssio_accounts/get
    void ssioAccountsGet(String adAccountId, Handler<AsyncResult<SSIOAccountResponse>> handler);

    //ssio_insertion_order/create
    void ssioInsertionOrderCreate(String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest, Handler<AsyncResult<SSIOCreateInsertionOrderResponse>> handler);

    //ssio_insertion_order/edit
    void ssioInsertionOrderEdit(String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest, Handler<AsyncResult<SSIOEditInsertionOrderResponse>> handler);

    //ssio_insertion_orders_status/get_by_ad_account
    void ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, String bookmark, Integer pageSize, Handler<AsyncResult<SsioInsertionOrdersStatusGetByAdAccount200Response>> handler);

    //ssio_insertion_orders_status/get_by_pin_order_id
    void ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId, Handler<AsyncResult<SSIOInsertionOrderStatusResponse>> handler);

    //ssio_order_lines/get_by_ad_account
    void ssioOrderLinesGetByAdAccount(String adAccountId, String bookmark, Integer pageSize, String pinOrderId, Handler<AsyncResult<SsioOrderLinesGetByAdAccount200Response>> handler);

}
