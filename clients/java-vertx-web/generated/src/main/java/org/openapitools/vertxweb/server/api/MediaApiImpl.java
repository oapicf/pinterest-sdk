package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.MediaList200Response;
import org.openapitools.vertxweb.server.model.MediaUpload;
import org.openapitools.vertxweb.server.model.MediaUploadDetails;
import org.openapitools.vertxweb.server.model.MediaUploadRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class MediaApiImpl implements MediaApi {
    public Future<ApiResponse<MediaUpload>> mediaCreate(MediaUploadRequest mediaUploadRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MediaUploadDetails>> mediaGet(String mediaId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MediaList200Response>> mediaList(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

}
