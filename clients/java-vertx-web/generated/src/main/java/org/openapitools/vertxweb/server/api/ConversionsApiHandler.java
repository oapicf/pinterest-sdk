package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsGet200Response;
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
        builder.operation("advertiserDefinedEventsCreate").handler(this::advertiserDefinedEventsCreate);
        builder.operation("advertiserDefinedEventsDelete").handler(this::advertiserDefinedEventsDelete);
        builder.operation("advertiserDefinedEventsGet").handler(this::advertiserDefinedEventsGet);
        builder.operation("advertiserDefinedEventsUpdate").handler(this::advertiserDefinedEventsUpdate);
    }

    private void advertiserDefinedEventsCreate(RoutingContext routingContext) {
        logger.info("advertiserDefinedEventsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdvertiserDefinedEventsCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter advertiserDefinedEventsCreateRequest is {}", advertiserDefinedEventsCreateRequest);

        api.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)
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

    private void advertiserDefinedEventsDelete(RoutingContext routingContext) {
        logger.info("advertiserDefinedEventsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> eventNames = requestParameters.queryParameter("event_names") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("event_names").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter eventNames is {}", eventNames);

        api.advertiserDefinedEventsDelete(adAccountId, eventNames)
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

    private void advertiserDefinedEventsUpdate(RoutingContext routingContext) {
        logger.info("advertiserDefinedEventsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdvertiserDefinedEventsCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter advertiserDefinedEventsCreateRequest is {}", advertiserDefinedEventsCreateRequest);

        api.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)
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
