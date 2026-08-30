package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccount;
import org.openapitools.vertxweb.server.model.AdAccountAnalyticsItems;
import org.openapitools.vertxweb.server.model.AdAccountCreate;
import org.openapitools.vertxweb.server.model.AdAccountsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.ConversionProductReport;
import org.openapitools.vertxweb.server.model.ConversionProductReportCreate;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MMMReport;
import org.openapitools.vertxweb.server.model.MMMReportCreate;
import org.openapitools.vertxweb.server.model.MetricsResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.ReportingColumnSync;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;
import org.openapitools.vertxweb.server.model.TemplateBasedReport;
import org.openapitools.vertxweb.server.model.TemplatesList200Response;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class AdAccountsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AdAccountsApiHandler.class);

    private final AdAccountsApi api;

    public AdAccountsApiHandler(AdAccountsApi api) {
        this.api = api;
    }

    @Deprecated
    public AdAccountsApiHandler() {
        this(new AdAccountsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adAccountAnalytics").handler(this::adAccountAnalytics);
        builder.operation("adAccountTargetingAnalyticsGet").handler(this::adAccountTargetingAnalyticsGet);
        builder.operation("adAccountsCreate").handler(this::adAccountsCreate);
        builder.operation("adAccountsGet").handler(this::adAccountsGet);
        builder.operation("adAccountsList").handler(this::adAccountsList);
        builder.operation("analyticsCreateConversionProductReport").handler(this::analyticsCreateConversionProductReport);
        builder.operation("analyticsCreateMmmReport").handler(this::analyticsCreateMmmReport);
        builder.operation("analyticsCreateReport").handler(this::analyticsCreateReport);
        builder.operation("analyticsCreateTemplateReport").handler(this::analyticsCreateTemplateReport);
        builder.operation("analyticsGetConversionProductReport").handler(this::analyticsGetConversionProductReport);
        builder.operation("analyticsGetMmmReport").handler(this::analyticsGetMmmReport);
        builder.operation("analyticsGetReport").handler(this::analyticsGetReport);
        builder.operation("sandboxDelete").handler(this::sandboxDelete);
        builder.operation("templatesList").handler(this::templatesList);
    }

    private void adAccountAnalytics(RoutingContext routingContext) {
        logger.info("adAccountAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);
        logger.debug("Parameter reportingTimezone is {}", reportingTimezone);

        api.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountTargetingAnalyticsGet(RoutingContext routingContext) {
        logger.info("adAccountTargetingAnalyticsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<AdsAnalyticsAccountTargetingType> targetingTypes = requestParameters.queryParameter("targeting_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("targeting_types").get(), new TypeReference<List<AdsAnalyticsAccountTargetingType>>(){}) : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = requestParameters.queryParameter("attribution_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("attribution_types").get(), new TypeReference<List<ConversionReportAttributionType>>(){}) : null;
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter targetingTypes is {}", targetingTypes);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);
        logger.debug("Parameter attributionTypes is {}", attributionTypes);
        logger.debug("Parameter reportingTimezone is {}", reportingTimezone);

        api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountsCreate(RoutingContext routingContext) {
        logger.info("adAccountsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        AdAccountCreate adAccountCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdAccountCreate>(){}) : null;

        logger.debug("Parameter adAccountCreate is {}", adAccountCreate);

        api.adAccountsCreate(adAccountCreate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountsGet(RoutingContext routingContext) {
        logger.info("adAccountsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.adAccountsGet(adAccountId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountsList(RoutingContext routingContext) {
        logger.info("adAccountsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean includeSharedAccounts = requestParameters.queryParameter("include_shared_accounts") != null ? requestParameters.queryParameter("include_shared_accounts").getBoolean() : true;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter includeSharedAccounts is {}", includeSharedAccounts);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.adAccountsList(includeSharedAccounts, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsCreateConversionProductReport(RoutingContext routingContext) {
        logger.info("analyticsCreateConversionProductReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ConversionProductReportCreate conversionProductReportCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConversionProductReportCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter conversionProductReportCreate is {}", conversionProductReportCreate);

        api.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsCreateMmmReport(RoutingContext routingContext) {
        logger.info("analyticsCreateMmmReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        MMMReportCreate mmMReportCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<MMMReportCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter mmMReportCreate is {}", mmMReportCreate);

        api.analyticsCreateMmmReport(adAccountId, mmMReportCreate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsCreateReport(RoutingContext routingContext) {
        logger.info("analyticsCreateReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdsAnalyticsCreateAsyncRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adsAnalyticsCreateAsyncRequest is {}", adsAnalyticsCreateAsyncRequest);

        api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsCreateTemplateReport(RoutingContext routingContext) {
        logger.info("analyticsCreateTemplateReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String templateId = requestParameters.pathParameter("template_id") != null ? requestParameters.pathParameter("template_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter templateId is {}", templateId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter granularity is {}", granularity);

        api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsGetConversionProductReport(RoutingContext routingContext) {
        logger.info("analyticsGetConversionProductReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String token = requestParameters.queryParameter("token") != null ? requestParameters.queryParameter("token").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter token is {}", token);

        api.analyticsGetConversionProductReport(adAccountId, token)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsGetMmmReport(RoutingContext routingContext) {
        logger.info("analyticsGetMmmReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String token = requestParameters.queryParameter("token") != null ? requestParameters.queryParameter("token").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter token is {}", token);

        api.analyticsGetMmmReport(adAccountId, token)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void analyticsGetReport(RoutingContext routingContext) {
        logger.info("analyticsGetReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String token = requestParameters.queryParameter("token") != null ? requestParameters.queryParameter("token").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter token is {}", token);

        api.analyticsGetReport(adAccountId, token)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void sandboxDelete(RoutingContext routingContext) {
        logger.info("sandboxDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.sandboxDelete(adAccountId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void templatesList(RoutingContext routingContext) {
        logger.info("templatesList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);

        api.templatesList(adAccountId, bookmark, pageSize, order)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
