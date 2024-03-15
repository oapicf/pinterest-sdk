package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ProductGroupsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ProductGroupsApiVerticle.class);

    static final String AD_ACCOUNTS_CATALOGS_PRODUCT_GROUPS/LIST_SERVICE_ID = "ad_accounts_catalogs_product_groups/list";
    
    final ProductGroupsApi service;

    public ProductGroupsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ProductGroupsApiImpl");
            service = (ProductGroupsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductGroupsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_accounts_catalogs_product_groups/list
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS_CATALOGS_PRODUCT_GROUPS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts_catalogs_product_groups/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String feedProfileIdParam = message.body().getString("feed_profile_id");
                String feedProfileId = (feedProfileIdParam == null) ? null : feedProfileIdParam;
                service.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts_catalogs_product_groups/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts_catalogs_product_groups/list", e);
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
