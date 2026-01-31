package controllers;

import apimodels.AdAccount;
import apimodels.AdAccountAnalyticsResponseInner;
import apimodels.AdAccountCreate;
import apimodels.AdAccountsList200Response;
import apimodels.AdsAnalyticsCreateAsyncRequest;
import apimodels.AdsAnalyticsCreateAsyncResponse;
import apimodels.AdsAnalyticsGetAsyncResponse;
import apimodels.AdsAnalyticsTargetingType;
import apimodels.ConversionProductReportRequest;
import apimodels.ConversionReportAttributionType;
import apimodels.CreateMMMReportRequest;
import apimodels.CreateMMMReportResponse;
import apimodels.Error;
import apimodels.GetMMMReportResponse;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;
import apimodels.PinterestLibError;
import apimodels.ReportingTimeZone;
import apimodels.TemplateBasedReport;
import apimodels.TemplatesList200Response;

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
public class AdAccountsApiControllerImp extends AdAccountsApiControllerImpInterface {
    @Override
    public List<AdAccountAnalyticsResponseInner> adAccountAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdAccountAnalyticsResponseInner>();
    }

    @Override
    public MetricsResponse adAccountTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new MetricsResponse();
    }

    @Override
    public AdAccount adAccountsCreate(Http.Request request, AdAccountCreate adAccountCreate) throws Exception {
        //Do your magic!!!
        return new AdAccount();
    }

    @Override
    public AdAccount adAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new AdAccount();
    }

    @Override
    public AdAccountsList200Response adAccountsList(Http.Request request, Boolean includeSharedAccounts, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AdAccountsList200Response();
    }

    @Override
    public AdsAnalyticsCreateAsyncResponse analyticsCreateConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionProductReportRequest conversionProductReportRequest) throws Exception {
        //Do your magic!!!
        return new AdsAnalyticsCreateAsyncResponse();
    }

    @Override
    public CreateMMMReportResponse analyticsCreateMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CreateMMMReportRequest createMMMReportRequest) throws Exception {
        //Do your magic!!!
        return new CreateMMMReportResponse();
    }

    @Override
    public AdsAnalyticsCreateAsyncResponse analyticsCreateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) throws Exception {
        //Do your magic!!!
        return new AdsAnalyticsCreateAsyncResponse();
    }

    @Override
    public TemplateBasedReport analyticsCreateTemplateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(max=18)String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) throws Exception {
        //Do your magic!!!
        return new TemplateBasedReport();
    }

    @Override
    public AdsAnalyticsGetAsyncResponse analyticsGetConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new AdsAnalyticsGetAsyncResponse();
    }

    @Override
    public GetMMMReportResponse analyticsGetMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new GetMMMReportResponse();
    }

    @Override
    public AdsAnalyticsGetAsyncResponse analyticsGetReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new AdsAnalyticsGetAsyncResponse();
    }

    @Override
    public String sandboxDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public TemplatesList200Response templatesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new TemplatesList200Response();
    }

}
