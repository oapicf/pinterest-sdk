package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.OauthAccessTokenResponse;

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

public class OauthApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OauthApiHandler.class);

    private final OauthApi api;

    public OauthApiHandler(OauthApi api) {
        this.api = api;
    }

    @Deprecated
    public OauthApiHandler() {
        this(new OauthApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("oauthToken").handler(this::oauthToken);
    }

    private void oauthToken(RoutingContext routingContext) {
        logger.info("oauthToken()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        JsonObject formBody = body != null ? body.getJsonObject() : null;

        logger.debug("Parameter formBody is {}", formBody);

        api.oauthToken(formBody)
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
