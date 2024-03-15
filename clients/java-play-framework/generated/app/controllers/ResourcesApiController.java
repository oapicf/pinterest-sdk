package controllers;

import apimodels.AdAccountsCountryResponse;
import apimodels.BookClosedResponse;
import apimodels.DeliveryMetricsResponse;
import apimodels.Error;
import apimodels.SingleInterestTargetingOptionResponse;

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
public class ResourcesApiController extends Controller {
    private final ResourcesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ResourcesApiController(Config configuration, ResourcesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adAccountCountriesGet(Http.Request request) throws Exception {
        return imp.adAccountCountriesGetHttp(request);
    }

    @ApiAction
    public Result deliveryMetricsGet(Http.Request request) throws Exception {
        String valuereportType = request.getQueryString("report_type");
        String reportType;
        if (valuereportType != null) {
            reportType = valuereportType;
        } else {
            reportType = null;
        }
        return imp.deliveryMetricsGetHttp(request, reportType);
    }

    @ApiAction
    public Result interestTargetingOptionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String interestId) throws Exception {
        return imp.interestTargetingOptionsGetHttp(request, interestId);
    }

    @ApiAction
    public Result leadFormQuestionsGet(Http.Request request) throws Exception {
        return imp.leadFormQuestionsGetHttp(request);
    }

    @ApiAction
    public Result metricsReadyStateGet(Http.Request request) throws Exception {
        String valuedate = request.getQueryString("date");
        String date;
        if (valuedate != null) {
            date = valuedate;
        } else {
            throw new IllegalArgumentException("'date' parameter is required");
        }
        return imp.metricsReadyStateGetHttp(request, date);
    }

    @ApiAction
    public Result targetingOptionsGet(Http.Request request, String targetingType) throws Exception {
        String valueclientId = request.getQueryString("client_id");
        String clientId;
        if (valueclientId != null) {
            clientId = valueclientId;
        } else {
            clientId = null;
        }
        String valueoauthSignature = request.getQueryString("oauth_signature");
        String oauthSignature;
        if (valueoauthSignature != null) {
            oauthSignature = valueoauthSignature;
        } else {
            oauthSignature = null;
        }
        String valuetimestamp = request.getQueryString("timestamp");
        String timestamp;
        if (valuetimestamp != null) {
            timestamp = valuetimestamp;
        } else {
            timestamp = null;
        }
        return imp.targetingOptionsGetHttp(request, targetingType, clientId, oauthSignature, timestamp);
    }

}
