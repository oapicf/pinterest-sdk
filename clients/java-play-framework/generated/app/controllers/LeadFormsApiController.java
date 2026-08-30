package controllers;

import apimodels.LeadForm;
import apimodels.LeadFormBatchUpdate;
import apimodels.LeadFormCreate;
import apimodels.LeadFormTest;
import apimodels.LeadFormTestCreate;
import apimodels.LeadFormsCreate200Response;
import apimodels.LeadFormsList200Response;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;

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
public class LeadFormsApiController extends Controller {
    private final LeadFormsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LeadFormsApiController(Config configuration, LeadFormsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result leadFormGet(Http.Request request,  @Pattern(regexp="^\\d+$")String leadFormId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.leadFormGetHttp(request, leadFormId, adAccountId);
    }

    @ApiAction
    public Result leadFormTestCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$")String leadFormId) throws Exception {
        JsonNode nodeleadFormTestCreate = request.body().asJson();
        LeadFormTestCreate leadFormTestCreate;
        if (nodeleadFormTestCreate != null) {
            leadFormTestCreate = mapper.readValue(nodeleadFormTestCreate.toString(), LeadFormTestCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(leadFormTestCreate);
            }
        } else {
            throw new IllegalArgumentException("'LeadFormTestCreate' parameter is required");
        }
        return imp.leadFormTestCreateHttp(request, adAccountId, leadFormId, leadFormTestCreate);
    }

    @ApiAction
    public Result leadFormsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeleadFormCreate = request.body().asJson();
        List<@Valid LeadFormCreate> leadFormCreate;
        if (nodeleadFormCreate != null) {
            leadFormCreate = mapper.readValue(nodeleadFormCreate.toString(), new TypeReference<List<@Valid LeadFormCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (LeadFormCreate curItem : leadFormCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'LeadFormCreate' parameter is required");
        }
        return imp.leadFormsCreateHttp(request, adAccountId, leadFormCreate);
    }

    @ApiAction
    public Result leadFormsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.leadFormsListHttp(request, adAccountId, bookmark, pageSize, order);
    }

    @ApiAction
    public Result leadFormsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeleadFormBatchUpdate = request.body().asJson();
        List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate;
        if (nodeleadFormBatchUpdate != null) {
            leadFormBatchUpdate = mapper.readValue(nodeleadFormBatchUpdate.toString(), new TypeReference<List<@Valid LeadFormBatchUpdate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (LeadFormBatchUpdate curItem : leadFormBatchUpdate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'LeadFormBatchUpdate' parameter is required");
        }
        return imp.leadFormsUpdateHttp(request, adAccountId, leadFormBatchUpdate);
    }

}
