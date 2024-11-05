package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdvancedAuctionItems;
import org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.server.api.model.AdvancedAuctionProcessedItems;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AdvancedAuctionApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AdvancedAuctionApiVerticle.class);

    static final String ADVANCED_AUCTION_ITEMS_GET/POST_SERVICE_ID = "advanced_auction_items_get/post";
    static final String ADVANCED_AUCTION_ITEMS_SUBMIT/POST_SERVICE_ID = "advanced_auction_items_submit/post";
    
    final AdvancedAuctionApi service;

    public AdvancedAuctionApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AdvancedAuctionApiImpl");
            service = (AdvancedAuctionApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AdvancedAuctionApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for advanced_auction_items_get/post
        vertx.eventBus().<JsonObject> consumer(ADVANCED_AUCTION_ITEMS_GET/POST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "advanced_auction_items_get/post";
                JsonObject advancedAuctionItemsGetRequestParam = message.body().getJsonObject("AdvancedAuctionItemsGetRequest");
                if (advancedAuctionItemsGetRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdvancedAuctionItemsGetRequest is required"), serviceId);
                    return;
                }
                AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = Json.mapper.readValue(advancedAuctionItemsGetRequestParam.encode(), AdvancedAuctionItemsGetRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "advanced_auction_items_get/post");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("advanced_auction_items_get/post", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for advanced_auction_items_submit/post
        vertx.eventBus().<JsonObject> consumer(ADVANCED_AUCTION_ITEMS_SUBMIT/POST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "advanced_auction_items_submit/post";
                JsonObject advancedAuctionItemsSubmitRequestParam = message.body().getJsonObject("AdvancedAuctionItemsSubmitRequest");
                if (advancedAuctionItemsSubmitRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdvancedAuctionItemsSubmitRequest is required"), serviceId);
                    return;
                }
                AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = Json.mapper.readValue(advancedAuctionItemsSubmitRequestParam.encode(), AdvancedAuctionItemsSubmitRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "advanced_auction_items_submit/post");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("advanced_auction_items_submit/post", e);
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
