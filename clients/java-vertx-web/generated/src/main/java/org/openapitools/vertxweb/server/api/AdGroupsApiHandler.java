package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdGroupArrayResponse;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingRequest;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingResponse;
import org.openapitools.vertxweb.server.model.AdGroupCreateRequest;
import org.openapitools.vertxweb.server.model.AdGroupResponse;
import org.openapitools.vertxweb.server.model.AdGroupUpdateRequest;
import org.openapitools.vertxweb.server.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdGroupsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.BidFloor;
import org.openapitools.vertxweb.server.model.BidFloorRequest;
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
        builder.operation("adGroupsGet").handler(this::adGroupsGet);
        builder.operation("adGroupsList").handler(this::adGroupsList);
        builder.operation("adGroupsTargetingAnalyticsGet").handler(this::adGroupsTargetingAnalyticsGet);
        builder.operation("adGroupsUpdate").handler(this::adGroupsUpdate);
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
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : 30;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : 30;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : 1;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";

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

    private void adGroupsAudienceSizing(RoutingContext routingContext) {
        logger.info("adGroupsAudienceSizing()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdGroupAudienceSizingRequest adGroupAudienceSizingRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdGroupAudienceSizingRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupAudienceSizingRequest is {}", adGroupAudienceSizingRequest);

        api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingRequest)
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
        BidFloorRequest bidFloorRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BidFloorRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bidFloorRequest is {}", bidFloorRequest);

        api.adGroupsBidFloorGet(adAccountId, bidFloorRequest)
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
        List<AdGroupCreateRequest> adGroupCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdGroupCreateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupCreateRequest is {}", adGroupCreateRequest);

        api.adGroupsCreate(adAccountId, adGroupCreateRequest)
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

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String adGroupId = requestParameters.pathParameter("ad_group_id") != null ? requestParameters.pathParameter("ad_group_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupId is {}", adGroupId);

        api.adGroupsGet(adAccountId, adGroupId)
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
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Boolean translateInterestsToNames = requestParameters.queryParameter("translate_interests_to_names") != null ? requestParameters.queryParameter("translate_interests_to_names").getBoolean() : false;

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

    private void adGroupsTargetingAnalyticsGet(RoutingContext routingContext) {
        logger.info("adGroupsTargetingAnalyticsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
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

        api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
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
        List<AdGroupUpdateRequest> adGroupUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<AdGroupUpdateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adGroupUpdateRequest is {}", adGroupUpdateRequest);

        api.adGroupsUpdate(adAccountId, adGroupUpdateRequest)
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
