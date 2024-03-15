package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdArrayResponse;
import org.openapitools.vertxweb.server.model.AdCreateRequest;
import org.openapitools.vertxweb.server.model.AdPreviewRequest;
import org.openapitools.vertxweb.server.model.AdPreviewURLResponse;
import org.openapitools.vertxweb.server.model.AdResponse;
import org.openapitools.vertxweb.server.model.AdUpdateRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.AdsList200Response;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;

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
        List<AdsAnalyticsTargetingType> targetingTypes = requestParameters.queryParameter("targeting_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("targeting_types").get(), new TypeReference<List<AdsAnalyticsTargetingType>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : 30;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : 30;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : 1;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";
        ConversionReportAttributionType attributionTypes = requestParameters.queryParameter("attribution_types") != null ? requestParameters.queryParameter("attribution_types").getConversionReportAttributionType() : null;

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

        api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
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
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : 30;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : 30;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : 1;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";

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

    private void adsCreate(RoutingContext routingContext) {
        logger.info("adsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<AdCreateRequest> adCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdCreateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adCreateRequest is {}", adCreateRequest);

        api.adsCreate(adAccountId, adCreateRequest)
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

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String adId = requestParameters.pathParameter("ad_id") != null ? requestParameters.pathParameter("ad_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adId is {}", adId);

        api.adsGet(adAccountId, adId)
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
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
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

    private void adsUpdate(RoutingContext routingContext) {
        logger.info("adsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<AdUpdateRequest> adUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdUpdateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adUpdateRequest is {}", adUpdateRequest);

        api.adsUpdate(adAccountId, adUpdateRequest)
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
