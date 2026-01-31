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
    
    String itemType
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    String videoUrl
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    Integer width
}
