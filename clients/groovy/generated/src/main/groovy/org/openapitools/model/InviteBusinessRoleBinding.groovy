package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;

@Canonical
class InviteBusinessRoleBinding {
    /* Unique identifier for the business that created the invite/request. */
    String createdByBusinessId
    /* Unique identifier for the user that created the invite/request. */
    String createdByUserId
    /* Metadata for the user that updated the invite/request. */
    BusinessAccessUserSummary user
    /* Unique identifier of the invite/request. */
    String id
    
    BaseInviteDataResponseInviteData inviteData
    /* Indicates whether the invite/request was received. */
    Boolean isReceivedInvite
}
