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
public class CampaignsApiControllerImp extends CampaignsApiControllerImpInterface {
    @Override
    public List<AdPinAnalytics> adPinsAnalytics(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdPinAnalytics>();
    }

    @Override
    public MetricsResponse campaignTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsCampaignTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public List<CampaignsAnalyticsMetrics> campaignsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<CampaignsAnalyticsMetrics>();
    }

    @Override
    public CampaignBatchWriteResponseModel campaignsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignCreateItem> campaignCreateItem) throws Exception {
        //Do your magic!!!
        return new CampaignBatchWriteResponseModel();
    }

    @Override
    public Campaign campaignsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Campaign();
    }

    @Override
    public CampaignsList200Response campaignsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<EntityStatus> entityStatuses) throws Exception {
        //Do your magic!!!
        return new CampaignsList200Response();
    }

    @Override
    public CampaignBatchWriteResponseModel campaignsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem) throws Exception {
        //Do your magic!!!
        return new CampaignBatchWriteResponseModel();
    }

    @Override
    public CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign) throws Exception {
        //Do your magic!!!
        return new CampaignDeliveryEstimatesResponse();
    }

}
