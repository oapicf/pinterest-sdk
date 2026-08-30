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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupsApiControllerImp extends AdGroupsApiControllerImpInterface {
    @Override
    public List<AdGroupsAnalyticsMetrics> adGroupsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdGroupsAnalyticsMetrics>();
    }

    @Override
    public AdGroupAudienceSizing adGroupsAudienceSizing(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate) throws Exception {
        //Do your magic!!!
        return new AdGroupAudienceSizing();
    }

    @Override
    public BidFloor adGroupsBidFloorGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BidFloorCreate bidFloorCreate) throws Exception {
        //Do your magic!!!
        return new BidFloor();
    }

    @Override
    public AdGroupsCreate200Response adGroupsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupCreateCreate> adGroupCreateCreate) throws Exception {
        //Do your magic!!!
        return new AdGroupsCreate200Response();
    }

    @Override
    public DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        //Do your magic!!!
        return new DynamicTitlesDownloadCSV();
    }

    @Override
    public DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        //Do your magic!!!
        return new DynamicTitlesGetStatus();
    }

    @Override
    public DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        //Do your magic!!!
        return new DynamicTitlesUploadURL();
    }

    @Override
    public DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate) throws Exception {
        //Do your magic!!!
        return new DynamicTitlesProcessCSV();
    }

    @Override
    public AdGroup adGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new AdGroup();
    }

    @Override
    public AdGroupsList200Response adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<EntityStatus> entityStatuses, Boolean translateInterestsToNames) throws Exception {
        //Do your magic!!!
        return new AdGroupsList200Response();
    }

    @Override
    public MetricsResponse adGroupsTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdGroupTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone,  @Size(min=1,max=2)List<String> sortColumns, Boolean sortAscending) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public AdGroupsCreate200Response adGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate) throws Exception {
        //Do your magic!!!
        return new AdGroupsCreate200Response();
    }

    @Override
    public AdGroupsList200Response getAdGroupsByPromotionIdsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=50)List<String> promotionIds, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        //Do your magic!!!
        return new AdGroupsList200Response();
    }

}
