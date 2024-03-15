package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pin;
import org.openapitools.server.api.model.PinAnalyticsMetricsResponse;
import org.openapitools.server.api.model.PinCreate;
import org.openapitools.server.api.model.PinUpdate;
import org.openapitools.server.api.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.server.api.model.PinsList200Response;
import org.openapitools.server.api.model.PinsSaveRequest;

import java.util.List;
import java.util.Map;

public class PinsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(PinsApiVerticle.class);

    static final String PINS/ANALYTICS_SERVICE_ID = "pins/analytics";
    static final String PINS/CREATE_SERVICE_ID = "pins/create";
    static final String PINS/DELETE_SERVICE_ID = "pins/delete";
    static final String PINS/GET_SERVICE_ID = "pins/get";
    static final String PINS/LIST_SERVICE_ID = "pins/list";
    static final String PINS/SAVE_SERVICE_ID = "pins/save";
    static final String PINS/UPDATE_SERVICE_ID = "pins/update";
    
    final PinsApi service;

    public PinsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PinsApiImpl");
            service = (PinsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PinsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for pins/analytics
        vertx.eventBus().<JsonObject> consumer(PINS/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/analytics";
                String pinIdParam = message.body().getString("pin_id");
                if(pinIdParam == null) {
                    manageError(message, new MainApiException(400, "pin_id is required"), serviceId);
                    return;
                }
                String pinId = pinIdParam;
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
                JsonArray metricTypesParam = message.body().getJsonArray("metric_types");
                if(metricTypesParam == null) {
                    manageError(message, new MainApiException(400, "metric_types is required"), serviceId);
                    return;
                }
                List<PinsAnalyticsMetricTypesParameterInner> metricTypes = Json.mapper.readValue(metricTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, PinsAnalyticsMetricTypesParameterInner.class));
                String appTypesParam = message.body().getString("app_types");
                String appTypes = (appTypesParam == null) ? "ALL" : appTypesParam;
                String splitFieldParam = message.body().getString("split_field");
                String splitField = (splitFieldParam == null) ? "NO_SPLIT" : splitFieldParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pins/create
        vertx.eventBus().<JsonObject> consumer(PINS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/create";
                JsonObject pinCreateParam = message.body().getJsonObject("PinCreate");
                if (pinCreateParam == null) {
                    manageError(message, new MainApiException(400, "PinCreate is required"), serviceId);
                    return;
                }
                PinCreate pinCreate = Json.mapper.readValue(pinCreateParam.encode(), PinCreate.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.pinsCreate(pinCreate, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pins/delete
        vertx.eventBus().<JsonObject> consumer(PINS/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/delete";
                String pinIdParam = message.body().getString("pin_id");
                if(pinIdParam == null) {
                    manageError(message, new MainApiException(400, "pin_id is required"), serviceId);
                    return;
                }
                String pinId = pinIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.pinsDelete(pinId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pins/get
        vertx.eventBus().<JsonObject> consumer(PINS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/get";
                String pinIdParam = message.body().getString("pin_id");
                if(pinIdParam == null) {
                    manageError(message, new MainApiException(400, "pin_id is required"), serviceId);
                    return;
                }
                String pinId = pinIdParam;
                String pinMetricsParam = message.body().getString("pin_metrics");
                Boolean pinMetrics = (pinMetricsParam == null) ? false : Json.mapper.readValue(pinMetricsParam, Boolean.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.pinsGet(pinId, pinMetrics, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pins/list
        vertx.eventBus().<JsonObject> consumer(PINS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String pinFilterParam = message.body().getString("pin_filter");
                String pinFilter = (pinFilterParam == null) ? null : pinFilterParam;
                String includeProtectedPinsParam = message.body().getString("include_protected_pins");
                Boolean includeProtectedPins = (includeProtectedPinsParam == null) ? false : Json.mapper.readValue(includeProtectedPinsParam, Boolean.class);
                String pinTypeParam = message.body().getString("pin_type");
                String pinType = (pinTypeParam == null) ? null : pinTypeParam;
                JsonArray creativeTypesParam = message.body().getJsonArray("creative_types");
                List<String> creativeTypes = (creativeTypesParam == null) ? null : Json.mapper.readValue(creativeTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String pinMetricsParam = message.body().getString("pin_metrics");
                Boolean pinMetrics = (pinMetricsParam == null) ? false : Json.mapper.readValue(pinMetricsParam, Boolean.class);
                service.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pins/save
        vertx.eventBus().<JsonObject> consumer(PINS/SAVE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/save";
                String pinIdParam = message.body().getString("pin_id");
                if(pinIdParam == null) {
                    manageError(message, new MainApiException(400, "pin_id is required"), serviceId);
                    return;
                }
                String pinId = pinIdParam;
                JsonObject pinsSaveRequestParam = message.body().getJsonObject("PinsSaveRequest");
                if (pinsSaveRequestParam == null) {
                    manageError(message, new MainApiException(400, "PinsSaveRequest is required"), serviceId);
                    return;
                }
                PinsSaveRequest pinsSaveRequest = Json.mapper.readValue(pinsSaveRequestParam.encode(), PinsSaveRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.pinsSave(pinId, pinsSaveRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/save");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/save", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pins/update
        vertx.eventBus().<JsonObject> consumer(PINS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pins/update";
                String pinIdParam = message.body().getString("pin_id");
                if(pinIdParam == null) {
                    manageError(message, new MainApiException(400, "pin_id is required"), serviceId);
                    return;
                }
                String pinId = pinIdParam;
                JsonObject pinUpdateParam = message.body().getJsonObject("PinUpdate");
                if (pinUpdateParam == null) {
                    manageError(message, new MainApiException(400, "PinUpdate is required"), serviceId);
                    return;
                }
                PinUpdate pinUpdate = Json.mapper.readValue(pinUpdateParam.encode(), PinUpdate.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.pinsUpdate(pinId, pinUpdate, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pins/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pins/update", e);
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
