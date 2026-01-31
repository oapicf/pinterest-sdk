package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;

@Canonical
class Media {
    /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    String mediaId
    
    MediaUploadType mediaType
    
    MediaUploadStatus status
}
