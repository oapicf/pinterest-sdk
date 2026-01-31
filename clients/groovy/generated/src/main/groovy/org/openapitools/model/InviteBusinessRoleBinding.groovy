package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BaseInviteDataResponseInviteData;

@Canonical
class InviteBusinessRoleBinding {
    /* Unique identifier of the invite/request. */
    String id
    
    BaseInviteDataResponseInviteData inviteData
    /* Indicates whether the invite/request was received. */
    Boolean isReceivedInvite
    /* Metadata for the user that updated the invite/request. */
    Object user
    /* Unique identifier for the business that created the invite/request. */
    String createdByBusinessId
    /* Unique identifier for the user that created the invite/request. */
    String createdByUserId
}
