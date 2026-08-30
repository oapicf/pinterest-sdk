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
public class AdsApiControllerImp extends AdsApiControllerImpInterface {
    @Override
    public AdPreviewURLResponse adPreviewsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdPreviewRequest adPreviewRequest) throws Exception {
        //Do your magic!!!
        return new AdPreviewURLResponse();
    }

    @Override
    public MetricsResponse adTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsAdTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone,  @Size(min=1,max=2)List<String> sortColumns, Boolean sortAscending) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public List<AdsAnalytics> adsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<String> pinIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdsAnalytics>();
    }

    @Override
    public AdBatchWriteResponseModel adsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdCreate> adCreate) throws Exception {
        //Do your magic!!!
        return new AdBatchWriteResponseModel();
    }

    @Override
    public Ad adsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Ad();
    }

    @Override
    public AdsList200Response adsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adIds, List<EntityStatus> entityStatuses) throws Exception {
        //Do your magic!!!
        return new AdsList200Response();
    }

    @Override
    public AdBatchWriteResponseModel adsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid AdBatchUpdate> adBatchUpdate) throws Exception {
        //Do your magic!!!
        return new AdBatchWriteResponseModel();
    }

    @Override
    public List<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate) throws Exception {
        //Do your magic!!!
        return new ArrayList<CampaignAdPreviewCreate200ResponseInner>();
    }

    @Override
    public List<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete(Http.Request request, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<CampaignAdPreviewDelete200ResponseInner>();
    }

    @Override
    public List<CampaignAdPreview> campaignAdPreviewRead(Http.Request request, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<CampaignAdPreview>();
    }

}
