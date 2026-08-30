package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BusinessRoleForInvite;
import org.openapitools.server.model.InviteType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Body to be used on path to send Members or Partners Invite or Request
 */
public class CreateMembershipOrPartnershipInvitesBody   {

    private BusinessRoleForInvite businessRole;
    private InviteType inviteType;
    private List<String> members = new ArrayList<>();
    private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateMembershipOrPartnershipInvitesBody() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateMembershipOrPartnershipInvitesBody.
     *
     * @param businessRole businessRole
     * @param inviteType inviteType
     * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
     * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
     */
    public CreateMembershipOrPartnershipInvitesBody(
        BusinessRoleForInvite businessRole, 
        InviteType inviteType, 
        List<String> members, 
        List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners
    ) {
        this.businessRole = businessRole;
        this.inviteType = inviteType;
        this.members = members;
        this.partners = partners;
    }



    /**
     * Get businessRole
     * @return businessRole
     */
    public BusinessRoleForInvite getBusinessRole() {
        return businessRole;
    }

    public void setBusinessRole(BusinessRoleForInvite businessRole) {
        this.businessRole = businessRole;
    }

    /**
     * Get inviteType
     * @return inviteType
     */
    public InviteType getInviteType() {
        return inviteType;
    }

    public void setInviteType(InviteType inviteType) {
        this.inviteType = inviteType;
    }

    /**
     * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
     * @return members
     */
    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    /**
     * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
     * @return partners
     */
    public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getPartners() {
        return partners;
    }

    public void setPartners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
        this.partners = partners;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMembershipOrPartnershipInvitesBody {\n");
        
        sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
        sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

