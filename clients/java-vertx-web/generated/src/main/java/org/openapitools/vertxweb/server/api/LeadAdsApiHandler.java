package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.vertxweb.server.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.vertxweb.server.model.AdAccountGetSubscriptionResponse;
import org.openapitools.vertxweb.server.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.vertxweb.server.model.Error;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class LeadAdsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(LeadAdsApiHandler.class);

    private final LeadAdsApi api;

    public LeadAdsApiHandler(LeadAdsApi api) {
        this.api = api;
    }

    @Deprecated
    public LeadAdsApiHandler() {
        this(new LeadAdsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adAccountsSubscriptionsDelById").handler(this::adAccountsSubscriptionsDelById);
        builder.operation("adAccountsSubscriptionsGetById").handler(this::adAccountsSubscriptionsGetById);
        builder.operation("adAccountsSubscriptionsGetList").handler(this::adAccountsSubscriptionsGetList);
        builder.operation("adAccountsSubscriptionsPost").handler(this::adAccountsSubscriptionsPost);
    }

    private void adAccountsSubscriptionsDelById(RoutingContext routingContext) {
        logger.info("adAccountsSubscriptionsDelById()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String subscriptionId = requestParameters.pathParameter("subscription_id") != null ? requestParameters.pathParameter("subscription_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter subscriptionId is {}", subscriptionId);

        api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountsSubscriptionsGetById(RoutingContext routingContext) {
        logger.info("adAccountsSubscriptionsGetById()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String subscriptionId = requestParameters.pathParameter("subscription_id") != null ? requestParameters.pathParameter("subscription_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter subscriptionId is {}", subscriptionId);

        api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountsSubscriptionsGetList(RoutingContext routingContext) {
        logger.info("adAccountsSubscriptionsGetList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void adAccountsSubscriptionsPost(RoutingContext routingContext) {
        logger.info("adAccountsSubscriptionsPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdAccountCreateSubscriptionRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adAccountCreateSubscriptionRequest is {}", adAccountCreateSubscriptionRequest);

        api.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
