package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BusinessRoleForInvite;
import org.openapitools.model.InviteType;

@Canonical
class CreateMembershipOrPartnershipInvitesBody {
    
    BusinessRoleForInvite businessRole
    
    InviteType inviteType
    /* A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE */
    List<String> members = new ArrayList<>()
    /* A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST */
    List<String> partners = new ArrayList<>()
}
