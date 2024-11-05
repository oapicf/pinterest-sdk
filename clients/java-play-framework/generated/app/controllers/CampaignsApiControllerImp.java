package controllers;

import apimodels.AdsAnalyticsCampaignTargetingType;
import apimodels.CampaignCreateRequest;
import apimodels.CampaignCreateResponse;
import apimodels.CampaignResponse;
import apimodels.CampaignUpdateRequest;
import apimodels.CampaignUpdateResponse;
import apimodels.CampaignsAnalyticsResponseInner;
import apimodels.CampaignsList200Response;
import apimodels.ConversionReportAttributionType;
import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CampaignsApiControllerImp extends CampaignsApiControllerImpInterface {
    @Override
    public MetricsResponse campaignTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=14)List<AdsAnalyticsCampaignTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public List<CampaignsAnalyticsResponseInner> campaignsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<CampaignsAnalyticsResponseInner>();
    }

    @Override
    public CampaignCreateResponse campaignsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignCreateRequest> campaignCreateRequest) throws Exception {
        //Do your magic!!!
        return new CampaignCreateResponse();
    }

    @Override
    public CampaignResponse campaignsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId) throws Exception {
        //Do your magic!!!
        return new CampaignResponse();
    }

    @Override
    public CampaignsList200Response campaignsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<String> entityStatuses,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new CampaignsList200Response();
    }

    @Override
    public CampaignUpdateResponse campaignsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid CampaignUpdateRequest> campaignUpdateRequest) throws Exception {
        //Do your magic!!!
        return new CampaignUpdateResponse();
    }

}
