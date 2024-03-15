package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MediaList200Response;
import org.openapitools.server.api.model.MediaUpload;
import org.openapitools.server.api.model.MediaUploadDetails;
import org.openapitools.server.api.model.MediaUploadRequest;

import java.util.List;
import java.util.Map;

public class MediaApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MediaApiVerticle.class);

    static final String MEDIA/CREATE_SERVICE_ID = "media/create";
    static final String MEDIA/GET_SERVICE_ID = "media/get";
    static final String MEDIA/LIST_SERVICE_ID = "media/list";
    
    final MediaApi service;

    public MediaApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.MediaApiImpl");
            service = (MediaApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("MediaApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for media/create
        vertx.eventBus().<JsonObject> consumer(MEDIA/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "media/create";
                JsonObject mediaUploadRequestParam = message.body().getJsonObject("MediaUploadRequest");
                if (mediaUploadRequestParam == null) {
                    manageError(message, new MainApiException(400, "MediaUploadRequest is required"), serviceId);
                    return;
                }
                MediaUploadRequest mediaUploadRequest = Json.mapper.readValue(mediaUploadRequestParam.encode(), MediaUploadRequest.class);
                service.mediaCreate(mediaUploadRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "media/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("media/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for media/get
        vertx.eventBus().<JsonObject> consumer(MEDIA/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "media/get";
                String mediaIdParam = message.body().getString("media_id");
                if(mediaIdParam == null) {
                    manageError(message, new MainApiException(400, "media_id is required"), serviceId);
                    return;
                }
                String mediaId = mediaIdParam;
                service.mediaGet(mediaId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "media/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("media/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for media/list
        vertx.eventBus().<JsonObject> consumer(MEDIA/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "media/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.mediaList(bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "media/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("media/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
