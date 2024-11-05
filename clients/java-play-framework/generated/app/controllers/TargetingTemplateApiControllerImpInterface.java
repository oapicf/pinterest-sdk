package controllers;

import apimodels.Error;
import apimodels.TargetingTemplateCreate;
import apimodels.TargetingTemplateGetResponseData;
import apimodels.TargetingTemplateList200Response;
import apimodels.TargetingTemplateUpdateRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class TargetingTemplateApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result targetingTemplateCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateCreate targetingTemplateCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TargetingTemplateGetResponseData obj = targetingTemplateCreate(request, adAccountId, targetingTemplateCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TargetingTemplateGetResponseData targetingTemplateCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateCreate targetingTemplateCreate) throws Exception;

    public Result targetingTemplateListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String order, Boolean includeSizing, String searchQuery,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TargetingTemplateList200Response obj = targetingTemplateList(request, adAccountId, order, includeSizing, searchQuery, pageSize, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TargetingTemplateList200Response targetingTemplateList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String order, Boolean includeSizing, String searchQuery,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception;

    public Result targetingTemplateUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        targetingTemplateUpdate(request, adAccountId, targetingTemplateUpdateRequest);
        return ok();

    }

    public abstract void targetingTemplateUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) throws Exception;

}
