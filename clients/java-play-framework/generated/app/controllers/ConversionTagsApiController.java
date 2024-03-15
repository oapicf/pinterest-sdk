package controllers;

import apimodels.ConversionEventResponse;
import apimodels.ConversionTagCreate;
import apimodels.ConversionTagListResponse;
import apimodels.ConversionTagResponse;
import apimodels.Error;
import java.util.Map;
import apimodels.PageVisitConversionTagsGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionTagsApiController extends Controller {
    private final ConversionTagsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ConversionTagsApiController(Config configuration, ConversionTagsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result conversionTagsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeconversionTagCreate = request.body().asJson();
        ConversionTagCreate conversionTagCreate;
        if (nodeconversionTagCreate != null) {
            conversionTagCreate = mapper.readValue(nodeconversionTagCreate.toString(), ConversionTagCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(conversionTagCreate);
            }
        } else {
            throw new IllegalArgumentException("'ConversionTagCreate' parameter is required");
        }
        return imp.conversionTagsCreateHttp(request, adAccountId, conversionTagCreate);
    }

    @ApiAction
    public Result conversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String conversionTagId) throws Exception {
        return imp.conversionTagsGetHttp(request, adAccountId, conversionTagId);
    }

    @ApiAction
    public Result conversionTagsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuefilterDeleted = request.getQueryString("filter_deleted");
        Boolean filterDeleted;
        if (valuefilterDeleted != null) {
            filterDeleted = Boolean.valueOf(valuefilterDeleted);
        } else {
            filterDeleted = false;
        }
        return imp.conversionTagsListHttp(request, adAccountId, filterDeleted);
    }

    @ApiAction
    public Result ocpmEligibleConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.ocpmEligibleConversionTagsGetHttp(request, adAccountId);
    }

    @ApiAction
    public Result pageVisitConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.pageVisitConversionTagsGetHttp(request, adAccountId, pageSize, order, bookmark);
    }

}
