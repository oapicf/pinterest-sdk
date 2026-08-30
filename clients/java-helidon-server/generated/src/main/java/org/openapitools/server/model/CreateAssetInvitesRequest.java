package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateAssetInvitesRequestItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request body for updating asset roles for existing invites.
 */
public class CreateAssetInvitesRequest   {

    private List<@Valid CreateAssetInvitesRequestItem> invites = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateAssetInvitesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateAssetInvitesRequest.
     *
     * @param invites invites
     */
    public CreateAssetInvitesRequest(
        List<@Valid CreateAssetInvitesRequestItem> invites
    ) {
        this.invites = invites;
    }



    /**
     * Get invites
     * @return invites
     */
    public List<@Valid CreateAssetInvitesRequestItem> getInvites() {
        return invites;
    }

    public void setInvites(List<@Valid CreateAssetInvitesRequestItem> invites) {
        this.invites = invites;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetInvitesRequest {\n");
        
        sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

