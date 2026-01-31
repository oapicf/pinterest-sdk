package controllers;

import apimodels.ConversionMSOTEvents;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MsotEventsApiController extends Controller {
    private final MsotEventsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MsotEventsApiController(Config configuration, MsotEventsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result msotEventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeconversionMSOTEvents = request.body().asJson();
        ConversionMSOTEvents conversionMSOTEvents;
        if (nodeconversionMSOTEvents != null) {
            conversionMSOTEvents = mapper.readValue(nodeconversionMSOTEvents.toString(), ConversionMSOTEvents.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(conversionMSOTEvents);
            }
        } else {
            throw new IllegalArgumentException("'ConversionMSOTEvents' parameter is required");
        }
        return imp.msotEventsCreateHttp(request, adAccountId, conversionMSOTEvents);
    }

}
