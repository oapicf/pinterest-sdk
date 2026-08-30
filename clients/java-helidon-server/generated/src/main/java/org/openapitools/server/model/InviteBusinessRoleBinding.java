package org.openapitools.server.model;

import org.openapitools.server.model.BusinessAccessUserSummary;
import org.openapitools.server.model.InviteDataResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
public class InviteBusinessRoleBinding   {

    private String createdByBusinessId;
    private String createdByUserId;
    private String id;
    private InviteDataResponse inviteData;
    private Boolean isReceivedInvite;
    private BusinessAccessUserSummary user;

    /**
     * Default constructor.
     */
    public InviteBusinessRoleBinding() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteBusinessRoleBinding.
     *
     * @param createdByBusinessId Unique identifier for the business that created the invite/request.
     * @param createdByUserId Unique identifier for the user that created the invite/request.
     * @param id Unique identifier of the invite/request.
     * @param inviteData inviteData
     * @param isReceivedInvite Indicates whether the invite/request was received.
     * @param user Metadata for the member/partner that was sent the invite/request.
     */
    public InviteBusinessRoleBinding(
        String createdByBusinessId, 
        String createdByUserId, 
        String id, 
        InviteDataResponse inviteData, 
        Boolean isReceivedInvite, 
        BusinessAccessUserSummary user
    ) {
        this.createdByBusinessId = createdByBusinessId;
        this.createdByUserId = createdByUserId;
        this.id = id;
        this.inviteData = inviteData;
        this.isReceivedInvite = isReceivedInvite;
        this.user = user;
    }



    /**
     * Unique identifier for the business that created the invite/request.
     * @return createdByBusinessId
     */
    public String getCreatedByBusinessId() {
        return createdByBusinessId;
    }

    public void setCreatedByBusinessId(String createdByBusinessId) {
        this.createdByBusinessId = createdByBusinessId;
    }

    /**
     * Unique identifier for the user that created the invite/request.
     * @return createdByUserId
     */
    public String getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
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
        sb.append("class InviteBusinessRoleBinding {\n");
        
        sb.append("    createdByBusinessId: ").append(toIndentedString(createdByBusinessId)).append("\n");
        sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
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

