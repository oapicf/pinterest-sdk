package org.openapitools.server.model;

import org.openapitools.server.model.CancelInviteResultUser;
import org.openapitools.server.model.InviteDataResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CancelInviteResult   {

    private String id;
    private InviteDataResponse inviteData;
    private Boolean isReceivedInvite;
    private CancelInviteResultUser user;

    /**
     * Default constructor.
     */
    public CancelInviteResult() {
    // JSON-B / Jackson
    }

    /**
     * Create CancelInviteResult.
     *
     * @param id id
     * @param inviteData inviteData
     * @param isReceivedInvite isReceivedInvite
     * @param user user
     */
    public CancelInviteResult(
        String id, 
        InviteDataResponse inviteData, 
        Boolean isReceivedInvite, 
        CancelInviteResultUser user
    ) {
        this.id = id;
        this.inviteData = inviteData;
        this.isReceivedInvite = isReceivedInvite;
        this.user = user;
    }



    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get inviteData
     * @return inviteData
     */
    public InviteDataResponse getInviteData() {
        return inviteData;
    }

    public void setInviteData(InviteDataResponse inviteData) {
        this.inviteData = inviteData;
    }

    /**
     * Get isReceivedInvite
     * @return isReceivedInvite
     */
    public Boolean getIsReceivedInvite() {
        return isReceivedInvite;
    }

    public void setIsReceivedInvite(Boolean isReceivedInvite) {
        this.isReceivedInvite = isReceivedInvite;
    }

    /**
     * Get user
     * @return user
     */
    public CancelInviteResultUser getUser() {
        return user;
    }

    public void setUser(CancelInviteResultUser user) {
        this.user = user;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelInviteResult {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
        sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

