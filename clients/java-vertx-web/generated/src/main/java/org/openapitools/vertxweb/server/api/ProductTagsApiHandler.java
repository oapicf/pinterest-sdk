package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.ProductTagsBulkAddRequest;
import org.openapitools.vertxweb.server.model.ProductTagsBulkDeleteRequest;
import org.openapitools.vertxweb.server.model.ProductTagsError;
import org.openapitools.vertxweb.server.model.ProductTagsResponse;

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

public class ProductTagsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProductTagsApiHandler.class);

    private final ProductTagsApi api;

    public ProductTagsApiHandler(ProductTagsApi api) {
        this.api = api;
    }

    @Deprecated
    public ProductTagsApiHandler() {
        this(new ProductTagsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("productTagsBulkAdd").handler(this::productTagsBulkAdd);
        builder.operation("productTagsBulkDelete").handler(this::productTagsBulkDelete);
        builder.operation("productTagsList").handler(this::productTagsList);
    }

    private void productTagsBulkAdd(RoutingContext routingContext) {
        logger.info("productTagsBulkAdd()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProductTagsBulkAddRequest productTagsBulkAddRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProductTagsBulkAddRequest>(){}) : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter productTagsBulkAddRequest is {}", productTagsBulkAddRequest);

        api.productTagsBulkAdd(pinId, productTagsBulkAddRequest)
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

    private void productTagsBulkDelete(RoutingContext routingContext) {
        logger.info("productTagsBulkDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProductTagsBulkDeleteRequest>(){}) : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter productTagsBulkDeleteRequest is {}", productTagsBulkDeleteRequest);

        api.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)
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

    private void productTagsList(RoutingContext routingContext) {
        logger.info("productTagsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);

        api.productTagsList(pinId)
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
