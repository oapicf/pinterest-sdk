package controllers;

import apimodels.EventQualityScore;
import apimodels.IngestionSourceOptions;
import apimodels.LookbackPeriodOptions;
import apimodels.PinterestLibError;
import apimodels.SourcePlatformOptions;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionEqsApiController extends Controller {
    private final ConversionEqsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ConversionEqsApiController(Config configuration, ConversionEqsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result conversionEqsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuelookbackPeriod = request.getQueryString("lookback_period");
        LookbackPeriodOptions lookbackPeriod;
        if (valuelookbackPeriod != null) {
            lookbackPeriod = valuelookbackPeriod;
        } else {
            throw new IllegalArgumentException("'lookback_period' parameter is required");
        }
        String valuesourcePlatform = request.getQueryString("source_platform");
        SourcePlatformOptions sourcePlatform;
        if (valuesourcePlatform != null) {
            sourcePlatform = valuesourcePlatform;
        } else {
            sourcePlatform = null;
        }
        String valueingestionSource = request.getQueryString("ingestion_source");
        IngestionSourceOptions ingestionSource;
        if (valueingestionSource != null) {
            ingestionSource = valueingestionSource;
        } else {
            ingestionSource = null;
        }
        return imp.conversionEqsListHttp(request, lookbackPeriod, adAccountId, sourcePlatform, ingestionSource);
    }

}
