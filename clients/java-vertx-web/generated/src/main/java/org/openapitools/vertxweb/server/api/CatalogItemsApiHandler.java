package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatchPostRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequest;
import org.openapitools.vertxweb.server.model.ItemsPost200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

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

public class CatalogItemsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CatalogItemsApiHandler.class);

    private final CatalogItemsApi api;

    public CatalogItemsApiHandler(CatalogItemsApi api) {
        this.api = api;
    }

    @Deprecated
    public CatalogItemsApiHandler() {
        this(new CatalogItemsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("itemsBatchGet").handler(this::itemsBatchGet);
        builder.operation("itemsBatchPost").handler(this::itemsBatchPost);
        builder.operation("itemsPost").handler(this::itemsPost);
    }

    private void itemsBatchGet(RoutingContext routingContext) {
        logger.info("itemsBatchGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter batchId is {}", batchId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.itemsBatchGet(batchId, adAccountId)
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

    private void itemsBatchPost(RoutingContext routingContext) {
        logger.info("itemsBatchPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsItemsBatchPostRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogsItemsBatchPostRequest is {}", catalogsItemsBatchPostRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)
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

    private void itemsPost(RoutingContext routingContext) {
        logger.info("itemsPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogsItemsRequest catalogsItemsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsItemsRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogsItemsRequest is {}", catalogsItemsRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.itemsPost(catalogsItemsRequest, adAccountId)
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
