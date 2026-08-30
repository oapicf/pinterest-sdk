package controllers;

import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.TargetingTemplate;
import apimodels.TargetingTemplateCreate;
import apimodels.TargetingTemplateList200Response;
import apimodels.TargetingTemplateUpdateRequestReadOrUpdate;

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
public class TargetingTemplateApiController extends Controller {
    private final TargetingTemplateApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TargetingTemplateApiController(Config configuration, TargetingTemplateApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result targetingTemplateCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodetargetingTemplateCreate = request.body().asJson();
        TargetingTemplateCreate targetingTemplateCreate;
        if (nodetargetingTemplateCreate != null) {
            targetingTemplateCreate = mapper.readValue(nodetargetingTemplateCreate.toString(), TargetingTemplateCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(targetingTemplateCreate);
            }
        } else {
            throw new IllegalArgumentException("'TargetingTemplateCreate' parameter is required");
        }
        return imp.targetingTemplateCreateHttp(request, adAccountId, targetingTemplateCreate);
    }

    @ApiAction
    public Result targetingTemplateList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String valueorder = request.getQueryString("order");
        PinterestLibPaginationOrder order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valueincludeSizing = request.getQueryString("include_sizing");
        Boolean includeSizing;
        if (valueincludeSizing != null) {
            includeSizing = Boolean.valueOf(valueincludeSizing);
        } else {
            includeSizing = false;
        }
        String valuesearchQuery = request.getQueryString("search_query");
        String searchQuery;
        if (valuesearchQuery != null) {
            searchQuery = valuesearchQuery;
        } else {
            searchQuery = null;
        }
        return imp.targetingTemplateListHttp(request, adAccountId, bookmark, pageSize, order, includeSizing, searchQuery);
    }

    @ApiAction
    public Result targetingTemplateUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodetargetingTemplateUpdateRequestReadOrUpdate = request.body().asJson();
        TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate;
        if (nodetargetingTemplateUpdateRequestReadOrUpdate != null) {
            targetingTemplateUpdateRequestReadOrUpdate = mapper.readValue(nodetargetingTemplateUpdateRequestReadOrUpdate.toString(), TargetingTemplateUpdateRequestReadOrUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(targetingTemplateUpdateRequestReadOrUpdate);
            }
        } else {
            throw new IllegalArgumentException("'TargetingTemplateUpdateRequestReadOrUpdate' parameter is required");
        }
        return imp.targetingTemplateUpdateHttp(request, adAccountId, targetingTemplateUpdateRequestReadOrUpdate);
    }

}
