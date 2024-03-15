package controllers;

import apimodels.AdAccount;
import apimodels.AdAccountAnalyticsResponseInner;
import apimodels.AdAccountCreateRequest;
import apimodels.AdAccountsList200Response;
import apimodels.AdsAnalyticsCreateAsyncRequest;
import apimodels.AdsAnalyticsCreateAsyncResponse;
import apimodels.AdsAnalyticsGetAsyncResponse;
import apimodels.AdsAnalyticsTargetingType;
import apimodels.ConversionReportAttributionType;
import apimodels.CreateMMMReportRequest;
import apimodels.CreateMMMReportResponse;
import apimodels.Error;
import apimodels.GetMMMReportResponse;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;
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

    public Result adAccountAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<AdAccountAnalyticsResponseInner> obj = adAccountAnalytics(request, adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AdAccountAnalyticsResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AdAccountAnalyticsResponseInner> adAccountAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

    public Result adAccountTargetingAnalyticsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MetricsResponse obj = adAccountTargetingAnalyticsGet(request, adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MetricsResponse adAccountTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) throws Exception;

    public Result adAccountsCreateHttp(Http.Request request, AdAccountCreateRequest adAccountCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccount obj = adAccountsCreate(request, adAccountCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccount adAccountsCreate(Http.Request request, AdAccountCreateRequest adAccountCreateRequest) throws Exception;

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

    public Result adAccountsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, Boolean includeSharedAccounts) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsList200Response obj = adAccountsList(request, bookmark, pageSize, includeSharedAccounts);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsList200Response adAccountsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, Boolean includeSharedAccounts) throws Exception;

    public Result analyticsCreateMmmReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CreateMMMReportRequest createMMMReportRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CreateMMMReportResponse obj = analyticsCreateMmmReport(request, adAccountId, createMMMReportRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateMMMReportResponse analyticsCreateMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CreateMMMReportRequest createMMMReportRequest) throws Exception;

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

    public Result analyticsCreateTemplateReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsAnalyticsCreateAsyncResponse obj = analyticsCreateTemplateReport(request, adAccountId, templateId, startDate, endDate, granularity);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsAnalyticsCreateAsyncResponse analyticsCreateTemplateReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) throws Exception;

    public Result analyticsGetMmmReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetMMMReportResponse obj = analyticsGetMmmReport(request, adAccountId, token);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetMMMReportResponse analyticsGetMmmReport(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String token) throws Exception;

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

    public Result templatesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TemplatesList200Response obj = templatesList(request, adAccountId, pageSize, order, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TemplatesList200Response templatesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception;

}
