package controllers;

import apimodels.AnalyticsMetricsResponse;
import apimodels.Error;
import java.time.LocalDate;
import apimodels.Pin;

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
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
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
        List<String> metricTypes = new ArrayList<>();
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
        JsonNode nodepin = request.body().asJson();
        Pin pin;
        if (nodepin != null) {
            pin = mapper.readValue(nodepin.toString(), Pin.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(pin);
            }
        } else {
            throw new IllegalArgumentException("'Pin' parameter is required");
        }
        return imp.pinsCreateHttp(request, pin);
    }

    @ApiAction
    public Result pinsDelete(Http.Request request, String pinId) throws Exception {
        return imp.pinsDeleteHttp(request, pinId);
    }

    @ApiAction
    public Result pinsGet(Http.Request request, String pinId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.pinsGetHttp(request, pinId, adAccountId);
    }

}
