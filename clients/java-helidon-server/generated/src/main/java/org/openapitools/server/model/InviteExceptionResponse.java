package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */
public class InviteExceptionResponse   {

    private Integer code;
    private String inviteOrRequestId;
    private String message;
    private List<String> usersOrPartnerIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public InviteExceptionResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteExceptionResponse.
     *
     * @param code Error code associated with the error in performing the action on the invite/request.
     * @param inviteOrRequestId Unique identifier of the invite/request.
     * @param message Error message associated with the error in performing the action on the invite/request.
     * @param usersOrPartnerIds A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
     */
    public InviteExceptionResponse(
        Integer code, 
        String inviteOrRequestId, 
        String message, 
        List<String> usersOrPartnerIds
    ) {
        this.code = code;
        this.inviteOrRequestId = inviteOrRequestId;
        this.message = message;
        this.usersOrPartnerIds = usersOrPartnerIds;
    }



    /**
     * Error code associated with the error in performing the action on the invite/request.
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Unique identifier of the invite/request.
     * @return inviteOrRequestId
     */
    public String getInviteOrRequestId() {
        return inviteOrRequestId;
    }

    public void setInviteOrRequestId(String inviteOrRequestId) {
        this.inviteOrRequestId = inviteOrRequestId;
    }

    /**
     * Error message associated with the error in performing the action on the invite/request.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * A list of users' usernames or emails OR a list of partner ids that caused the error.
     * @return usersOrPartnerIds
     */
    public List<String> getUsersOrPartnerIds() {
        return usersOrPartnerIds;
    }

    public void setUsersOrPartnerIds(List<String> usersOrPartnerIds) {
        this.usersOrPartnerIds = usersOrPartnerIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteExceptionResponse {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    inviteOrRequestId: ").append(toIndentedString(inviteOrRequestId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    usersOrPartnerIds: ").append(toIndentedString(usersOrPartnerIds)).append("\n");
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

