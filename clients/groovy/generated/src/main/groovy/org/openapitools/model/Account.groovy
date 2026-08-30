package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserAccountType;

@Canonical
class Account {
    /* Profile about description. */
    String about
    /* Type of account */
    UserAccountType accountType
    /*   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
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
