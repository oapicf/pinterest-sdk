package controllers;

import apimodels.AdAccountsAudience;
import apimodels.AdAccountsAudienceCreate;
import apimodels.AdAccountsAudienceUpdate;
import apimodels.AudienceOwnershipType;
import apimodels.AudiencesList200Response;
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
        JsonNode nodeadAccountsAudienceCreate = request.body().asJson();
        AdAccountsAudienceCreate adAccountsAudienceCreate;
        if (nodeadAccountsAudienceCreate != null) {
            adAccountsAudienceCreate = mapper.readValue(nodeadAccountsAudienceCreate.toString(), AdAccountsAudienceCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adAccountsAudienceCreate);
            }
        } else {
            throw new IllegalArgumentException("'AdAccountsAudienceCreate' parameter is required");
        }
        return imp.audiencesCreateHttp(request, adAccountId, adAccountsAudienceCreate);
    }

    @ApiAction
    public Result audiencesGet(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.audiencesGetHttp(request, audienceId, adAccountId);
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
        String valueownershipType = request.getQueryString("ownership_type");
        AudienceOwnershipType ownershipType;
        if (valueownershipType != null) {
            ownershipType = valueownershipType;
        } else {
            ownershipType = null;
        }
        String valueexcludeNca = request.getQueryString("exclude_nca");
        Boolean excludeNca;
        if (valueexcludeNca != null) {
            excludeNca = Boolean.valueOf(valueexcludeNca);
        } else {
            excludeNca = false;
        }
        return imp.audiencesListHttp(request, adAccountId, bookmark, pageSize, order, ownershipType, excludeNca);
    }

    @ApiAction
    public Result audiencesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadAccountsAudienceUpdate = request.body().asJson();
        AdAccountsAudienceUpdate adAccountsAudienceUpdate;
        if (nodeadAccountsAudienceUpdate != null) {
            adAccountsAudienceUpdate = mapper.readValue(nodeadAccountsAudienceUpdate.toString(), AdAccountsAudienceUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adAccountsAudienceUpdate);
            }
        } else {
            throw new IllegalArgumentException("'AdAccountsAudienceUpdate' parameter is required");
        }
        return imp.audiencesUpdateHttp(request, audienceId, adAccountId, adAccountsAudienceUpdate);
    }

}
