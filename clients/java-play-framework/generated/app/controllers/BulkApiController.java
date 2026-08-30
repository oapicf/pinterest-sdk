package controllers;

import apimodels.BulkDownload;
import apimodels.BulkDownloadCreate;
import apimodels.BulkJobData;
import apimodels.BulkUpsertRequest;
import apimodels.BulkUpsertResponse;
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
public class BulkApiController extends Controller {
    private final BulkApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BulkApiController(Config configuration, BulkApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result bulkDownloadCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodebulkDownloadCreate = request.body().asJson();
        BulkDownloadCreate bulkDownloadCreate;
        if (nodebulkDownloadCreate != null) {
            bulkDownloadCreate = mapper.readValue(nodebulkDownloadCreate.toString(), BulkDownloadCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(bulkDownloadCreate);
            }
        } else {
            throw new IllegalArgumentException("'BulkDownloadCreate' parameter is required");
        }
        return imp.bulkDownloadCreateHttp(request, adAccountId, bulkDownloadCreate);
    }

    @ApiAction
    public Result bulkRequestGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bulkRequestId) throws Exception {
        String valueincludeDetails = request.getQueryString("include_details");
        Boolean includeDetails;
        if (valueincludeDetails != null) {
            includeDetails = Boolean.valueOf(valueincludeDetails);
        } else {
            includeDetails = false;
        }
        return imp.bulkRequestGetHttp(request, adAccountId, bulkRequestId, includeDetails);
    }

    @ApiAction
    public Result bulkUpsertCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodebulkUpsertRequest = request.body().asJson();
        BulkUpsertRequest bulkUpsertRequest;
        if (nodebulkUpsertRequest != null) {
            bulkUpsertRequest = mapper.readValue(nodebulkUpsertRequest.toString(), BulkUpsertRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(bulkUpsertRequest);
            }
        } else {
            throw new IllegalArgumentException("'BulkUpsertRequest' parameter is required");
        }
        return imp.bulkUpsertCreateHttp(request, adAccountId, bulkUpsertRequest);
    }

}
