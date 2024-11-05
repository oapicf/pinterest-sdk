package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdArrayResponse;
import org.openapitools.server.api.model.AdCreateRequest;
import org.openapitools.server.api.model.AdPreviewRequest;
import org.openapitools.server.api.model.AdPreviewURLResponse;
import org.openapitools.server.api.model.AdResponse;
import org.openapitools.server.api.model.AdUpdateRequest;
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType;
import org.openapitools.server.api.model.AdsAnalyticsResponseInner;
import org.openapitools.server.api.model.AdsList200Response;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

import java.util.List;
import java.util.Map;

public class AdsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AdsApiVerticle.class);

    static final String AD_PREVIEWS/CREATE_SERVICE_ID = "ad_previews/create";
    static final String AD_TARGETING_ANALYTICS/GET_SERVICE_ID = "ad_targeting_analytics/get";
    static final String ADS/ANALYTICS_SERVICE_ID = "ads/analytics";
    static final String ADS/CREATE_SERVICE_ID = "ads/create";
    static final String ADS/GET_SERVICE_ID = "ads/get";
    static final String ADS/LIST_SERVICE_ID = "ads/list";
    static final String ADS/UPDATE_SERVICE_ID = "ads/update";
    
    final AdsApi service;

    public AdsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AdsApiImpl");
            service = (AdsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AdsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_previews/create
        vertx.eventBus().<JsonObject> consumer(AD_PREVIEWS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_previews/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject adPreviewRequestParam = message.body().getJsonObject("AdPreviewRequest");
                if (adPreviewRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdPreviewRequest is required"), serviceId);
                    return;
                }
                AdPreviewRequest adPreviewRequest = Json.mapper.readValue(adPreviewRequestParam.encode(), AdPreviewRequest.class);
                service.adPreviewsCreate(adAccountId, adPreviewRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_previews/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_previews/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_targeting_analytics/get
        vertx.eventBus().<JsonObject> consumer(AD_TARGETING_ANALYTICS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_targeting_analytics/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray adIdsParam = message.body().getJsonArray("ad_ids");
                if(adIdsParam == null) {
                    manageError(message, new MainApiException(400, "ad_ids is required"), serviceId);
                    return;
                }
                List<String> adIds = Json.mapper.readValue(adIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
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
                JsonArray targetingTypesParam = message.body().getJsonArray("targeting_types");
                if(targetingTypesParam == null) {
                    manageError(message, new MainApiException(400, "targeting_types is required"), serviceId);
                    return;
                }
                List<AdsAnalyticsAdTargetingType> targetingTypes = Json.mapper.readValue(targetingTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdsAnalyticsAdTargetingType.class));
                JsonArray columnsParam = message.body().getJsonArray("columns");
                if(columnsParam == null) {
                    manageError(message, new MainApiException(400, "columns is required"), serviceId);
                    return;
                }
                List<String> columns = Json.mapper.readValue(columnsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject granularityParam = message.body().getJsonObject("granularity");
                if (granularityParam == null) {
                    manageError(message, new MainApiException(400, "granularity is required"), serviceId);
                    return;
                }
                Granularity granularity = Json.mapper.readValue(granularityParam.encode(), Granularity.class);
                String clickWindowDaysParam = message.body().getString("click_window_days");
                Integer clickWindowDays = (clickWindowDaysParam == null) ? 30 : Json.mapper.readValue(clickWindowDaysParam, Integer.class);
                String engagementWindowDaysParam = message.body().getString("engagement_window_days");
                Integer engagementWindowDays = (engagementWindowDaysParam == null) ? 30 : Json.mapper.readValue(engagementWindowDaysParam, Integer.class);
                String viewWindowDaysParam = message.body().getString("view_window_days");
                Integer viewWindowDays = (viewWindowDaysParam == null) ? 1 : Json.mapper.readValue(viewWindowDaysParam, Integer.class);
                String conversionReportTimeParam = message.body().getString("conversion_report_time");
                String conversionReportTime = (conversionReportTimeParam == null) ? "TIME_OF_AD_ACTION" : conversionReportTimeParam;
                JsonObject attributionTypesParam = message.body().getJsonObject("attribution_types");
                if (attributionTypesParam == null) {
                    manageError(message, new MainApiException(400, "attribution_types is required"), serviceId);
                    return;
                }
                ConversionReportAttributionType attributionTypes = Json.mapper.readValue(attributionTypesParam.encode(), ConversionReportAttributionType.class);
                service.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_targeting_analytics/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_targeting_analytics/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ads/analytics
        vertx.eventBus().<JsonObject> consumer(ADS/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads/analytics";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
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
                JsonArray columnsParam = message.body().getJsonArray("columns");
                if(columnsParam == null) {
                    manageError(message, new MainApiException(400, "columns is required"), serviceId);
                    return;
                }
                List<String> columns = Json.mapper.readValue(columnsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject granularityParam = message.body().getJsonObject("granularity");
                if (granularityParam == null) {
                    manageError(message, new MainApiException(400, "granularity is required"), serviceId);
                    return;
                }
                Granularity granularity = Json.mapper.readValue(granularityParam.encode(), Granularity.class);
                JsonArray adIdsParam = message.body().getJsonArray("ad_ids");
                List<String> adIds = (adIdsParam == null) ? null : Json.mapper.readValue(adIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String clickWindowDaysParam = message.body().getString("click_window_days");
                Integer clickWindowDays = (clickWindowDaysParam == null) ? 30 : Json.mapper.readValue(clickWindowDaysParam, Integer.class);
                String engagementWindowDaysParam = message.body().getString("engagement_window_days");
                Integer engagementWindowDays = (engagementWindowDaysParam == null) ? 30 : Json.mapper.readValue(engagementWindowDaysParam, Integer.class);
                String viewWindowDaysParam = message.body().getString("view_window_days");
                Integer viewWindowDays = (viewWindowDaysParam == null) ? 1 : Json.mapper.readValue(viewWindowDaysParam, Integer.class);
                String conversionReportTimeParam = message.body().getString("conversion_report_time");
                String conversionReportTime = (conversionReportTimeParam == null) ? "TIME_OF_AD_ACTION" : conversionReportTimeParam;
                JsonArray pinIdsParam = message.body().getJsonArray("pin_ids");
                List<String> pinIds = (pinIdsParam == null) ? null : Json.mapper.readValue(pinIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray campaignIdsParam = message.body().getJsonArray("campaign_ids");
                List<String> campaignIds = (campaignIdsParam == null) ? null : Json.mapper.readValue(campaignIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                service.adsAnalytics(adAccountId, startDate, endDate, columns, granularity, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ads/create
        vertx.eventBus().<JsonObject> consumer(ADS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray adCreateRequestParam = message.body().getJsonArray("AdCreateRequest");
                if(adCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdCreateRequest is required"), serviceId);
                    return;
                }
                List<AdCreateRequest> adCreateRequest = Json.mapper.readValue(adCreateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdCreateRequest.class));
                service.adsCreate(adAccountId, adCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ads/get
        vertx.eventBus().<JsonObject> consumer(ADS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String adIdParam = message.body().getString("ad_id");
                if(adIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_id is required"), serviceId);
                    return;
                }
                String adId = adIdParam;
                service.adsGet(adAccountId, adId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ads/list
        vertx.eventBus().<JsonObject> consumer(ADS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray campaignIdsParam = message.body().getJsonArray("campaign_ids");
                List<String> campaignIds = (campaignIdsParam == null) ? null : Json.mapper.readValue(campaignIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray adGroupIdsParam = message.body().getJsonArray("ad_group_ids");
                List<String> adGroupIds = (adGroupIdsParam == null) ? null : Json.mapper.readValue(adGroupIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray adIdsParam = message.body().getJsonArray("ad_ids");
                List<String> adIds = (adIdsParam == null) ? null : Json.mapper.readValue(adIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray entityStatusesParam = message.body().getJsonArray("entity_statuses");
                List<String> entityStatuses = (entityStatusesParam == null) ? ACTIVE,PAUSED : Json.mapper.readValue(entityStatusesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ads/update
        vertx.eventBus().<JsonObject> consumer(ADS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ads/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray adUpdateRequestParam = message.body().getJsonArray("AdUpdateRequest");
                if(adUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdUpdateRequest is required"), serviceId);
                    return;
                }
                List<AdUpdateRequest> adUpdateRequest = Json.mapper.readValue(adUpdateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdUpdateRequest.class));
                service.adsUpdate(adAccountId, adUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ads/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ads/update", e);
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
