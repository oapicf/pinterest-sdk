package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadata;
import org.openapitools.model.ImageSize;
import org.openapitools.model.VideoMetadataWithItemType;

@Canonical
class PinMediaMetadata {
    
    String description
    
    ImageSize images
    
    String itemType
    
    String link
    
    String title
    
    String coverImageUrl
    /* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    BigDecimal duration
    /* Height (in pixels). Field maybe null after creation due to video processing time. */
    Integer height
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    String videoUrl
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    Integer width
}
