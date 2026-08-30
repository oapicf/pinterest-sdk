package org.openapitools.server.model;

import org.openapitools.server.model.AuthRespondInviteAction;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AuthRespondInvitesBodyItem   {

    private AuthRespondInviteAction action;
    private String inviteId;

    /**
     * Default constructor.
     */
    public AuthRespondInvitesBodyItem() {
    // JSON-B / Jackson
    }

    /**
     * Create AuthRespondInvitesBodyItem.
     *
     * @param action action
     * @param inviteId Unique identifier of an invite.
     */
    public AuthRespondInvitesBodyItem(
        AuthRespondInviteAction action, 
        String inviteId
    ) {
        this.action = action;
        this.inviteId = inviteId;
    }



    /**
     * Get action
     * @return action
     */
    public AuthRespondInviteAction getAction() {
        return action;
    }

    public void setAction(AuthRespondInviteAction action) {
        this.action = action;
    }

    /**
     * Unique identifier of an invite.
     * @return inviteId
     */
    public String getInviteId() {
        return inviteId;
    }

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthRespondInvitesBodyItem {\n");
        
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
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

