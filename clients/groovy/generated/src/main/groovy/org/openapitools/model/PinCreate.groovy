package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.PinMediaSource;

@Canonical
class PinCreate {
    /* AI disclosure declarations the creator has made about this Pin. */
    AiDisclosures aiDisclosures
    
    String altText
    /* The board to which this Pin belongs. */
    String boardId
    /* The board section to which this Pin belongs. */
    String boardSectionId
    
    String description
    /* Dominant pin color. Hex number, e.g. `#6E7874`. */
    String dominantColor
    
    String link
    
    PinMediaSource mediaSource
    /* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
    String parentPinId
    /* The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. */
    String sponsorId
    
    String title
}
