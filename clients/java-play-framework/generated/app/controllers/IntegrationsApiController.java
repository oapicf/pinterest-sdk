package controllers;

import apimodels.DetailedError;
import apimodels.Error;
import apimodels.IntegrationLogsRequest;
import apimodels.IntegrationLogsSuccessResponse;
import apimodels.IntegrationMetadata;
import apimodels.IntegrationRecord;
import apimodels.IntegrationRequest;
import apimodels.IntegrationRequestPatch;
import apimodels.IntegrationsGetList200Response;

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
public class IntegrationsApiController extends Controller {
    private final IntegrationsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private IntegrationsApiController(Config configuration, IntegrationsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result integrationsCommerceDel(Http.Request request, String externalBusinessId) throws Exception {
        return imp.integrationsCommerceDelHttp(request, externalBusinessId);
    }

    @ApiAction
    public Result integrationsCommerceGet(Http.Request request, String externalBusinessId) throws Exception {
        return imp.integrationsCommerceGetHttp(request, externalBusinessId);
    }

    @ApiAction
    public Result integrationsCommercePatch(Http.Request request, String externalBusinessId) throws Exception {
        JsonNode nodeintegrationRequestPatch = request.body().asJson();
        IntegrationRequestPatch integrationRequestPatch;
        if (nodeintegrationRequestPatch != null) {
            integrationRequestPatch = mapper.readValue(nodeintegrationRequestPatch.toString(), IntegrationRequestPatch.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(integrationRequestPatch);
            }
        } else {
            integrationRequestPatch = null;
        }
        return imp.integrationsCommercePatchHttp(request, externalBusinessId, integrationRequestPatch);
    }

    @ApiAction
    public Result integrationsCommercePost(Http.Request request) throws Exception {
        JsonNode nodeintegrationRequest = request.body().asJson();
        IntegrationRequest integrationRequest;
        if (nodeintegrationRequest != null) {
            integrationRequest = mapper.readValue(nodeintegrationRequest.toString(), IntegrationRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(integrationRequest);
            }
        } else {
            integrationRequest = null;
        }
        return imp.integrationsCommercePostHttp(request, integrationRequest);
    }

    @ApiAction
    public Result integrationsGetById(Http.Request request, String id) throws Exception {
        return imp.integrationsGetByIdHttp(request, id);
    }

    @ApiAction
    public Result integrationsGetList(Http.Request request) throws Exception {
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
        return imp.integrationsGetListHttp(request, bookmark, pageSize);
    }

    @ApiAction
    public Result integrationsLogsPost(Http.Request request) throws Exception {
        JsonNode nodeintegrationLogsRequest = request.body().asJson();
        IntegrationLogsRequest integrationLogsRequest;
        if (nodeintegrationLogsRequest != null) {
            integrationLogsRequest = mapper.readValue(nodeintegrationLogsRequest.toString(), IntegrationLogsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(integrationLogsRequest);
            }
        } else {
            throw new IllegalArgumentException("'IntegrationLogsRequest' parameter is required");
        }
        return imp.integrationsLogsPostHttp(request, integrationLogsRequest);
    }

}
