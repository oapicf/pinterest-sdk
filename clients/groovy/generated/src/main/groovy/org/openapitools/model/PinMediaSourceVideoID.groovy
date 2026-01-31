package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ContentType;

@Canonical
class PinMediaSourceVideoID {
    /* Content type for cover image Base64. */
    ContentType coverImageContentType
    /* Cover image Base64. */
    String coverImageData
    /* Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
    Integer coverImageKeyFrameTime
    /* Cover image URL. */
    String coverImageUrl
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    Boolean isStandard = true
    
    String mediaId

    enum SourceTypeEnum {
    
        VIDEO_ID("video_id")
    
        private final String value
    
        SourceTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    SourceTypeEnum sourceType
}
