package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.BulkDownloadRequest;
import org.openapitools.server.api.model.BulkDownloadResponse;
import org.openapitools.server.api.model.BulkUpsertRequest;
import org.openapitools.server.api.model.BulkUpsertResponse;
import org.openapitools.server.api.model.BulkUpsertStatusResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class BulkApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BulkApiVerticle.class);

    static final String BULK_DOWNLOAD/CREATE_SERVICE_ID = "bulk_download/create";
    static final String BULK_REQUEST/GET_SERVICE_ID = "bulk_request/get";
    static final String BULK_UPSERT/CREATE_SERVICE_ID = "bulk_upsert/create";
    
    final BulkApi service;

    public BulkApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BulkApiImpl");
            service = (BulkApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BulkApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for bulk_download/create
        vertx.eventBus().<JsonObject> consumer(BULK_DOWNLOAD/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "bulk_download/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject bulkDownloadRequestParam = message.body().getJsonObject("BulkDownloadRequest");
                if (bulkDownloadRequestParam == null) {
                    manageError(message, new MainApiException(400, "BulkDownloadRequest is required"), serviceId);
                    return;
                }
                BulkDownloadRequest bulkDownloadRequest = Json.mapper.readValue(bulkDownloadRequestParam.encode(), BulkDownloadRequest.class);
                service.bulkDownloadCreate(adAccountId, bulkDownloadRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "bulk_download/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("bulk_download/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for bulk_request/get
        vertx.eventBus().<JsonObject> consumer(BULK_REQUEST/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "bulk_request/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String bulkRequestIdParam = message.body().getString("bulk_request_id");
                if(bulkRequestIdParam == null) {
                    manageError(message, new MainApiException(400, "bulk_request_id is required"), serviceId);
                    return;
                }
                String bulkRequestId = bulkRequestIdParam;
                String includeDetailsParam = message.body().getString("include_details");
                Boolean includeDetails = (includeDetailsParam == null) ? false : Json.mapper.readValue(includeDetailsParam, Boolean.class);
                service.bulkRequestGet(adAccountId, bulkRequestId, includeDetails, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "bulk_request/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("bulk_request/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for bulk_upsert/create
        vertx.eventBus().<JsonObject> consumer(BULK_UPSERT/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "bulk_upsert/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject bulkUpsertRequestParam = message.body().getJsonObject("BulkUpsertRequest");
                if (bulkUpsertRequestParam == null) {
                    manageError(message, new MainApiException(400, "BulkUpsertRequest is required"), serviceId);
                    return;
                }
                BulkUpsertRequest bulkUpsertRequest = Json.mapper.readValue(bulkUpsertRequestParam.encode(), BulkUpsertRequest.class);
                service.bulkUpsertCreate(adAccountId, bulkUpsertRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "bulk_upsert/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("bulk_upsert/create", e);
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
