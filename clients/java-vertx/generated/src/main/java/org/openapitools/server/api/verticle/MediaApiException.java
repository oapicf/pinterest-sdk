package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MediaUpload;
import org.openapitools.server.api.model.MediaUploadDetails;
import org.openapitools.server.api.model.MediaUploadRequest;
import org.openapitools.server.api.model.Paginated;

public final class MediaApiException extends MainApiException {
    public MediaApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final MediaApiException Media_mediaCreate_201_Exception = new MediaApiException(201, "response");
    public static final MediaApiException Media_mediaGet_200_Exception = new MediaApiException(200, "response");
    public static final MediaApiException Media_mediaGet_404_Exception = new MediaApiException(404, "Media upload not found");
    public static final MediaApiException Media_mediaList_200_Exception = new MediaApiException(200, "response");
    

}