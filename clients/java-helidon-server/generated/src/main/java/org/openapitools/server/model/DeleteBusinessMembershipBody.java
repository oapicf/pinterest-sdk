package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeleteBusinessMembershipMember;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * List of members with role to delete.
 */
public class DeleteBusinessMembershipBody   {

    private List<@Valid DeleteBusinessMembershipMember> members = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeleteBusinessMembershipBody() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteBusinessMembershipBody.
     *
     * @param members members
     */
    public DeleteBusinessMembershipBody(
        List<@Valid DeleteBusinessMembershipMember> members
    ) {
        this.members = members;
    }



    /**
     * Get members
     * @return members
     */
    public List<@Valid DeleteBusinessMembershipMember> getMembers() {
        return members;
    }

    public void setMembers(List<@Valid DeleteBusinessMembershipMember> members) {
        this.members = members;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBusinessMembershipBody {\n");
        
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

