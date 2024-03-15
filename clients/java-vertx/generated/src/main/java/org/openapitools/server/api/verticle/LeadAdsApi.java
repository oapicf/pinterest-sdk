package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.server.api.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.server.api.model.AdAccountGetSubscriptionResponse;
import org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LeadAdsApi  {
    //ad_accounts_subscriptions/del_by_id
    void adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId, Handler<AsyncResult<Void>> handler);

    //ad_accounts_subscriptions/get_by_id
    void adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId, Handler<AsyncResult<AdAccountGetSubscriptionResponse>> handler);

    //ad_accounts_subscriptions/get_list
    void adAccountsSubscriptionsGetList(String adAccountId, Integer pageSize, String bookmark, Handler<AsyncResult<AdAccountsSubscriptionsGetList200Response>> handler);

    //ad_accounts_subscriptions/post
    void adAccountsSubscriptionsPost(String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest, Handler<AsyncResult<AdAccountCreateSubscriptionResponse>> handler);

}
