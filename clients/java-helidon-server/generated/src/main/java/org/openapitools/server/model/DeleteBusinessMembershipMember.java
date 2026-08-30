package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BusinessRoleForMembers;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Single instance of a business member to be removed from the business.
 */
public class DeleteBusinessMembershipMember   {

    private BusinessRoleForMembers businessRole;
    private String memberId;

    /**
     * Default constructor.
     */
    public DeleteBusinessMembershipMember() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteBusinessMembershipMember.
     *
     * @param businessRole businessRole
     * @param memberId Unique identifier of the member
     */
    public DeleteBusinessMembershipMember(
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
     * Unique identifier of the member
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
        sb.append("class DeleteBusinessMembershipMember {\n");
        
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

