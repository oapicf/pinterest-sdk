package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.NotificationPostRequest;
import org.openapitools.vertxweb.server.model.NotificationResponse;

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

public class NotificationApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(NotificationApiHandler.class);

    private final NotificationApi api;

    public NotificationApiHandler(NotificationApi api) {
        this.api = api;
    }

    @Deprecated
    public NotificationApiHandler() {
        this(new NotificationApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("notificationPost").handler(this::notificationPost);
    }

    private void notificationPost(RoutingContext routingContext) {
        logger.info("notificationPost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        NotificationPostRequest notificationPostRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<NotificationPostRequest>(){}) : null;

        logger.debug("Parameter notificationPostRequest is {}", notificationPostRequest);

        api.notificationPost(notificationPostRequest)
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
