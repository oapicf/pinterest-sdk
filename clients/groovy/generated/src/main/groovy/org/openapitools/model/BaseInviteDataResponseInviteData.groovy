package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BaseInviteDataResponseInviteData {
    /* The date and time when the invite/request will expire. Returned in milliseconds. */
    Integer inviteExpiration
    /* The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. */
    String inviteStatus
    /* The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. */
    String inviteType
    /* The date and time the invite/request was last updated. Returned in milliseconds. */
    Integer lastUpdatedTime
    /* The date and time the invite/request was sent/created. Returned in milliseconds. */
    Integer sentAt
}
