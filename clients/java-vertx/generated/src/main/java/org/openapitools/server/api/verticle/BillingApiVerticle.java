package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

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

import java.util.List;
import java.util.Map;

public class BillingApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BillingApiVerticle.class);

    static final String ADS_CREDIT/REDEEM_SERVICE_ID = "ads_credit/redeem";
    static final String ADS_CREDITS_DISCOUNTS/GET_SERVICE_ID = "ads_credits_discounts/get";
    static final String BILLING_PROFILES/GET_SERVICE_ID = "billing_profiles/get";
    static final String SSIO_ACCOUNTS/GET_SERVICE_ID = "ssio_accounts/get";
    static final String SSIO_INSERTION_ORDER/CREATE_SERVICE_ID = "ssio_insertion_order/create";
    static final String SSIO_INSERTION_ORDER/EDIT_SERVICE_ID = "ssio_insertion_order/edit";
    static final String SSIO_INSERTION_ORDERS_STATUS/GET_BY_AD_ACCOUNT_SERVICE_ID = "ssio_insertion_orders_status/get_by_ad_account";
    static final String SSIO_INSERTION_ORDERS_STATUS/GET_BY_PIN_ORDER_ID_SERVICE_ID = "ssio_insertion_orders_status/get_by_pin_order_id";
    static final String SSIO_ORDER_LINES/GET_BY_AD_ACCOUNT_SERVICE_ID = "ssio_order_lines/get_by_ad_account";
    
    final BillingApi service;

    public BillingApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BillingApiImpl");
            service = (BillingApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BillingApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ads_credit/redeem
        vertx.eventBus().<JsonObject> consumer(ADS_CREDIT/REDEEM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads_credit/redeem";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject adsCreditRedeemRequestParam = message.body().getJsonObject("AdsCreditRedeemRequest");
                if (adsCreditRedeemRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdsCreditRedeemRequest is required"), serviceId);
                    return;
                }
                AdsCreditRedeemRequest adsCreditRedeemRequest = Json.mapper.readValue(adsCreditRedeemRequestParam.encode(), AdsCreditRedeemRequest.class);
                service.adsCreditRedeem(adAccountId, adsCreditRedeemRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads_credit/redeem");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads_credit/redeem", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ads_credits_discounts/get
        vertx.eventBus().<JsonObject> consumer(ADS_CREDITS_DISCOUNTS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads_credits_discounts/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads_credits_discounts/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads_credits_discounts/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for billing_profiles/get
        vertx.eventBus().<JsonObject> consumer(BILLING_PROFILES/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "billing_profiles/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String isActiveParam = message.body().getString("is_active");
                if(isActiveParam == null) {
                    manageError(message, new MainApiException(400, "is_active is required"), serviceId);
                    return;
                }
                Boolean isActive = Json.mapper.readValue(isActiveParam, Boolean.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.billingProfilesGet(adAccountId, isActive, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "billing_profiles/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("billing_profiles/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ssio_accounts/get
        vertx.eventBus().<JsonObject> consumer(SSIO_ACCOUNTS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ssio_accounts/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                service.ssioAccountsGet(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ssio_accounts/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ssio_accounts/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ssio_insertion_order/create
        vertx.eventBus().<JsonObject> consumer(SSIO_INSERTION_ORDER/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ssio_insertion_order/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject ssIOCreateInsertionOrderRequestParam = message.body().getJsonObject("SSIOCreateInsertionOrderRequest");
                if (ssIOCreateInsertionOrderRequestParam == null) {
                    manageError(message, new MainApiException(400, "SSIOCreateInsertionOrderRequest is required"), serviceId);
                    return;
                }
                SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest = Json.mapper.readValue(ssIOCreateInsertionOrderRequestParam.encode(), SSIOCreateInsertionOrderRequest.class);
                service.ssioInsertionOrderCreate(adAccountId, ssIOCreateInsertionOrderRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ssio_insertion_order/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ssio_insertion_order/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ssio_insertion_order/edit
        vertx.eventBus().<JsonObject> consumer(SSIO_INSERTION_ORDER/EDIT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ssio_insertion_order/edit";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject ssIOEditInsertionOrderRequestParam = message.body().getJsonObject("SSIOEditInsertionOrderRequest");
                if (ssIOEditInsertionOrderRequestParam == null) {
                    manageError(message, new MainApiException(400, "SSIOEditInsertionOrderRequest is required"), serviceId);
                    return;
                }
                SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest = Json.mapper.readValue(ssIOEditInsertionOrderRequestParam.encode(), SSIOEditInsertionOrderRequest.class);
                service.ssioInsertionOrderEdit(adAccountId, ssIOEditInsertionOrderRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ssio_insertion_order/edit");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ssio_insertion_order/edit", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ssio_insertion_orders_status/get_by_ad_account
        vertx.eventBus().<JsonObject> consumer(SSIO_INSERTION_ORDERS_STATUS/GET_BY_AD_ACCOUNT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ssio_insertion_orders_status/get_by_ad_account";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ssio_insertion_orders_status/get_by_ad_account");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ssio_insertion_orders_status/get_by_ad_account", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ssio_insertion_orders_status/get_by_pin_order_id
        vertx.eventBus().<JsonObject> consumer(SSIO_INSERTION_ORDERS_STATUS/GET_BY_PIN_ORDER_ID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ssio_insertion_orders_status/get_by_pin_order_id";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String pinOrderIdParam = message.body().getString("pin_order_id");
                if(pinOrderIdParam == null) {
                    manageError(message, new MainApiException(400, "pin_order_id is required"), serviceId);
                    return;
                }
                String pinOrderId = pinOrderIdParam;
                service.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ssio_insertion_orders_status/get_by_pin_order_id");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ssio_insertion_orders_status/get_by_pin_order_id", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ssio_order_lines/get_by_ad_account
        vertx.eventBus().<JsonObject> consumer(SSIO_ORDER_LINES/GET_BY_AD_ACCOUNT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ssio_order_lines/get_by_ad_account";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String pinOrderIdParam = message.body().getString("pin_order_id");
                String pinOrderId = (pinOrderIdParam == null) ? null : pinOrderIdParam;
                service.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ssio_order_lines/get_by_ad_account");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ssio_order_lines/get_by_ad_account", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
