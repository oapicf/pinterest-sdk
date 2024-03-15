package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class IntegrationRequestPatch {
    
    String connectedMerchantId
    
    String connectedAdvertiserId
    
    String connectedLbaId
    
    String connectedTagId
    
    String partnerAccessToken
    
    String partnerRefreshToken
    
    String partnerPrimaryEmail
    
    BigDecimal partnerAccessTokenExpiry
    
    BigDecimal partnerRefreshTokenExpiry
    
    String scopes
    
    String additionalId1
    
    String partnerMetadata
}
