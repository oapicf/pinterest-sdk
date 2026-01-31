package controllers;

import apimodels.AdAccountsSubscriptionsGetList200Response;
import apimodels.LeadSubscription;
import apimodels.LeadSubscriptionPostParamsCreate;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LeadAdsApiController extends Controller {
    private final LeadAdsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LeadAdsApiController(Config configuration, LeadAdsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adAccountsSubscriptionsDelById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        return imp.adAccountsSubscriptionsDelByIdHttp(request, adAccountId, subscriptionId);
    }

    @ApiAction
    public Result adAccountsSubscriptionsGetById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        return imp.adAccountsSubscriptionsGetByIdHttp(request, adAccountId, subscriptionId);
    }

    @ApiAction
    public Result adAccountsSubscriptionsGetList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.adAccountsSubscriptionsGetListHttp(request, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result adAccountsSubscriptionsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeleadSubscriptionPostParamsCreate = request.body().asJson();
        LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate;
        if (nodeleadSubscriptionPostParamsCreate != null) {
            leadSubscriptionPostParamsCreate = mapper.readValue(nodeleadSubscriptionPostParamsCreate.toString(), LeadSubscriptionPostParamsCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(leadSubscriptionPostParamsCreate);
            }
        } else {
            throw new IllegalArgumentException("'LeadSubscriptionPostParamsCreate' parameter is required");
        }
        return imp.adAccountsSubscriptionsPostHttp(request, adAccountId, leadSubscriptionPostParamsCreate);
    }

}
