package controllers;

import apimodels.AdAccountsAudience;
import apimodels.AdAccountsAudienceCreate;
import apimodels.AdAccountsAudienceUpdate;
import apimodels.AudienceOwnershipType;
import apimodels.AudiencesList200Response;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;

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

    public Result audiencesCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudience obj = audiencesCreate(request, adAccountId, adAccountsAudienceCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudience audiencesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate) throws Exception;

    public Result audiencesGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudience obj = audiencesGet(request, audienceId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudience audiencesGet(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result audiencesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, Boolean excludeNca) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AudiencesList200Response obj = audiencesList(request, adAccountId, bookmark, pageSize, order, ownershipType, excludeNca);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudiencesList200Response audiencesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, Boolean excludeNca) throws Exception;

    public Result audiencesUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudience obj = audiencesUpdate(request, audienceId, adAccountId, adAccountsAudienceUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudience audiencesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate) throws Exception;

}
