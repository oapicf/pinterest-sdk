package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdGroup;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizing;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingCreate;
import org.openapitools.vertxweb.server.model.AdGroupCreateCreate;
import org.openapitools.vertxweb.server.model.AdGroupUpdateBatchUpdate;
import org.openapitools.vertxweb.server.model.AdGroupsAnalyticsMetrics;
import org.openapitools.vertxweb.server.model.AdGroupsCreate200Response;
import org.openapitools.vertxweb.server.model.AdGroupsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.vertxweb.server.model.BidFloor;
import org.openapitools.vertxweb.server.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.DynamicTitlesDownloadCSV;
import org.openapitools.vertxweb.server.model.DynamicTitlesGetStatus;
import org.openapitools.vertxweb.server.model.DynamicTitlesProcessCSV;
import org.openapitools.vertxweb.server.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.vertxweb.server.model.DynamicTitlesUploadURL;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.ReportingColumnSync;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;

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

public class AdGroupsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AdGroupsApiHandler.class);

    private final AdGroupsApi api;

    public AdGroupsApiHandler(AdGroupsApi api) {
        this.api = api;
    }

    @Deprecated
    public AdGroupsApiHandler() {
        this(new AdGroupsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adGroupsAnalytics").handler(this::adGroupsAnalytics);
        builder.operation("adGroupsAudienceSizing").handler(this::adGroupsAudienceSizing);
        builder.operation("adGroupsBidFloorGet").handler(this::adGroupsBidFloorGet);
        builder.operation("adGroupsCreate").handler(this::adGroupsCreate);
        builder.operation("adGroupsDynamicTitlesDownloadCsv").handler(this::adGroupsDynamicTitlesDownloadCsv);
        builder.operation("adGroupsDynamicTitlesGetStatus").handler(this::adGroupsDynamicTitlesGetStatus);
        builder.operation("adGroupsDynamicTitlesGetUploadUrl").handler(this::adGroupsDynamicTitlesGetUploadUrl);
        builder.operation("adGroupsDynamicTitlesProcessCsv").handler(this::adGroupsDynamicTitlesProcessCsv);
        builder.operation("adGroupsGet").handler(this::adGroupsGet);
        builder.operation("adGroupsList").handler(this::adGroupsList);
        builder.operation("adGroupsTargetingAnalyticsGet").handler(this::adGroupsTargetingAnalyticsGet);
        builder.operation("adGroupsUpdate").handler(this::adGroupsUpdate);
        builder.operation("getAdGroupsByPromotionIdsList").handler(this::getAdGroupsByPromotionIdsList);
    }

    private void adGroupsAnalytics(RoutingContext routingContext) {
        logger.info("adGroupsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        Boolean aggregateReportRows = requestParameters.queryParameter("aggregate_report_rows") != null ? requestParameters.queryParameter("aggregate_report_rows").getBoolean() : false;
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);
        logger.debug("Parameter aggregateReportRows is {}", aggregateReportRows);
        logger.debug("Parameter reportingTimezone is {}", reportingTimezone);

        api.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
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

    private void adGroupsAudienceSizing(RoutingContext routingContext) {
        logger.info("adGroupsAudienceSizing()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdGroupAudienceSizingCreate adGroupAudienceSizingCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdGroupAudienceSizingCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupAudienceSizingCreate is {}", adGroupAudienceSizingCreate);

        api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)
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

    private void adGroupsBidFloorGet(RoutingContext routingContext) {
        logger.info("adGroupsBidFloorGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BidFloorCreate bidFloorCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BidFloorCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bidFloorCreate is {}", bidFloorCreate);

        api.adGroupsBidFloorGet(adAccountId, bidFloorCreate)
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

    private void adGroupsCreate(RoutingContext routingContext) {
        logger.info("adGroupsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<AdGroupCreateCreate> adGroupCreateCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdGroupCreateCreate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupCreateCreate is {}", adGroupCreateCreate);

        api.adGroupsCreate(adAccountId, adGroupCreateCreate)
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

    private void adGroupsDynamicTitlesDownloadCsv(RoutingContext routingContext) {
        logger.info("adGroupsDynamicTitlesDownloadCsv()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String adGroupId = requestParameters.pathParameter("ad_group_id") != null ? requestParameters.pathParameter("ad_group_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupId is {}", adGroupId);

        api.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)
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

    private void adGroupsDynamicTitlesGetStatus(RoutingContext routingContext) {
        logger.info("adGroupsDynamicTitlesGetStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String adGroupId = requestParameters.pathParameter("ad_group_id") != null ? requestParameters.pathParameter("ad_group_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupId is {}", adGroupId);

        api.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)
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

    private void adGroupsDynamicTitlesGetUploadUrl(RoutingContext routingContext) {
        logger.info("adGroupsDynamicTitlesGetUploadUrl()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String adGroupId = requestParameters.pathParameter("ad_group_id") != null ? requestParameters.pathParameter("ad_group_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupId is {}", adGroupId);

        api.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)
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

    private void adGroupsDynamicTitlesProcessCsv(RoutingContext routingContext) {
        logger.info("adGroupsDynamicTitlesProcessCsv()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String adGroupId = requestParameters.pathParameter("ad_group_id") != null ? requestParameters.pathParameter("ad_group_id").getString() : null;
        RequestParameter body = requestParameters.body();
        DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DynamicTitlesProcessCSVCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupId is {}", adGroupId);
        logger.debug("Parameter dynamicTitlesProcessCSVCreate is {}", dynamicTitlesProcessCSVCreate);

        api.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)
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

    private void adGroupsGet(RoutingContext routingContext) {
        logger.info("adGroupsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adGroupId = requestParameters.pathParameter("ad_group_id") != null ? requestParameters.pathParameter("ad_group_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adGroupId is {}", adGroupId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.adGroupsGet(adGroupId, adAccountId)
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
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<EntityStatus> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<EntityStatus>>(){}) : null;
        Boolean translateInterestsToNames = requestParameters.queryParameter("translate_interests_to_names") != null ? requestParameters.queryParameter("translate_interests_to_names").getBoolean() : false;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);
        logger.debug("Parameter translateInterestsToNames is {}", translateInterestsToNames);

        api.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)
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

    private void adGroupsTargetingAnalyticsGet(RoutingContext routingContext) {
        logger.info("adGroupsTargetingAnalyticsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<AdsAnalyticsAdGroupTargetingType> targetingTypes = requestParameters.queryParameter("targeting_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("targeting_types").get(), new TypeReference<List<AdsAnalyticsAdGroupTargetingType>>(){}) : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = requestParameters.queryParameter("attribution_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("attribution_types").get(), new TypeReference<List<ConversionReportAttributionType>>(){}) : null;
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;
        List<String> sortColumns = requestParameters.queryParameter("sort_columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("sort_columns").get(), new TypeReference<List<String>>(){}) : null;
        Boolean sortAscending = requestParameters.queryParameter("sort_ascending") != null ? requestParameters.queryParameter("sort_ascending").getBoolean() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
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
        logger.debug("Parameter sortColumns is {}", sortColumns);
        logger.debug("Parameter sortAscending is {}", sortAscending);

        api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
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

    private void adGroupsUpdate(RoutingContext routingContext) {
        logger.info("adGroupsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdGroupUpdateBatchUpdate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupUpdateBatchUpdate is {}", adGroupUpdateBatchUpdate);

        api.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)
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

    private void getAdGroupsByPromotionIdsList(RoutingContext routingContext) {
        logger.info("getAdGroupsByPromotionIdsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> promotionIds = requestParameters.queryParameter("promotion_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("promotion_ids").get(), new TypeReference<List<String>>(){}) : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionIds is {}", promotionIds);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);

        api.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)
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
