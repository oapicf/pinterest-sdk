package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CancelInviteResultUser {
    /* Email of the business member/partner. */
    String email
    /* Unique identifier of the business member/partner. */
    String id
    /* Username of the business member/partner. */
    String username
}
