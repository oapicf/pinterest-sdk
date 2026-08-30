package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.InviteBusinessRoleBinding;
import org.openapitools.server.model.InviteExceptionResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */
public class InviteActionResultItem   {

    private InviteExceptionResponse exception;
    private InviteBusinessRoleBinding invite;

    /**
     * Default constructor.
     */
    public InviteActionResultItem() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteActionResultItem.
     *
     * @param exception exception
     * @param invite invite
     */
    public InviteActionResultItem(
        InviteExceptionResponse exception, 
        InviteBusinessRoleBinding invite
    ) {
        this.exception = exception;
        this.invite = invite;
    }



    /**
     * Get exception
     * @return exception
     */
    public InviteExceptionResponse getException() {
        return exception;
    }

    public void setException(InviteExceptionResponse exception) {
        this.exception = exception;
    }

    /**
     * Get invite
     * @return invite
     */
    public InviteBusinessRoleBinding getInvite() {
        return invite;
    }

    public void setInvite(InviteBusinessRoleBinding invite) {
        this.invite = invite;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteActionResultItem {\n");
        
        sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
        sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
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

