package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedsCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsFeedsUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsItems;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroup;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Paginated;

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

public class CatalogsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CatalogsApiHandler.class);

    private final CatalogsApi api;

    public CatalogsApiHandler(CatalogsApi api) {
        this.api = api;
    }

    @Deprecated
    public CatalogsApiHandler() {
        this(new CatalogsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("catalogsProductGroupsCreate").handler(this::catalogsProductGroupsCreate);
        builder.operation("catalogsProductGroupsDelete").handler(this::catalogsProductGroupsDelete);
        builder.operation("catalogsProductGroupsList").handler(this::catalogsProductGroupsList);
        builder.operation("catalogsProductGroupsUpdate").handler(this::catalogsProductGroupsUpdate);
        builder.operation("feedProcessingResultsList").handler(this::feedProcessingResultsList);
        builder.operation("feedsCreate").handler(this::feedsCreate);
        builder.operation("feedsDelete").handler(this::feedsDelete);
        builder.operation("feedsGet").handler(this::feedsGet);
        builder.operation("feedsList").handler(this::feedsList);
        builder.operation("feedsUpdate").handler(this::feedsUpdate);
        builder.operation("itemsBatchGet").handler(this::itemsBatchGet);
        builder.operation("itemsBatchPost").handler(this::itemsBatchPost);
        builder.operation("itemsGet").handler(this::itemsGet);
    }

    private void catalogsProductGroupsCreate(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsProductGroupCreateRequest>(){}) : null;

        logger.debug("Parameter catalogsProductGroupCreateRequest is {}", catalogsProductGroupCreateRequest);

        api.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest)
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

    private void catalogsProductGroupsDelete(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String productGroupId = requestParameters.pathParameter("product_group_id") != null ? requestParameters.pathParameter("product_group_id").getString() : null;

        logger.debug("Parameter productGroupId is {}", productGroupId);

        api.catalogsProductGroupsDelete(productGroupId)
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

    private void catalogsProductGroupsList(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.queryParameter("feed_id") != null ? requestParameters.queryParameter("feed_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.catalogsProductGroupsList(feedId, bookmark, pageSize)
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

    private void catalogsProductGroupsUpdate(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String productGroupId = requestParameters.pathParameter("product_group_id") != null ? requestParameters.pathParameter("product_group_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsProductGroupUpdateRequest>(){}) : null;

        logger.debug("Parameter productGroupId is {}", productGroupId);
        logger.debug("Parameter catalogsProductGroupUpdateRequest is {}", catalogsProductGroupUpdateRequest);

        api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest)
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

    private void feedProcessingResultsList(RoutingContext routingContext) {
        logger.info("feedProcessingResultsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.feedProcessingResultsList(feedId, bookmark, pageSize)
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

    private void feedsCreate(RoutingContext routingContext) {
        logger.info("feedsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogsFeedsCreateRequest catalogsFeedsCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsFeedsCreateRequest>(){}) : null;

        logger.debug("Parameter catalogsFeedsCreateRequest is {}", catalogsFeedsCreateRequest);

        api.feedsCreate(catalogsFeedsCreateRequest)
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

    private void feedsDelete(RoutingContext routingContext) {
        logger.info("feedsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);

        api.feedsDelete(feedId)
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

    private void feedsGet(RoutingContext routingContext) {
        logger.info("feedsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);

        api.feedsGet(feedId)
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

    private void feedsList(RoutingContext routingContext) {
        logger.info("feedsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.feedsList(bookmark, pageSize)
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

    private void feedsUpdate(RoutingContext routingContext) {
        logger.info("feedsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsFeedsUpdateRequest>(){}) : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter catalogsFeedsUpdateRequest is {}", catalogsFeedsUpdateRequest);

        api.feedsUpdate(feedId, catalogsFeedsUpdateRequest)
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

    private void itemsBatchGet(RoutingContext routingContext) {
        logger.info("itemsBatchGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;

        logger.debug("Parameter batchId is {}", batchId);

        api.itemsBatchGet(batchId)
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
        CatalogsItemsBatchRequest catalogsItemsBatchRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsItemsBatchRequest>(){}) : null;

        logger.debug("Parameter catalogsItemsBatchRequest is {}", catalogsItemsBatchRequest);

        api.itemsBatchPost(catalogsItemsBatchRequest)
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

    private void itemsGet(RoutingContext routingContext) {
        logger.info("itemsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String country = requestParameters.queryParameter("country") != null ? requestParameters.queryParameter("country").getString() : null;
        List<String> itemIds = requestParameters.queryParameter("item_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("item_ids").get(), new TypeReference<List<String>>(){}) : null;
        String language = requestParameters.queryParameter("language") != null ? requestParameters.queryParameter("language").getString() : null;

        logger.debug("Parameter country is {}", country);
        logger.debug("Parameter itemIds is {}", itemIds);
        logger.debug("Parameter language is {}", language);

        api.itemsGet(country, itemIds, language)
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
