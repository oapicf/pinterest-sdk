package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PromotionCreateRequest;
import org.openapitools.vertxweb.server.model.PromotionResponse;
import org.openapitools.vertxweb.server.model.PromotionUpdateRequest;
import org.openapitools.vertxweb.server.model.PromotionsList200Response;
import org.openapitools.vertxweb.server.model.PromotionsResponse;

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

public class PromotionsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(PromotionsApiHandler.class);

    private final PromotionsApi api;

    public PromotionsApiHandler(PromotionsApi api) {
        this.api = api;
    }

    @Deprecated
    public PromotionsApiHandler() {
        this(new PromotionsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("promotionsCreate").handler(this::promotionsCreate);
        builder.operation("promotionsDelete").handler(this::promotionsDelete);
        builder.operation("promotionsGet").handler(this::promotionsGet);
        builder.operation("promotionsList").handler(this::promotionsList);
        builder.operation("promotionsUpdate").handler(this::promotionsUpdate);
    }

    private void promotionsCreate(RoutingContext routingContext) {
        logger.info("promotionsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<PromotionCreateRequest> promotionCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<PromotionCreateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionCreateRequest is {}", promotionCreateRequest);

        api.promotionsCreate(adAccountId, promotionCreateRequest)
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

    private void promotionsDelete(RoutingContext routingContext) {
        logger.info("promotionsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String promotionId = requestParameters.pathParameter("promotion_id") != null ? requestParameters.pathParameter("promotion_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionId is {}", promotionId);

        api.promotionsDelete(adAccountId, promotionId)
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

    private void promotionsGet(RoutingContext routingContext) {
        logger.info("promotionsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String promotionId = requestParameters.pathParameter("promotion_id") != null ? requestParameters.pathParameter("promotion_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionId is {}", promotionId);

        api.promotionsGet(adAccountId, promotionId)
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

    private void promotionsList(RoutingContext routingContext) {
        logger.info("promotionsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.promotionsList(adAccountId, pageSize, order, bookmark)
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

    private void promotionsUpdate(RoutingContext routingContext) {
        logger.info("promotionsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<PromotionUpdateRequest> promotionUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<PromotionUpdateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionUpdateRequest is {}", promotionUpdateRequest);

        api.promotionsUpdate(adAccountId, promotionUpdateRequest)
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
