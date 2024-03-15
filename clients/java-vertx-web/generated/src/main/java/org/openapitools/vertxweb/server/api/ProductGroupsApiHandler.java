package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsCatalogsProductGroupsList200Response;
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

public class ProductGroupsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProductGroupsApiHandler.class);

    private final ProductGroupsApi api;

    public ProductGroupsApiHandler(ProductGroupsApi api) {
        this.api = api;
    }

    @Deprecated
    public ProductGroupsApiHandler() {
        this(new ProductGroupsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adAccountsCatalogsProductGroupsList").handler(this::adAccountsCatalogsProductGroupsList);
    }

    private void adAccountsCatalogsProductGroupsList(RoutingContext routingContext) {
        logger.info("adAccountsCatalogsProductGroupsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String feedProfileId = requestParameters.queryParameter("feed_profile_id") != null ? requestParameters.queryParameter("feed_profile_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter feedProfileId is {}", feedProfileId);

        api.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId)
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
