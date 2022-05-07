package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OauthAccessTokenRequest;
import org.openapitools.model.OauthAccessTokenRequestRefreshAllOf;

@Canonical
class OauthAccessTokenRequestRefresh {
    
    String refreshToken
    
    String scope
}
