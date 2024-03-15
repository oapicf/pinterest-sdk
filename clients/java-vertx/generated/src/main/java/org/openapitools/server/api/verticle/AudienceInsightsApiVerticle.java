package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AudienceDefinitionResponse;
import org.openapitools.server.api.model.AudienceInsightType;
import org.openapitools.server.api.model.AudienceInsightsResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AudienceInsightsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AudienceInsightsApiVerticle.class);

    static final String AUDIENCE_INSIGHTS/GET_SERVICE_ID = "audience_insights/get";
    static final String AUDIENCE_INSIGHTS_SCOPE_AND_TYPE/GET_SERVICE_ID = "audience_insights_scope_and_type/get";
    
    final AudienceInsightsApi service;

    public AudienceInsightsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AudienceInsightsApiImpl");
            service = (AudienceInsightsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AudienceInsightsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for audience_insights/get
        vertx.eventBus().<JsonObject> consumer(AUDIENCE_INSIGHTS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audience_insights/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject audienceInsightTypeParam = message.body().getJsonObject("audience_insight_type");
                if (audienceInsightTypeParam == null) {
                    manageError(message, new MainApiException(400, "audience_insight_type is required"), serviceId);
                    return;
                }
                AudienceInsightType audienceInsightType = Json.mapper.readValue(audienceInsightTypeParam.encode(), AudienceInsightType.class);
                service.audienceInsightsGet(adAccountId, audienceInsightType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audience_insights/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audience_insights/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for audience_insights_scope_and_type/get
        vertx.eventBus().<JsonObject> consumer(AUDIENCE_INSIGHTS_SCOPE_AND_TYPE/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "audience_insights_scope_and_type/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                service.audienceInsightsScopeAndTypeGet(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "audience_insights_scope_and_type/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("audience_insights_scope_and_type/get", e);
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
