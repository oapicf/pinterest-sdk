package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OauthAccessTokenResponse {

    enum ResponseTypeEnum {
    
        AUTHORIZATION_CODE("authorization_code"),
        
        REFRESH_TOKEN("refresh_token"),
        
        CLIENT_CREDENTIALS("client_credentials")
    
        private final String value
    
        ResponseTypeEnum(String value) {
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

    
    ResponseTypeEnum responseType
    
    String accessToken
    
    String tokenType = "bearer"
    
    Integer expiresIn
    
    String scope
}
