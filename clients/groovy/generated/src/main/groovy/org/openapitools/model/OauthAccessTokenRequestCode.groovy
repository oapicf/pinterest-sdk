package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OauthAccessTokenRequest;
import org.openapitools.model.OauthAccessTokenRequestCodeAllOf;

@Canonical
class OauthAccessTokenRequestCode {
    
    String code
    
    String redirectUri
}
