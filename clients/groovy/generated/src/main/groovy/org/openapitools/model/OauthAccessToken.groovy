package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TokenGrantType;

@Canonical
class OauthAccessToken {
    
    String accessToken
    
    Integer expiresIn
    
    String refreshToken
    
    Integer refreshTokenExpiresAt
    
    Integer refreshTokenExpiresIn
    
    TokenGrantType responseType
    
    String scope
    
    String tokenType = "bearer"
}
