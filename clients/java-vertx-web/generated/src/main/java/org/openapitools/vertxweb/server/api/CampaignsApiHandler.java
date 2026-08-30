package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdPinAnalytics;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.Campaign;
import org.openapitools.vertxweb.server.model.CampaignBatchUpdateItem;
import org.openapitools.vertxweb.server.model.CampaignBatchWriteResponseModel;
import org.openapitools.vertxweb.server.model.CampaignCreateItem;
import org.openapitools.vertxweb.server.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.vertxweb.server.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.vertxweb.server.model.CampaignsAnalyticsMetrics;
import org.openapitools.vertxweb.server.model.CampaignsList200Response;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
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

public class CampaignsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CampaignsApiHandler.class);

    private final CampaignsApi api;

    public CampaignsApiHandler(CampaignsApi api) {
        this.api = api;
    }

    @Deprecated
    public CampaignsApiHandler() {
        this(new CampaignsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adPinsAnalytics").handler(this::adPinsAnalytics);
        builder.operation("campaignTargetingAnalyticsGet").handler(this::campaignTargetingAnalyticsGet);
        builder.operation("campaignsAnalytics").handler(this::campaignsAnalytics);
        builder.operation("campaignsCreate").handler(this::campaignsCreate);
        builder.operation("campaignsGet").handler(this::campaignsGet);
        builder.operation("campaignsList").handler(this::campaignsList);
        builder.operation("campaignsUpdate").handler(this::campaignsUpdate);
        builder.operation("getCampaignDeliveryEstimates").handler(this::getCampaignDeliveryEstimates);
    }

    private void adPinsAnalytics(RoutingContext routingContext) {
        logger.info("adPinsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String campaignId = requestParameters.queryParameter("campaign_id") != null ? requestParameters.queryParameter("campaign_id").getString() : null;
        List<String> pinIds = requestParameters.queryParameter("pin_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("pin_ids").get(), new TypeReference<List<String>>(){}) : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pinIds is {}", pinIds);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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

    private void campaignTargetingAnalyticsGet(RoutingContext routingContext) {
        logger.info("campaignTargetingAnalyticsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<AdsAnalyticsCampaignTargetingType> targetingTypes = requestParameters.queryParameter("targeting_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("targeting_types").get(), new TypeReference<List<AdsAnalyticsCampaignTargetingType>>(){}) : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = requestParameters.queryParameter("attribution_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("attribution_types").get(), new TypeReference<List<ConversionReportAttributionType>>(){}) : null;
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignIds is {}", campaignIds);
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

        api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)
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

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
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
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);
        logger.debug("Parameter aggregateReportRows is {}", aggregateReportRows);
        logger.debug("Parameter reportingTimezone is {}", reportingTimezone);

        api.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
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

    private void campaignsCreate(RoutingContext routingContext) {
        logger.info("campaignsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<CampaignCreateItem> campaignCreateItem = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<CampaignCreateItem>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignCreateItem is {}", campaignCreateItem);

        api.campaignsCreate(adAccountId, campaignCreateItem)
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

    private void campaignsGet(RoutingContext routingContext) {
        logger.info("campaignsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String campaignId = requestParameters.pathParameter("campaign_id") != null ? requestParameters.pathParameter("campaign_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.campaignsGet(campaignId, adAccountId)
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
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<EntityStatus> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<EntityStatus>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);

        api.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)
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

    private void campaignsUpdate(RoutingContext routingContext) {
        logger.info("campaignsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<CampaignBatchUpdateItem> campaignBatchUpdateItem = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<CampaignBatchUpdateItem>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignBatchUpdateItem is {}", campaignBatchUpdateItem);

        api.campaignsUpdate(adAccountId, campaignBatchUpdateItem)
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

    private void getCampaignDeliveryEstimates(RoutingContext routingContext) {
        logger.info("getCampaignDeliveryEstimates()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<CampaignDeliveryEstimatesCampaign>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignDeliveryEstimatesCampaign is {}", campaignDeliveryEstimatesCampaign);

        api.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)
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
