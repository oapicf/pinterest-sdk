package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MediaUploadAllOf;
import org.openapitools.model.MediaUploadAllOfUploadParameters;
import org.openapitools.model.MediaUploadType;

@Canonical
class MediaUpload {
    /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    String mediaId
    
    MediaUploadType mediaType
    /* The URL where you will POST your media file. */
    String uploadUrl
    
    MediaUploadAllOfUploadParameters uploadParameters
}
