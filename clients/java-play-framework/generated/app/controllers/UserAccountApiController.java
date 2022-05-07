package controllers;

import apimodels.Account;
import apimodels.AnalyticsMetricsResponse;
import apimodels.Error;
import java.time.LocalDate;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
public class UserAccountApiController extends Controller {
    private final UserAccountApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UserAccountApiController(Config configuration, UserAccountApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result userAccountAnalytics(Http.Request request) throws Exception {
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
        String valuefromClaimedContent = request.getQueryString("from_claimed_content");
        String fromClaimedContent;
        if (valuefromClaimedContent != null) {
            fromClaimedContent = valuefromClaimedContent;
        } else {
            fromClaimedContent = "BOTH";
        }
        String valuepinFormat = request.getQueryString("pin_format");
        String pinFormat;
        if (valuepinFormat != null) {
            pinFormat = valuepinFormat;
        } else {
            pinFormat = "ALL";
        }
        String valueappTypes = request.getQueryString("app_types");
        String appTypes;
        if (valueappTypes != null) {
            appTypes = valueappTypes;
        } else {
            appTypes = "ALL";
        }
        String[] metricTypesArray = request.queryString().get("metric_types");
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
        return imp.userAccountAnalyticsHttp(request, startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId);
    }

    @ApiAction
    public Result userAccountGet(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.userAccountGetHttp(request, adAccountId);
    }

}
