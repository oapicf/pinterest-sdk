package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionDeletionRequest;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestCreate;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

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

public class ConversionDeletionRequestsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConversionDeletionRequestsApiHandler.class);

    private final ConversionDeletionRequestsApi api;

    public ConversionDeletionRequestsApiHandler(ConversionDeletionRequestsApi api) {
        this.api = api;
    }

    @Deprecated
    public ConversionDeletionRequestsApiHandler() {
        this(new ConversionDeletionRequestsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("conversionDeletionRequestCreate").handler(this::conversionDeletionRequestCreate);
        builder.operation("conversionDeletionRequestDelete").handler(this::conversionDeletionRequestDelete);
        builder.operation("conversionDeletionRequestGet").handler(this::conversionDeletionRequestGet);
        builder.operation("conversionDeletionRequestList").handler(this::conversionDeletionRequestList);
    }

    private void conversionDeletionRequestCreate(RoutingContext routingContext) {
        logger.info("conversionDeletionRequestCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ConversionDeletionRequestCreate conversionDeletionRequestCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConversionDeletionRequestCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter conversionDeletionRequestCreate is {}", conversionDeletionRequestCreate);

        api.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)
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

    private void conversionDeletionRequestDelete(RoutingContext routingContext) {
        logger.info("conversionDeletionRequestDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String requestId = requestParameters.pathParameter("request_id") != null ? requestParameters.pathParameter("request_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter requestId is {}", requestId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.conversionDeletionRequestDelete(requestId, adAccountId)
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

    private void conversionDeletionRequestGet(RoutingContext routingContext) {
        logger.info("conversionDeletionRequestGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String requestId = requestParameters.pathParameter("request_id") != null ? requestParameters.pathParameter("request_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter requestId is {}", requestId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.conversionDeletionRequestGet(requestId, adAccountId)
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

    private void conversionDeletionRequestList(RoutingContext routingContext) {
        logger.info("conversionDeletionRequestList()");

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

        api.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order)
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
