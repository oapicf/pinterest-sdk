package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;

@Canonical
class Keyword {
    
    Boolean archived
    /* Keyword ID . */
    String id
    /* Keyword parent entity ID (advertiser, campaign, ad group). */
    String parentId
    /* Parent entity type */
    String parentType
    /* Always keyword */
    String type
    /* Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    Integer bid
    
    MatchTypeResponse matchType
    /* Keyword value (120 chars max). */
    String value
}
