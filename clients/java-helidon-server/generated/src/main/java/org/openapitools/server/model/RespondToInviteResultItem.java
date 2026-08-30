package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BaseInviteDataResponse;
import org.openapitools.server.model.InviteExceptionResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RespondToInviteResultItem   {

    private InviteExceptionResponse exception;
    private BaseInviteDataResponse invite;

    /**
     * Default constructor.
     */
    public RespondToInviteResultItem() {
    // JSON-B / Jackson
    }

    /**
     * Create RespondToInviteResultItem.
     *
     * @param exception exception
     * @param invite An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
     */
    public RespondToInviteResultItem(
        InviteExceptionResponse exception, 
        BaseInviteDataResponse invite
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
     * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
     * @return invite
     */
    public BaseInviteDataResponse getInvite() {
        return invite;
    }

    public void setInvite(BaseInviteDataResponse invite) {
        this.invite = invite;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespondToInviteResultItem {\n");
        
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

