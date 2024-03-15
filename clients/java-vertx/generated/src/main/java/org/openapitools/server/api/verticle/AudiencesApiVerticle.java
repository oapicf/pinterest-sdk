package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Audience;
import org.openapitools.server.api.model.AudienceCreateCustomRequest;
import org.openapitools.server.api.model.AudienceCreateRequest;
import org.openapitools.server.api.model.AudienceUpdateRequest;
import org.openapitools.server.api.model.AudiencesList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AudiencesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AudiencesApiVerticle.class);

    static final String AUDIENCES/CREATE_SERVICE_ID = "audiences/create";
    static final String AUDIENCES/CREATE_CUSTOM_SERVICE_ID = "audiences/create_custom";
    static final String AUDIENCES/GET_SERVICE_ID = "audiences/get";
    static final String AUDIENCES/LIST_SERVICE_ID = "audiences/list";
    static final String AUDIENCES/UPDATE_SERVICE_ID = "audiences/update";
    
    final AudiencesApi service;

    public AudiencesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AudiencesApiImpl");
            service = (AudiencesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AudiencesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for audiences/create
        vertx.eventBus().<JsonObject> consumer(AUDIENCES/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audiences/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject audienceCreateRequestParam = message.body().getJsonObject("AudienceCreateRequest");
                if (audienceCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AudienceCreateRequest is required"), serviceId);
                    return;
                }
                AudienceCreateRequest audienceCreateRequest = Json.mapper.readValue(audienceCreateRequestParam.encode(), AudienceCreateRequest.class);
                service.audiencesCreate(adAccountId, audienceCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audiences/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audiences/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for audiences/create_custom
        vertx.eventBus().<JsonObject> consumer(AUDIENCES/CREATE_CUSTOM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audiences/create_custom";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject audienceCreateCustomRequestParam = message.body().getJsonObject("AudienceCreateCustomRequest");
                if (audienceCreateCustomRequestParam == null) {
                    manageError(message, new MainApiException(400, "AudienceCreateCustomRequest is required"), serviceId);
                    return;
                }
                AudienceCreateCustomRequest audienceCreateCustomRequest = Json.mapper.readValue(audienceCreateCustomRequestParam.encode(), AudienceCreateCustomRequest.class);
                service.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audiences/create_custom");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audiences/create_custom", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for audiences/get
        vertx.eventBus().<JsonObject> consumer(AUDIENCES/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audiences/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String audienceIdParam = message.body().getString("audience_id");
                if(audienceIdParam == null) {
                    manageError(message, new MainApiException(400, "audience_id is required"), serviceId);
                    return;
                }
                String audienceId = audienceIdParam;
                service.audiencesGet(adAccountId, audienceId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audiences/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audiences/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for audiences/list
        vertx.eventBus().<JsonObject> consumer(AUDIENCES/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audiences/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String ownershipTypeParam = message.body().getString("ownership_type");
                String ownershipType = (ownershipTypeParam == null) ? "OWNED" : ownershipTypeParam;
                service.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audiences/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audiences/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for audiences/update
        vertx.eventBus().<JsonObject> consumer(AUDIENCES/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audiences/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String audienceIdParam = message.body().getString("audience_id");
                if(audienceIdParam == null) {
                    manageError(message, new MainApiException(400, "audience_id is required"), serviceId);
                    return;
                }
                String audienceId = audienceIdParam;
                JsonObject audienceUpdateRequestParam = message.body().getJsonObject("AudienceUpdateRequest");
                if (audienceUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AudienceUpdateRequest is required"), serviceId);
                    return;
                }
                AudienceUpdateRequest audienceUpdateRequest = Json.mapper.readValue(audienceUpdateRequestParam.encode(), AudienceUpdateRequest.class);
                service.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audiences/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audiences/update", e);
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
