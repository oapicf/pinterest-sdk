package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PinMediaSourceVideoID {

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
    /* Cover image url. */
    String coverImageUrl

    enum CoverImageContentTypeEnum {
    
        JPEG("image/jpeg"),
        
        PNG("image/png")
    
        private final String value
    
        CoverImageContentTypeEnum(String value) {
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

    /* Content type for cover image Base64. */
    CoverImageContentTypeEnum coverImageContentType
    /* Cover image Base64. */
    String coverImageData
    
    String mediaId
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    Boolean isStandard = true
}
