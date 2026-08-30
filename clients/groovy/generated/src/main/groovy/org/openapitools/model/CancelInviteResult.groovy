package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CancelInviteResultUser;
import org.openapitools.model.InviteDataResponse;

@Canonical
class CancelInviteResult {
    
    String id
    
    InviteDataResponse inviteData
    
    Boolean isReceivedInvite
    
    CancelInviteResultUser user
}
