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
import org.openapitools.server.api.model.OauthAccessTokenResponse;

import java.util.List;
import java.util.Map;

public class OauthApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OauthApiVerticle.class);

    static final String OAUTH/TOKEN_SERVICE_ID = "oauth/token";
    
    final OauthApi service;

    public OauthApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OauthApiImpl");
            service = (OauthApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OauthApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for oauth/token
        vertx.eventBus().<JsonObject> consumer(OAUTH/TOKEN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "oauth/token";
                String grantTypeParam = message.body().getString("grant_type");
                if(grantTypeParam == null) {
                    manageError(message, new MainApiException(400, "grant_type is required"), serviceId);
                    return;
                }
                String grantType = grantTypeParam;
                service.oauthToken(grantType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "oauth/token");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("oauth/token", e);
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
