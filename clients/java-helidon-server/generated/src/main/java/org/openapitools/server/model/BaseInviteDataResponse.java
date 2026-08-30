package org.openapitools.server.model;

import org.openapitools.server.model.BusinessAccessUserSummary;
import org.openapitools.server.model.InviteDataResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Common invite/request data returned by the business access endpoints.
 */
public class BaseInviteDataResponse   {

    private String id;
    private InviteDataResponse inviteData;
    private Boolean isReceivedInvite;
    private BusinessAccessUserSummary user;

    /**
     * Default constructor.
     */
    public BaseInviteDataResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BaseInviteDataResponse.
     *
     * @param id Unique identifier of the invite/request.
     * @param inviteData inviteData
     * @param isReceivedInvite Indicates whether the invite/request was received.
     * @param user Metadata for the member/partner that was sent the invite/request.
     */
    public BaseInviteDataResponse(
        String id, 
        InviteDataResponse inviteData, 
        Boolean isReceivedInvite, 
        BusinessAccessUserSummary user
    ) {
        this.id = id;
        this.inviteData = inviteData;
        this.isReceivedInvite = isReceivedInvite;
        this.user = user;
    }



    /**
     * Unique identifier of the invite/request.
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
     * Indicates whether the invite/request was received.
     * @return isReceivedInvite
     */
    public Boolean getIsReceivedInvite() {
        return isReceivedInvite;
    }

    public void setIsReceivedInvite(Boolean isReceivedInvite) {
        this.isReceivedInvite = isReceivedInvite;
    }

    /**
     * Metadata for the member/partner that was sent the invite/request.
     * @return user
     */
    public BusinessAccessUserSummary getUser() {
        return user;
    }

    public void setUser(BusinessAccessUserSummary user) {
        this.user = user;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseInviteDataResponse {\n");
        
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

