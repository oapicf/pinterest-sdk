package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Ad;
import org.openapitools.vertxweb.server.model.AdBatchUpdate;
import org.openapitools.vertxweb.server.model.AdBatchWriteResponseModel;
import org.openapitools.vertxweb.server.model.AdCreate;
import org.openapitools.vertxweb.server.model.AdPreviewRequest;
import org.openapitools.vertxweb.server.model.AdPreviewURLResponse;
import org.openapitools.vertxweb.server.model.AdsAnalytics;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAdTargetingType;
import org.openapitools.vertxweb.server.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CampaignAdPreview;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewCreate;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.vertxweb.server.model.ConversionAttributionWindowDays;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;
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

public class AdsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AdsApiHandler.class);

    private final AdsApi api;

    public AdsApiHandler(AdsApi api) {
        this.api = api;
    }

    @Deprecated
    public AdsApiHandler() {
        this(new AdsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adPreviewsCreate").handler(this::adPreviewsCreate);
        builder.operation("adTargetingAnalyticsGet").handler(this::adTargetingAnalyticsGet);
        builder.operation("adsAnalytics").handler(this::adsAnalytics);
        builder.operation("adsCreate").handler(this::adsCreate);
        builder.operation("adsGet").handler(this::adsGet);
        builder.operation("adsList").handler(this::adsList);
        builder.operation("adsUpdate").handler(this::adsUpdate);
        builder.operation("campaignAdPreviewCreate").handler(this::campaignAdPreviewCreate);
        builder.operation("campaignAdPreviewDelete").handler(this::campaignAdPreviewDelete);
        builder.operation("campaignAdPreviewRead").handler(this::campaignAdPreviewRead);
    }

    private void adPreviewsCreate(RoutingContext routingContext) {
        logger.info("adPreviewsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdPreviewRequest adPreviewRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdPreviewRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adPreviewRequest is {}", adPreviewRequest);

        api.adPreviewsCreate(adAccountId, adPreviewRequest)
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

    private void adTargetingAnalyticsGet(RoutingContext routingContext) {
        logger.info("adTargetingAnalyticsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> adIds = requestParameters.queryParameter("ad_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_ids").get(), new TypeReference<List<String>>(){}) : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<AdsAnalyticsAdTargetingType> targetingTypes = requestParameters.queryParameter("targeting_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("targeting_types").get(), new TypeReference<List<AdsAnalyticsAdTargetingType>>(){}) : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        ConversionAttributionWindowDays clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getConversionAttributionWindowDays() : null;
        ConversionAttributionWindowDays engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getConversionAttributionWindowDays() : null;
        ConversionAttributionWindowDays viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getConversionAttributionWindowDays() : null;
        ConversionReportTimeType conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getConversionReportTimeType() : null;
        List<ConversionReportAttributionType> attributionTypes = requestParameters.queryParameter("attribution_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("attribution_types").get(), new TypeReference<List<ConversionReportAttributionType>>(){}) : null;
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;
        List<String> sortColumns = requestParameters.queryParameter("sort_columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("sort_columns").get(), new TypeReference<List<String>>(){}) : null;
        Boolean sortAscending = requestParameters.queryParameter("sort_ascending") != null ? requestParameters.queryParameter("sort_ascending").getBoolean() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adIds is {}", adIds);
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

        api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
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

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<ReportingColumnSync> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<ReportingColumnSync>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> pinIds = requestParameters.queryParameter("pin_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("pin_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adIds = requestParameters.queryParameter("ad_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_ids").get(), new TypeReference<List<String>>(){}) : null;
        BigDecimal clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getBigDecimal() : ;
        BigDecimal engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getBigDecimal() : ;
        BigDecimal viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getBigDecimal() : ;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        ReportingTimeZone reportingTimezone = requestParameters.queryParameter("reporting_timezone") != null ? requestParameters.queryParameter("reporting_timezone").getReportingTimeZone() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinIds is {}", pinIds);
        logger.debug("Parameter adIds is {}", adIds);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter reportingTimezone is {}", reportingTimezone);

        api.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)
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

    private void adsCreate(RoutingContext routingContext) {
        logger.info("adsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<AdCreate> adCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdCreate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adCreate is {}", adCreate);

        api.adsCreate(adAccountId, adCreate)
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

    private void adsGet(RoutingContext routingContext) {
        logger.info("adsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adId = requestParameters.pathParameter("ad_id") != null ? requestParameters.pathParameter("ad_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adId is {}", adId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.adsGet(adId, adAccountId)
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
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> adIds = requestParameters.queryParameter("ad_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<EntityStatus> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<EntityStatus>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter adIds is {}", adIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);

        api.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)
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

    private void adsUpdate(RoutingContext routingContext) {
        logger.info("adsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<AdBatchUpdate> adBatchUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdBatchUpdate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adBatchUpdate is {}", adBatchUpdate);

        api.adsUpdate(adAccountId, adBatchUpdate)
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

    private void campaignAdPreviewCreate(RoutingContext routingContext) {
        logger.info("campaignAdPreviewCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<CampaignAdPreviewCreate> campaignAdPreviewCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<CampaignAdPreviewCreate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignAdPreviewCreate is {}", campaignAdPreviewCreate);

        api.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)
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

    private void campaignAdPreviewDelete(RoutingContext routingContext) {
        logger.info("campaignAdPreviewDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.campaignAdPreviewDelete(adGroupIds, adAccountId)
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

    private void campaignAdPreviewRead(RoutingContext routingContext) {
        logger.info("campaignAdPreviewRead()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.campaignAdPreviewRead(adGroupIds, adAccountId)
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
