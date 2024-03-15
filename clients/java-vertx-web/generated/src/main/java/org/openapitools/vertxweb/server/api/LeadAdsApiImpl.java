package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.vertxweb.server.model.AdAccountGetSubscriptionResponse;
import org.openapitools.vertxweb.server.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LeadAdsApiImpl implements LeadAdsApi {
    public Future<ApiResponse<Void>> adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountGetSubscriptionResponse>> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsSubscriptionsGetList200Response>> adAccountsSubscriptionsGetList(String adAccountId, Integer pageSize, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountCreateSubscriptionResponse>> adAccountsSubscriptionsPost(String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
