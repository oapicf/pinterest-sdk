package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;
import org.openapitools.model.PinMediaMetadata;
import org.openapitools.model.PinMediaWithImage;
import org.openapitools.model.PinMediaWithImageAndVideo;
import org.openapitools.model.PinMediaWithImages;
import org.openapitools.model.PinMediaWithVideo;
import org.openapitools.model.PinMediaWithVideos;

@Canonical
class PinMedia {
    
    ImageSize images

    enum MediaTypeEnum {
    
        MULTIPLE_MIXED("multiple_mixed")
    
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
    
    String coverImageUrl
    /* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    BigDecimal duration
    /* Height (in pixels). Field maybe null after creation due to video processing time. */
    Integer height
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    String videoUrl
    /* Video url (HLS).  **Note:** This field is limited and not available to all apps. */
    String videoUrlHls
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    Integer width
    
    List<PinMediaMetadata> items = new ArrayList<>()
}
