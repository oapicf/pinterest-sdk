package controllers;

import apimodels.AdvertiserDefinedEventsCreate200Response;
import apimodels.AdvertiserDefinedEventsCreateRequest;
import apimodels.AdvertiserDefinedEventsGet200Response;
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
public class ConversionsApiController extends Controller {
    private final ConversionsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ConversionsApiController(Config configuration, ConversionsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result advertiserDefinedEventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadvertiserDefinedEventsCreateRequest = request.body().asJson();
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest;
        if (nodeadvertiserDefinedEventsCreateRequest != null) {
            advertiserDefinedEventsCreateRequest = mapper.readValue(nodeadvertiserDefinedEventsCreateRequest.toString(), AdvertiserDefinedEventsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(advertiserDefinedEventsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdvertiserDefinedEventsCreateRequest' parameter is required");
        }
        return imp.advertiserDefinedEventsCreateHttp(request, adAccountId, advertiserDefinedEventsCreateRequest);
    }

    @ApiAction
    public Result advertiserDefinedEventsDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] eventNamesArray = request.queryString().get("event_names");
        if (eventNamesArray == null) {
            throw new IllegalArgumentException("'event_names' parameter is required");
        }
        List<String> eventNamesList = OpenAPIUtils.parametersToList("csv", eventNamesArray);
        List<String> eventNames = new ArrayList<>();
        for (String curParam : eventNamesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                eventNames.add(curParam);
            }
        }
        return imp.advertiserDefinedEventsDeleteHttp(request, adAccountId, eventNames);
    }

    @ApiAction
    public Result advertiserDefinedEventsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.advertiserDefinedEventsGetHttp(request, adAccountId);
    }

    @ApiAction
    public Result advertiserDefinedEventsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadvertiserDefinedEventsCreateRequest = request.body().asJson();
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest;
        if (nodeadvertiserDefinedEventsCreateRequest != null) {
            advertiserDefinedEventsCreateRequest = mapper.readValue(nodeadvertiserDefinedEventsCreateRequest.toString(), AdvertiserDefinedEventsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(advertiserDefinedEventsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdvertiserDefinedEventsCreateRequest' parameter is required");
        }
        return imp.advertiserDefinedEventsUpdateHttp(request, adAccountId, advertiserDefinedEventsCreateRequest);
    }

}
