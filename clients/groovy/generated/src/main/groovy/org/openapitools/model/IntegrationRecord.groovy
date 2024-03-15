package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class IntegrationRecord {
    
    String id
    
    String externalBusinessId
    
    String connectedMerchantId
    
    String connectedUserId
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedTagId
    
    String partnerAccessToken
    
    String partnerRefreshToken
    
    String partnerPrimaryEmail
    
    Integer partnerAccessTokenExpiry
    
    Integer partnerRefreshTokenExpiry
    
    String scopes
    
    String partnerMetadata
    
    String additionalId1
    
    Integer createdTime
    
    Integer updatedTime
}
