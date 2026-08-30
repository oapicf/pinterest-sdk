package controllers;

import apimodels.AdGroup;
import apimodels.AdGroupAudienceSizing;
import apimodels.AdGroupAudienceSizingCreate;
import apimodels.AdGroupCreateCreate;
import apimodels.AdGroupUpdateBatchUpdate;
import apimodels.AdGroupsAnalyticsMetrics;
import apimodels.AdGroupsCreate200Response;
import apimodels.AdGroupsList200Response;
import apimodels.AdsAnalyticsAdGroupTargetingType;
import apimodels.BidFloor;
import apimodels.BidFloorCreate;
import java.math.BigDecimal;
import apimodels.ConversionReportAttributionType;
import apimodels.DynamicTitlesDownloadCSV;
import apimodels.DynamicTitlesGetStatus;
import apimodels.DynamicTitlesProcessCSV;
import apimodels.DynamicTitlesProcessCSVCreate;
import apimodels.DynamicTitlesUploadURL;
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
public abstract class AdGroupsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adGroupsAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<AdGroupsAnalyticsMetrics> obj = adGroupsAnalytics(request, startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AdGroupsAnalyticsMetrics curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AdGroupsAnalyticsMetrics> adGroupsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception;

    public Result adGroupsAudienceSizingHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupAudienceSizing obj = adGroupsAudienceSizing(request, adAccountId, adGroupAudienceSizingCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupAudienceSizing adGroupsAudienceSizing(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate) throws Exception;

    public Result adGroupsBidFloorGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BidFloorCreate bidFloorCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BidFloor obj = adGroupsBidFloorGet(request, adAccountId, bidFloorCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BidFloor adGroupsBidFloorGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BidFloorCreate bidFloorCreate) throws Exception;

    public Result adGroupsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupCreateCreate> adGroupCreateCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupsCreate200Response obj = adGroupsCreate(request, adAccountId, adGroupCreateCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupsCreate200Response adGroupsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupCreateCreate> adGroupCreateCreate) throws Exception;

    public Result adGroupsDynamicTitlesDownloadCsvHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DynamicTitlesDownloadCSV obj = adGroupsDynamicTitlesDownloadCsv(request, adAccountId, adGroupId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception;

    public Result adGroupsDynamicTitlesGetStatusHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DynamicTitlesGetStatus obj = adGroupsDynamicTitlesGetStatus(request, adAccountId, adGroupId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception;

    public Result adGroupsDynamicTitlesGetUploadUrlHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DynamicTitlesUploadURL obj = adGroupsDynamicTitlesGetUploadUrl(request, adAccountId, adGroupId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception;

    public Result adGroupsDynamicTitlesProcessCsvHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DynamicTitlesProcessCSV obj = adGroupsDynamicTitlesProcessCsv(request, adAccountId, adGroupId, dynamicTitlesProcessCSVCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate) throws Exception;

    public Result adGroupsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroup obj = adGroupsGet(request, adGroupId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroup adGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result adGroupsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<EntityStatus> entityStatuses, Boolean translateInterestsToNames) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupsList200Response obj = adGroupsList(request, adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupsList200Response adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<EntityStatus> entityStatuses, Boolean translateInterestsToNames) throws Exception;

    public Result adGroupsTargetingAnalyticsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdGroupTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone,  @Size(min=1,max=2)List<String> sortColumns, Boolean sortAscending) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MetricsResponse obj = adGroupsTargetingAnalyticsGet(request, adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MetricsResponse adGroupsTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdGroupTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone,  @Size(min=1,max=2)List<String> sortColumns, Boolean sortAscending) throws Exception;

    public Result adGroupsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupsCreate200Response obj = adGroupsUpdate(request, adAccountId, adGroupUpdateBatchUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupsCreate200Response adGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate) throws Exception;

    public Result getAdGroupsByPromotionIdsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=50)List<String> promotionIds, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupsList200Response obj = getAdGroupsByPromotionIdsList(request, adAccountId, promotionIds, bookmark, pageSize, order);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupsList200Response getAdGroupsByPromotionIdsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=50)List<String> promotionIds, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception;

}
