package controllers;

import apimodels.IntegrationLogsInvalidLogResponse;
import apimodels.IntegrationLogsRequestCreate;
import apimodels.IntegrationLogsSuccessResponse;
import apimodels.IntegrationMetadata;
import apimodels.IntegrationMetadataCreate;
import apimodels.IntegrationMetadataUpdate;
import apimodels.IntegrationRecord;
import apimodels.IntegrationsGetList200Response;
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
        JsonNode nodeintegrationMetadataUpdate = request.body().asJson();
        IntegrationMetadataUpdate integrationMetadataUpdate;
        if (nodeintegrationMetadataUpdate != null) {
            integrationMetadataUpdate = mapper.readValue(nodeintegrationMetadataUpdate.toString(), IntegrationMetadataUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(integrationMetadataUpdate);
            }
        } else {
            throw new IllegalArgumentException("'IntegrationMetadataUpdate' parameter is required");
        }
        return imp.integrationsCommercePatchHttp(request, externalBusinessId, integrationMetadataUpdate);
    }

    @ApiAction
    public Result integrationsCommercePost(Http.Request request) throws Exception {
        JsonNode nodeintegrationMetadataCreate = request.body().asJson();
        IntegrationMetadataCreate integrationMetadataCreate;
        if (nodeintegrationMetadataCreate != null) {
            integrationMetadataCreate = mapper.readValue(nodeintegrationMetadataCreate.toString(), IntegrationMetadataCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(integrationMetadataCreate);
            }
        } else {
            throw new IllegalArgumentException("'IntegrationMetadataCreate' parameter is required");
        }
        return imp.integrationsCommercePostHttp(request, integrationMetadataCreate);
    }

    @ApiAction
    public Result integrationsGetById(Http.Request request,  @Pattern(regexp="^\\d+$")String id) throws Exception {
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
        JsonNode nodeintegrationLogsRequestCreate = request.body().asJson();
        IntegrationLogsRequestCreate integrationLogsRequestCreate;
        if (nodeintegrationLogsRequestCreate != null) {
            integrationLogsRequestCreate = mapper.readValue(nodeintegrationLogsRequestCreate.toString(), IntegrationLogsRequestCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(integrationLogsRequestCreate);
            }
        } else {
            throw new IllegalArgumentException("'IntegrationLogsRequestCreate' parameter is required");
        }
        return imp.integrationsLogsPostHttp(request, integrationLogsRequestCreate);
    }

}
