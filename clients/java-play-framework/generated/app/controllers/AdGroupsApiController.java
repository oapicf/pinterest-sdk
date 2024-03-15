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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupsApiController extends Controller {
    private final AdGroupsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AdGroupsApiController(Config configuration, AdGroupsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] adGroupIdsArray = request.queryString().get("ad_group_ids");
        if (adGroupIdsArray == null) {
            throw new IllegalArgumentException("'ad_group_ids' parameter is required");
        }
        List<String> adGroupIdsList = OpenAPIUtils.parametersToList("multi", adGroupIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = new ArrayList<>();
        for (String curParam : adGroupIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adGroupIds.add(curParam);
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
        return imp.adGroupsAnalyticsHttp(request, adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
    }

    @ApiAction
    public Result adGroupsAudienceSizing(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadGroupAudienceSizingRequest = request.body().asJson();
        AdGroupAudienceSizingRequest adGroupAudienceSizingRequest;
        if (nodeadGroupAudienceSizingRequest != null) {
            adGroupAudienceSizingRequest = mapper.readValue(nodeadGroupAudienceSizingRequest.toString(), AdGroupAudienceSizingRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adGroupAudienceSizingRequest);
            }
        } else {
            adGroupAudienceSizingRequest = null;
        }
        return imp.adGroupsAudienceSizingHttp(request, adAccountId, adGroupAudienceSizingRequest);
    }

    @ApiAction
    public Result adGroupsBidFloorGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodebidFloorRequest = request.body().asJson();
        BidFloorRequest bidFloorRequest;
        if (nodebidFloorRequest != null) {
            bidFloorRequest = mapper.readValue(nodebidFloorRequest.toString(), BidFloorRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(bidFloorRequest);
            }
        } else {
            throw new IllegalArgumentException("'BidFloorRequest' parameter is required");
        }
        return imp.adGroupsBidFloorGetHttp(request, adAccountId, bidFloorRequest);
    }

    @ApiAction
    public Result adGroupsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadGroupCreateRequest = request.body().asJson();
        List<AdGroupCreateRequest> adGroupCreateRequest;
        if (nodeadGroupCreateRequest != null) {
            adGroupCreateRequest = mapper.readValue(nodeadGroupCreateRequest.toString(), new TypeReference<List<AdGroupCreateRequest>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdGroupCreateRequest curItem : adGroupCreateRequest) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdGroupCreateRequest' parameter is required");
        }
        return imp.adGroupsCreateHttp(request, adAccountId, adGroupCreateRequest);
    }

    @ApiAction
    public Result adGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        return imp.adGroupsGetHttp(request, adAccountId, adGroupId);
    }

    @ApiAction
    public Result adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] campaignIdsArray = request.queryString().get("campaign_ids");
        List<String> campaignIdsList = OpenAPIUtils.parametersToList("multi", campaignIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = new ArrayList<>();
        for (String curParam : campaignIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                campaignIds.add(curParam);
            }
        }
        String[] adGroupIdsArray = request.queryString().get("ad_group_ids");
        List<String> adGroupIdsList = OpenAPIUtils.parametersToList("multi", adGroupIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
        for (String curParam : adGroupIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adGroupIds.add(curParam);
            }
        }
        String[] entityStatusesArray = request.queryString().get("entity_statuses");
        List<String> entityStatusesList = OpenAPIUtils.parametersToList("multi", entityStatusesArray);
        List<String> entityStatuses = new ArrayList<>();
        for (String curParam : entityStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                entityStatuses.add(curParam);
            }
        }
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
        String valuetranslateInterestsToNames = request.getQueryString("translate_interests_to_names");
        Boolean translateInterestsToNames;
        if (valuetranslateInterestsToNames != null) {
            translateInterestsToNames = Boolean.valueOf(valuetranslateInterestsToNames);
        } else {
            translateInterestsToNames = false;
        }
        return imp.adGroupsListHttp(request, adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames);
    }

    @ApiAction
    public Result adGroupsTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] adGroupIdsArray = request.queryString().get("ad_group_ids");
        if (adGroupIdsArray == null) {
            throw new IllegalArgumentException("'ad_group_ids' parameter is required");
        }
        List<String> adGroupIdsList = OpenAPIUtils.parametersToList("multi", adGroupIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = new ArrayList<>();
        for (String curParam : adGroupIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adGroupIds.add(curParam);
            }
        }
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
        String valueattributionTypes = request.getQueryString("attribution_types");
        ConversionReportAttributionType attributionTypes;
        if (valueattributionTypes != null) {
            attributionTypes = valueattributionTypes;
        } else {
            attributionTypes = null;
        }
        return imp.adGroupsTargetingAnalyticsGetHttp(request, adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
    }

    @ApiAction
    public Result adGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadGroupUpdateRequest = request.body().asJson();
        List<AdGroupUpdateRequest> adGroupUpdateRequest;
        if (nodeadGroupUpdateRequest != null) {
            adGroupUpdateRequest = mapper.readValue(nodeadGroupUpdateRequest.toString(), new TypeReference<List<AdGroupUpdateRequest>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdGroupUpdateRequest curItem : adGroupUpdateRequest) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdGroupUpdateRequest' parameter is required");
        }
        return imp.adGroupsUpdateHttp(request, adAccountId, adGroupUpdateRequest);
    }

}
