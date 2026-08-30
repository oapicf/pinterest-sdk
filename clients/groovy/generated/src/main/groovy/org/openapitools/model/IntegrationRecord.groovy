package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class IntegrationRecord {
    
    String additionalId1
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedMerchantId
    
    String connectedTagId
    
    String connectedUserId
    
    Integer createdTime
    
    String externalBusinessId
    /* Integration record ID. */
    String id
    
    String partnerAccessToken
    
    Integer partnerAccessTokenExpiry
    
    String partnerMetadata
    
    String partnerPrimaryEmail
    
    String partnerRefreshToken
    
    Integer partnerRefreshTokenExpiry
    
    String scopes
    
    Integer updatedTime
}
