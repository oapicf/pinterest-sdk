package controllers;

import apimodels.AdAccountCreateSubscriptionRequest;
import apimodels.AdAccountCreateSubscriptionResponse;
import apimodels.AdAccountGetSubscriptionResponse;
import apimodels.AdAccountsSubscriptionsGetList200Response;
import apimodels.Error;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadAdsApiControllerImp extends LeadAdsApiControllerImpInterface {
    @Override
    public void adAccountsSubscriptionsDelById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public AdAccountGetSubscriptionResponse adAccountsSubscriptionsGetById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        //Do your magic!!!
        return new AdAccountGetSubscriptionResponse();
    }

    @Override
    public AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new AdAccountsSubscriptionsGetList200Response();
    }

    @Override
    public AdAccountCreateSubscriptionResponse adAccountsSubscriptionsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest) throws Exception {
        //Do your magic!!!
        return new AdAccountCreateSubscriptionResponse();
    }

}
