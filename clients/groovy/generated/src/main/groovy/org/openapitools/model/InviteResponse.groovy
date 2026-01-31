package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteAssetsSummary;

@Canonical
class InviteResponse {
    /* Unique identifier of the invite/request. */
    String id
    
    BaseInviteDataResponseInviteData inviteData
    /* Indicates whether the invite/request was received. */
    Boolean isReceivedInvite
    /* Metadata for the member/partner that was sent the invite/request. */
    BusinessAccessUserSummary user
    
    InviteAssetsSummary assetsSummary
    /* The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
    List<String> businessRoles = new ArrayList<>()
    /* Metadata for the business that created the invite/request. */
    Object createdByBusiness
    /* Metadata for the user that created the invite/request. */
    Object createdByUser
    /* The time the invite/request was created. Returned in milliseconds. */
    Integer createdTime
}
