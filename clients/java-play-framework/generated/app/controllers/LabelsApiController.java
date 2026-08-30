package controllers;

import apimodels.LabelCreateRequest;
import apimodels.LabelUpdateRequest;
import apimodels.LabeledEntities;
import apimodels.LabeledEntitiesCreate;
import apimodels.LabelsList200Response;
import apimodels.LabelsResponse;
import apimodels.PinterestLibError;
import apimodels.QueryLabelEntityStatusesItems;
import apimodels.QueryLabelTypesItems;

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
public class LabelsApiController extends Controller {
    private final LabelsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LabelsApiController(Config configuration, LabelsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result labelsApply(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String labelId) throws Exception {
        JsonNode nodelabeledEntitiesCreate = request.body().asJson();
        LabeledEntitiesCreate labeledEntitiesCreate;
        if (nodelabeledEntitiesCreate != null) {
            labeledEntitiesCreate = mapper.readValue(nodelabeledEntitiesCreate.toString(), LabeledEntitiesCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(labeledEntitiesCreate);
            }
        } else {
            throw new IllegalArgumentException("'LabeledEntitiesCreate' parameter is required");
        }
        return imp.labelsApplyHttp(request, adAccountId, labelId, labeledEntitiesCreate);
    }

    @ApiAction
    public Result labelsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodelabelCreateRequest = request.body().asJson();
        LabelCreateRequest labelCreateRequest;
        if (nodelabelCreateRequest != null) {
            labelCreateRequest = mapper.readValue(nodelabelCreateRequest.toString(), LabelCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(labelCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'LabelCreateRequest' parameter is required");
        }
        return imp.labelsCreateHttp(request, adAccountId, labelCreateRequest);
    }

    @ApiAction
    public Result labelsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String[] campaignIdsArray = request.queryString().get("campaign_ids");
        List<String> campaignIdsList = OpenAPIUtils.parametersToList("multi", campaignIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = new ArrayList<>();
        for (String curParam : campaignIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                campaignIds.add(curParam);
            }
        }
        String[] labelIdsArray = request.queryString().get("label_ids");
        List<String> labelIdsList = OpenAPIUtils.parametersToList("multi", labelIdsArray);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds = new ArrayList<>();
        for (String curParam : labelIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                labelIds.add(curParam);
            }
        }
        String[] entityStatusesArray = request.queryString().get("entity_statuses");
        List<String> entityStatusesList = OpenAPIUtils.parametersToList("multi", entityStatusesArray);
        List<QueryLabelEntityStatusesItems> entityStatuses = new ArrayList<>();
        for (String curParam : entityStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                entityStatuses.add(curParam);
            }
        }
        String[] labelTypesArray = request.queryString().get("label_types");
        List<String> labelTypesList = OpenAPIUtils.parametersToList("multi", labelTypesArray);
        List<QueryLabelTypesItems> labelTypes = new ArrayList<>();
        for (String curParam : labelTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                labelTypes.add(curParam);
            }
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
        return imp.labelsListHttp(request, adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize);
    }

    @ApiAction
    public Result labelsRemove(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String labelId) throws Exception {
        JsonNode nodelabeledEntitiesCreate = request.body().asJson();
        LabeledEntitiesCreate labeledEntitiesCreate;
        if (nodelabeledEntitiesCreate != null) {
            labeledEntitiesCreate = mapper.readValue(nodelabeledEntitiesCreate.toString(), LabeledEntitiesCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(labeledEntitiesCreate);
            }
        } else {
            throw new IllegalArgumentException("'LabeledEntitiesCreate' parameter is required");
        }
        return imp.labelsRemoveHttp(request, adAccountId, labelId, labeledEntitiesCreate);
    }

    @ApiAction
    public Result labelsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodelabelUpdateRequest = request.body().asJson();
        LabelUpdateRequest labelUpdateRequest;
        if (nodelabelUpdateRequest != null) {
            labelUpdateRequest = mapper.readValue(nodelabelUpdateRequest.toString(), LabelUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(labelUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'LabelUpdateRequest' parameter is required");
        }
        return imp.labelsUpdateHttp(request, adAccountId, labelUpdateRequest);
    }

}
