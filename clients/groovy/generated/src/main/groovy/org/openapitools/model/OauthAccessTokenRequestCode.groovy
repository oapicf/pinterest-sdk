package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OauthAccessTokenRequestCode {

    enum GrantTypeEnum {
    
        AUTHORIZATION_CODE("authorization_code"),
        
        REFRESH_TOKEN("refresh_token"),
        
        CLIENT_CREDENTIALS("client_credentials")
    
        private final String value
    
        GrantTypeEnum(String value) {
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

    
    GrantTypeEnum grantType
    
    String code
    
    String redirectUri
}
