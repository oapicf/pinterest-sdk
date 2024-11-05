package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TargetingTemplateCreate;
import org.openapitools.server.api.model.TargetingTemplateGetResponseData;
import org.openapitools.server.api.model.TargetingTemplateList200Response;
import org.openapitools.server.api.model.TargetingTemplateUpdateRequest;

import java.util.List;
import java.util.Map;

public class TargetingTemplateApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(TargetingTemplateApiVerticle.class);

    static final String TARGETING_TEMPLATE/CREATE_SERVICE_ID = "targeting_template/create";
    static final String TARGETING_TEMPLATE/LIST_SERVICE_ID = "targeting_template/list";
    static final String TARGETING_TEMPLATE/UPDATE_SERVICE_ID = "targeting_template/update";
    
    final TargetingTemplateApi service;

    public TargetingTemplateApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.TargetingTemplateApiImpl");
            service = (TargetingTemplateApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("TargetingTemplateApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for targeting_template/create
        vertx.eventBus().<JsonObject> consumer(TARGETING_TEMPLATE/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "targeting_template/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject targetingTemplateCreateParam = message.body().getJsonObject("TargetingTemplateCreate");
                if (targetingTemplateCreateParam == null) {
                    manageError(message, new MainApiException(400, "TargetingTemplateCreate is required"), serviceId);
                    return;
                }
                TargetingTemplateCreate targetingTemplateCreate = Json.mapper.readValue(targetingTemplateCreateParam.encode(), TargetingTemplateCreate.class);
                service.targetingTemplateCreate(adAccountId, targetingTemplateCreate, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "targeting_template/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("targeting_template/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for targeting_template/list
        vertx.eventBus().<JsonObject> consumer(TARGETING_TEMPLATE/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "targeting_template/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String includeSizingParam = message.body().getString("include_sizing");
                Boolean includeSizing = (includeSizingParam == null) ? false : Json.mapper.readValue(includeSizingParam, Boolean.class);
                String searchQueryParam = message.body().getString("search_query");
                String searchQuery = (searchQueryParam == null) ? null : searchQueryParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "targeting_template/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("targeting_template/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for targeting_template/update
        vertx.eventBus().<JsonObject> consumer(TARGETING_TEMPLATE/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "targeting_template/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject targetingTemplateUpdateRequestParam = message.body().getJsonObject("TargetingTemplateUpdateRequest");
                if (targetingTemplateUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "TargetingTemplateUpdateRequest is required"), serviceId);
                    return;
                }
                TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = Json.mapper.readValue(targetingTemplateUpdateRequestParam.encode(), TargetingTemplateUpdateRequest.class);
                service.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "targeting_template/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("targeting_template/update", e);
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
