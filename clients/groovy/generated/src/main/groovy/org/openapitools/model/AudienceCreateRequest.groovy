package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceType;

@Canonical
class AudienceCreateRequest {
    /* Ad account ID. */
    String adAccountId
    /* Audience name. */
    String name
    
    AudienceRule rule
    /* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. */
    AudienceType audienceType
    /* Audience description. */
    String description
}
