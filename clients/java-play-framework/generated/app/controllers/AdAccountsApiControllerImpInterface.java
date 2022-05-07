package controllers;

import apimodels.AdsAnalyticsCreateAsyncRequest;
import apimodels.AdsAnalyticsCreateAsyncResponse;
import apimodels.AdsAnalyticsGetAsyncResponse;
import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.Paginated;

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

@SuppressWarnings("RedundantThrows")
public abstract class AdAccountsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adAccountAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<Map<String, Object>> obj = adAccountAnalytics(request, adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map<String, Object> curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Map<String, Object>> adAccountAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

    public Result adAccountsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize, Boolean includeSharedAccounts) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = adAccountsList(request, bookmark, pageSize, includeSharedAccounts);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated adAccountsList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize, Boolean includeSharedAccounts) throws Exception;

    public Result adGroupsAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> adGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<Map<String, Object>> obj = adGroupsAnalytics(request, adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map<String, Object> curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Map<String, Object>> adGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> adGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

    public Result adGroupsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = adGroupsList(request, adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames) throws Exception;

    public Result adsAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> adIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<Map<String, Object>> obj = adsAnalytics(request, adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map<String, Object> curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Map<String, Object>> adsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> adIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

    public Result adsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds,  @Size(min=1,max=100)List<String> adIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = adsList(request, adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated adsList(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds,  @Size(min=1,max=100)List<String> adIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark) throws Exception;

    public Result analyticsCreateReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) throws Exception {
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

    public abstract AdsAnalyticsCreateAsyncResponse analyticsCreateReport(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) throws Exception;

    public Result analyticsGetReportHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull String token) throws Exception {
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

    public abstract AdsAnalyticsGetAsyncResponse analyticsGetReport(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull String token) throws Exception;

    public Result campaignsAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> campaignIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<Map<String, Object>> obj = campaignsAnalytics(request, adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map<String, Object> curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Map<String, Object>> campaignsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> campaignIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

    public Result campaignsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = campaignsList(request, adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated campaignsList(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark) throws Exception;

    public Result productGroupsAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> productGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<Map<String, Object>> obj = productGroupsAnalytics(request, adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map<String, Object> curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Map<String, Object>> productGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<String> productGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

}
