package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroup;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.MultipleProductGroupsInner;

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

public class CatalogProductGroupsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CatalogProductGroupsApiHandler.class);

    private final CatalogProductGroupsApi api;

    public CatalogProductGroupsApiHandler(CatalogProductGroupsApi api) {
        this.api = api;
    }

    @Deprecated
    public CatalogProductGroupsApiHandler() {
        this(new CatalogProductGroupsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("catalogsProductGroupPinsList").handler(this::catalogsProductGroupPinsList);
        builder.operation("catalogsProductGroupsCreate").handler(this::catalogsProductGroupsCreate);
        builder.operation("catalogsProductGroupsCreateMany").handler(this::catalogsProductGroupsCreateMany);
        builder.operation("catalogsProductGroupsDelete").handler(this::catalogsProductGroupsDelete);
        builder.operation("catalogsProductGroupsDeleteMany").handler(this::catalogsProductGroupsDeleteMany);
        builder.operation("catalogsProductGroupsGet").handler(this::catalogsProductGroupsGet);
        builder.operation("catalogsProductGroupsList").handler(this::catalogsProductGroupsList);
        builder.operation("catalogsProductGroupsProductCountsGet").handler(this::catalogsProductGroupsProductCountsGet);
        builder.operation("catalogsProductGroupsUpdate").handler(this::catalogsProductGroupsUpdate);
        builder.operation("productsByProductGroupFilterList").handler(this::productsByProductGroupFilterList);
    }

    private void catalogsProductGroupPinsList(RoutingContext routingContext) {
        logger.info("catalogsProductGroupPinsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String productGroupId = requestParameters.pathParameter("product_group_id") != null ? requestParameters.pathParameter("product_group_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean pinMetrics = requestParameters.queryParameter("pin_metrics") != null ? requestParameters.queryParameter("pin_metrics").getBoolean() : false;

        logger.debug("Parameter productGroupId is {}", productGroupId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinMetrics is {}", pinMetrics);

        api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, pinMetrics)
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

    private void catalogsProductGroupsCreate(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        MultipleProductGroupsInner multipleProductGroupsInner = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<MultipleProductGroupsInner>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter multipleProductGroupsInner is {}", multipleProductGroupsInner);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsCreate(multipleProductGroupsInner, adAccountId)
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

    private void catalogsProductGroupsCreateMany(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsCreateMany()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        List<MultipleProductGroupsInner> multipleProductGroupsInner = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<MultipleProductGroupsInner>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter multipleProductGroupsInner is {}", multipleProductGroupsInner);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsCreateMany(multipleProductGroupsInner, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter productGroupId is {}", productGroupId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsDelete(productGroupId, adAccountId)
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

    private void catalogsProductGroupsDeleteMany(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsDeleteMany()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Integer> id = requestParameters.queryParameter("id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("id").get(), new TypeReference<List<Integer>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter id is {}", id);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsDeleteMany(id, adAccountId)
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

    private void catalogsProductGroupsGet(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String productGroupId = requestParameters.pathParameter("product_group_id") != null ? requestParameters.pathParameter("product_group_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter productGroupId is {}", productGroupId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsGet(productGroupId, adAccountId)
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

        List<Integer> id = requestParameters.queryParameter("id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("id").get(), new TypeReference<List<Integer>>(){}) : null;
        String feedId = requestParameters.queryParameter("feed_id") != null ? requestParameters.queryParameter("feed_id").getString() : null;
        String catalogId = requestParameters.queryParameter("catalog_id") != null ? requestParameters.queryParameter("catalog_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter id is {}", id);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsList(id, feedId, catalogId, bookmark, pageSize, adAccountId)
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

    private void catalogsProductGroupsProductCountsGet(RoutingContext routingContext) {
        logger.info("catalogsProductGroupsProductCountsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String productGroupId = requestParameters.pathParameter("product_group_id") != null ? requestParameters.pathParameter("product_group_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter productGroupId is {}", productGroupId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)
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
        CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsProductGroupsUpdateRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter productGroupId is {}", productGroupId);
        logger.debug("Parameter catalogsProductGroupsUpdateRequest is {}", catalogsProductGroupsUpdateRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)
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

    private void productsByProductGroupFilterList(RoutingContext routingContext) {
        logger.info("productsByProductGroupFilterList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsListProductsByFilterRequest>(){}) : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean pinMetrics = requestParameters.queryParameter("pin_metrics") != null ? requestParameters.queryParameter("pin_metrics").getBoolean() : false;

        logger.debug("Parameter catalogsListProductsByFilterRequest is {}", catalogsListProductsByFilterRequest);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinMetrics is {}", pinMetrics);

        api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)
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
