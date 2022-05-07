package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaSource;

@Canonical
class Pin {
    
    String id
    
    Date createdAt
    
    String link
    
    String title
    
    String description
    
    String altText
    /* The board to which this Pin belongs. */
    String boardId
    /* The board section to which this Pin belongs. */
    String boardSectionId
    
    BoardOwner boardOwner
    
    PinMedia media
    
    PinMediaSource mediaSource
}
