package controllers;

import apimodels.Audience;
import apimodels.AudienceCreateCustomRequest;
import apimodels.AudienceCreateRequest;
import apimodels.AudienceUpdateRequest;
import apimodels.AudiencesList200Response;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudiencesApiController extends Controller {
    private final AudiencesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AudiencesApiController(Config configuration, AudiencesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result audiencesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeaudienceCreateRequest = request.body().asJson();
        AudienceCreateRequest audienceCreateRequest;
        if (nodeaudienceCreateRequest != null) {
            audienceCreateRequest = mapper.readValue(nodeaudienceCreateRequest.toString(), AudienceCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(audienceCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'AudienceCreateRequest' parameter is required");
        }
        return imp.audiencesCreateHttp(request, adAccountId, audienceCreateRequest);
    }

    @ApiAction
    public Result audiencesCreateCustom(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeaudienceCreateCustomRequest = request.body().asJson();
        AudienceCreateCustomRequest audienceCreateCustomRequest;
        if (nodeaudienceCreateCustomRequest != null) {
            audienceCreateCustomRequest = mapper.readValue(nodeaudienceCreateCustomRequest.toString(), AudienceCreateCustomRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(audienceCreateCustomRequest);
            }
        } else {
            throw new IllegalArgumentException("'AudienceCreateCustomRequest' parameter is required");
        }
        return imp.audiencesCreateCustomHttp(request, adAccountId, audienceCreateCustomRequest);
    }

    @ApiAction
    public Result audiencesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId) throws Exception {
        return imp.audiencesGetHttp(request, adAccountId, audienceId);
    }

    @ApiAction
    public Result audiencesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueownershipType = request.getQueryString("ownership_type");
        String ownershipType;
        if (valueownershipType != null) {
            ownershipType = valueownershipType;
        } else {
            ownershipType = "OWNED";
        }
        return imp.audiencesListHttp(request, adAccountId, bookmark, order, pageSize, ownershipType);
    }

    @ApiAction
    public Result audiencesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId) throws Exception {
        JsonNode nodeaudienceUpdateRequest = request.body().asJson();
        AudienceUpdateRequest audienceUpdateRequest;
        if (nodeaudienceUpdateRequest != null) {
            audienceUpdateRequest = mapper.readValue(nodeaudienceUpdateRequest.toString(), AudienceUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(audienceUpdateRequest);
            }
        } else {
            audienceUpdateRequest = null;
        }
        return imp.audiencesUpdateHttp(request, adAccountId, audienceId, audienceUpdateRequest);
    }

}
