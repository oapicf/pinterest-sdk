package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteDataResponse;

@Canonical
class InviteBusinessRoleBinding {
    /* Unique identifier for the business that created the invite/request. */
    String createdByBusinessId
    /* Unique identifier for the user that created the invite/request. */
    String createdByUserId
    /* Unique identifier of the invite/request. */
    String id
    
    InviteDataResponse inviteData
    /* Indicates whether the invite/request was received. */
    Boolean isReceivedInvite
    /* Metadata for the member/partner that was sent the invite/request. */
    BusinessAccessUserSummary user
}
