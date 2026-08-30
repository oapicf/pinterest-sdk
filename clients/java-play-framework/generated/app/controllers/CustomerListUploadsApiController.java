package controllers;

import apimodels.CustomerListUpload;
import apimodels.CustomerListUploadCreateRequest;
import apimodels.CustomerListUploadCreateResponse;
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
public class CustomerListUploadsApiController extends Controller {
    private final CustomerListUploadsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CustomerListUploadsApiController(Config configuration, CustomerListUploadsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result customerListUploadsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        JsonNode nodecustomerListUploadCreateRequest = request.body().asJson();
        CustomerListUploadCreateRequest customerListUploadCreateRequest;
        if (nodecustomerListUploadCreateRequest != null) {
            customerListUploadCreateRequest = mapper.readValue(nodecustomerListUploadCreateRequest.toString(), CustomerListUploadCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(customerListUploadCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CustomerListUploadCreateRequest' parameter is required");
        }
        return imp.customerListUploadsCreateHttp(request, adAccountId, customerListId, customerListUploadCreateRequest);
    }

    @ApiAction
    public Result customerListUploadsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId, @Pattern(regexp="^\\d+$")String customerListUploadId) throws Exception {
        return imp.customerListUploadsGetHttp(request, adAccountId, customerListId, customerListUploadId);
    }

    @ApiAction
    public Result customerListUploadsRun(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId, @Pattern(regexp="^\\d+$")String customerListUploadId) throws Exception {
        return imp.customerListUploadsRunHttp(request, adAccountId, customerListId, customerListUploadId);
    }

}
