package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Account;
import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class UserAccountApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(UserAccountApiVerticle.class);

    static final String USER_ACCOUNT/ANALYTICS_SERVICE_ID = "user_account/analytics";
    static final String USER_ACCOUNT/GET_SERVICE_ID = "user_account/get";
    
    final UserAccountApi service;

    public UserAccountApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.UserAccountApiImpl");
            service = (UserAccountApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("UserAccountApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for user_account/analytics
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/analytics";
                String startDateParam = message.body().getString("start_date");
                if(startDateParam == null) {
                    manageError(message, new MainApiException(400, "start_date is required"), serviceId);
                    return;
                }
                LocalDate startDate = Json.mapper.readValue(startDateParam, LocalDate.class);
                String endDateParam = message.body().getString("end_date");
                if(endDateParam == null) {
                    manageError(message, new MainApiException(400, "end_date is required"), serviceId);
                    return;
                }
                LocalDate endDate = Json.mapper.readValue(endDateParam, LocalDate.class);
                String fromClaimedContentParam = message.body().getString("from_claimed_content");
                String fromClaimedContent = (fromClaimedContentParam == null) ? "BOTH" : fromClaimedContentParam;
                String pinFormatParam = message.body().getString("pin_format");
                String pinFormat = (pinFormatParam == null) ? "ALL" : pinFormatParam;
                String appTypesParam = message.body().getString("app_types");
                String appTypes = (appTypesParam == null) ? "ALL" : appTypesParam;
                JsonArray metricTypesParam = message.body().getJsonArray("metric_types");
                List<String> metricTypes = (metricTypesParam == null) ? null : Json.mapper.readValue(metricTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String splitFieldParam = message.body().getString("split_field");
                String splitField = (splitFieldParam == null) ? "NO_SPLIT" : splitFieldParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_account/get
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userAccountGet(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/get", e);
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
