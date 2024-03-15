package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class IntegrationRequest {
    /* External business ID for the integration. */
    String externalBusinessId
    
    String connectedMerchantId
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedTagId
    
    String partnerAccessToken
    
    String partnerRefreshToken
    
    String partnerPrimaryEmail
    
    Integer partnerAccessTokenExpiry
    
    Integer partnerRefreshTokenExpiry
    
    String scopes
    
    String additionalId1
    
    String partnerMetadata
}
