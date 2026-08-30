package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */
public class CancelInviteException   {

    private String inviteId;
    private String message;

    /**
     * Default constructor.
     */
    public CancelInviteException() {
    // JSON-B / Jackson
    }

    /**
     * Create CancelInviteException.
     *
     * @param inviteId inviteId
     * @param message message
     */
    public CancelInviteException(
        String inviteId, 
        String message
    ) {
        this.inviteId = inviteId;
        this.message = message;
    }



    /**
     * Get inviteId
     * @return inviteId
     */
    public String getInviteId() {
        return inviteId;
    }

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    /**
     * Get message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelInviteException {\n");
        
        sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

