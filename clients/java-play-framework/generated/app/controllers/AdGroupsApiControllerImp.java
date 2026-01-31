package controllers;

import apimodels.AdGroupArrayResponse;
import apimodels.AdGroupAudienceSizingRequest;
import apimodels.AdGroupAudienceSizingResponse;
import apimodels.AdGroupCreateRequest;
import apimodels.AdGroupResponse;
import apimodels.AdGroupUpdateRequest;
import apimodels.AdGroupsAnalyticsResponseInner;
import apimodels.AdGroupsList200Response;
import apimodels.AdsAnalyticsAdGroupTargetingType;
import apimodels.BidFloor;
import apimodels.BidFloorRequest;
import apimodels.ConversionReportAttributionType;
import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdGroupsApiControllerImp extends AdGroupsApiControllerImpInterface {
    @Override
    public List<AdGroupsAnalyticsResponseInner> adGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdGroupsAnalyticsResponseInner>();
    }

    @Override
    public AdGroupAudienceSizingResponse adGroupsAudienceSizing(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest) throws Exception {
        //Do your magic!!!
        return new AdGroupAudienceSizingResponse();
    }

    @Override
    public BidFloor adGroupsBidFloorGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BidFloorRequest bidFloorRequest) throws Exception {
        //Do your magic!!!
        return new BidFloor();
    }

    @Override
    public AdGroupArrayResponse adGroupsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupCreateRequest> adGroupCreateRequest) throws Exception {
        //Do your magic!!!
        return new AdGroupArrayResponse();
    }

    @Override
    public AdGroupResponse adGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        //Do your magic!!!
        return new AdGroupResponse();
    }

    @Override
    public AdGroupsList200Response adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames) throws Exception {
        //Do your magic!!!
        return new AdGroupsList200Response();
    }

    @Override
    public MetricsResponse adGroupsTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdGroupTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public AdGroupArrayResponse adGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdGroupUpdateRequest> adGroupUpdateRequest) throws Exception {
        //Do your magic!!!
        return new AdGroupArrayResponse();
    }

}
