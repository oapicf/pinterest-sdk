package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.vertxweb.server.model.LeadSubscription;
import org.openapitools.vertxweb.server.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface LeadAdsApi  {
    Future<ApiResponse<LeadSubscription>> adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId);
    Future<ApiResponse<LeadSubscription>> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId);
    Future<ApiResponse<AdAccountsSubscriptionsGetList200Response>> adAccountsSubscriptionsGetList(String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<LeadSubscription>> adAccountsSubscriptionsPost(String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate);
}
