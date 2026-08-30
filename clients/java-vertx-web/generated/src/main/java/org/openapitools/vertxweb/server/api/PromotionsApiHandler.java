package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.Promotion;
import org.openapitools.vertxweb.server.model.PromotionBatchUpdate;
import org.openapitools.vertxweb.server.model.PromotionCreate;
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
        List<PromotionCreate> promotionCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<PromotionCreate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionCreate is {}", promotionCreate);

        api.promotionsCreate(adAccountId, promotionCreate)
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

        String promotionId = requestParameters.pathParameter("promotion_id") != null ? requestParameters.pathParameter("promotion_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter promotionId is {}", promotionId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.promotionsDelete(promotionId, adAccountId)
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

        String promotionId = requestParameters.pathParameter("promotion_id") != null ? requestParameters.pathParameter("promotion_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter promotionId is {}", promotionId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.promotionsGet(promotionId, adAccountId)
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
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);

        api.promotionsList(adAccountId, bookmark, pageSize, order)
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
        List<PromotionBatchUpdate> promotionBatchUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<PromotionBatchUpdate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter promotionBatchUpdate is {}", promotionBatchUpdate);

        api.promotionsUpdate(adAccountId, promotionBatchUpdate)
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
