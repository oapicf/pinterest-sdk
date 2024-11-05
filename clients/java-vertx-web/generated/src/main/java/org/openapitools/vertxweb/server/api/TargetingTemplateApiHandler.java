package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.TargetingTemplateCreate;
import org.openapitools.vertxweb.server.model.TargetingTemplateGetResponseData;
import org.openapitools.vertxweb.server.model.TargetingTemplateList200Response;
import org.openapitools.vertxweb.server.model.TargetingTemplateUpdateRequest;

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

public class TargetingTemplateApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(TargetingTemplateApiHandler.class);

    private final TargetingTemplateApi api;

    public TargetingTemplateApiHandler(TargetingTemplateApi api) {
        this.api = api;
    }

    @Deprecated
    public TargetingTemplateApiHandler() {
        this(new TargetingTemplateApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("targetingTemplateCreate").handler(this::targetingTemplateCreate);
        builder.operation("targetingTemplateList").handler(this::targetingTemplateList);
        builder.operation("targetingTemplateUpdate").handler(this::targetingTemplateUpdate);
    }

    private void targetingTemplateCreate(RoutingContext routingContext) {
        logger.info("targetingTemplateCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        TargetingTemplateCreate targetingTemplateCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<TargetingTemplateCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter targetingTemplateCreate is {}", targetingTemplateCreate);

        api.targetingTemplateCreate(adAccountId, targetingTemplateCreate)
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

    private void targetingTemplateList(RoutingContext routingContext) {
        logger.info("targetingTemplateList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        Boolean includeSizing = requestParameters.queryParameter("include_sizing") != null ? requestParameters.queryParameter("include_sizing").getBoolean() : false;
        String searchQuery = requestParameters.queryParameter("search_query") != null ? requestParameters.queryParameter("search_query").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter includeSizing is {}", includeSizing);
        logger.debug("Parameter searchQuery is {}", searchQuery);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)
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

    private void targetingTemplateUpdate(RoutingContext routingContext) {
        logger.info("targetingTemplateUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<TargetingTemplateUpdateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter targetingTemplateUpdateRequest is {}", targetingTemplateUpdateRequest);

        api.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)
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
