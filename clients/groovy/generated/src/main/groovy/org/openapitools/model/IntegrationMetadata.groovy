package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class IntegrationMetadata {
    
    String id
    
    String externalBusinessId
    
    String connectedMerchantId
    
    String connectedUserId
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedTagId
    
    BigDecimal partnerAccessTokenExpiry
    
    BigDecimal partnerRefreshTokenExpiry
    
    String scopes
    
    BigDecimal createdTimestamp
    
    BigDecimal updatedTimestamp
    
    String additionalId1
    
    String partnerMetadata
}
