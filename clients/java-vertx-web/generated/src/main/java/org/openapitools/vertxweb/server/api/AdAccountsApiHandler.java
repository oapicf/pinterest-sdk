package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccount;
import org.openapitools.vertxweb.server.model.AdAccountAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdAccountCreateRequest;
import org.openapitools.vertxweb.server.model.AdAccountsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.CreateMMMReportRequest;
import org.openapitools.vertxweb.server.model.CreateMMMReportResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.GetMMMReportResponse;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;
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
        builder.operation("analyticsCreateMmmReport").handler(this::analyticsCreateMmmReport);
        builder.operation("analyticsCreateReport").handler(this::analyticsCreateReport);
        builder.operation("analyticsCreateTemplateReport").handler(this::analyticsCreateTemplateReport);
        builder.operation("analyticsGetMmmReport").handler(this::analyticsGetMmmReport);
        builder.operation("analyticsGetReport").handler(this::analyticsGetReport);
        builder.operation("sandboxDelete").handler(this::sandboxDelete);
        builder.operation("templatesList").handler(this::templatesList);
    }

    private void adAccountAnalytics(RoutingContext routingContext) {
        logger.info("adAccountAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : 30;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : 30;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : 1;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
        List<AdsAnalyticsTargetingType> targetingTypes = requestParameters.queryParameter("targeting_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("targeting_types").get(), new TypeReference<List<AdsAnalyticsTargetingType>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : 30;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : 30;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : 1;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        ConversionReportAttributionType attributionTypes = requestParameters.queryParameter("attribution_types") != null ? requestParameters.queryParameter("attribution_types").getConversionReportAttributionType() : null;

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

        api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
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
        AdAccountCreateRequest adAccountCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdAccountCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountCreateRequest is {}", adAccountCreateRequest);

        api.adAccountsCreate(adAccountCreateRequest)
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

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        Boolean includeSharedAccounts = requestParameters.queryParameter("include_shared_accounts") != null ? requestParameters.queryParameter("include_shared_accounts").getBoolean() : true;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter includeSharedAccounts is {}", includeSharedAccounts);

        api.adAccountsList(bookmark, pageSize, includeSharedAccounts)
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
        CreateMMMReportRequest createMMMReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateMMMReportRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter createMMMReportRequest is {}", createMMMReportRequest);

        api.analyticsCreateMmmReport(adAccountId, createMMMReportRequest)
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
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.templatesList(adAccountId, pageSize, order, bookmark)
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
