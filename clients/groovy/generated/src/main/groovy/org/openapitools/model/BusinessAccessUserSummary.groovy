package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class BusinessAccessUserSummary {
    /* Email of the business member/partner. */
    String email
    /* Unique identifier of the business member/partner. */
    String id
    /* Username of the business member/partner. */
    String username
}
