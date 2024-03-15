package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionApiResponse;
import org.openapitools.vertxweb.server.model.ConversionEvents;
import org.openapitools.vertxweb.server.model.DetailedError;
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

public class ConversionEventsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConversionEventsApiHandler.class);

    private final ConversionEventsApi api;

    public ConversionEventsApiHandler(ConversionEventsApi api) {
        this.api = api;
    }

    @Deprecated
    public ConversionEventsApiHandler() {
        this(new ConversionEventsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("eventsCreate").handler(this::eventsCreate);
    }

    private void eventsCreate(RoutingContext routingContext) {
        logger.info("eventsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ConversionEvents conversionEvents = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConversionEvents>(){}) : null;
        Boolean test = requestParameters.queryParameter("test") != null ? requestParameters.queryParameter("test").getBoolean() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter conversionEvents is {}", conversionEvents);
        logger.debug("Parameter test is {}", test);

        api.eventsCreate(adAccountId, conversionEvents, test)
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
