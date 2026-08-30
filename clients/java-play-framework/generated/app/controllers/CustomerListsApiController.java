package controllers;

import apimodels.CustomerList;
import apimodels.CustomerListCreate;
import apimodels.CustomerListUpdateWithRequiredBody;
import apimodels.CustomerListsList200Response;
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
public class CustomerListsApiController extends Controller {
    private final CustomerListsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CustomerListsApiController(Config configuration, CustomerListsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result customerListsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecustomerListCreate = request.body().asJson();
        CustomerListCreate customerListCreate;
        if (nodecustomerListCreate != null) {
            customerListCreate = mapper.readValue(nodecustomerListCreate.toString(), CustomerListCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerListCreate);
            }
        } else {
            throw new IllegalArgumentException("'CustomerListCreate' parameter is required");
        }
        return imp.customerListsCreateHttp(request, adAccountId, customerListCreate);
    }

    @ApiAction
    public Result customerListsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        return imp.customerListsGetHttp(request, adAccountId, customerListId);
    }

    @ApiAction
    public Result customerListsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String valueexcludeNca = request.getQueryString("exclude_nca");
        Boolean excludeNca;
        if (valueexcludeNca != null) {
            excludeNca = Boolean.valueOf(valueexcludeNca);
        } else {
            excludeNca = false;
        }
        return imp.customerListsListHttp(request, adAccountId, bookmark, pageSize, order, excludeNca);
    }

    @ApiAction
    public Result customerListsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        JsonNode nodecustomerListUpdateWithRequiredBody = request.body().asJson();
        CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody;
        if (nodecustomerListUpdateWithRequiredBody != null) {
            customerListUpdateWithRequiredBody = mapper.readValue(nodecustomerListUpdateWithRequiredBody.toString(), CustomerListUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerListUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'CustomerListUpdateWithRequiredBody' parameter is required");
        }
        return imp.customerListsUpdateHttp(request, adAccountId, customerListId, customerListUpdateWithRequiredBody);
    }

}
