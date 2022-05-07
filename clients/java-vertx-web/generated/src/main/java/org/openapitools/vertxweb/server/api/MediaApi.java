package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.MediaUpload;
import org.openapitools.vertxweb.server.model.MediaUploadDetails;
import org.openapitools.vertxweb.server.model.MediaUploadRequest;
import org.openapitools.vertxweb.server.model.Paginated;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface MediaApi  {
    Future<ApiResponse<MediaUpload>> mediaCreate(MediaUploadRequest mediaUploadRequest);
    Future<ApiResponse<MediaUploadDetails>> mediaGet(String mediaId);
    Future<ApiResponse<Paginated>> mediaList(String bookmark, Integer pageSize);
}
