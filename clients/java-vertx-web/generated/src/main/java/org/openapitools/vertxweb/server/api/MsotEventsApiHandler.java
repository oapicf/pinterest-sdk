package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionMSOTEventsCreate;
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

public class MsotEventsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(MsotEventsApiHandler.class);

    private final MsotEventsApi api;

    public MsotEventsApiHandler(MsotEventsApi api) {
        this.api = api;
    }

    @Deprecated
    public MsotEventsApiHandler() {
        this(new MsotEventsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("msotEventsCreate").handler(this::msotEventsCreate);
    }

    private void msotEventsCreate(RoutingContext routingContext) {
        logger.info("msotEventsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ConversionMSOTEventsCreate conversionMSOTEventsCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConversionMSOTEventsCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter conversionMSOTEventsCreate is {}", conversionMSOTEventsCreate);

        api.msotEventsCreate(adAccountId, conversionMSOTEventsCreate)
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
