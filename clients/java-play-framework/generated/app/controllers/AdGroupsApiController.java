package controllers;

import apimodels.AdGroup;
import apimodels.AdGroupAudienceSizing;
import apimodels.AdGroupAudienceSizingCreate;
import apimodels.AdGroupCreateCreate;
import apimodels.AdGroupUpdateBatchUpdate;
import apimodels.AdGroupsAnalyticsMetrics;
import apimodels.AdGroupsCreate200Response;
import apimodels.AdGroupsList200Response;
import apimodels.AdsAnalyticsAdGroupTargetingType;
import apimodels.BidFloor;
import apimodels.BidFloorCreate;
import java.math.BigDecimal;
import apimodels.ConversionReportAttributionType;
import apimodels.DynamicTitlesDownloadCSV;
import apimodels.DynamicTitlesGetStatus;
import apimodels.DynamicTitlesProcessCSV;
import apimodels.DynamicTitlesProcessCSVCreate;
import apimodels.DynamicTitlesUploadURL;
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
        String valueaggregateReportRows = request.getQueryString("aggregate_report_rows");
        Boolean aggregateReportRows;
        if (valueaggregateReportRows != null) {
            aggregateReportRows = Boolean.valueOf(valueaggregateReportRows);
        } else {
            aggregateReportRows = false;
        }
        String valuereportingTimezone = request.getQueryString("reporting_timezone");
        ReportingTimeZone reportingTimezone;
        if (valuereportingTimezone != null) {
            reportingTimezone = valuereportingTimezone;
        } else {
            reportingTimezone = null;
        }
        return imp.adGroupsAnalyticsHttp(request, startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);
    }

    @ApiAction
    public Result adGroupsAudienceSizing(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadGroupAudienceSizingCreate = request.body().asJson();
        AdGroupAudienceSizingCreate adGroupAudienceSizingCreate;
        if (nodeadGroupAudienceSizingCreate != null) {
            adGroupAudienceSizingCreate = mapper.readValue(nodeadGroupAudienceSizingCreate.toString(), AdGroupAudienceSizingCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adGroupAudienceSizingCreate);
            }
        } else {
            throw new IllegalArgumentException("'AdGroupAudienceSizingCreate' parameter is required");
        }
        return imp.adGroupsAudienceSizingHttp(request, adAccountId, adGroupAudienceSizingCreate);
    }

    @ApiAction
    public Result adGroupsBidFloorGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodebidFloorCreate = request.body().asJson();
        BidFloorCreate bidFloorCreate;
        if (nodebidFloorCreate != null) {
            bidFloorCreate = mapper.readValue(nodebidFloorCreate.toString(), BidFloorCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(bidFloorCreate);
            }
        } else {
            throw new IllegalArgumentException("'BidFloorCreate' parameter is required");
        }
        return imp.adGroupsBidFloorGetHttp(request, adAccountId, bidFloorCreate);
    }

    @ApiAction
    public Result adGroupsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadGroupCreateCreate = request.body().asJson();
        List<@Valid AdGroupCreateCreate> adGroupCreateCreate;
        if (nodeadGroupCreateCreate != null) {
            adGroupCreateCreate = mapper.readValue(nodeadGroupCreateCreate.toString(), new TypeReference<List<@Valid AdGroupCreateCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdGroupCreateCreate curItem : adGroupCreateCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdGroupCreateCreate' parameter is required");
        }
        return imp.adGroupsCreateHttp(request, adAccountId, adGroupCreateCreate);
    }

    @ApiAction
    public Result adGroupsDynamicTitlesDownloadCsv(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        return imp.adGroupsDynamicTitlesDownloadCsvHttp(request, adAccountId, adGroupId);
    }

    @ApiAction
    public Result adGroupsDynamicTitlesGetStatus(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        return imp.adGroupsDynamicTitlesGetStatusHttp(request, adAccountId, adGroupId);
    }

    @ApiAction
    public Result adGroupsDynamicTitlesGetUploadUrl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        return imp.adGroupsDynamicTitlesGetUploadUrlHttp(request, adAccountId, adGroupId);
    }

    @ApiAction
    public Result adGroupsDynamicTitlesProcessCsv(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        JsonNode nodedynamicTitlesProcessCSVCreate = request.body().asJson();
        DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate;
        if (nodedynamicTitlesProcessCSVCreate != null) {
            dynamicTitlesProcessCSVCreate = mapper.readValue(nodedynamicTitlesProcessCSVCreate.toString(), DynamicTitlesProcessCSVCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(dynamicTitlesProcessCSVCreate);
            }
        } else {
            throw new IllegalArgumentException("'DynamicTitlesProcessCSVCreate' parameter is required");
        }
        return imp.adGroupsDynamicTitlesProcessCsvHttp(request, adAccountId, adGroupId, dynamicTitlesProcessCSVCreate);
    }

    @ApiAction
    public Result adGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.adGroupsGetHttp(request, adGroupId, adAccountId);
    }

    @ApiAction
    public Result adGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] entityStatusesArray = request.queryString().get("entity_statuses");
        List<String> entityStatusesList = OpenAPIUtils.parametersToList("multi", entityStatusesArray);
        List<EntityStatus> entityStatuses = new ArrayList<>();
        for (String curParam : entityStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                entityStatuses.add(curParam);
            }
        }
        String valuetranslateInterestsToNames = request.getQueryString("translate_interests_to_names");
        Boolean translateInterestsToNames;
        if (valuetranslateInterestsToNames != null) {
            translateInterestsToNames = Boolean.valueOf(valuetranslateInterestsToNames);
        } else {
            translateInterestsToNames = false;
        }
        return imp.adGroupsListHttp(request, adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames);
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
        List<AdsAnalyticsAdGroupTargetingType> targetingTypes = new ArrayList<>();
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
        return imp.adGroupsTargetingAnalyticsGetHttp(request, adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending);
    }

    @ApiAction
    public Result adGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadGroupUpdateBatchUpdate = request.body().asJson();
        List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate;
        if (nodeadGroupUpdateBatchUpdate != null) {
            adGroupUpdateBatchUpdate = mapper.readValue(nodeadGroupUpdateBatchUpdate.toString(), new TypeReference<List<@Valid AdGroupUpdateBatchUpdate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (AdGroupUpdateBatchUpdate curItem : adGroupUpdateBatchUpdate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'AdGroupUpdateBatchUpdate' parameter is required");
        }
        return imp.adGroupsUpdateHttp(request, adAccountId, adGroupUpdateBatchUpdate);
    }

    @ApiAction
    public Result getAdGroupsByPromotionIdsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] promotionIdsArray = request.queryString().get("promotion_ids");
        if (promotionIdsArray == null) {
            throw new IllegalArgumentException("'promotion_ids' parameter is required");
        }
        List<String> promotionIdsList = OpenAPIUtils.parametersToList("multi", promotionIdsArray);
        List<String> promotionIds = new ArrayList<>();
        for (String curParam : promotionIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                promotionIds.add(curParam);
            }
        }
        return imp.getAdGroupsByPromotionIdsListHttp(request, adAccountId, promotionIds, bookmark, pageSize, order);
    }

}
