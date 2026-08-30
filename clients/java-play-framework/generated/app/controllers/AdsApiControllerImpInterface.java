package controllers;

import apimodels.Ad;
import apimodels.AdBatchUpdate;
import apimodels.AdBatchWriteResponseModel;
import apimodels.AdCreate;
import apimodels.AdPreviewRequest;
import apimodels.AdPreviewURLResponse;
import apimodels.AdsAnalytics;
import apimodels.AdsAnalyticsAdTargetingType;
import apimodels.AdsList200Response;
import java.math.BigDecimal;
import apimodels.CampaignAdPreview;
import apimodels.CampaignAdPreviewCreate;
import apimodels.CampaignAdPreviewCreate200ResponseInner;
import apimodels.CampaignAdPreviewDelete200ResponseInner;
import apimodels.ConversionAttributionWindowDays;
import apimodels.ConversionReportAttributionType;
import apimodels.ConversionReportTimeType;
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
public abstract class AdsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adPreviewsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdPreviewRequest adPreviewRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdPreviewURLResponse obj = adPreviewsCreate(request, adAccountId, adPreviewRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdPreviewURLResponse adPreviewsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdPreviewRequest adPreviewRequest) throws Exception;

    public Result adTargetingAnalyticsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone,  @Size(min=1,max=2)List<String> sortColumns, Boolean sortAscending) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MetricsResponse obj = adTargetingAnalyticsGet(request, adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MetricsResponse adTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone,  @Size(min=1,max=2)List<String> sortColumns, Boolean sortAscending) throws Exception;

    public Result adsAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<String> pinIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<AdsAnalytics> obj = adsAnalytics(request, startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AdsAnalytics curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AdsAnalytics> adsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<String> pinIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, ReportingTimeZone reportingTimezone) throws Exception;

    public Result adsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdCreate> adCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdBatchWriteResponseModel obj = adsCreate(request, adAccountId, adCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdBatchWriteResponseModel adsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdCreate> adCreate) throws Exception;

    public Result adsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Ad obj = adsGet(request, adId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Ad adsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result adsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, List<EntityStatus> entityStatuses) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsList200Response obj = adsList(request, adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsList200Response adsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, List<EntityStatus> entityStatuses) throws Exception;

    public Result adsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdBatchUpdate> adBatchUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdBatchWriteResponseModel obj = adsUpdate(request, adAccountId, adBatchUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdBatchWriteResponseModel adsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdBatchUpdate> adBatchUpdate) throws Exception;

    public Result campaignAdPreviewCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CampaignAdPreviewCreate200ResponseInner> obj = campaignAdPreviewCreate(request, adAccountId, campaignAdPreviewCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CampaignAdPreviewCreate200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate) throws Exception;

    public Result campaignAdPreviewDeleteHttp(Http.Request request, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CampaignAdPreviewDelete200ResponseInner> obj = campaignAdPreviewDelete(request, adGroupIds, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CampaignAdPreviewDelete200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete(Http.Request request, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result campaignAdPreviewReadHttp(Http.Request request, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CampaignAdPreview> obj = campaignAdPreviewRead(request, adGroupIds, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CampaignAdPreview curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CampaignAdPreview> campaignAdPreviewRead(Http.Request request, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
