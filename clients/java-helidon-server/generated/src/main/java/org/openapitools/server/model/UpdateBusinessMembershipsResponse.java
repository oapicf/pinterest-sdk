package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BusinessMembershipMember;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateBusinessMembershipsResponse   {

    private List<@Valid BusinessMembershipMember> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateBusinessMembershipsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateBusinessMembershipsResponse.
     *
     * @param items List of members with updated business access role.
     */
    public UpdateBusinessMembershipsResponse(
        List<@Valid BusinessMembershipMember> items
    ) {
        this.items = items;
    }



    /**
     * List of members with updated business access role.
     * @return items
     */
    public List<@Valid BusinessMembershipMember> getItems() {
        return items;
    }

    public void setItems(List<@Valid BusinessMembershipMember> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBusinessMembershipsResponse {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

