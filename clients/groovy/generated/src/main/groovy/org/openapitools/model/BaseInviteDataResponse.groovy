package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;

@Canonical
class BaseInviteDataResponse {
    /* Unique identifier of the invite/request. */
    String id
    
    BaseInviteDataResponseInviteData inviteData
    /* Indicates whether the invite/request was received. */
    Boolean isReceivedInvite
    /* Metadata for the member/partner that was sent the invite/request. */
    BusinessAccessUserSummary user
}
