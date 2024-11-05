package controllers;

import apimodels.ConversionApiResponse;
import apimodels.ConversionEvents;
import apimodels.DetailedError;
import apimodels.Error;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
        JsonNode nodeconversionEvents = request.body().asJson();
        ConversionEvents conversionEvents;
        if (nodeconversionEvents != null) {
            conversionEvents = mapper.readValue(nodeconversionEvents.toString(), ConversionEvents.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(conversionEvents);
            }
        } else {
            throw new IllegalArgumentException("'ConversionEvents' parameter is required");
        }
        String valuetest = request.getQueryString("test");
        Boolean test;
        if (valuetest != null) {
            test = Boolean.valueOf(valuetest);
        } else {
            test = null;
        }
        return imp.eventsCreateHttp(request, adAccountId, conversionEvents, test);
    }

}
