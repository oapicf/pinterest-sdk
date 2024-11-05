package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessAccessUserSummary;

@Canonical
class CreateInvitesResultsResponseArrayItemsInnerInvite {
    /* Unique identifier of the invite/request. */
    String id
    /* Metadata for the member/partner that was sent the invite/request. */
    BusinessAccessUserSummary user
}
