package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MediaList200Response;
import org.openapitools.server.api.model.MediaUpload;
import org.openapitools.server.api.model.MediaUploadDetails;
import org.openapitools.server.api.model.MediaUploadRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MediaApi  {
    //media/create
    void mediaCreate(MediaUploadRequest mediaUploadRequest, Handler<AsyncResult<MediaUpload>> handler);

    //media/get
    void mediaGet(String mediaId, Handler<AsyncResult<MediaUploadDetails>> handler);

    //media/list
    void mediaList(String bookmark, Integer pageSize, Handler<AsyncResult<MediaList200Response>> handler);

}
