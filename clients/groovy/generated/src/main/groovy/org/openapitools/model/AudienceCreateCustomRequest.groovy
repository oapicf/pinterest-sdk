package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceSharingType;

@Canonical
class AudienceCreateCustomRequest {
    /* Ad account ID. */
    String adAccountId
    /* Audience name. */
    String name
    
    AudienceRule rule
    
    AudienceSharingType sharingType
    
    AudienceDataParty dataParty
    
    String category
}
