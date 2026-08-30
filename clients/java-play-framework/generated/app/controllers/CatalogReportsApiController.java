package controllers;

import apimodels.CatalogsCreateReportResponse;
import apimodels.CatalogsReport;
import apimodels.CatalogsReportParameters;
import apimodels.CatalogsReportStatsParameters;
import apimodels.PinterestLibError;
import apimodels.ReportsStats200Response;

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
public class CatalogReportsApiController extends Controller {
    private final CatalogReportsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogReportsApiController(Config configuration, CatalogReportsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result reportsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsReportParameters = request.body().asJson();
        CatalogsReportParameters catalogsReportParameters;
        if (nodecatalogsReportParameters != null) {
            catalogsReportParameters = mapper.readValue(nodecatalogsReportParameters.toString(), CatalogsReportParameters.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsReportParameters);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsReportParameters' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.reportsCreateHttp(request, catalogsReportParameters, adAccountId);
    }

    @ApiAction
    public Result reportsGet(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        return imp.reportsGetHttp(request, token, adAccountId);
    }

    @ApiAction
    public Result reportsStats(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valueparameters = request.getQueryString("parameters");
        CatalogsReportStatsParameters parameters;
        if (valueparameters != null) {
            parameters = valueparameters;
        } else {
            throw new IllegalArgumentException("'parameters' parameter is required");
        }
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
        return imp.reportsStatsHttp(request, parameters, adAccountId, bookmark, pageSize);
    }

}
