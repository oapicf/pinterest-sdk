package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DetailedError;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.IntegrationLogsRequest;
import org.openapitools.vertxweb.server.model.IntegrationLogsSuccessResponse;
import org.openapitools.vertxweb.server.model.IntegrationMetadata;
import org.openapitools.vertxweb.server.model.IntegrationRecord;
import org.openapitools.vertxweb.server.model.IntegrationRequest;
import org.openapitools.vertxweb.server.model.IntegrationRequestPatch;
import org.openapitools.vertxweb.server.model.IntegrationsGetList200Response;

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

public class IntegrationsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(IntegrationsApiHandler.class);

    private final IntegrationsApi api;

    public IntegrationsApiHandler(IntegrationsApi api) {
        this.api = api;
    }

    @Deprecated
    public IntegrationsApiHandler() {
        this(new IntegrationsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("integrationsCommerceDel").handler(this::integrationsCommerceDel);
        builder.operation("integrationsCommerceGet").handler(this::integrationsCommerceGet);
        builder.operation("integrationsCommercePatch").handler(this::integrationsCommercePatch);
        builder.operation("integrationsCommercePost").handler(this::integrationsCommercePost);
        builder.operation("integrationsGetById").handler(this::integrationsGetById);
        builder.operation("integrationsGetList").handler(this::integrationsGetList);
        builder.operation("integrationsLogsPost").handler(this::integrationsLogsPost);
    }

    private void integrationsCommerceDel(RoutingContext routingContext) {
        logger.info("integrationsCommerceDel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String externalBusinessId = requestParameters.pathParameter("external_business_id") != null ? requestParameters.pathParameter("external_business_id").getString() : null;

        logger.debug("Parameter externalBusinessId is {}", externalBusinessId);

        api.integrationsCommerceDel(externalBusinessId)
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

    private void integrationsCommerceGet(RoutingContext routingContext) {
        logger.info("integrationsCommerceGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String externalBusinessId = requestParameters.pathParameter("external_business_id") != null ? requestParameters.pathParameter("external_business_id").getString() : null;

        logger.debug("Parameter externalBusinessId is {}", externalBusinessId);

        api.integrationsCommerceGet(externalBusinessId)
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

    private void integrationsCommercePatch(RoutingContext routingContext) {
        logger.info("integrationsCommercePatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String externalBusinessId = requestParameters.pathParameter("external_business_id") != null ? requestParameters.pathParameter("external_business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        IntegrationRequestPatch integrationRequestPatch = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<IntegrationRequestPatch>(){}) : null;

        logger.debug("Parameter externalBusinessId is {}", externalBusinessId);
        logger.debug("Parameter integrationRequestPatch is {}", integrationRequestPatch);

        api.integrationsCommercePatch(externalBusinessId, integrationRequestPatch)
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

    private void integrationsCommercePost(RoutingContext routingContext) {
        logger.info("integrationsCommercePost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        IntegrationRequest integrationRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<IntegrationRequest>(){}) : null;

        logger.debug("Parameter integrationRequest is {}", integrationRequest);

        api.integrationsCommercePost(integrationRequest)
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

    private void integrationsGetById(RoutingContext routingContext) {
        logger.info("integrationsGetById()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.integrationsGetById(id)
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

    private void integrationsGetList(RoutingContext routingContext) {
        logger.info("integrationsGetList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.integrationsGetList(bookmark, pageSize)
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

    private void integrationsLogsPost(RoutingContext routingContext) {
        logger.info("integrationsLogsPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        IntegrationLogsRequest integrationLogsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<IntegrationLogsRequest>(){}) : null;

        logger.debug("Parameter integrationLogsRequest is {}", integrationLogsRequest);

        api.integrationsLogsPost(integrationLogsRequest)
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
