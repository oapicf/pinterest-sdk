package controllers;

import apimodels.Audience;
import apimodels.AudienceCreateCustomRequest;
import apimodels.AudienceCreateRequest;
import apimodels.AudienceUpdateRequest;
import apimodels.AudiencesList200Response;
import apimodels.Error;

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
public abstract class AudiencesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result audiencesCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AudienceCreateRequest audienceCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Audience obj = audiencesCreate(request, adAccountId, audienceCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Audience audiencesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AudienceCreateRequest audienceCreateRequest) throws Exception;

    public Result audiencesCreateCustomHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Audience obj = audiencesCreateCustom(request, adAccountId, audienceCreateCustomRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Audience audiencesCreateCustom(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest) throws Exception;

    public Result audiencesGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Audience obj = audiencesGet(request, adAccountId, audienceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Audience audiencesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId) throws Exception;

    public Result audiencesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark, String order,  @Min(1) @Max(250)Integer pageSize, String ownershipType) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AudiencesList200Response obj = audiencesList(request, adAccountId, bookmark, order, pageSize, ownershipType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudiencesList200Response audiencesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark, String order,  @Min(1) @Max(250)Integer pageSize, String ownershipType) throws Exception;

    public Result audiencesUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, AudienceUpdateRequest audienceUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Audience obj = audiencesUpdate(request, adAccountId, audienceId, audienceUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Audience audiencesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, AudienceUpdateRequest audienceUpdateRequest) throws Exception;

}
