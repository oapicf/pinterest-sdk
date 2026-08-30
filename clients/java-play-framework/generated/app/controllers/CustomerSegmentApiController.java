package controllers;

import apimodels.CustomerSegment;
import apimodels.CustomerSegmentCreate;
import apimodels.CustomerSegmentList200Response;
import apimodels.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
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
public class CustomerSegmentApiController extends Controller {
    private final CustomerSegmentApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CustomerSegmentApiController(Config configuration, CustomerSegmentApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result customerSegmentCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecustomerSegmentCreate = request.body().asJson();
        CustomerSegmentCreate customerSegmentCreate;
        if (nodecustomerSegmentCreate != null) {
            customerSegmentCreate = mapper.readValue(nodecustomerSegmentCreate.toString(), CustomerSegmentCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerSegmentCreate);
            }
        } else {
            throw new IllegalArgumentException("'CustomerSegmentCreate' parameter is required");
        }
        return imp.customerSegmentCreateHttp(request, adAccountId, customerSegmentCreate);
    }

    @ApiAction
    public Result customerSegmentList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.customerSegmentListHttp(request, adAccountId, bookmark, pageSize, order, includeSizing, searchQuery);
    }

    @ApiAction
    public Result customerSegmentUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodecustomerSegmentUpdateRequestUpdateWithRequiredBody = request.body().asJson();
        CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody;
        if (nodecustomerSegmentUpdateRequestUpdateWithRequiredBody != null) {
            customerSegmentUpdateRequestUpdateWithRequiredBody = mapper.readValue(nodecustomerSegmentUpdateRequestUpdateWithRequiredBody.toString(), CustomerSegmentUpdateRequestUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerSegmentUpdateRequestUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'CustomerSegmentUpdateRequestUpdateWithRequiredBody' parameter is required");
        }
        return imp.customerSegmentUpdateHttp(request, adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody);
    }

}
