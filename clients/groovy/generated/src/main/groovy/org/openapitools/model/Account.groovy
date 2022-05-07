package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Account {
    /* Type of account */
    String accountType
    
    String profileImage
    
    String websiteUrl
    
    String username
}
