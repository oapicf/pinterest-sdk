package controllers;

import apimodels.AdPinAnalytics;
import apimodels.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import apimodels.Campaign;
import apimodels.CampaignBatchUpdateItem;
import apimodels.CampaignBatchWriteResponseModel;
import apimodels.CampaignCreateItem;
import apimodels.CampaignDeliveryEstimatesCampaign;
import apimodels.CampaignDeliveryEstimatesResponse;
import apimodels.CampaignsAnalyticsMetrics;
import apimodels.CampaignsList200Response;
import apimodels.ConversionReportAttributionType;
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
public class CampaignsApiController extends Controller {
    private final CampaignsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CampaignsApiController(Config configuration, CampaignsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adPinsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuecampaignId = request.getQueryString("campaign_id");
        String campaignId;
        if (valuecampaignId != null) {
            campaignId = valuecampaignId;
        } else {
            throw new IllegalArgumentException("'campaign_id' parameter is required");
        }
        String[] pinIdsArray = request.queryString().get("pin_ids");
        if (pinIdsArray == null) {
            throw new IllegalArgumentException("'pin_ids' parameter is required");
        }
        List<String> pinIdsList = OpenAPIUtils.parametersToList("multi", pinIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> pinIds = new ArrayList<>();
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
        return imp.adPinsAnalyticsHttp(request, campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
    }

    @ApiAction
    public Result campaignTargetingAnalyticsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] campaignIdsArray = request.queryString().get("campaign_ids");
        if (campaignIdsArray == null) {
            throw new IllegalArgumentException("'campaign_ids' parameter is required");
        }
        List<String> campaignIdsList = OpenAPIUtils.parametersToList("multi", campaignIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = new ArrayList<>();
        for (String curParam : campaignIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                campaignIds.add(curParam);
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
        List<AdsAnalyticsCampaignTargetingType> targetingTypes = new ArrayList<>();
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
        return imp.campaignTargetingAnalyticsGetHttp(request, adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);
    }

    @ApiAction
    public Result campaignsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] campaignIdsArray = request.queryString().get("campaign_ids");
        if (campaignIdsArray == null) {
            throw new IllegalArgumentException("'campaign_ids' parameter is required");
        }
        List<String> campaignIdsList = OpenAPIUtils.parametersToList("multi", campaignIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = new ArrayList<>();
        for (String curParam : campaignIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                campaignIds.add(curParam);
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
        return imp.campaignsAnalyticsHttp(request, startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);
    }

    @ApiAction
    public Result campaignsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecampaignCreateItem = request.body().asJson();
        List<@Valid CampaignCreateItem> campaignCreateItem;
        if (nodecampaignCreateItem != null) {
            campaignCreateItem = mapper.readValue(nodecampaignCreateItem.toString(), new TypeReference<List<@Valid CampaignCreateItem>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (CampaignCreateItem curItem : campaignCreateItem) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'CampaignCreateItem' parameter is required");
        }
        return imp.campaignsCreateHttp(request, adAccountId, campaignCreateItem);
    }

    @ApiAction
    public Result campaignsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.campaignsGetHttp(request, campaignId, adAccountId);
    }

    @ApiAction
    public Result campaignsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] entityStatusesArray = request.queryString().get("entity_statuses");
        List<String> entityStatusesList = OpenAPIUtils.parametersToList("multi", entityStatusesArray);
        List<EntityStatus> entityStatuses = new ArrayList<>();
        for (String curParam : entityStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                entityStatuses.add(curParam);
            }
        }
        return imp.campaignsListHttp(request, adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses);
    }

    @ApiAction
    public Result campaignsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecampaignBatchUpdateItem = request.body().asJson();
        List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem;
        if (nodecampaignBatchUpdateItem != null) {
            campaignBatchUpdateItem = mapper.readValue(nodecampaignBatchUpdateItem.toString(), new TypeReference<List<@Valid CampaignBatchUpdateItem>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (CampaignBatchUpdateItem curItem : campaignBatchUpdateItem) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'CampaignBatchUpdateItem' parameter is required");
        }
        return imp.campaignsUpdateHttp(request, adAccountId, campaignBatchUpdateItem);
    }

    @ApiAction
    public Result getCampaignDeliveryEstimates(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecampaignDeliveryEstimatesCampaign = request.body().asJson();
        List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign;
        if (nodecampaignDeliveryEstimatesCampaign != null) {
            campaignDeliveryEstimatesCampaign = mapper.readValue(nodecampaignDeliveryEstimatesCampaign.toString(), new TypeReference<List<@Valid CampaignDeliveryEstimatesCampaign>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (CampaignDeliveryEstimatesCampaign curItem : campaignDeliveryEstimatesCampaign) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'CampaignDeliveryEstimatesCampaign' parameter is required");
        }
        return imp.getCampaignDeliveryEstimatesHttp(request, adAccountId, campaignDeliveryEstimatesCampaign);
    }

}
