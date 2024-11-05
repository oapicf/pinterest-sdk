package controllers;

import apimodels.Error;
import apimodels.LeadsExportCreateRequest;
import apimodels.LeadsExportCreateResponse;
import apimodels.LeadsExportResponseData;

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
public class LeadsExportApiController extends Controller {
    private final LeadsExportApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LeadsExportApiController(Config configuration, LeadsExportApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result leadsExportCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeleadsExportCreateRequest = request.body().asJson();
        LeadsExportCreateRequest leadsExportCreateRequest;
        if (nodeleadsExportCreateRequest != null) {
            leadsExportCreateRequest = mapper.readValue(nodeleadsExportCreateRequest.toString(), LeadsExportCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(leadsExportCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'LeadsExportCreateRequest' parameter is required");
        }
        return imp.leadsExportCreateHttp(request, adAccountId, leadsExportCreateRequest);
    }

    @ApiAction
    public Result leadsExportGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$")String leadsExportId) throws Exception {
        return imp.leadsExportGetHttp(request, adAccountId, leadsExportId);
    }

}
