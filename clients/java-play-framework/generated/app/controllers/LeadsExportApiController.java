package controllers;

import apimodels.LeadsExportResponseData;
import apimodels.LeadsExports;
import apimodels.LeadsExportsCreate;
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
        JsonNode nodeleadsExportsCreate = request.body().asJson();
        LeadsExportsCreate leadsExportsCreate;
        if (nodeleadsExportsCreate != null) {
            leadsExportsCreate = mapper.readValue(nodeleadsExportsCreate.toString(), LeadsExportsCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(leadsExportsCreate);
            }
        } else {
            throw new IllegalArgumentException("'LeadsExportsCreate' parameter is required");
        }
        return imp.leadsExportCreateHttp(request, adAccountId, leadsExportsCreate);
    }

    @ApiAction
    public Result leadsExportGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$")String leadsExportId) throws Exception {
        return imp.leadsExportGetHttp(request, adAccountId, leadsExportId);
    }

}
