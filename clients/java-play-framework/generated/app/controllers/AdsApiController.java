package controllers;

import apimodels.AdArrayResponse;
import apimodels.AdCreateRequest;
import apimodels.AdPreviewRequest;
import apimodels.AdPreviewURLResponse;
import apimodels.AdResponse;
import apimodels.AdUpdateRequest;
import apimodels.AdsAnalyticsAdTargetingType;
import apimodels.AdsAnalyticsResponseInner;
import apimodels.AdsList200Response;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdsApiController extends Controller {
    private final AdsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AdsApiController(Config configuration, AdsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adPreviewsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadPreviewRequest = request.body().asJson();
        AdPreviewRequest adPreviewRequest;
        if (nodeadPreviewRequest != null) {
            adPreviewRequest = mapper.readValue(nodeadPreviewRequest.toString(), AdPreviewRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adPreviewRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdPreviewRequest' parameter is required");
        }
        return imp.adPreviewsCreateHttp(request, adAccountId, adPreviewRequest);
    }

    @ApiAction
    public Result adTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] adIdsArray = request.queryString().get("ad_ids");
        if (adIdsArray == null) {
            throw new IllegalArgumentException("'ad_ids' parameter is required");
        }
        List<String> adIdsList = OpenAPIUtils.parametersToList("multi", adIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();
        for (String curParam : adIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adIds.add(curParam);
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
        List<AdsAnalyticsAdTargetingType> targetingTypes = new ArrayList<>();
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
        return imp.adTargetingAnalyticsGetHttp(request, adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
    }

    @ApiAction
    public Result adsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] adIdsArray = request.queryString().get("ad_ids");
        List<String> adIdsList = OpenAPIUtils.parametersToList("multi", adIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();
        for (String curParam : adIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adIds.add(curParam);
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
        String[] pinIdsArray = request.queryString().get("pin_ids");
        List<String> pinIdsList = OpenAPIUtils.parametersToList("multi", pinIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> pinIds = new ArrayList<>();
        for (String curParam : pinIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                pinIds.add(curParam);
            }
        }
        String[] campaignIdsArray = request.queryString().get("campaign_ids");
        List<String> campaignIdsList = OpenAPIUtils.parametersToList("multi", campaignIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = new ArrayList<>();
        for (String curParam : campaignIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                campaignIds.add(curParam);
            }
        }
        return imp.adsAnalyticsHttp(request, adAccountId, startDate, endDate, columns, granularity, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds);
    }

    @ApiAction
    public Result adsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadCreateRequest = request.body().asJson();
        List<@Valid AdCreateRequest> adCreateRequest;
        if (nodeadCreateRequest != null) {
            adCreateRequest = mapper.readValue(nodeadCreateRequest.toString(), new TypeReference<List<@Valid AdCreateRequest>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdCreateRequest curItem : adCreateRequest) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdCreateRequest' parameter is required");
        }
        return imp.adsCreateHttp(request, adAccountId, adCreateRequest);
    }

    @ApiAction
    public Result adsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String adId) throws Exception {
        return imp.adsGetHttp(request, adAccountId, adId);
    }

    @ApiAction
    public Result adsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] adIdsArray = request.queryString().get("ad_ids");
        List<String> adIdsList = OpenAPIUtils.parametersToList("multi", adIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();
        for (String curParam : adIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adIds.add(curParam);
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
        return imp.adsListHttp(request, adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark);
    }

    @ApiAction
    public Result adsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadUpdateRequest = request.body().asJson();
        List<@Valid AdUpdateRequest> adUpdateRequest;
        if (nodeadUpdateRequest != null) {
            adUpdateRequest = mapper.readValue(nodeadUpdateRequest.toString(), new TypeReference<List<@Valid AdUpdateRequest>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdUpdateRequest curItem : adUpdateRequest) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdUpdateRequest' parameter is required");
        }
        return imp.adsUpdateHttp(request, adAccountId, adUpdateRequest);
    }

}
