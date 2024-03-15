package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.server.api.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.server.api.model.AdAccountGetSubscriptionResponse;
import org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class LeadAdsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(LeadAdsApiVerticle.class);

    static final String AD_ACCOUNTS_SUBSCRIPTIONS/DEL_BY_ID_SERVICE_ID = "ad_accounts_subscriptions/del_by_id";
    static final String AD_ACCOUNTS_SUBSCRIPTIONS/GET_BY_ID_SERVICE_ID = "ad_accounts_subscriptions/get_by_id";
    static final String AD_ACCOUNTS_SUBSCRIPTIONS/GET_LIST_SERVICE_ID = "ad_accounts_subscriptions/get_list";
    static final String AD_ACCOUNTS_SUBSCRIPTIONS/POST_SERVICE_ID = "ad_accounts_subscriptions/post";
    
    final LeadAdsApi service;

    public LeadAdsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.LeadAdsApiImpl");
            service = (LeadAdsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("LeadAdsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_accounts_subscriptions/del_by_id
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS_SUBSCRIPTIONS/DEL_BY_ID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts_subscriptions/del_by_id";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String subscriptionIdParam = message.body().getString("subscription_id");
                if(subscriptionIdParam == null) {
                    manageError(message, new MainApiException(400, "subscription_id is required"), serviceId);
                    return;
                }
                String subscriptionId = subscriptionIdParam;
                service.adAccountsSubscriptionsDelById(adAccountId, subscriptionId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts_subscriptions/del_by_id");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts_subscriptions/del_by_id", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_accounts_subscriptions/get_by_id
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS_SUBSCRIPTIONS/GET_BY_ID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts_subscriptions/get_by_id";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String subscriptionIdParam = message.body().getString("subscription_id");
                if(subscriptionIdParam == null) {
                    manageError(message, new MainApiException(400, "subscription_id is required"), serviceId);
                    return;
                }
                String subscriptionId = subscriptionIdParam;
                service.adAccountsSubscriptionsGetById(adAccountId, subscriptionId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts_subscriptions/get_by_id");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts_subscriptions/get_by_id", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_accounts_subscriptions/get_list
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS_SUBSCRIPTIONS/GET_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts_subscriptions/get_list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts_subscriptions/get_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts_subscriptions/get_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_accounts_subscriptions/post
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS_SUBSCRIPTIONS/POST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts_subscriptions/post";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject adAccountCreateSubscriptionRequestParam = message.body().getJsonObject("AdAccountCreateSubscriptionRequest");
                if (adAccountCreateSubscriptionRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdAccountCreateSubscriptionRequest is required"), serviceId);
                    return;
                }
                AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest = Json.mapper.readValue(adAccountCreateSubscriptionRequestParam.encode(), AdAccountCreateSubscriptionRequest.class);
                service.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts_subscriptions/post");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts_subscriptions/post", e);
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
