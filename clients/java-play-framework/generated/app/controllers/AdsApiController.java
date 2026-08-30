package controllers;

import apimodels.Ad;
import apimodels.AdBatchUpdate;
import apimodels.AdBatchWriteResponseModel;
import apimodels.AdCreate;
import apimodels.AdPreviewRequest;
import apimodels.AdPreviewURLResponse;
import apimodels.AdsAnalytics;
import apimodels.AdsAnalyticsAdTargetingType;
import apimodels.AdsList200Response;
import java.math.BigDecimal;
import apimodels.CampaignAdPreview;
import apimodels.CampaignAdPreviewCreate;
import apimodels.CampaignAdPreviewCreate200ResponseInner;
import apimodels.CampaignAdPreviewDelete200ResponseInner;
import apimodels.ConversionAttributionWindowDays;
import apimodels.ConversionReportAttributionType;
import apimodels.ConversionReportTimeType;
import apimodels.EntityStatus;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.MetricsResponse;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.ReportingColumnSync;
import apimodels.ReportingTimeZone;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        List<ReportingColumnSync> columns = new ArrayList<>();
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
        ConversionAttributionWindowDays clickWindowDays;
        if (valueclickWindowDays != null) {
            clickWindowDays = valueclickWindowDays;
        } else {
            clickWindowDays = null;
        }
        String valueengagementWindowDays = request.getQueryString("engagement_window_days");
        ConversionAttributionWindowDays engagementWindowDays;
        if (valueengagementWindowDays != null) {
            engagementWindowDays = valueengagementWindowDays;
        } else {
            engagementWindowDays = null;
        }
        String valueviewWindowDays = request.getQueryString("view_window_days");
        ConversionAttributionWindowDays viewWindowDays;
        if (valueviewWindowDays != null) {
            viewWindowDays = valueviewWindowDays;
        } else {
            viewWindowDays = null;
        }
        String valueconversionReportTime = request.getQueryString("conversion_report_time");
        ConversionReportTimeType conversionReportTime;
        if (valueconversionReportTime != null) {
            conversionReportTime = valueconversionReportTime;
        } else {
            conversionReportTime = null;
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
        String[] sortColumnsArray = request.queryString().get("sort_columns");
        List<String> sortColumnsList = OpenAPIUtils.parametersToList("multi", sortColumnsArray);
        List<String> sortColumns = new ArrayList<>();
        for (String curParam : sortColumnsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                sortColumns.add(curParam);
            }
        }
        String valuesortAscending = request.getQueryString("sort_ascending");
        Boolean sortAscending;
        if (valuesortAscending != null) {
            sortAscending = Boolean.valueOf(valuesortAscending);
        } else {
            sortAscending = null;
        }
        return imp.adTargetingAnalyticsGetHttp(request, adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending);
    }

    @ApiAction
    public Result adsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] pinIdsArray = request.queryString().get("pin_ids");
        List<String> pinIdsList = OpenAPIUtils.parametersToList("multi", pinIdsArray);
        List<String> pinIds = new ArrayList<>();
        for (String curParam : pinIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                pinIds.add(curParam);
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
        List<ReportingColumnSync> columns = new ArrayList<>();
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
        BigDecimal clickWindowDays;
        if (valueclickWindowDays != null) {
            clickWindowDays = new BigDecimal(valueclickWindowDays);
        } else {
            clickWindowDays = 30;
        }
        String valueengagementWindowDays = request.getQueryString("engagement_window_days");
        BigDecimal engagementWindowDays;
        if (valueengagementWindowDays != null) {
            engagementWindowDays = new BigDecimal(valueengagementWindowDays);
        } else {
            engagementWindowDays = 30;
        }
        String valueviewWindowDays = request.getQueryString("view_window_days");
        BigDecimal viewWindowDays;
        if (valueviewWindowDays != null) {
            viewWindowDays = new BigDecimal(valueviewWindowDays);
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
        String[] campaignIdsArray = request.queryString().get("campaign_ids");
        List<String> campaignIdsList = OpenAPIUtils.parametersToList("multi", campaignIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = new ArrayList<>();
        for (String curParam : campaignIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                campaignIds.add(curParam);
            }
        }
        String valuereportingTimezone = request.getQueryString("reporting_timezone");
        ReportingTimeZone reportingTimezone;
        if (valuereportingTimezone != null) {
            reportingTimezone = valuereportingTimezone;
        } else {
            reportingTimezone = null;
        }
        return imp.adsAnalyticsHttp(request, startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone);
    }

    @ApiAction
    public Result adsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadCreate = request.body().asJson();
        List<@Valid AdCreate> adCreate;
        if (nodeadCreate != null) {
            adCreate = mapper.readValue(nodeadCreate.toString(), new TypeReference<List<@Valid AdCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdCreate curItem : adCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdCreate' parameter is required");
        }
        return imp.adsCreateHttp(request, adAccountId, adCreate);
    }

    @ApiAction
    public Result adsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.adsGetHttp(request, adId, adAccountId);
    }

    @ApiAction
    public Result adsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String valueorder = request.getQueryString("order");
        PinterestLibPaginationOrder order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
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
        List<EntityStatus> entityStatuses = new ArrayList<>();
        for (String curParam : entityStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                entityStatuses.add(curParam);
            }
        }
        return imp.adsListHttp(request, adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses);
    }

    @ApiAction
    public Result adsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadBatchUpdate = request.body().asJson();
        List<@Valid AdBatchUpdate> adBatchUpdate;
        if (nodeadBatchUpdate != null) {
            adBatchUpdate = mapper.readValue(nodeadBatchUpdate.toString(), new TypeReference<List<@Valid AdBatchUpdate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdBatchUpdate curItem : adBatchUpdate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdBatchUpdate' parameter is required");
        }
        return imp.adsUpdateHttp(request, adAccountId, adBatchUpdate);
    }

    @ApiAction
    public Result campaignAdPreviewCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecampaignAdPreviewCreate = request.body().asJson();
        List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate;
        if (nodecampaignAdPreviewCreate != null) {
            campaignAdPreviewCreate = mapper.readValue(nodecampaignAdPreviewCreate.toString(), new TypeReference<List<@Valid CampaignAdPreviewCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (CampaignAdPreviewCreate curItem : campaignAdPreviewCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'CampaignAdPreviewCreate' parameter is required");
        }
        return imp.campaignAdPreviewCreateHttp(request, adAccountId, campaignAdPreviewCreate);
    }

    @ApiAction
    public Result campaignAdPreviewDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.campaignAdPreviewDeleteHttp(request, adGroupIds, adAccountId);
    }

    @ApiAction
    public Result campaignAdPreviewRead(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.campaignAdPreviewReadHttp(request, adGroupIds, adAccountId);
    }

}
