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
import org.openapitools.server.api.model.TermsOfService;

import java.util.List;
import java.util.Map;

public class TermsOfServiceApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(TermsOfServiceApiVerticle.class);

    static final String TERMS_OF_SERVICE/GET_SERVICE_ID = "terms_of_service/get";
    
    final TermsOfServiceApi service;

    public TermsOfServiceApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.TermsOfServiceApiImpl");
            service = (TermsOfServiceApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("TermsOfServiceApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for terms_of_service/get
        vertx.eventBus().<JsonObject> consumer(TERMS_OF_SERVICE/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "terms_of_service/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String includeHtmlParam = message.body().getString("include_html");
                Boolean includeHtml = (includeHtmlParam == null) ? false : Json.mapper.readValue(includeHtmlParam, Boolean.class);
                String tosTypeParam = message.body().getString("tos_type");
                String tosType = (tosTypeParam == null) ? null : tosTypeParam;
                service.termsOfServiceGet(adAccountId, includeHtml, tosType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "terms_of_service/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("terms_of_service/get", e);
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
