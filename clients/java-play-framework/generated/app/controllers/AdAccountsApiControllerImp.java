package controllers;

import apimodels.AdAccount;
import apimodels.AdAccountAnalyticsItems;
import apimodels.AdAccountCreate;
import apimodels.AdAccountsList200Response;
import apimodels.AdsAnalyticsAccountTargetingType;
import apimodels.AdsAnalyticsCreateAsyncRequest;
import apimodels.AdsAnalyticsCreateAsyncResponse;
import apimodels.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import apimodels.ConversionProductReport;
import apimodels.ConversionProductReportCreate;
import apimodels.ConversionReportAttributionType;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MMMReport;
import apimodels.MMMReportCreate;
import apimodels.MetricsResponse;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.ReportingColumnSync;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsApiControllerImp extends AdAccountsApiControllerImpInterface {
    @Override
    public List<AdAccountAnalyticsItems> adAccountAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<AdAccountAnalyticsItems>();
    }

    @Override
    public MetricsResponse adAccountTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsAccountTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
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
    public ConversionProductReport analyticsCreateConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionProductReportCreate conversionProductReportCreate) throws Exception {
        //Do your magic!!!
        return new ConversionProductReport();
    }

    @Override
    public MMMReport analyticsCreateMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, MMMReportCreate mmMReportCreate) throws Exception {
        //Do your magic!!!
        return new MMMReport();
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
    public ConversionProductReport analyticsGetConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new ConversionProductReport();
    }

    @Override
    public MMMReport analyticsGetMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new MMMReport();
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
    public TemplatesList200Response templatesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        //Do your magic!!!
        return new TemplatesList200Response();
    }

}
