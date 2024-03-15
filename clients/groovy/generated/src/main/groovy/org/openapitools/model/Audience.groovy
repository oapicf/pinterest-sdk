package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;

@Canonical
class Audience {
    /* Ad account ID. */
    String adAccountId
    /* Audience ID. */
    String id
    /* Audience name. */
    String name
    /* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    String audienceType
    /* Audience description. */
    String description
    
    AudienceRule rule
    /* Audience size. */
    Integer size
    /* Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
    String status
    /* Always \"audience\". */
    String type
    /* Creation time. Unix timestamp in seconds. */
    Integer createdTimestamp
    /* Last update time. Unix timestamp in seconds. */
    Integer updatedTimestamp
}
