package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.MediaList200Response;
import org.openapitools.vertxweb.server.model.MediaUpload;
import org.openapitools.vertxweb.server.model.MediaUploadDetails;
import org.openapitools.vertxweb.server.model.MediaUploadRequest;

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

public class MediaApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(MediaApiHandler.class);

    private final MediaApi api;

    public MediaApiHandler(MediaApi api) {
        this.api = api;
    }

    @Deprecated
    public MediaApiHandler() {
        this(new MediaApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("mediaCreate").handler(this::mediaCreate);
        builder.operation("mediaGet").handler(this::mediaGet);
        builder.operation("mediaList").handler(this::mediaList);
    }

    private void mediaCreate(RoutingContext routingContext) {
        logger.info("mediaCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        MediaUploadRequest mediaUploadRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<MediaUploadRequest>(){}) : null;

        logger.debug("Parameter mediaUploadRequest is {}", mediaUploadRequest);

        api.mediaCreate(mediaUploadRequest)
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

    private void mediaGet(RoutingContext routingContext) {
        logger.info("mediaGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String mediaId = requestParameters.pathParameter("media_id") != null ? requestParameters.pathParameter("media_id").getString() : null;

        logger.debug("Parameter mediaId is {}", mediaId);

        api.mediaGet(mediaId)
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

    private void mediaList(RoutingContext routingContext) {
        logger.info("mediaList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.mediaList(bookmark, pageSize)
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
