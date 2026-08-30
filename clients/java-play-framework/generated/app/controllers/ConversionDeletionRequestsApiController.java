package controllers;

import apimodels.ConversionDeletionRequest;
import apimodels.ConversionDeletionRequestCreate;
import apimodels.ConversionDeletionRequestList200Response;
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
public class ConversionDeletionRequestsApiController extends Controller {
    private final ConversionDeletionRequestsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ConversionDeletionRequestsApiController(Config configuration, ConversionDeletionRequestsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result conversionDeletionRequestCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeconversionDeletionRequestCreate = request.body().asJson();
        ConversionDeletionRequestCreate conversionDeletionRequestCreate;
        if (nodeconversionDeletionRequestCreate != null) {
            conversionDeletionRequestCreate = mapper.readValue(nodeconversionDeletionRequestCreate.toString(), ConversionDeletionRequestCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(conversionDeletionRequestCreate);
            }
        } else {
            throw new IllegalArgumentException("'ConversionDeletionRequestCreate' parameter is required");
        }
        return imp.conversionDeletionRequestCreateHttp(request, adAccountId, conversionDeletionRequestCreate);
    }

    @ApiAction
    public Result conversionDeletionRequestDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String requestId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.conversionDeletionRequestDeleteHttp(request, requestId, adAccountId);
    }

    @ApiAction
    public Result conversionDeletionRequestGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String requestId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.conversionDeletionRequestGetHttp(request, requestId, adAccountId);
    }

    @ApiAction
    public Result conversionDeletionRequestList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.conversionDeletionRequestListHttp(request, adAccountId, bookmark, pageSize, order);
    }

}
