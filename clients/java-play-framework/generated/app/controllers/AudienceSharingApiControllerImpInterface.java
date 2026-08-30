package controllers;

import apimodels.AdAccountToAdAccountSharedAudience;
import apimodels.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import apimodels.AdAccountToBusinessSharedAudience;
import apimodels.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import apimodels.AdAccountsAudiencesSharedAccountsList200Response;
import apimodels.AudienceAccountType;
import apimodels.BusinessToAdAccountSharedAudience;
import apimodels.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import apimodels.BusinessToBusinessSharedAudience;
import apimodels.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import apimodels.Order;
import apimodels.PinterestLibError;
import apimodels.SharedAudiencesForBusinessList200Response;

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

    public Result adAccountsAudiencesSharedAccountsListHttp(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudiencesSharedAccountsList200Response obj = adAccountsAudiencesSharedAccountsList(request, audienceId, accountType, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result businessAccountAudiencesSharedAccountsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsAudiencesSharedAccountsList200Response obj = businessAccountAudiencesSharedAccountsList(request, businessId, audienceId, accountType, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result sharedAudiencesForBusinessListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Order order, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SharedAudiencesForBusinessList200Response obj = sharedAudiencesForBusinessList(request, businessId, order, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Order order, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result updateAdAccountToAdAccountSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountToAdAccountSharedAudience obj = updateAdAccountToAdAccountSharedAudience(request, adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody) throws Exception;

    public Result updateAdAccountToBusinessSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountToBusinessSharedAudience obj = updateAdAccountToBusinessSharedAudience(request, adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody) throws Exception;

    public Result updateBusinessToAdAccountSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessToAdAccountSharedAudience obj = updateBusinessToAdAccountSharedAudience(request, businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) throws Exception;

    public Result updateBusinessToBusinessSharedAudienceHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessToBusinessSharedAudience obj = updateBusinessToBusinessSharedAudience(request, businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) throws Exception;

}
