package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AuthRespondInvitesBodyItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */
public class AuthRespondInvitesBody   {

    private List<@Valid AuthRespondInvitesBodyItem> invites = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AuthRespondInvitesBody() {
    // JSON-B / Jackson
    }

    /**
     * Create AuthRespondInvitesBody.
     *
     * @param invites invites
     */
    public AuthRespondInvitesBody(
        List<@Valid AuthRespondInvitesBodyItem> invites
    ) {
        this.invites = invites;
    }



    /**
     * Get invites
     * @return invites
     */
    public List<@Valid AuthRespondInvitesBodyItem> getInvites() {
        return invites;
    }

    public void setInvites(List<@Valid AuthRespondInvitesBodyItem> invites) {
        this.invites = invites;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthRespondInvitesBody {\n");
        
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

