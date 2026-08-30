package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;

@Canonical
class PinMediaWithVideo {
    
    String coverImageUrl
    /* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    BigDecimal duration
    /* Height (in pixels). Field maybe null after creation due to video processing time. */
    Integer height
    
    ImageSize images

    enum MediaTypeEnum {
    
        VIDEO("video")
    
        private final String value
    
        MediaTypeEnum(String value) {
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

    
    MediaTypeEnum mediaType
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    String videoUrl
    /* Video url (HLS).  **Note:** This field is limited and not available to all apps. */
    String videoUrlHls
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    Integer width
}
