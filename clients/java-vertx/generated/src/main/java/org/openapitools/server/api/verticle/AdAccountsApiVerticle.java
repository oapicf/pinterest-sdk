package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdAccount;
import org.openapitools.server.api.model.AdAccountAnalyticsResponseInner;
import org.openapitools.server.api.model.AdAccountCreateRequest;
import org.openapitools.server.api.model.AdAccountsList200Response;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.CreateMMMReportRequest;
import org.openapitools.server.api.model.CreateMMMReportResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetMMMReportResponse;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;
import org.openapitools.server.api.model.TemplatesList200Response;

import java.util.List;
import java.util.Map;

public class AdAccountsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AdAccountsApiVerticle.class);

    static final String AD_ACCOUNT/ANALYTICS_SERVICE_ID = "ad_account/analytics";
    static final String AD_ACCOUNT_TARGETING_ANALYTICS/GET_SERVICE_ID = "ad_account_targeting_analytics/get";
    static final String AD_ACCOUNTS/CREATE_SERVICE_ID = "ad_accounts/create";
    static final String AD_ACCOUNTS/GET_SERVICE_ID = "ad_accounts/get";
    static final String AD_ACCOUNTS/LIST_SERVICE_ID = "ad_accounts/list";
    static final String ANALYTICS/CREATE_MMM_REPORT_SERVICE_ID = "analytics/create_mmm_report";
    static final String ANALYTICS/CREATE_REPORT_SERVICE_ID = "analytics/create_report";
    static final String ANALYTICS/CREATE_TEMPLATE_REPORT_SERVICE_ID = "analytics/create_template_report";
    static final String ANALYTICS/GET_MMM_REPORT_SERVICE_ID = "analytics/get_mmm_report";
    static final String ANALYTICS/GET_REPORT_SERVICE_ID = "analytics/get_report";
    static final String SANDBOX/DELETE_SERVICE_ID = "sandbox/delete";
    static final String TEMPLATES/LIST_SERVICE_ID = "templates/list";
    
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
        
        //Consumer for ad_account_targeting_analytics/get
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNT_TARGETING_ANALYTICS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_account_targeting_analytics/get";
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
                service.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_account_targeting_analytics/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_account_targeting_analytics/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_accounts/create
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts/create";
                JsonObject adAccountCreateRequestParam = message.body().getJsonObject("AdAccountCreateRequest");
                if (adAccountCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "AdAccountCreateRequest is required"), serviceId);
                    return;
                }
                AdAccountCreateRequest adAccountCreateRequest = Json.mapper.readValue(adAccountCreateRequestParam.encode(), AdAccountCreateRequest.class);
                service.adAccountsCreate(adAccountCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ad_accounts/get
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                service.adAccountsGet(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts/get", e);
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
        
        //Consumer for analytics/create_mmm_report
        vertx.eventBus().<JsonObject> consumer(ANALYTICS/CREATE_MMM_REPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "analytics/create_mmm_report";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject createMMMReportRequestParam = message.body().getJsonObject("CreateMMMReportRequest");
                if (createMMMReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateMMMReportRequest is required"), serviceId);
                    return;
                }
                CreateMMMReportRequest createMMMReportRequest = Json.mapper.readValue(createMMMReportRequestParam.encode(), CreateMMMReportRequest.class);
                service.analyticsCreateMmmReport(adAccountId, createMMMReportRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "analytics/create_mmm_report");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("analytics/create_mmm_report", e);
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
        
        //Consumer for analytics/create_template_report
        vertx.eventBus().<JsonObject> consumer(ANALYTICS/CREATE_TEMPLATE_REPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "analytics/create_template_report";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String templateIdParam = message.body().getString("template_id");
                if(templateIdParam == null) {
                    manageError(message, new MainApiException(400, "template_id is required"), serviceId);
                    return;
                }
                String templateId = templateIdParam;
                String startDateParam = message.body().getString("start_date");
                LocalDate startDate = (startDateParam == null) ? null : Json.mapper.readValue(startDateParam, LocalDate.class);
                String endDateParam = message.body().getString("end_date");
                LocalDate endDate = (endDateParam == null) ? null : Json.mapper.readValue(endDateParam, LocalDate.class);
                JsonObject granularityParam = message.body().getJsonObject("granularity");
                if (granularityParam == null) {
                    manageError(message, new MainApiException(400, "granularity is required"), serviceId);
                    return;
                }
                Granularity granularity = Json.mapper.readValue(granularityParam.encode(), Granularity.class);
                service.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "analytics/create_template_report");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("analytics/create_template_report", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for analytics/get_mmm_report
        vertx.eventBus().<JsonObject> consumer(ANALYTICS/GET_MMM_REPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "analytics/get_mmm_report";
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
                service.analyticsGetMmmReport(adAccountId, token, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "analytics/get_mmm_report");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("analytics/get_mmm_report", e);
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
        
        //Consumer for sandbox/delete
        vertx.eventBus().<JsonObject> consumer(SANDBOX/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sandbox/delete";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                service.sandboxDelete(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sandbox/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sandbox/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for templates/list
        vertx.eventBus().<JsonObject> consumer(TEMPLATES/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "templates/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.templatesList(adAccountId, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "templates/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("templates/list", e);
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
