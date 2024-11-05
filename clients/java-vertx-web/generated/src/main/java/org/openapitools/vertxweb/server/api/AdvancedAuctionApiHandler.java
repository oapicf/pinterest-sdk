package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvancedAuctionItems;
import org.openapitools.vertxweb.server.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.vertxweb.server.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.vertxweb.server.model.AdvancedAuctionProcessedItems;
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

public class AdvancedAuctionApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AdvancedAuctionApiHandler.class);

    private final AdvancedAuctionApi api;

    public AdvancedAuctionApiHandler(AdvancedAuctionApi api) {
        this.api = api;
    }

    @Deprecated
    public AdvancedAuctionApiHandler() {
        this(new AdvancedAuctionApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("advancedAuctionItemsGetPost").handler(this::advancedAuctionItemsGetPost);
        builder.operation("advancedAuctionItemsSubmitPost").handler(this::advancedAuctionItemsSubmitPost);
    }

    private void advancedAuctionItemsGetPost(RoutingContext routingContext) {
        logger.info("advancedAuctionItemsGetPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdvancedAuctionItemsGetRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter advancedAuctionItemsGetRequest is {}", advancedAuctionItemsGetRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)
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

    private void advancedAuctionItemsSubmitPost(RoutingContext routingContext) {
        logger.info("advancedAuctionItemsSubmitPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdvancedAuctionItemsSubmitRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter advancedAuctionItemsSubmitRequest is {}", advancedAuctionItemsSubmitRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)
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
