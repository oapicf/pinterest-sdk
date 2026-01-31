package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Account {
    /* Profile about description. */
    String about

    enum AccountTypeEnum {
    
        PINNER("PINNER"),
        
        BUSINESS("BUSINESS")
    
        private final String value
    
        AccountTypeEnum(String value) {
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

    /* Type of account */
    AccountTypeEnum accountType
    /* User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
    Integer boardCount
    
    String businessName
    /* User account follower count. */
    Integer followerCount
    /* User account following count. */
    Integer followingCount
    /* User account ID. */
    String id
    /* User account monthly views. */
    Integer monthlyViews
    /* User account pin count. This includes both created and saved pins. */
    Integer pinCount
    
    String profileImage
    
    String username
    
    String websiteUrl
}
