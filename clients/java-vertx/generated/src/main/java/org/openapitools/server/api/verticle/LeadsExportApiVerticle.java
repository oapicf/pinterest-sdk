package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.LeadsExportCreateRequest;
import org.openapitools.server.api.model.LeadsExportCreateResponse;
import org.openapitools.server.api.model.LeadsExportResponseData;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class LeadsExportApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(LeadsExportApiVerticle.class);

    static final String LEADS_EXPORT/CREATE_SERVICE_ID = "leads_export/create";
    static final String LEADS_EXPORT/GET_SERVICE_ID = "leads_export/get";
    
    final LeadsExportApi service;

    public LeadsExportApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.LeadsExportApiImpl");
            service = (LeadsExportApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("LeadsExportApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for leads_export/create
        vertx.eventBus().<JsonObject> consumer(LEADS_EXPORT/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "leads_export/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject leadsExportCreateRequestParam = message.body().getJsonObject("LeadsExportCreateRequest");
                if (leadsExportCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "LeadsExportCreateRequest is required"), serviceId);
                    return;
                }
                LeadsExportCreateRequest leadsExportCreateRequest = Json.mapper.readValue(leadsExportCreateRequestParam.encode(), LeadsExportCreateRequest.class);
                service.leadsExportCreate(adAccountId, leadsExportCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "leads_export/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("leads_export/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for leads_export/get
        vertx.eventBus().<JsonObject> consumer(LEADS_EXPORT/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "leads_export/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String leadsExportIdParam = message.body().getString("leads_export_id");
                if(leadsExportIdParam == null) {
                    manageError(message, new MainApiException(400, "leads_export_id is required"), serviceId);
                    return;
                }
                String leadsExportId = leadsExportIdParam;
                service.leadsExportGet(adAccountId, leadsExportId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "leads_export/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("leads_export/get", e);
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
