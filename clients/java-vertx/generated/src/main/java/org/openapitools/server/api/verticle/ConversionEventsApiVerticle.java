package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.ConversionApiResponse;
import org.openapitools.server.api.model.ConversionEvents;
import org.openapitools.server.api.model.DetailedError;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ConversionEventsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ConversionEventsApiVerticle.class);

    static final String EVENTS/CREATE_SERVICE_ID = "events/create";
    
    final ConversionEventsApi service;

    public ConversionEventsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ConversionEventsApiImpl");
            service = (ConversionEventsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ConversionEventsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for events/create
        vertx.eventBus().<JsonObject> consumer(EVENTS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "events/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject conversionEventsParam = message.body().getJsonObject("ConversionEvents");
                if (conversionEventsParam == null) {
                    manageError(message, new MainApiException(400, "ConversionEvents is required"), serviceId);
                    return;
                }
                ConversionEvents conversionEvents = Json.mapper.readValue(conversionEventsParam.encode(), ConversionEvents.class);
                String testParam = message.body().getString("test");
                Boolean test = (testParam == null) ? null : Json.mapper.readValue(testParam, Boolean.class);
                service.eventsCreate(adAccountId, conversionEvents, test, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "events/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("events/create", e);
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
