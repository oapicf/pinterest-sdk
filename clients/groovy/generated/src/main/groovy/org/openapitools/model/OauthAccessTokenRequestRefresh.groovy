package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OauthAccessTokenRequestRefresh {

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
    
    String refreshToken
    
    String scope
    /* Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\". */
    Boolean refreshOn
}
