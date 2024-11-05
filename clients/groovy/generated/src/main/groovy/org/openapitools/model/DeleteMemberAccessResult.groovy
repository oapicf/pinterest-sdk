package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeleteMemberAccessResult {
    /* Unique identifier of the business asset. */
    String assetId
    /* Unique identifier of the business member. */
    String memberId
}
