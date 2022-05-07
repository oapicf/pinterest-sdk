package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OauthAccessTokenResponse {
    
    String responseType
    
    String accessToken
    
    String tokenType = "bearer"
    
    Integer expiresIn
    
    String scope
}
