package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsLocalStoresCreate200ResponseInner;
import org.openapitools.vertxweb.server.model.CatalogsLocalStoresDelete200ResponseInner;
import org.openapitools.vertxweb.server.model.CatalogsLocalStoresList200Response;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsBatch;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsBatchCreate;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsGet;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsGetCreate;
import org.openapitools.vertxweb.server.model.LocalStore;
import org.openapitools.vertxweb.server.model.LocalStoreBatchUpdate;
import org.openapitools.vertxweb.server.model.LocalStoreCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SupplementalItemsBatchResponse;

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

public class CatalogSupplementalApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CatalogSupplementalApiHandler.class);

    private final CatalogSupplementalApi api;

    public CatalogSupplementalApiHandler(CatalogSupplementalApi api) {
        this.api = api;
    }

    @Deprecated
    public CatalogSupplementalApiHandler() {
        this(new CatalogSupplementalApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("catalogsLocalInventoryItemsBatchOperate").handler(this::catalogsLocalInventoryItemsBatchOperate);
        builder.operation("catalogsLocalInventoryItemsPost").handler(this::catalogsLocalInventoryItemsPost);
        builder.operation("catalogsLocalStoresCreate").handler(this::catalogsLocalStoresCreate);
        builder.operation("catalogsLocalStoresDelete").handler(this::catalogsLocalStoresDelete);
        builder.operation("catalogsLocalStoresList").handler(this::catalogsLocalStoresList);
        builder.operation("catalogsLocalStoresUpdate").handler(this::catalogsLocalStoresUpdate);
        builder.operation("catalogsSupplementalItemsBatchGet").handler(this::catalogsSupplementalItemsBatchGet);
    }

    private void catalogsLocalInventoryItemsBatchOperate(RoutingContext routingContext) {
        logger.info("catalogsLocalInventoryItemsBatchOperate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        RequestParameter body = requestParameters.body();
        LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<LocalInventoryItemsBatchCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter localInventoryItemsBatchCreate is {}", localInventoryItemsBatchCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)
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

    private void catalogsLocalInventoryItemsPost(RoutingContext routingContext) {
        logger.info("catalogsLocalInventoryItemsPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        RequestParameter body = requestParameters.body();
        LocalInventoryItemsGetCreate localInventoryItemsGetCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<LocalInventoryItemsGetCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter localInventoryItemsGetCreate is {}", localInventoryItemsGetCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)
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

    private void catalogsLocalStoresCreate(RoutingContext routingContext) {
        logger.info("catalogsLocalStoresCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<LocalStoreCreate> localStoreCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<LocalStoreCreate>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter localStoreCreate is {}", localStoreCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)
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

    private void catalogsLocalStoresDelete(RoutingContext routingContext) {
        logger.info("catalogsLocalStoresDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        List<String> ids = requestParameters.queryParameter("ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ids").get(), new TypeReference<List<String>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter ids is {}", ids);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsLocalStoresDelete(catalogId, ids, adAccountId)
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

    private void catalogsLocalStoresList(RoutingContext routingContext) {
        logger.info("catalogsLocalStoresList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        List<String> ids = requestParameters.queryParameter("ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ids").get(), new TypeReference<List<String>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter ids is {}", ids);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)
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

    private void catalogsLocalStoresUpdate(RoutingContext routingContext) {
        logger.info("catalogsLocalStoresUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<LocalStoreBatchUpdate> localStoreBatchUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<LocalStoreBatchUpdate>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter localStoreBatchUpdate is {}", localStoreBatchUpdate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)
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

    private void catalogsSupplementalItemsBatchGet(RoutingContext routingContext) {
        logger.info("catalogsSupplementalItemsBatchGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.pathParameter("catalog_id") != null ? requestParameters.pathParameter("catalog_id").getString() : null;
        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter batchId is {}", batchId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)
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
