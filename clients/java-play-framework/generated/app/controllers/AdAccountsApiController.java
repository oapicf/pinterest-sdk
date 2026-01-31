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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdAccountsApiController extends Controller {
    private final AdAccountsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AdAccountsApiController(Config configuration, AdAccountsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adAccountAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuestartDate = request.getQueryString("start_date");
        LocalDate startDate;
        if (valuestartDate != null) {
            startDate = LocalDate.parse(valuestartDate);
        } else {
            throw new IllegalArgumentException("'start_date' parameter is required");
        }
        String valueendDate = request.getQueryString("end_date");
        LocalDate endDate;
        if (valueendDate != null) {
            endDate = LocalDate.parse(valueendDate);
        } else {
            throw new IllegalArgumentException("'end_date' parameter is required");
        }
        String[] columnsArray = request.queryString().get("columns");
        if (columnsArray == null) {
            throw new IllegalArgumentException("'columns' parameter is required");
        }
        List<String> columnsList = OpenAPIUtils.parametersToList("csv", columnsArray);
        List<String> columns = new ArrayList<>();
        for (String curParam : columnsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                columns.add(curParam);
            }
        }
        String valuegranularity = request.getQueryString("granularity");
        Granularity granularity;
        if (valuegranularity != null) {
            granularity = valuegranularity;
        } else {
            throw new IllegalArgumentException("'granularity' parameter is required");
        }
        String valueclickWindowDays = request.getQueryString("click_window_days");
        Integer clickWindowDays;
        if (valueclickWindowDays != null) {
            clickWindowDays = Integer.parseInt(valueclickWindowDays);
        } else {
            clickWindowDays = 30;
        }
        String valueengagementWindowDays = request.getQueryString("engagement_window_days");
        Integer engagementWindowDays;
        if (valueengagementWindowDays != null) {
            engagementWindowDays = Integer.parseInt(valueengagementWindowDays);
        } else {
            engagementWindowDays = 30;
        }
        String valueviewWindowDays = request.getQueryString("view_window_days");
        Integer viewWindowDays;
        if (valueviewWindowDays != null) {
            viewWindowDays = Integer.parseInt(valueviewWindowDays);
        } else {
            viewWindowDays = 1;
        }
        String valueconversionReportTime = request.getQueryString("conversion_report_time");
        String conversionReportTime;
        if (valueconversionReportTime != null) {
            conversionReportTime = valueconversionReportTime;
        } else {
            conversionReportTime = "TIME_OF_AD_ACTION";
        }
        String valuereportingTimezone = request.getQueryString("reporting_timezone");
        ReportingTimeZone reportingTimezone;
        if (valuereportingTimezone != null) {
            reportingTimezone = valuereportingTimezone;
        } else {
            reportingTimezone = null;
        }
        return imp.adAccountAnalyticsHttp(request, adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);
    }

    @ApiAction
    public Result adAccountTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuestartDate = request.getQueryString("start_date");
        LocalDate startDate;
        if (valuestartDate != null) {
            startDate = LocalDate.parse(valuestartDate);
        } else {
            throw new IllegalArgumentException("'start_date' parameter is required");
        }
        String valueendDate = request.getQueryString("end_date");
        LocalDate endDate;
        if (valueendDate != null) {
            endDate = LocalDate.parse(valueendDate);
        } else {
            throw new IllegalArgumentException("'end_date' parameter is required");
        }
        String[] targetingTypesArray = request.queryString().get("targeting_types");
        if (targetingTypesArray == null) {
            throw new IllegalArgumentException("'targeting_types' parameter is required");
        }
        List<String> targetingTypesList = OpenAPIUtils.parametersToList("csv", targetingTypesArray);
        List<AdsAnalyticsTargetingType> targetingTypes = new ArrayList<>();
        for (String curParam : targetingTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                targetingTypes.add(curParam);
            }
        }
        String[] columnsArray = request.queryString().get("columns");
        if (columnsArray == null) {
            throw new IllegalArgumentException("'columns' parameter is required");
        }
        List<String> columnsList = OpenAPIUtils.parametersToList("csv", columnsArray);
        List<String> columns = new ArrayList<>();
        for (String curParam : columnsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                columns.add(curParam);
            }
        }
        String valuegranularity = request.getQueryString("granularity");
        Granularity granularity;
        if (valuegranularity != null) {
            granularity = valuegranularity;
        } else {
            throw new IllegalArgumentException("'granularity' parameter is required");
        }
        String valueclickWindowDays = request.getQueryString("click_window_days");
        Integer clickWindowDays;
        if (valueclickWindowDays != null) {
            clickWindowDays = Integer.parseInt(valueclickWindowDays);
        } else {
            clickWindowDays = 30;
        }
        String valueengagementWindowDays = request.getQueryString("engagement_window_days");
        Integer engagementWindowDays;
        if (valueengagementWindowDays != null) {
            engagementWindowDays = Integer.parseInt(valueengagementWindowDays);
        } else {
            engagementWindowDays = 30;
        }
        String valueviewWindowDays = request.getQueryString("view_window_days");
        Integer viewWindowDays;
        if (valueviewWindowDays != null) {
            viewWindowDays = Integer.parseInt(valueviewWindowDays);
        } else {
            viewWindowDays = 1;
        }
        String valueconversionReportTime = request.getQueryString("conversion_report_time");
        String conversionReportTime;
        if (valueconversionReportTime != null) {
            conversionReportTime = valueconversionReportTime;
        } else {
            conversionReportTime = "TIME_OF_AD_ACTION";
        }
        String[] attributionTypesArray = request.queryString().get("attribution_types");
        List<String> attributionTypesList = OpenAPIUtils.parametersToList("csv", attributionTypesArray);
        List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();
        for (String curParam : attributionTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                attributionTypes.add(curParam);
            }
        }
        String valuereportingTimezone = request.getQueryString("reporting_timezone");
        ReportingTimeZone reportingTimezone;
        if (valuereportingTimezone != null) {
            reportingTimezone = valuereportingTimezone;
        } else {
            reportingTimezone = null;
        }
        return imp.adAccountTargetingAnalyticsGetHttp(request, adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);
    }

    @ApiAction
    public Result adAccountsCreate(Http.Request request) throws Exception {
        JsonNode nodeadAccountCreate = request.body().asJson();
        AdAccountCreate adAccountCreate;
        if (nodeadAccountCreate != null) {
            adAccountCreate = mapper.readValue(nodeadAccountCreate.toString(), AdAccountCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adAccountCreate);
            }
        } else {
            throw new IllegalArgumentException("'AdAccountCreate' parameter is required");
        }
        return imp.adAccountsCreateHttp(request, adAccountCreate);
    }

    @ApiAction
    public Result adAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.adAccountsGetHttp(request, adAccountId);
    }

    @ApiAction
    public Result adAccountsList(Http.Request request) throws Exception {
        String valueincludeSharedAccounts = request.getQueryString("include_shared_accounts");
        Boolean includeSharedAccounts;
        if (valueincludeSharedAccounts != null) {
            includeSharedAccounts = Boolean.valueOf(valueincludeSharedAccounts);
        } else {
            includeSharedAccounts = true;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.adAccountsListHttp(request, includeSharedAccounts, bookmark, pageSize);
    }

    @ApiAction
    public Result analyticsCreateConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeconversionProductReportRequest = request.body().asJson();
        ConversionProductReportRequest conversionProductReportRequest;
        if (nodeconversionProductReportRequest != null) {
            conversionProductReportRequest = mapper.readValue(nodeconversionProductReportRequest.toString(), ConversionProductReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(conversionProductReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'ConversionProductReportRequest' parameter is required");
        }
        return imp.analyticsCreateConversionProductReportHttp(request, adAccountId, conversionProductReportRequest);
    }

    @ApiAction
    public Result analyticsCreateMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecreateMMMReportRequest = request.body().asJson();
        CreateMMMReportRequest createMMMReportRequest;
        if (nodecreateMMMReportRequest != null) {
            createMMMReportRequest = mapper.readValue(nodecreateMMMReportRequest.toString(), CreateMMMReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createMMMReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateMMMReportRequest' parameter is required");
        }
        return imp.analyticsCreateMmmReportHttp(request, adAccountId, createMMMReportRequest);
    }

    @ApiAction
    public Result analyticsCreateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadsAnalyticsCreateAsyncRequest = request.body().asJson();
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest;
        if (nodeadsAnalyticsCreateAsyncRequest != null) {
            adsAnalyticsCreateAsyncRequest = mapper.readValue(nodeadsAnalyticsCreateAsyncRequest.toString(), AdsAnalyticsCreateAsyncRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adsAnalyticsCreateAsyncRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdsAnalyticsCreateAsyncRequest' parameter is required");
        }
        return imp.analyticsCreateReportHttp(request, adAccountId, adsAnalyticsCreateAsyncRequest);
    }

    @ApiAction
    public Result analyticsCreateTemplateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Size(max=18)String templateId) throws Exception {
        String valuestartDate = request.getQueryString("start_date");
        LocalDate startDate;
        if (valuestartDate != null) {
            startDate = LocalDate.parse(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("end_date");
        LocalDate endDate;
        if (valueendDate != null) {
            endDate = LocalDate.parse(valueendDate);
        } else {
            endDate = null;
        }
        String valuegranularity = request.getQueryString("granularity");
        Granularity granularity;
        if (valuegranularity != null) {
            granularity = valuegranularity;
        } else {
            granularity = null;
        }
        return imp.analyticsCreateTemplateReportHttp(request, adAccountId, templateId, startDate, endDate, granularity);
    }

    @ApiAction
    public Result analyticsGetConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        return imp.analyticsGetConversionProductReportHttp(request, adAccountId, token);
    }

    @ApiAction
    public Result analyticsGetMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        return imp.analyticsGetMmmReportHttp(request, adAccountId, token);
    }

    @ApiAction
    public Result analyticsGetReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        return imp.analyticsGetReportHttp(request, adAccountId, token);
    }

    @ApiAction
    public Result sandboxDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.sandboxDeleteHttp(request, adAccountId);
    }

    @ApiAction
    public Result templatesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.templatesListHttp(request, adAccountId, pageSize, order, bookmark);
    }

}
