package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.DetailedError;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.IntegrationLogsRequest;
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse;
import org.openapitools.server.api.model.IntegrationMetadata;
import org.openapitools.server.api.model.IntegrationRecord;
import org.openapitools.server.api.model.IntegrationRequest;
import org.openapitools.server.api.model.IntegrationRequestPatch;
import org.openapitools.server.api.model.IntegrationsGetList200Response;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class IntegrationsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(IntegrationsApiVerticle.class);

    static final String INTEGRATIONS_COMMERCE/DEL_SERVICE_ID = "integrations_commerce/del";
    static final String INTEGRATIONS_COMMERCE/GET_SERVICE_ID = "integrations_commerce/get";
    static final String INTEGRATIONS_COMMERCE/PATCH_SERVICE_ID = "integrations_commerce/patch";
    static final String INTEGRATIONS_COMMERCE/POST_SERVICE_ID = "integrations_commerce/post";
    static final String INTEGRATIONS/GET_BY_ID_SERVICE_ID = "integrations/get_by_id";
    static final String INTEGRATIONS/GET_LIST_SERVICE_ID = "integrations/get_list";
    static final String INTEGRATIONS_LOGS/POST_SERVICE_ID = "integrations_logs/post";
    
    final IntegrationsApi service;

    public IntegrationsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.IntegrationsApiImpl");
            service = (IntegrationsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("IntegrationsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for integrations_commerce/del
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS_COMMERCE/DEL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations_commerce/del";
                String externalBusinessIdParam = message.body().getString("external_business_id");
                if(externalBusinessIdParam == null) {
                    manageError(message, new MainApiException(400, "external_business_id is required"), serviceId);
                    return;
                }
                String externalBusinessId = externalBusinessIdParam;
                service.integrationsCommerceDel(externalBusinessId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations_commerce/del");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations_commerce/del", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for integrations_commerce/get
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS_COMMERCE/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations_commerce/get";
                String externalBusinessIdParam = message.body().getString("external_business_id");
                if(externalBusinessIdParam == null) {
                    manageError(message, new MainApiException(400, "external_business_id is required"), serviceId);
                    return;
                }
                String externalBusinessId = externalBusinessIdParam;
                service.integrationsCommerceGet(externalBusinessId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations_commerce/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations_commerce/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for integrations_commerce/patch
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS_COMMERCE/PATCH_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations_commerce/patch";
                String externalBusinessIdParam = message.body().getString("external_business_id");
                if(externalBusinessIdParam == null) {
                    manageError(message, new MainApiException(400, "external_business_id is required"), serviceId);
                    return;
                }
                String externalBusinessId = externalBusinessIdParam;
                JsonObject integrationRequestPatchParam = message.body().getJsonObject("IntegrationRequestPatch");
                if (integrationRequestPatchParam == null) {
                    manageError(message, new MainApiException(400, "IntegrationRequestPatch is required"), serviceId);
                    return;
                }
                IntegrationRequestPatch integrationRequestPatch = Json.mapper.readValue(integrationRequestPatchParam.encode(), IntegrationRequestPatch.class);
                service.integrationsCommercePatch(externalBusinessId, integrationRequestPatch, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations_commerce/patch");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations_commerce/patch", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for integrations_commerce/post
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS_COMMERCE/POST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations_commerce/post";
                JsonObject integrationRequestParam = message.body().getJsonObject("IntegrationRequest");
                if (integrationRequestParam == null) {
                    manageError(message, new MainApiException(400, "IntegrationRequest is required"), serviceId);
                    return;
                }
                IntegrationRequest integrationRequest = Json.mapper.readValue(integrationRequestParam.encode(), IntegrationRequest.class);
                service.integrationsCommercePost(integrationRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations_commerce/post");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations_commerce/post", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for integrations/get_by_id
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS/GET_BY_ID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations/get_by_id";
                String idParam = message.body().getString("id");
                if(idParam == null) {
                    manageError(message, new MainApiException(400, "id is required"), serviceId);
                    return;
                }
                String id = idParam;
                service.integrationsGetById(id, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations/get_by_id");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations/get_by_id", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for integrations/get_list
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS/GET_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations/get_list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.integrationsGetList(bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations/get_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations/get_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for integrations_logs/post
        vertx.eventBus().<JsonObject> consumer(INTEGRATIONS_LOGS/POST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "integrations_logs/post";
                JsonObject integrationLogsRequestParam = message.body().getJsonObject("IntegrationLogsRequest");
                if (integrationLogsRequestParam == null) {
                    manageError(message, new MainApiException(400, "IntegrationLogsRequest is required"), serviceId);
                    return;
                }
                IntegrationLogsRequest integrationLogsRequest = Json.mapper.readValue(integrationLogsRequestParam.encode(), IntegrationLogsRequest.class);
                service.integrationsLogsPost(integrationLogsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "integrations_logs/post");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("integrations_logs/post", e);
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
