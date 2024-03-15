package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.vertxweb.server.model.AdAccountGetSubscriptionResponse;
import org.openapitools.vertxweb.server.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface LeadAdsApi  {
    Future<ApiResponse<Void>> adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId);
    Future<ApiResponse<AdAccountGetSubscriptionResponse>> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId);
    Future<ApiResponse<AdAccountsSubscriptionsGetList200Response>> adAccountsSubscriptionsGetList(String adAccountId, Integer pageSize, String bookmark);
    Future<ApiResponse<AdAccountCreateSubscriptionResponse>> adAccountsSubscriptionsPost(String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest);
}
