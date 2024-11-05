package controllers;

import apimodels.AdAccountsAudiencesSharedAccountsList200Response;
import apimodels.AudienceAccountType;
import apimodels.AudiencesList200Response;
import apimodels.BusinessSharedAudience;
import apimodels.BusinessSharedAudienceResponse;
import apimodels.Error;
import apimodels.SharedAudience;
import apimodels.SharedAudienceResponse;

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
public abstract class AudienceSharingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adAccountsAudiencesSharedAccountsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudiencesSharedAccountsList200Response obj = adAccountsAudiencesSharedAccountsList(request, adAccountId, audienceId, accountType, pageSize, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception;

    public Result businessAccountAudiencesSharedAccountsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudiencesSharedAccountsList200Response obj = businessAccountAudiencesSharedAccountsList(request, businessId, audienceId, accountType, pageSize, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception;

    public Result sharedAudiencesForBusinessListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, String bookmark, String order,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AudiencesList200Response obj = sharedAudiencesForBusinessList(request, businessId, bookmark, order, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudiencesList200Response sharedAudiencesForBusinessList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, String bookmark, String order,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result updateAdAccountToAdAccountSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SharedAudience sharedAudience) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SharedAudienceResponse obj = updateAdAccountToAdAccountSharedAudience(request, adAccountId, sharedAudience);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SharedAudience sharedAudience) throws Exception;

    public Result updateAdAccountToBusinessSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BusinessSharedAudience businessSharedAudience) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessSharedAudienceResponse obj = updateAdAccountToBusinessSharedAudience(request, adAccountId, businessSharedAudience);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BusinessSharedAudience businessSharedAudience) throws Exception;

    public Result updateBusinessToAdAccountSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, SharedAudience sharedAudience) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SharedAudienceResponse obj = updateBusinessToAdAccountSharedAudience(request, businessId, sharedAudience);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SharedAudienceResponse updateBusinessToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, SharedAudience sharedAudience) throws Exception;

    public Result updateBusinessToBusinessSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessSharedAudience businessSharedAudience) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessSharedAudienceResponse obj = updateBusinessToBusinessSharedAudience(request, businessId, businessSharedAudience);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessSharedAudience businessSharedAudience) throws Exception;

}
