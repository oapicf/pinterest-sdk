package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Paginated;

import java.util.List;
import java.util.Map;

public class AdAccountsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AdAccountsApiVerticle.class);

    static final String AD_ACCOUNT/ANALYTICS_SERVICE_ID = "ad_account/analytics";
    static final String AD_ACCOUNTS/LIST_SERVICE_ID = "ad_accounts/list";
    static final String AD_GROUPS/ANALYTICS_SERVICE_ID = "ad_groups/analytics";
    static final String AD_GROUPS/LIST_SERVICE_ID = "ad_groups/list";
    static final String ADS/ANALYTICS_SERVICE_ID = "ads/analytics";
    static final String ADS/LIST_SERVICE_ID = "ads/list";
    static final String ANALYTICS/CREATE_REPORT_SERVICE_ID = "analytics/create_report";
    static final String ANALYTICS/GET_REPORT_SERVICE_ID = "analytics/get_report";
    static final String CAMPAIGNS/ANALYTICS_SERVICE_ID = "campaigns/analytics";
    static final String CAMPAIGNS/LIST_SERVICE_ID = "campaigns/list";
    static final String PRODUCT_GROUPS/ANALYTICS_SERVICE_ID = "product_groups/analytics";
    
    final AdAccountsApi service;

    public AdAccountsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AdAccountsApiImpl");
            service = (AdAccountsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AdAccountsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_account/analytics
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNT/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_account/analytics";
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
                String clickWindowDaysParam = message.body().getString("click_window_days");
                Integer clickWindowDays = (clickWindowDaysParam == null) ? 30 : Json.mapper.readValue(clickWindowDaysParam, Integer.class);
                String engagementWindowDaysParam = message.body().getString("engagement_window_days");
                Integer engagementWindowDays = (engagementWindowDaysParam == null) ? 30 : Json.mapper.readValue(engagementWindowDaysParam, Integer.class);
                String viewWindowDaysParam = message.body().getString("view_window_days");
                Integer viewWindowDays = (viewWindowDaysParam == null) ? 1 : Json.mapper.readValue(viewWindowDaysParam, Integer.class);
                String conversionReportTimeParam = message.body().getString("conversion_report_time");
                String conversionReportTime = (conversionReportTimeParam == null) ? "TIME_OF_AD_ACTION" : conversionReportTimeParam;
                service.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_account/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_account/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_accounts/list
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String includeSharedAccountsParam = message.body().getString("include_shared_accounts");
                Boolean includeSharedAccounts = (includeSharedAccountsParam == null) ? true : Json.mapper.readValue(includeSharedAccountsParam, Boolean.class);
                service.adAccountsList(bookmark, pageSize, includeSharedAccounts, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
                List<String> entityStatuses = (entityStatusesParam == null) ? null : Json.mapper.readValue(entityStatusesParam.encode(),
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
                JsonArray adIdsParam = message.body().getJsonArray("ad_ids");
                if(adIdsParam == null) {
                    manageError(message, new MainApiException(400, "ad_ids is required"), serviceId);
                    return;
                }
                List<String> adIds = Json.mapper.readValue(adIdsParam.encode(),
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
                service.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, result -> {
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
                List<String> entityStatuses = (entityStatusesParam == null) ? null : Json.mapper.readValue(entityStatusesParam.encode(),
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
        
        //Consumer for analytics/create_report
        vertx.eventBus().<JsonObject> consumer(ANALYTICS/CREATE_REPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "analytics/create_report";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject adsAnalyticsCreateAsyncRequestParam = message.body().getJsonObject("AdsAnalyticsCreateAsyncRequest");
                if (adsAnalyticsCreateAsyncRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdsAnalyticsCreateAsyncRequest is required"), serviceId);
                    return;
                }
                AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = Json.mapper.readValue(adsAnalyticsCreateAsyncRequestParam.encode(), AdsAnalyticsCreateAsyncRequest.class);
                service.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "analytics/create_report");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("analytics/create_report", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for analytics/get_report
        vertx.eventBus().<JsonObject> consumer(ANALYTICS/GET_REPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "analytics/get_report";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String tokenParam = message.body().getString("token");
                if(tokenParam == null) {
                    manageError(message, new MainApiException(400, "token is required"), serviceId);
                    return;
                }
                String token = tokenParam;
                service.analyticsGetReport(adAccountId, token, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "analytics/get_report");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("analytics/get_report", e);
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
                List<String> entityStatuses = (entityStatusesParam == null) ? null : Json.mapper.readValue(entityStatusesParam.encode(),
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
        
        //Consumer for product_groups/analytics
        vertx.eventBus().<JsonObject> consumer(PRODUCT_GROUPS/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "product_groups/analytics";
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
                JsonArray productGroupIdsParam = message.body().getJsonArray("product_group_ids");
                if(productGroupIdsParam == null) {
                    manageError(message, new MainApiException(400, "product_group_ids is required"), serviceId);
                    return;
                }
                List<String> productGroupIds = Json.mapper.readValue(productGroupIdsParam.encode(),
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
                service.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "product_groups/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("product_groups/analytics", e);
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
