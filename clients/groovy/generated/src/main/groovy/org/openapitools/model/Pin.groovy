package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;

@Canonical
class Pin {
    
    String altText
    /* The board to which this Pin belongs. */
    String boardId
    
    BoardOwner boardOwner
    /* The board section to which this Pin belongs. */
    String boardSectionId
    
    Date createdAt
    
    CreativeType creativeType
    
    String description
    /* Dominant pin color. Hex number, e.g. `#6E7874`. */
    String dominantColor
    /* Whether the Pin has been promoted or not. */
    Boolean hasBeenPromoted
    
    String id
    /* Whether the \"operation user_account\" is the Pin owner. */
    Boolean isOwner
    /* Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. */
    Boolean isStandard
    
    String link
    
    PinMedia media
    /* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
    String parentPinId
    /* Pin metrics with associated time intervals if any. */
    Object pinMetrics
    
    String title
}
