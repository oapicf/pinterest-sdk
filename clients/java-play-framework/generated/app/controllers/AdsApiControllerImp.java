package controllers;

import apimodels.AdArrayResponse;
import apimodels.AdCreateRequest;
import apimodels.AdPreviewRequest;
import apimodels.AdPreviewURLResponse;
import apimodels.AdResponse;
import apimodels.AdUpdateRequest;
import apimodels.AdsAnalyticsAdTargetingType;
import apimodels.AdsAnalyticsResponseInner;
import apimodels.AdsList200Response;
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
public class AdsApiControllerImp extends AdsApiControllerImpInterface {
    @Override
    public AdPreviewURLResponse adPreviewsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdPreviewRequest adPreviewRequest) throws Exception {
        //Do your magic!!!
        return new AdPreviewURLResponse();
    }

    @Override
    public MetricsResponse adTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public List<AdsAnalyticsResponseInner> adsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdsAnalyticsResponseInner>();
    }

    @Override
    public AdArrayResponse adsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdCreateRequest> adCreateRequest) throws Exception {
        //Do your magic!!!
        return new AdArrayResponse();
    }

    @Override
    public AdResponse adsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adId) throws Exception {
        //Do your magic!!!
        return new AdResponse();
    }

    @Override
    public AdsList200Response adsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, List<String> entityStatuses,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new AdsList200Response();
    }

    @Override
    public AdArrayResponse adsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdUpdateRequest> adUpdateRequest) throws Exception {
        //Do your magic!!!
        return new AdArrayResponse();
    }

}
