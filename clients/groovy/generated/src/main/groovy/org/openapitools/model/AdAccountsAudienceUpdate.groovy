package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceType;
import org.openapitools.model.AudienceUpdateOperationType;

@Canonical
class AdAccountsAudienceUpdate {
    /* Ad account ID. */
    String adAccountId
    /* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    AudienceType audienceType
    /* Audience description. */
    String description
    /* Audience name. */
    String name
    /* Audience operation type (update or remove). Only valid in update request body. */
    AudienceUpdateOperationType operationType
    
    AdAccountsAudienceRule rule
}
