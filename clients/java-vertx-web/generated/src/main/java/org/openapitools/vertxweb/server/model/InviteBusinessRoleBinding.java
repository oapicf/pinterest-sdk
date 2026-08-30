package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BusinessAccessUserSummary;
import org.openapitools.vertxweb.server.model.InviteDataResponse;

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteBusinessRoleBinding   {
  
  private String createdByBusinessId;
  private String createdByUserId;
  private String id;
  private InviteDataResponse inviteData;
  private Boolean isReceivedInvite;
  private BusinessAccessUserSummary user;

  public InviteBusinessRoleBinding () {

  }

  public InviteBusinessRoleBinding (String createdByBusinessId, String createdByUserId, String id, InviteDataResponse inviteData, Boolean isReceivedInvite, BusinessAccessUserSummary user) {
    this.createdByBusinessId = createdByBusinessId;
    this.createdByUserId = createdByUserId;
    this.id = id;
    this.inviteData = inviteData;
    this.isReceivedInvite = isReceivedInvite;
    this.user = user;
  }

    
  @JsonProperty("created_by_business_id")
  public String getCreatedByBusinessId() {
    return createdByBusinessId;
  }
  public void setCreatedByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

    
  @JsonProperty("created_by_user_id")
  public String getCreatedByUserId() {
    return createdByUserId;
  }
  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("invite_data")
  public InviteDataResponse getInviteData() {
    return inviteData;
  }
  public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

    
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

    
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }
  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteBusinessRoleBinding inviteBusinessRoleBinding = (InviteBusinessRoleBinding) o;
    return Objects.equals(createdByBusinessId, inviteBusinessRoleBinding.createdByBusinessId) &&
        Objects.equals(createdByUserId, inviteBusinessRoleBinding.createdByUserId) &&
        Objects.equals(id, inviteBusinessRoleBinding.id) &&
        Objects.equals(inviteData, inviteBusinessRoleBinding.inviteData) &&
        Objects.equals(isReceivedInvite, inviteBusinessRoleBinding.isReceivedInvite) &&
        Objects.equals(user, inviteBusinessRoleBinding.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByBusinessId, createdByUserId, id, inviteData, isReceivedInvite, user);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
