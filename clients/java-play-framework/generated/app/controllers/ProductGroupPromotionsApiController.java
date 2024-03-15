package controllers;

import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.ProductGroupAnalyticsResponseInner;
import apimodels.ProductGroupPromotionCreateRequest;
import apimodels.ProductGroupPromotionResponse;
import apimodels.ProductGroupPromotionUpdateRequest;
import apimodels.ProductGroupPromotionsList200Response;

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
        JsonNode nodeproductGroupPromotionCreateRequest = request.body().asJson();
        ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest;
        if (nodeproductGroupPromotionCreateRequest != null) {
            productGroupPromotionCreateRequest = mapper.readValue(nodeproductGroupPromotionCreateRequest.toString(), ProductGroupPromotionCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(productGroupPromotionCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProductGroupPromotionCreateRequest' parameter is required");
        }
        return imp.productGroupPromotionsCreateHttp(request, adAccountId, productGroupPromotionCreateRequest);
    }

    @ApiAction
    public Result productGroupPromotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception {
        return imp.productGroupPromotionsGetHttp(request, adAccountId, productGroupPromotionId);
    }

    @ApiAction
    public Result productGroupPromotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        List<String> entityStatuses = new ArrayList<>();
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
        return imp.productGroupPromotionsListHttp(request, adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark);
    }

    @ApiAction
    public Result productGroupPromotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeproductGroupPromotionUpdateRequest = request.body().asJson();
        ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest;
        if (nodeproductGroupPromotionUpdateRequest != null) {
            productGroupPromotionUpdateRequest = mapper.readValue(nodeproductGroupPromotionUpdateRequest.toString(), ProductGroupPromotionUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(productGroupPromotionUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProductGroupPromotionUpdateRequest' parameter is required");
        }
        return imp.productGroupPromotionsUpdateHttp(request, adAccountId, productGroupPromotionUpdateRequest);
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
        return imp.productGroupsAnalyticsHttp(request, adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
    }

}
