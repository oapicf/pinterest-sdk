package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMediaSource;
import org.openapitools.model.SummaryPinMedia;

@Canonical
class Pin {
    
    String id
    
    Date createdAt
    
    String link
    
    String title
    
    String description
    /* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". */
    String dominantColor
    
    String altText
    
    CreativeType creativeType
    /* The board to which this Pin belongs. */
    String boardId
    /* The board section to which this Pin belongs. */
    String boardSectionId
    
    BoardOwner boardOwner
    /* Whether the \"operation user_account\" is the Pin owner. */
    Boolean isOwner
    
    SummaryPinMedia media
    
    PinMediaSource mediaSource
    /* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. */
    String parentPinId
    /* Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information. */
    Boolean isStandard
    /* Whether the Pin has been promoted or not. */
    Boolean hasBeenPromoted
    /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    String note
    /* Pin metrics with associated time intervals if any. */
    Object pinMetrics
}
