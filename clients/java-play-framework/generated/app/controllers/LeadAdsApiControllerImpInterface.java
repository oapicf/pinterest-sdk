package controllers;

import apimodels.AdAccountsSubscriptionsGetList200Response;
import apimodels.LeadSubscription;
import apimodels.LeadSubscriptionPostParamsCreate;
import apimodels.PinterestLibError;

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
public abstract class LeadAdsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adAccountsSubscriptionsDelByIdHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        adAccountsSubscriptionsDelById(request, adAccountId, subscriptionId);
        return ok();

    }

    public abstract void adAccountsSubscriptionsDelById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception;

    public Result adAccountsSubscriptionsGetByIdHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LeadSubscription obj = adAccountsSubscriptionsGetById(request, adAccountId, subscriptionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LeadSubscription adAccountsSubscriptionsGetById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception;

    public Result adAccountsSubscriptionsGetListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountsSubscriptionsGetList200Response obj = adAccountsSubscriptionsGetList(request, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result adAccountsSubscriptionsPostHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LeadSubscription obj = adAccountsSubscriptionsPost(request, adAccountId, leadSubscriptionPostParamsCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LeadSubscription adAccountsSubscriptionsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) throws Exception;

}
