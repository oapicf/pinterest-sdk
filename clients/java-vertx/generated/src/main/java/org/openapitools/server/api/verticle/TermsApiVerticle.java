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
import org.openapitools.server.api.model.RelatedTerms;

import java.util.List;
import java.util.Map;

public class TermsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(TermsApiVerticle.class);

    static final String TERMS_RELATED/LIST_SERVICE_ID = "terms_related/list";
    static final String TERMS_SUGGESTED/LIST_SERVICE_ID = "terms_suggested/list";
    
    final TermsApi service;

    public TermsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.TermsApiImpl");
            service = (TermsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("TermsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for terms_related/list
        vertx.eventBus().<JsonObject> consumer(TERMS_RELATED/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "terms_related/list";
                JsonArray termsParam = message.body().getJsonArray("terms");
                if(termsParam == null) {
                    manageError(message, new MainApiException(400, "terms is required"), serviceId);
                    return;
                }
                List<String> terms = Json.mapper.readValue(termsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                service.termsRelatedList(terms, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "terms_related/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("terms_related/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for terms_suggested/list
        vertx.eventBus().<JsonObject> consumer(TERMS_SUGGESTED/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "terms_suggested/list";
                String termParam = message.body().getString("term");
                if(termParam == null) {
                    manageError(message, new MainApiException(400, "term is required"), serviceId);
                    return;
                }
                String term = termParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 4 : Json.mapper.readValue(limitParam, Integer.class);
                service.termsSuggestedList(term, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "terms_suggested/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("terms_suggested/list", e);
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
