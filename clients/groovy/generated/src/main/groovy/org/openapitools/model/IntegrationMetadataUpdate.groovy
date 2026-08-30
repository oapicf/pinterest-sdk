package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class IntegrationMetadataUpdate {
    
    String additionalId1
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedMerchantId
    
    String connectedTagId
    
    String partnerAccessToken
    
    BigDecimal partnerAccessTokenExpiry
    
    String partnerMetadata
    
    String partnerPrimaryEmail
    
    String partnerRefreshToken
    
    BigDecimal partnerRefreshTokenExpiry
    
    String scopes
}
