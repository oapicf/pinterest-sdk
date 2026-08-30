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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class AdAccountsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adAccountAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<AdAccountAnalyticsItems> obj = adAccountAnalytics(request, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AdAccountAnalyticsItems curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AdAccountAnalyticsItems> adAccountAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception;

    public Result adAccountTargetingAnalyticsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsAccountTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MetricsResponse obj = adAccountTargetingAnalyticsGet(request, adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MetricsResponse adAccountTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsAccountTargetingType> targetingTypes, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime,    @Size(max=2)List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) throws Exception;

    public Result adAccountsCreateHttp(Http.Request request, AdAccountCreate adAccountCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccount obj = adAccountsCreate(request, adAccountCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccount adAccountsCreate(Http.Request request, AdAccountCreate adAccountCreate) throws Exception;

    public Result adAccountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccount obj = adAccountsGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccount adAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result adAccountsListHttp(Http.Request request, Boolean includeSharedAccounts, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsList200Response obj = adAccountsList(request, includeSharedAccounts, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsList200Response adAccountsList(Http.Request request, Boolean includeSharedAccounts, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result analyticsCreateConversionProductReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionProductReportCreate conversionProductReportCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionProductReport obj = analyticsCreateConversionProductReport(request, adAccountId, conversionProductReportCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionProductReport analyticsCreateConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionProductReportCreate conversionProductReportCreate) throws Exception;

    public Result analyticsCreateMmmReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, MMMReportCreate mmMReportCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MMMReport obj = analyticsCreateMmmReport(request, adAccountId, mmMReportCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MMMReport analyticsCreateMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, MMMReportCreate mmMReportCreate) throws Exception;

    public Result analyticsCreateReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsAnalyticsCreateAsyncResponse obj = analyticsCreateReport(request, adAccountId, adsAnalyticsCreateAsyncRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsAnalyticsCreateAsyncResponse analyticsCreateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) throws Exception;

    public Result analyticsCreateTemplateReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(max=18)String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TemplateBasedReport obj = analyticsCreateTemplateReport(request, adAccountId, templateId, startDate, endDate, granularity);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TemplateBasedReport analyticsCreateTemplateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(max=18)String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) throws Exception;

    public Result analyticsGetConversionProductReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionProductReport obj = analyticsGetConversionProductReport(request, adAccountId, token);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionProductReport analyticsGetConversionProductReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception;

    public Result analyticsGetMmmReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MMMReport obj = analyticsGetMmmReport(request, adAccountId, token);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MMMReport analyticsGetMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception;

    public Result analyticsGetReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsAnalyticsGetAsyncResponse obj = analyticsGetReport(request, adAccountId, token);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsAnalyticsGetAsyncResponse analyticsGetReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception;

    public Result sandboxDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        String obj = sandboxDelete(request, adAccountId);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String sandboxDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result templatesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TemplatesList200Response obj = templatesList(request, adAccountId, bookmark, pageSize, order);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TemplatesList200Response templatesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception;

}
