package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Media;
import org.openapitools.vertxweb.server.model.MediaList200Response;
import org.openapitools.vertxweb.server.model.MediaUpload;
import org.openapitools.vertxweb.server.model.MediaUploadCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class MediaApiImpl implements MediaApi {
    public Future<ApiResponse<MediaUpload>> mediaCreate(MediaUploadCreate mediaUploadCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Media>> mediaGet(String mediaId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MediaList200Response>> mediaList(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

}
