package controllers;

import apimodels.AdGroupArrayResponse;
import apimodels.AdGroupAudienceSizingRequest;
import apimodels.AdGroupAudienceSizingResponse;
import apimodels.AdGroupCreateRequest;
import apimodels.AdGroupResponse;
import apimodels.AdGroupUpdateRequest;
import apimodels.AdGroupsAnalyticsResponseInner;
import apimodels.AdGroupsList200Response;
import apimodels.AdsAnalyticsTargetingType;
import apimodels.BidFloor;
import apimodels.BidFloorRequest;
import apimodels.ConversionReportAttributionType;
import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;

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
public abstract class AdGroupsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adGroupsAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<AdGroupsAnalyticsResponseInner> obj = adGroupsAnalytics(request, adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AdGroupsAnalyticsResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AdGroupsAnalyticsResponseInner> adGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

    public Result adGroupsAudienceSizingHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupAudienceSizingResponse obj = adGroupsAudienceSizing(request, adAccountId, adGroupAudienceSizingRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupAudienceSizingResponse adGroupsAudienceSizing(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest) throws Exception;

    public Result adGroupsBidFloorGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BidFloorRequest bidFloorRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BidFloor obj = adGroupsBidFloorGet(request, adAccountId, bidFloorRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BidFloor adGroupsBidFloorGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BidFloorRequest bidFloorRequest) throws Exception;

    public Result adGroupsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<AdGroupCreateRequest> adGroupCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupArrayResponse obj = adGroupsCreate(request, adAccountId, adGroupCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupArrayResponse adGroupsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<AdGroupCreateRequest> adGroupCreateRequest) throws Exception;

    public Result adGroupsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupResponse obj = adGroupsGet(request, adAccountId, adGroupId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupResponse adGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception;

    public Result adGroupsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupsList200Response obj = adGroupsList(request, adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupsList200Response adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames) throws Exception;

    public Result adGroupsTargetingAnalyticsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MetricsResponse obj = adGroupsTargetingAnalyticsGet(request, adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MetricsResponse adGroupsTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=15)List<AdsAnalyticsTargetingType> targetingTypes, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) throws Exception;

    public Result adGroupsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<AdGroupUpdateRequest> adGroupUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdGroupArrayResponse obj = adGroupsUpdate(request, adAccountId, adGroupUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdGroupArrayResponse adGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<AdGroupUpdateRequest> adGroupUpdateRequest) throws Exception;

}
