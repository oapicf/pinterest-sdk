package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdAccountsCountryResponse;
import org.openapitools.server.api.model.BookClosedResponse;
import org.openapitools.server.api.model.DeliveryMetricsResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SingleInterestTargetingOptionResponse;

import java.util.List;
import java.util.Map;

public class ResourcesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ResourcesApiVerticle.class);

    static final String AD_ACCOUNT_COUNTRIES/GET_SERVICE_ID = "ad_account_countries/get";
    static final String DELIVERY_METRICS/GET_SERVICE_ID = "delivery_metrics/get";
    static final String INTEREST_TARGETING_OPTIONS/GET_SERVICE_ID = "interest_targeting_options/get";
    static final String LEAD_FORM_QUESTIONS/GET_SERVICE_ID = "lead_form_questions/get";
    static final String METRICS_READY_STATE/GET_SERVICE_ID = "metrics_ready_state/get";
    static final String TARGETING_OPTIONS/GET_SERVICE_ID = "targeting_options/get";
    
    final ResourcesApi service;

    public ResourcesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ResourcesApiImpl");
            service = (ResourcesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ResourcesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_account_countries/get
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNT_COUNTRIES/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_account_countries/get";
                service.adAccountCountriesGet(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_account_countries/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_account_countries/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delivery_metrics/get
        vertx.eventBus().<JsonObject> consumer(DELIVERY_METRICS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delivery_metrics/get";
                String reportTypeParam = message.body().getString("report_type");
                String reportType = (reportTypeParam == null) ? null : reportTypeParam;
                service.deliveryMetricsGet(reportType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delivery_metrics/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delivery_metrics/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for interest_targeting_options/get
        vertx.eventBus().<JsonObject> consumer(INTEREST_TARGETING_OPTIONS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "interest_targeting_options/get";
                String interestIdParam = message.body().getString("interest_id");
                if(interestIdParam == null) {
                    manageError(message, new MainApiException(400, "interest_id is required"), serviceId);
                    return;
                }
                String interestId = interestIdParam;
                service.interestTargetingOptionsGet(interestId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "interest_targeting_options/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("interest_targeting_options/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for lead_form_questions/get
        vertx.eventBus().<JsonObject> consumer(LEAD_FORM_QUESTIONS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "lead_form_questions/get";
                service.leadFormQuestionsGet(result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "lead_form_questions/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("lead_form_questions/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for metrics_ready_state/get
        vertx.eventBus().<JsonObject> consumer(METRICS_READY_STATE/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "metrics_ready_state/get";
                String dateParam = message.body().getString("date");
                if(dateParam == null) {
                    manageError(message, new MainApiException(400, "date is required"), serviceId);
                    return;
                }
                String date = dateParam;
                service.metricsReadyStateGet(date, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "metrics_ready_state/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("metrics_ready_state/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for targeting_options/get
        vertx.eventBus().<JsonObject> consumer(TARGETING_OPTIONS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "targeting_options/get";
                String targetingTypeParam = message.body().getString("targeting_type");
                if(targetingTypeParam == null) {
                    manageError(message, new MainApiException(400, "targeting_type is required"), serviceId);
                    return;
                }
                String targetingType = targetingTypeParam;
                String clientIdParam = message.body().getString("client_id");
                String clientId = (clientIdParam == null) ? null : clientIdParam;
                String oauthSignatureParam = message.body().getString("oauth_signature");
                String oauthSignature = (oauthSignatureParam == null) ? null : oauthSignatureParam;
                String timestampParam = message.body().getString("timestamp");
                String timestamp = (timestampParam == null) ? null : timestampParam;
                service.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "targeting_options/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("targeting_options/get", e);
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
