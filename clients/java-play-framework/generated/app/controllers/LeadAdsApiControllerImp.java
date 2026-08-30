package controllers;

import apimodels.AdAccountsSubscriptionsGetList200Response;
import apimodels.LeadSubscription;
import apimodels.LeadSubscriptionPostParamsCreate;
import apimodels.PinterestLibError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadAdsApiControllerImp extends LeadAdsApiControllerImpInterface {
    @Override
    public LeadSubscription adAccountsSubscriptionsDelById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        //Do your magic!!!
        return new LeadSubscription();
    }

    @Override
    public LeadSubscription adAccountsSubscriptionsGetById(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String subscriptionId) throws Exception {
        //Do your magic!!!
        return new LeadSubscription();
    }

    @Override
    public AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AdAccountsSubscriptionsGetList200Response();
    }

    @Override
    public LeadSubscription adAccountsSubscriptionsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) throws Exception {
        //Do your magic!!!
        return new LeadSubscription();
    }

}
