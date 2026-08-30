package controllers;

import apimodels.ConversionEvents;
import apimodels.ConversionEventsCreate;
import apimodels.DetailedError;
import apimodels.PinterestLibError;

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
public class ConversionEventsApiController extends Controller {
    private final ConversionEventsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ConversionEventsApiController(Config configuration, ConversionEventsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result eventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeconversionEventsCreate = request.body().asJson();
        ConversionEventsCreate conversionEventsCreate;
        if (nodeconversionEventsCreate != null) {
            conversionEventsCreate = mapper.readValue(nodeconversionEventsCreate.toString(), ConversionEventsCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(conversionEventsCreate);
            }
        } else {
            throw new IllegalArgumentException("'ConversionEventsCreate' parameter is required");
        }
        String valuetest = request.getQueryString("test");
        Boolean test;
        if (valuetest != null) {
            test = Boolean.valueOf(valuetest);
        } else {
            test = null;
        }
        return imp.eventsCreateHttp(request, adAccountId, conversionEventsCreate, test);
    }

}
