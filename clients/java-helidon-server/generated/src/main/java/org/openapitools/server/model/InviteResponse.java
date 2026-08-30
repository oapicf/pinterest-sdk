package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BusinessAccessUserSummary;
import org.openapitools.server.model.InviteAssetsSummary;
import org.openapitools.server.model.InviteDataResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A user's username or email OR a partner id that caused the error.
 */
public class InviteResponse   {

    private InviteAssetsSummary assetsSummary;
    private List<String> businessRoles = new ArrayList<>();
    private BusinessAccessUserSummary createdByBusiness;
    private BusinessAccessUserSummary createdByUser;
    private Integer createdTime;
    private String id;
    private InviteDataResponse inviteData;
    private Boolean isReceivedInvite;
    private BusinessAccessUserSummary user;

    /**
     * Default constructor.
     */
    public InviteResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteResponse.
     *
     * @param assetsSummary assetsSummary
     * @param businessRoles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @param createdByBusiness Metadata for the business that created the invite/request.
     * @param createdByUser Metadata for the user that created the invite/request.
     * @param createdTime The time the invite/request was created. Returned in milliseconds.
     * @param id Unique identifier of the invite/request.
     * @param inviteData inviteData
     * @param isReceivedInvite Indicates whether the invite/request was received.
     * @param user Metadata for the member/partner that was sent the invite/request.
     */
    public InviteResponse(
        InviteAssetsSummary assetsSummary, 
        List<String> businessRoles, 
        BusinessAccessUserSummary createdByBusiness, 
        BusinessAccessUserSummary createdByUser, 
        Integer createdTime, 
        String id, 
        InviteDataResponse inviteData, 
        Boolean isReceivedInvite, 
        BusinessAccessUserSummary user
    ) {
        this.assetsSummary = assetsSummary;
        this.businessRoles = businessRoles;
        this.createdByBusiness = createdByBusiness;
        this.createdByUser = createdByUser;
        this.createdTime = createdTime;
        this.id = id;
        this.inviteData = inviteData;
        this.isReceivedInvite = isReceivedInvite;
        this.user = user;
    }



    /**
     * Get assetsSummary
     * @return assetsSummary
     */
    public InviteAssetsSummary getAssetsSummary() {
        return assetsSummary;
    }

    public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
        this.assetsSummary = assetsSummary;
    }

    /**
     * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @return businessRoles
     */
    public List<String> getBusinessRoles() {
        return businessRoles;
    }

    public void setBusinessRoles(List<String> businessRoles) {
        this.businessRoles = businessRoles;
    }

    /**
     * Metadata for the business that created the invite/request.
     * @return createdByBusiness
     */
    public BusinessAccessUserSummary getCreatedByBusiness() {
        return createdByBusiness;
    }

    public void setCreatedByBusiness(BusinessAccessUserSummary createdByBusiness) {
        this.createdByBusiness = createdByBusiness;
    }

    /**
     * Metadata for the user that created the invite/request.
     * @return createdByUser
     */
    public BusinessAccessUserSummary getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(BusinessAccessUserSummary createdByUser) {
        this.createdByUser = createdByUser;
    }

    /**
     * The time the invite/request was created. Returned in milliseconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
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
        sb.append("class InviteResponse {\n");
        
        sb.append("    assetsSummary: ").append(toIndentedString(assetsSummary)).append("\n");
        sb.append("    businessRoles: ").append(toIndentedString(businessRoles)).append("\n");
        sb.append("    createdByBusiness: ").append(toIndentedString(createdByBusiness)).append("\n");
        sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

