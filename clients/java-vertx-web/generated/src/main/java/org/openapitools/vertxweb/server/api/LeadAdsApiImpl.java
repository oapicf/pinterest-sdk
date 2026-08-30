package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.vertxweb.server.model.LeadSubscription;
import org.openapitools.vertxweb.server.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LeadAdsApiImpl implements LeadAdsApi {
    public Future<ApiResponse<LeadSubscription>> adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadSubscription>> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsSubscriptionsGetList200Response>> adAccountsSubscriptionsGetList(String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadSubscription>> adAccountsSubscriptionsPost(String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) {
        return Future.failedFuture(new HttpException(501));
    }

}
