package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Catalog;
import org.openapitools.vertxweb.server.model.CatalogCreate;
import org.openapitools.vertxweb.server.model.CatalogsAvailableFilterValues;
import org.openapitools.vertxweb.server.model.CatalogsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsLocale;
import org.openapitools.vertxweb.server.model.Country;
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
        builder.operation("catalogsAvailableFilterValues").handler(this::catalogsAvailableFilterValues);
        builder.operation("catalogsCreate").handler(this::catalogsCreate);
        builder.operation("catalogsList").handler(this::catalogsList);
    }

    private void catalogsAvailableFilterValues(RoutingContext routingContext) {
        logger.info("catalogsAvailableFilterValues()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String catalogId = requestParameters.queryParameter("catalog_id") != null ? requestParameters.queryParameter("catalog_id").getString() : null;
        String feedId = requestParameters.queryParameter("feed_id") != null ? requestParameters.queryParameter("feed_id").getString() : null;
        Country country = requestParameters.queryParameter("country") != null ? requestParameters.queryParameter("country").getCountry() : null;
        CatalogsLocale language = requestParameters.queryParameter("language") != null ? requestParameters.queryParameter("language").getCatalogsLocale() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter country is {}", country);
        logger.debug("Parameter language is {}", language);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId)
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

    private void catalogsCreate(RoutingContext routingContext) {
        logger.info("catalogsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogCreate catalogCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogCreate is {}", catalogCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.catalogsCreate(catalogCreate, adAccountId)
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

    private void catalogsList(RoutingContext routingContext) {
        logger.info("catalogsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.catalogsList(adAccountId, bookmark, pageSize)
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
