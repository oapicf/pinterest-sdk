package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceStatus;
import org.openapitools.model.PinnerListType;

@Canonical
class Audience {
    /* Ad account ID. */
    String adAccountId
    /* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    PinnerListType audienceType
    /* The company that created this audience. */
    String createdByCompanyName
    /* Creation time. Unix timestamp in seconds. */
    Integer createdTimestamp
    /* Audience description. */
    String description
    /* Audience ID. */
    String id
    /* Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. */
    Boolean isNca
    /* Audience name. */
    String name
    
    AudienceRule rule
    /* Audience size. */
    Integer size
    /* Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
    AudienceStatus status
    /* Always \"audience\". */
    String type
    /* Last update time. Unix timestamp in seconds. */
    Integer updatedTimestamp
}
