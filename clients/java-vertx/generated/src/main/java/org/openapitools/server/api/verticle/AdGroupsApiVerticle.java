package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdGroupArrayResponse;
import org.openapitools.server.api.model.AdGroupAudienceSizingRequest;
import org.openapitools.server.api.model.AdGroupAudienceSizingResponse;
import org.openapitools.server.api.model.AdGroupCreateRequest;
import org.openapitools.server.api.model.AdGroupResponse;
import org.openapitools.server.api.model.AdGroupUpdateRequest;
import org.openapitools.server.api.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.server.api.model.AdGroupsList200Response;
import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.BidFloor;
import org.openapitools.server.api.model.BidFloorRequest;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

import java.util.List;
import java.util.Map;

public class AdGroupsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AdGroupsApiVerticle.class);

    static final String AD_GROUPS/ANALYTICS_SERVICE_ID = "ad_groups/analytics";
    static final String AD_GROUPS/AUDIENCE_SIZING_SERVICE_ID = "ad_groups/audience_sizing";
    static final String AD_GROUPS_BID_FLOOR/GET_SERVICE_ID = "ad_groups_bid_floor/get";
    static final String AD_GROUPS/CREATE_SERVICE_ID = "ad_groups/create";
    static final String AD_GROUPS/GET_SERVICE_ID = "ad_groups/get";
    static final String AD_GROUPS/LIST_SERVICE_ID = "ad_groups/list";
    static final String AD_GROUPS_TARGETING_ANALYTICS/GET_SERVICE_ID = "ad_groups_targeting_analytics/get";
    static final String AD_GROUPS/UPDATE_SERVICE_ID = "ad_groups/update";
    
    final AdGroupsApi service;

    public AdGroupsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AdGroupsApiImpl");
            service = (AdGroupsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AdGroupsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_groups/analytics
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups/analytics";
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
                JsonArray adGroupIdsParam = message.body().getJsonArray("ad_group_ids");
                if(adGroupIdsParam == null) {
                    manageError(message, new MainApiException(400, "ad_group_ids is required"), serviceId);
                    return;
                }
                List<String> adGroupIds = Json.mapper.readValue(adGroupIdsParam.encode(),
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
                service.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups/audience_sizing
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS/AUDIENCE_SIZING_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups/audience_sizing";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject adGroupAudienceSizingRequestParam = message.body().getJsonObject("AdGroupAudienceSizingRequest");
                if (adGroupAudienceSizingRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdGroupAudienceSizingRequest is required"), serviceId);
                    return;
                }
                AdGroupAudienceSizingRequest adGroupAudienceSizingRequest = Json.mapper.readValue(adGroupAudienceSizingRequestParam.encode(), AdGroupAudienceSizingRequest.class);
                service.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups/audience_sizing");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups/audience_sizing", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups_bid_floor/get
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS_BID_FLOOR/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups_bid_floor/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject bidFloorRequestParam = message.body().getJsonObject("BidFloorRequest");
                if (bidFloorRequestParam == null) {
                    manageError(message, new MainApiException(400, "BidFloorRequest is required"), serviceId);
                    return;
                }
                BidFloorRequest bidFloorRequest = Json.mapper.readValue(bidFloorRequestParam.encode(), BidFloorRequest.class);
                service.adGroupsBidFloorGet(adAccountId, bidFloorRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups_bid_floor/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups_bid_floor/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups/create
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray adGroupCreateRequestParam = message.body().getJsonArray("AdGroupCreateRequest");
                if(adGroupCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdGroupCreateRequest is required"), serviceId);
                    return;
                }
                List<AdGroupCreateRequest> adGroupCreateRequest = Json.mapper.readValue(adGroupCreateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdGroupCreateRequest.class));
                service.adGroupsCreate(adAccountId, adGroupCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups/get
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String adGroupIdParam = message.body().getString("ad_group_id");
                if(adGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_group_id is required"), serviceId);
                    return;
                }
                String adGroupId = adGroupIdParam;
                service.adGroupsGet(adAccountId, adGroupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups/list
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups/list";
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
                JsonArray entityStatusesParam = message.body().getJsonArray("entity_statuses");
                List<String> entityStatuses = (entityStatusesParam == null) ? ACTIVE,PAUSED : Json.mapper.readValue(entityStatusesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String translateInterestsToNamesParam = message.body().getString("translate_interests_to_names");
                Boolean translateInterestsToNames = (translateInterestsToNamesParam == null) ? false : Json.mapper.readValue(translateInterestsToNamesParam, Boolean.class);
                service.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups_targeting_analytics/get
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS_TARGETING_ANALYTICS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups_targeting_analytics/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray adGroupIdsParam = message.body().getJsonArray("ad_group_ids");
                if(adGroupIdsParam == null) {
                    manageError(message, new MainApiException(400, "ad_group_ids is required"), serviceId);
                    return;
                }
                List<String> adGroupIds = Json.mapper.readValue(adGroupIdsParam.encode(),
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
                List<AdsAnalyticsTargetingType> targetingTypes = Json.mapper.readValue(targetingTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdsAnalyticsTargetingType.class));
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
                service.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups_targeting_analytics/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups_targeting_analytics/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_groups/update
        vertx.eventBus().<JsonObject> consumer(AD_GROUPS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_groups/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray adGroupUpdateRequestParam = message.body().getJsonArray("AdGroupUpdateRequest");
                if(adGroupUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdGroupUpdateRequest is required"), serviceId);
                    return;
                }
                List<AdGroupUpdateRequest> adGroupUpdateRequest = Json.mapper.readValue(adGroupUpdateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, AdGroupUpdateRequest.class));
                service.adGroupsUpdate(adAccountId, adGroupUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_groups/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_groups/update", e);
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
