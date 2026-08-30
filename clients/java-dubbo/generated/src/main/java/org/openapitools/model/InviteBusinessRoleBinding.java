package org.openapitools.model;

import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteDataResponse;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
public class InviteBusinessRoleBinding implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier for the business that created the invite/request.
   */
  @JsonProperty("created_by_business_id")
  private String createdByBusinessId;

  /**
   * Unique identifier for the user that created the invite/request.
   */
  @JsonProperty("created_by_user_id")
  private String createdByUserId;

  /**
   * Unique identifier of the invite/request.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("invite_data")
  private InviteDataResponse inviteData;

  /**
   * Indicates whether the invite/request was received.
   */
  @JsonProperty("is_received_invite")
  private Boolean isReceivedInvite;

  /**
   * Metadata for the member/partner that was sent the invite/request.
   */
  @JsonProperty("user")
  private BusinessAccessUserSummary user;

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
   * 
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteBusinessRoleBinding inviteBusinessRoleBinding = (InviteBusinessRoleBinding) o;
    return Objects.equals(this.createdByBusinessId, inviteBusinessRoleBinding.createdByBusinessId) &&
        Objects.equals(this.createdByUserId, inviteBusinessRoleBinding.createdByUserId) &&
        Objects.equals(this.id, inviteBusinessRoleBinding.id) &&
        Objects.equals(this.inviteData, inviteBusinessRoleBinding.inviteData) &&
        Objects.equals(this.isReceivedInvite, inviteBusinessRoleBinding.isReceivedInvite) &&
        Objects.equals(this.user, inviteBusinessRoleBinding.user);
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
