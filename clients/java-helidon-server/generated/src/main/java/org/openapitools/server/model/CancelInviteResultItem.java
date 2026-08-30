package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CancelInviteException;
import org.openapitools.server.model.CancelInviteResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CancelInviteResultItem   {

    private CancelInviteException exception;
    private CancelInviteResult invite;

    /**
     * Default constructor.
     */
    public CancelInviteResultItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CancelInviteResultItem.
     *
     * @param exception exception
     * @param invite invite
     */
    public CancelInviteResultItem(
        CancelInviteException exception, 
        CancelInviteResult invite
    ) {
        this.exception = exception;
        this.invite = invite;
    }



    /**
     * Get exception
     * @return exception
     */
    public CancelInviteException getException() {
        return exception;
    }

    public void setException(CancelInviteException exception) {
        this.exception = exception;
    }

    /**
     * Get invite
     * @return invite
     */
    public CancelInviteResult getInvite() {
        return invite;
    }

    public void setInvite(CancelInviteResult invite) {
        this.invite = invite;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelInviteResultItem {\n");
        
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

