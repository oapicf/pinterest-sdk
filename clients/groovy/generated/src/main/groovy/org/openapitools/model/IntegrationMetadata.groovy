package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class IntegrationMetadata {
    
    String additionalId1
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedMerchantId
    
    String connectedTagId
    
    String connectedUserId
    
    BigDecimal createdTimestamp
    /* External business ID for the integration. */
    String externalBusinessId
    
    String id
    
    BigDecimal partnerAccessTokenExpiry
    
    String partnerMetadata
    
    BigDecimal partnerRefreshTokenExpiry
    
    String scopes
    
    BigDecimal updatedTimestamp
}
