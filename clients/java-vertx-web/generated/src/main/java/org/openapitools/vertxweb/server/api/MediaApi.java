package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Media;
import org.openapitools.vertxweb.server.model.MediaList200Response;
import org.openapitools.vertxweb.server.model.MediaUpload;
import org.openapitools.vertxweb.server.model.MediaUploadCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface MediaApi  {
    Future<ApiResponse<MediaUpload>> mediaCreate(MediaUploadCreate mediaUploadCreate);
    Future<ApiResponse<Media>> mediaGet(String mediaId);
    Future<ApiResponse<MediaList200Response>> mediaList(String bookmark, Integer pageSize);
}
