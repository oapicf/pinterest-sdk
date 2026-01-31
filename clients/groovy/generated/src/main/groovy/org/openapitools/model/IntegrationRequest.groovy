package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class IntegrationRequest {
    
    String additionalId1
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedMerchantId
    
    String connectedTagId
    /* External business ID for the integration. */
    String externalBusinessId
    
    String partnerAccessToken
    
    Integer partnerAccessTokenExpiry
    
    String partnerMetadata
    
    String partnerPrimaryEmail
    
    String partnerRefreshToken
    
    Integer partnerRefreshTokenExpiry
    
    String scopes
}
