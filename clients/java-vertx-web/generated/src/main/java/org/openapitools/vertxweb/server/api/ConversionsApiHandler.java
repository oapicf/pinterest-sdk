package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsResponse;
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

public class ConversionsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConversionsApiHandler.class);

    private final ConversionsApi api;

    public ConversionsApiHandler(ConversionsApi api) {
        this.api = api;
    }

    @Deprecated
    public ConversionsApiHandler() {
        this(new ConversionsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("advertiserDefinedEventsGet").handler(this::advertiserDefinedEventsGet);
    }

    private void advertiserDefinedEventsGet(RoutingContext routingContext) {
        logger.info("advertiserDefinedEventsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.advertiserDefinedEventsGet(adAccountId)
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
