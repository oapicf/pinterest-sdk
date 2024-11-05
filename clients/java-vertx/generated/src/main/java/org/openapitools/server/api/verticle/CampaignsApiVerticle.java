package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.server.api.model.CampaignCreateRequest;
import org.openapitools.server.api.model.CampaignCreateResponse;
import org.openapitools.server.api.model.CampaignResponse;
import org.openapitools.server.api.model.CampaignUpdateRequest;
import org.openapitools.server.api.model.CampaignUpdateResponse;
import org.openapitools.server.api.model.CampaignsAnalyticsResponseInner;
import org.openapitools.server.api.model.CampaignsList200Response;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

import java.util.List;
import java.util.Map;

public class CampaignsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CampaignsApiVerticle.class);

    static final String CAMPAIGN_TARGETING_ANALYTICS/GET_SERVICE_ID = "campaign_targeting_analytics/get";
    static final String CAMPAIGNS/ANALYTICS_SERVICE_ID = "campaigns/analytics";
    static final String CAMPAIGNS/CREATE_SERVICE_ID = "campaigns/create";
    static final String CAMPAIGNS/GET_SERVICE_ID = "campaigns/get";
    static final String CAMPAIGNS/LIST_SERVICE_ID = "campaigns/list";
    static final String CAMPAIGNS/UPDATE_SERVICE_ID = "campaigns/update";
    
    final CampaignsApi service;

    public CampaignsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CampaignsApiImpl");
            service = (CampaignsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CampaignsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for campaign_targeting_analytics/get
        vertx.eventBus().<JsonObject> consumer(CAMPAIGN_TARGETING_ANALYTICS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "campaign_targeting_analytics/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray campaignIdsParam = message.body().getJsonArray("campaign_ids");
                if(campaignIdsParam == null) {
                    manageError(message, new MainApiException(400, "campaign_ids is required"), serviceId);
                    return;
                }
                List<String> campaignIds = Json.mapper.readValue(campaignIdsParam.encode(),
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
                List<AdsAnalyticsCampaignTargetingType> targetingTypes = Json.mapper.readValue(targetingTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdsAnalyticsCampaignTargetingType.class));
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
                service.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "campaign_targeting_analytics/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("campaign_targeting_analytics/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for campaigns/analytics
        vertx.eventBus().<JsonObject> consumer(CAMPAIGNS/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "campaigns/analytics";
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
                JsonArray campaignIdsParam = message.body().getJsonArray("campaign_ids");
                if(campaignIdsParam == null) {
                    manageError(message, new MainApiException(400, "campaign_ids is required"), serviceId);
                    return;
                }
                List<String> campaignIds = Json.mapper.readValue(campaignIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
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
                service.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "campaigns/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("campaigns/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for campaigns/create
        vertx.eventBus().<JsonObject> consumer(CAMPAIGNS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "campaigns/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray campaignCreateRequestParam = message.body().getJsonArray("CampaignCreateRequest");
                if(campaignCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CampaignCreateRequest is required"), serviceId);
                    return;
                }
                List<CampaignCreateRequest> campaignCreateRequest = Json.mapper.readValue(campaignCreateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, CampaignCreateRequest.class));
                service.campaignsCreate(adAccountId, campaignCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "campaigns/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("campaigns/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for campaigns/get
        vertx.eventBus().<JsonObject> consumer(CAMPAIGNS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "campaigns/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String campaignIdParam = message.body().getString("campaign_id");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaign_id is required"), serviceId);
                    return;
                }
                String campaignId = campaignIdParam;
                service.campaignsGet(adAccountId, campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "campaigns/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("campaigns/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for campaigns/list
        vertx.eventBus().<JsonObject> consumer(CAMPAIGNS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "campaigns/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray campaignIdsParam = message.body().getJsonArray("campaign_ids");
                List<String> campaignIds = (campaignIdsParam == null) ? null : Json.mapper.readValue(campaignIdsParam.encode(),
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
                service.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "campaigns/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("campaigns/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for campaigns/update
        vertx.eventBus().<JsonObject> consumer(CAMPAIGNS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "campaigns/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray campaignUpdateRequestParam = message.body().getJsonArray("CampaignUpdateRequest");
                if(campaignUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CampaignUpdateRequest is required"), serviceId);
                    return;
                }
                List<CampaignUpdateRequest> campaignUpdateRequest = Json.mapper.readValue(campaignUpdateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, CampaignUpdateRequest.class));
                service.campaignsUpdate(adAccountId, campaignUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "campaigns/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("campaigns/update", e);
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
