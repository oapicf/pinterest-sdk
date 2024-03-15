package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;

@Canonical
class Board {
    
    String id
    /* Date and time of board creation. */
    Date createdAt
    /* Date and time of last board pins modified. */
    Date boardPinsModifiedAt
    
    String name
    
    String description
    /* Count of collaborators on the board. */
    Integer collaboratorCount
    /* Count of pins on the board. */
    Integer pinCount
    /* Board follower count. */
    Integer followerCount
    
    BoardMedia media
    
    BoardOwner owner

    enum PrivacyEnum {
    
        PUBLIC("PUBLIC"),
        
        PROTECTED("PROTECTED"),
        
        SECRET("SECRET")
    
        private final String value
    
        PrivacyEnum(String value) {
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

    /* Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> */
    PrivacyEnum privacy = PrivacyEnum.PUBLIC
}
