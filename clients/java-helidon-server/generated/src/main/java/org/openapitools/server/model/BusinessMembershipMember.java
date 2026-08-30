package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BusinessRoleForMembers;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A business member identified by `member_id` with their `business_role` in the business.
 */
public class BusinessMembershipMember   {

    private BusinessRoleForMembers businessRole;
    private String memberId;

    /**
     * Default constructor.
     */
    public BusinessMembershipMember() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessMembershipMember.
     *
     * @param businessRole businessRole
     * @param memberId Unique identifier of the member.
     */
    public BusinessMembershipMember(
        BusinessRoleForMembers businessRole, 
        String memberId
    ) {
        this.businessRole = businessRole;
        this.memberId = memberId;
    }



    /**
     * Get businessRole
     * @return businessRole
     */
    public BusinessRoleForMembers getBusinessRole() {
        return businessRole;
    }

    public void setBusinessRole(BusinessRoleForMembers businessRole) {
        this.businessRole = businessRole;
    }

    /**
     * Unique identifier of the member.
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessMembershipMember {\n");
        
        sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

