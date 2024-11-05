package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InviteType;

@Canonical
class CreateMembershipOrPartnershipInvitesBody {

    enum BusinessRoleEnum {
    
        EMPLOYEE("EMPLOYEE"),
        
        BIZ_ADMIN("BIZ_ADMIN"),
        
        PARTNER("PARTNER")
    
        private final String value
    
        BusinessRoleEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. */
    BusinessRoleEnum businessRole
    
    InviteType inviteType
    /* A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE */
    List<String> members = new ArrayList<>()
    /* A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST */
    List<String> partners = new ArrayList<>()
}
