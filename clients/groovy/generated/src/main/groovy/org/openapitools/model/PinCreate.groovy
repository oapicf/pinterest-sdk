package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaSource;

@Canonical
class PinCreate {
    
    String id
    
    Date createdAt
    
    String link
    
    String title
    
    String description
    /* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". */
    String dominantColor
    
    String altText
    /* The board to which this Pin belongs. */
    String boardId
    /* The board section to which this Pin belongs. */
    String boardSectionId
    
    BoardOwner boardOwner
    
    PinMedia media
    
    PinMediaSource mediaSource
    /* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. */
    String parentPinId
    /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    String note
}
