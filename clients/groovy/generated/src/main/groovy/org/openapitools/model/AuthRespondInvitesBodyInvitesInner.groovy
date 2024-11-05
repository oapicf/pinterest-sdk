package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInnerAction;

@Canonical
class AuthRespondInvitesBodyInvitesInner {
    
    AuthRespondInvitesBodyInvitesInnerAction action
    /* Unique identifier of an invite. */
    String inviteId
}
