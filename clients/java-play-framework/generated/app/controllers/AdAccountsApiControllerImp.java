package controllers;

import apimodels.AdsAnalyticsCreateAsyncRequest;
import apimodels.AdsAnalyticsCreateAsyncResponse;
import apimodels.AdsAnalyticsGetAsyncResponse;
import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.Paginated;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
public class AdAccountsApiControllerImp extends AdAccountsApiControllerImpInterface {
    @Override
    public List<Map<String, Object>> adAccountAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, Object>>();
    }

    @Override
    public Paginated adAccountsList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize, Boolean includeSharedAccounts) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public List<Map<String, Object>> adGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> adGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, Object>>();
    }

    @Override
    public Paginated adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public List<Map<String, Object>> adsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> adIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, Object>>();
    }

    @Override
    public Paginated adsList(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds,  @Size(min=1,max=100)List<String> adIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public AdsAnalyticsCreateAsyncResponse analyticsCreateReport(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) throws Exception {
        //Do your magic!!!
        return new AdsAnalyticsCreateAsyncResponse();
    }

    @Override
    public AdsAnalyticsGetAsyncResponse analyticsGetReport(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new AdsAnalyticsGetAsyncResponse();
    }

    @Override
    public List<Map<String, Object>> campaignsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> campaignIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, Object>>();
    }

    @Override
    public Paginated campaignsList(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public List<Map<String, Object>> productGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> productGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, Object>>();
    }

}
