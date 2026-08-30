package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object with the list of invite/request ids to cancel.
 */
public class CancelInvitesRequest   {

    private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CancelInvitesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CancelInvitesRequest.
     *
     * @param inviteIds A list of invite/request ids to cancel.
     */
    public CancelInvitesRequest(
        List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds
    ) {
        this.inviteIds = inviteIds;
    }



    /**
     * A list of invite/request ids to cancel.
     * @return inviteIds
     */
    public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getInviteIds() {
        return inviteIds;
    }

    public void setInviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
        this.inviteIds = inviteIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelInvitesRequest {\n");
        
        sb.append("    inviteIds: ").append(toIndentedString(inviteIds)).append("\n");
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

