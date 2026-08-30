package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class VideoMetadataWithItemType {
    
    String coverImageUrl
    /* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    BigDecimal duration
    /* Height (in pixels). Field maybe null after creation due to video processing time. */
    Integer height

    enum ItemTypeEnum {
    
        VIDEO("video")
    
        private final String value
    
        ItemTypeEnum(String value) {
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

    /* Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload. */
    ItemTypeEnum itemType
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    String videoUrl
    /* Video url (HLS).  **Note:** This field is limited and not available to all apps. */
    String videoUrlHls
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    Integer width
}
