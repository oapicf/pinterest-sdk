package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Paginated;

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
        builder.operation("adAccountsList").handler(this::adAccountsList);
        builder.operation("adGroupsAnalytics").handler(this::adGroupsAnalytics);
        builder.operation("adGroupsList").handler(this::adGroupsList);
        builder.operation("adsAnalytics").handler(this::adsAnalytics);
        builder.operation("adsList").handler(this::adsList);
        builder.operation("analyticsCreateReport").handler(this::analyticsCreateReport);
        builder.operation("analyticsGetReport").handler(this::analyticsGetReport);
        builder.operation("campaignsAnalytics").handler(this::campaignsAnalytics);
        builder.operation("campaignsList").handler(this::campaignsList);
        builder.operation("productGroupsAnalytics").handler(this::productGroupsAnalytics);
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
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : null;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : null;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : null;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : null;

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

    private void adAccountsList(RoutingContext routingContext) {
        logger.info("adAccountsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;
        Boolean includeSharedAccounts = requestParameters.queryParameter("include_shared_accounts") != null ? requestParameters.queryParameter("include_shared_accounts").getBoolean() : null;

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

    private void adGroupsAnalytics(RoutingContext routingContext) {
        logger.info("adGroupsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : null;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : null;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : null;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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

    private void adGroupsList(RoutingContext routingContext) {
        logger.info("adGroupsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<String>>(){}) : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Boolean translateInterestsToNames = requestParameters.queryParameter("translate_interests_to_names") != null ? requestParameters.queryParameter("translate_interests_to_names").getBoolean() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter translateInterestsToNames is {}", translateInterestsToNames);

        api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames)
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

    private void adsAnalytics(RoutingContext routingContext) {
        logger.info("adsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> adIds = requestParameters.queryParameter("ad_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : null;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : null;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : null;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter adIds is {}", adIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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

    private void adsList(RoutingContext routingContext) {
        logger.info("adsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adIds = requestParameters.queryParameter("ad_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<String>>(){}) : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter adIds is {}", adIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)
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

    private void campaignsAnalytics(RoutingContext routingContext) {
        logger.info("campaignsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : null;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : null;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : null;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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

    private void campaignsList(RoutingContext routingContext) {
        logger.info("campaignsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<String>>(){}) : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark)
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

    private void productGroupsAnalytics(RoutingContext routingContext) {
        logger.info("productGroupsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> productGroupIds = requestParameters.queryParameter("product_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("product_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : null;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : null;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : null;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter productGroupIds is {}", productGroupIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
