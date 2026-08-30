package controllers;

import java.math.BigDecimal;
import apimodels.EntityStatus;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.ProductGroupAnalyticsItems;
import apimodels.ProductGroupPromotion;
import apimodels.ProductGroupPromotions;
import apimodels.ProductGroupPromotionsCreate;
import apimodels.ProductGroupPromotionsList200Response;
import apimodels.ProductGroupPromotionsUpdateWithRequiredBody;
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
public class ProductGroupPromotionsApiController extends Controller {
    private final ProductGroupPromotionsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ProductGroupPromotionsApiController(Config configuration, ProductGroupPromotionsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result productGroupPromotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeproductGroupPromotionsCreate = request.body().asJson();
        ProductGroupPromotionsCreate productGroupPromotionsCreate;
        if (nodeproductGroupPromotionsCreate != null) {
            productGroupPromotionsCreate = mapper.readValue(nodeproductGroupPromotionsCreate.toString(), ProductGroupPromotionsCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(productGroupPromotionsCreate);
            }
        } else {
            throw new IllegalArgumentException("'ProductGroupPromotionsCreate' parameter is required");
        }
        return imp.productGroupPromotionsCreateHttp(request, adAccountId, productGroupPromotionsCreate);
    }

    @ApiAction
    public Result productGroupPromotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception {
        return imp.productGroupPromotionsGetHttp(request, adAccountId, productGroupPromotionId);
    }

    @ApiAction
    public Result productGroupPromotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] productGroupPromotionIdsArray = request.queryString().get("product_group_promotion_ids");
        List<String> productGroupPromotionIdsList = OpenAPIUtils.parametersToList("multi", productGroupPromotionIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds = new ArrayList<>();
        for (String curParam : productGroupPromotionIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                productGroupPromotionIds.add(curParam);
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
        String valueadGroupId = request.getQueryString("ad_group_id");
        String adGroupId;
        if (valueadGroupId != null) {
            adGroupId = valueadGroupId;
        } else {
            adGroupId = null;
        }
        return imp.productGroupPromotionsListHttp(request, adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId);
    }

    @ApiAction
    public Result productGroupPromotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeproductGroupPromotionsUpdateWithRequiredBody = request.body().asJson();
        ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody;
        if (nodeproductGroupPromotionsUpdateWithRequiredBody != null) {
            productGroupPromotionsUpdateWithRequiredBody = mapper.readValue(nodeproductGroupPromotionsUpdateWithRequiredBody.toString(), ProductGroupPromotionsUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(productGroupPromotionsUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'ProductGroupPromotionsUpdateWithRequiredBody' parameter is required");
        }
        return imp.productGroupPromotionsUpdateHttp(request, adAccountId, productGroupPromotionsUpdateWithRequiredBody);
    }

    @ApiAction
    public Result productGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String[] productGroupIdsArray = request.queryString().get("product_group_ids");
        if (productGroupIdsArray == null) {
            throw new IllegalArgumentException("'product_group_ids' parameter is required");
        }
        List<String> productGroupIdsList = OpenAPIUtils.parametersToList("multi", productGroupIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();
        for (String curParam : productGroupIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                productGroupIds.add(curParam);
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
        String valuereportingTimezone = request.getQueryString("reporting_timezone");
        ReportingTimeZone reportingTimezone;
        if (valuereportingTimezone != null) {
            reportingTimezone = valuereportingTimezone;
        } else {
            reportingTimezone = null;
        }
        return imp.productGroupsAnalyticsHttp(request, startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);
    }

}
