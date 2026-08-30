package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;

@Canonical
class BoardBase {
    /* Date and time of last board pins modified. */
    Date boardPinsModifiedAt
    /* Count of collaborators on the board. */
    Integer collaboratorCount
    /* Date and time of board creation. */
    Date createdAt
    
    String description
    /* Board follower count. */
    Integer followerCount
    
    String id
    /* If set to `true`, the board will be ad-only and can store ad-only Pins. */
    Boolean isAdsOnly = false
    /* Board media. */
    BoardMedia media
    /*     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
    String name
    
    BoardOwner owner
    /* Count of Pins on the board. */
    Integer pinCount
}
