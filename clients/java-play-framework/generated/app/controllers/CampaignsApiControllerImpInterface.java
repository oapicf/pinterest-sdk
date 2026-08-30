package controllers;

import apimodels.AdPinAnalytics;
import apimodels.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import apimodels.Campaign;
import apimodels.CampaignBatchUpdateItem;
import apimodels.CampaignBatchWriteResponseModel;
import apimodels.CampaignCreateItem;
import apimodels.CampaignDeliveryEstimatesCampaign;
import apimodels.CampaignDeliveryEstimatesResponse;
import apimodels.CampaignsAnalyticsMetrics;
import apimodels.CampaignsList200Response;
import apimodels.ConversionReportAttributionType;
import apimodels.EntityStatus;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.ReportingColumnSync;
import apimodels.ReportingTimeZone;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class CampaignsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adPinsAnalyticsHttp(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<AdPinAnalytics> obj = adPinsAnalytics(request, campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AdPinAnalytics curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AdPinAnalytics> adPinsAnalytics(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime) throws Exception;

    public Result campaignTargetingAnalyticsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsCampaignTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MetricsResponse obj = campaignTargetingAnalyticsGet(request, adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MetricsResponse campaignTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsCampaignTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception;

    public Result campaignsAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CampaignsAnalyticsMetrics> obj = campaignsAnalytics(request, startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CampaignsAnalyticsMetrics curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CampaignsAnalyticsMetrics> campaignsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception;

    public Result campaignsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignCreateItem> campaignCreateItem) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CampaignBatchWriteResponseModel obj = campaignsCreate(request, adAccountId, campaignCreateItem);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CampaignBatchWriteResponseModel campaignsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignCreateItem> campaignCreateItem) throws Exception;

    public Result campaignsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Campaign obj = campaignsGet(request, campaignId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Campaign campaignsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result campaignsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<EntityStatus> entityStatuses) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CampaignsList200Response obj = campaignsList(request, adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CampaignsList200Response campaignsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<EntityStatus> entityStatuses) throws Exception;

    public Result campaignsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CampaignBatchWriteResponseModel obj = campaignsUpdate(request, adAccountId, campaignBatchUpdateItem);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CampaignBatchWriteResponseModel campaignsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem) throws Exception;

    public Result getCampaignDeliveryEstimatesHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CampaignDeliveryEstimatesResponse obj = getCampaignDeliveryEstimates(request, adAccountId, campaignDeliveryEstimatesCampaign);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign) throws Exception;

}
