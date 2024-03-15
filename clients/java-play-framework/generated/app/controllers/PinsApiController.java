package controllers;

import apimodels.Error;
import java.time.LocalDate;
import java.util.Map;
import apimodels.Pin;
import apimodels.PinAnalyticsMetricsResponse;
import apimodels.PinCreate;
import apimodels.PinUpdate;
import apimodels.PinsAnalyticsMetricTypesParameterInner;
import apimodels.PinsList200Response;
import apimodels.PinsSaveRequest;

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
public class PinsApiController extends Controller {
    private final PinsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PinsApiController(Config configuration, PinsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result pinsAnalytics(Http.Request request, String pinId) throws Exception {
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
        String valueappTypes = request.getQueryString("app_types");
        String appTypes;
        if (valueappTypes != null) {
            appTypes = valueappTypes;
        } else {
            appTypes = "ALL";
        }
        String[] metricTypesArray = request.queryString().get("metric_types");
        if (metricTypesArray == null) {
            throw new IllegalArgumentException("'metric_types' parameter is required");
        }
        List<String> metricTypesList = OpenAPIUtils.parametersToList("csv", metricTypesArray);
        List<PinsAnalyticsMetricTypesParameterInner> metricTypes = new ArrayList<>();
        for (String curParam : metricTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                metricTypes.add(curParam);
            }
        }
        String valuesplitField = request.getQueryString("split_field");
        String splitField;
        if (valuesplitField != null) {
            splitField = valuesplitField;
        } else {
            splitField = "NO_SPLIT";
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsAnalyticsHttp(request, pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
    }

    @ApiAction
    public Result pinsCreate(Http.Request request) throws Exception {
        JsonNode nodepinCreate = request.body().asJson();
        PinCreate pinCreate;
        if (nodepinCreate != null) {
            pinCreate = mapper.readValue(nodepinCreate.toString(), PinCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(pinCreate);
            }
        } else {
            throw new IllegalArgumentException("'PinCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsCreateHttp(request, pinCreate, adAccountId);
    }

    @ApiAction
    public Result pinsDelete(Http.Request request, String pinId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsDeleteHttp(request, pinId, adAccountId);
    }

    @ApiAction
    public Result pinsGet(Http.Request request, String pinId) throws Exception {
        String valuepinMetrics = request.getQueryString("pin_metrics");
        Boolean pinMetrics;
        if (valuepinMetrics != null) {
            pinMetrics = Boolean.valueOf(valuepinMetrics);
        } else {
            pinMetrics = false;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsGetHttp(request, pinId, pinMetrics, adAccountId);
    }

    @ApiAction
    public Result pinsList(Http.Request request) throws Exception {
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
        String valuepinFilter = request.getQueryString("pin_filter");
        String pinFilter;
        if (valuepinFilter != null) {
            pinFilter = valuepinFilter;
        } else {
            pinFilter = null;
        }
        String valueincludeProtectedPins = request.getQueryString("include_protected_pins");
        Boolean includeProtectedPins;
        if (valueincludeProtectedPins != null) {
            includeProtectedPins = Boolean.valueOf(valueincludeProtectedPins);
        } else {
            includeProtectedPins = false;
        }
        String valuepinType = request.getQueryString("pin_type");
        String pinType;
        if (valuepinType != null) {
            pinType = valuepinType;
        } else {
            pinType = null;
        }
        String[] creativeTypesArray = request.queryString().get("creative_types");
        List<String> creativeTypesList = OpenAPIUtils.parametersToList("multi", creativeTypesArray);
        List<String> creativeTypes = new ArrayList<>();
        for (String curParam : creativeTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                creativeTypes.add(curParam);
            }
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuepinMetrics = request.getQueryString("pin_metrics");
        Boolean pinMetrics;
        if (valuepinMetrics != null) {
            pinMetrics = Boolean.valueOf(valuepinMetrics);
        } else {
            pinMetrics = false;
        }
        return imp.pinsListHttp(request, bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics);
    }

    @ApiAction
    public Result pinsSave(Http.Request request, String pinId) throws Exception {
        JsonNode nodepinsSaveRequest = request.body().asJson();
        PinsSaveRequest pinsSaveRequest;
        if (nodepinsSaveRequest != null) {
            pinsSaveRequest = mapper.readValue(nodepinsSaveRequest.toString(), PinsSaveRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(pinsSaveRequest);
            }
        } else {
            throw new IllegalArgumentException("'PinsSaveRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsSaveHttp(request, pinId, pinsSaveRequest, adAccountId);
    }

    @ApiAction
    public Result pinsUpdate(Http.Request request, String pinId) throws Exception {
        JsonNode nodepinUpdate = request.body().asJson();
        PinUpdate pinUpdate;
        if (nodepinUpdate != null) {
            pinUpdate = mapper.readValue(nodepinUpdate.toString(), PinUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(pinUpdate);
            }
        } else {
            throw new IllegalArgumentException("'PinUpdate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsUpdateHttp(request, pinId, pinUpdate, adAccountId);
    }

}
