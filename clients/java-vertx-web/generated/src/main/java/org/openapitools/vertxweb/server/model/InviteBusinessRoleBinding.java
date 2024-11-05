package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BaseInviteDataResponseInviteData;
import org.openapitools.vertxweb.server.model.BusinessAccessUserSummary;

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteBusinessRoleBinding   {
  
  private String createdByBusinessId;
  private String createdByUserId;
  private BusinessAccessUserSummary user;
  private String id;
  private BaseInviteDataResponseInviteData inviteData;
  private Boolean isReceivedInvite;

  public InviteBusinessRoleBinding () {

  }

  public InviteBusinessRoleBinding (String createdByBusinessId, String createdByUserId, BusinessAccessUserSummary user, String id, BaseInviteDataResponseInviteData inviteData, Boolean isReceivedInvite) {
    this.createdByBusinessId = createdByBusinessId;
    this.createdByUserId = createdByUserId;
    this.user = user;
    this.id = id;
    this.inviteData = inviteData;
    this.isReceivedInvite = isReceivedInvite;
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

    
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }
  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

    
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
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
        Objects.equals(user, inviteBusinessRoleBinding.user) &&
        Objects.equals(id, inviteBusinessRoleBinding.id) &&
        Objects.equals(inviteData, inviteBusinessRoleBinding.inviteData) &&
        Objects.equals(isReceivedInvite, inviteBusinessRoleBinding.isReceivedInvite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByBusinessId, createdByUserId, user, id, inviteData, isReceivedInvite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteBusinessRoleBinding {\n");
    
    sb.append("    createdByBusinessId: ").append(toIndentedString(createdByBusinessId)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
