package controllers;

import apimodels.CustomerList;
import apimodels.CustomerListRequest;
import apimodels.CustomerListUpdateRequest;
import apimodels.CustomerListsList200Response;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
        JsonNode nodecustomerListRequest = request.body().asJson();
        CustomerListRequest customerListRequest;
        if (nodecustomerListRequest != null) {
            customerListRequest = mapper.readValue(nodecustomerListRequest.toString(), CustomerListRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerListRequest);
            }
        } else {
            throw new IllegalArgumentException("'CustomerListRequest' parameter is required");
        }
        return imp.customerListsCreateHttp(request, adAccountId, customerListRequest);
    }

    @ApiAction
    public Result customerListsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        return imp.customerListsGetHttp(request, adAccountId, customerListId);
    }

    @ApiAction
    public Result customerListsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.customerListsListHttp(request, adAccountId, pageSize, order, bookmark);
    }

    @ApiAction
    public Result customerListsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        JsonNode nodecustomerListUpdateRequest = request.body().asJson();
        CustomerListUpdateRequest customerListUpdateRequest;
        if (nodecustomerListUpdateRequest != null) {
            customerListUpdateRequest = mapper.readValue(nodecustomerListUpdateRequest.toString(), CustomerListUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerListUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CustomerListUpdateRequest' parameter is required");
        }
        return imp.customerListsUpdateHttp(request, adAccountId, customerListId, customerListUpdateRequest);
    }

}
