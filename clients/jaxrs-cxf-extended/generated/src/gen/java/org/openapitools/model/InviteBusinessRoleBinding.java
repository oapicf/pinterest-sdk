package org.openapitools.model;

import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteDataResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
@ApiModel(description="An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.")

public class InviteBusinessRoleBinding  {
  
 /**
  * Unique identifier for the business that created the invite/request.
  */
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the business that created the invite/request.")
  private String createdByBusinessId;

 /**
  * Unique identifier for the user that created the invite/request.
  */
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the user that created the invite/request.")
  private String createdByUserId;

 /**
  * Unique identifier of the invite/request.
  */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private InviteDataResponse inviteData;

 /**
  * Indicates whether the invite/request was received.
  */
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  private Boolean isReceivedInvite;

 /**
  * Metadata for the member/partner that was sent the invite/request.
  */
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
  @Valid
  private BusinessAccessUserSummary user;
 /**
  * Unique identifier for the business that created the invite/request.
  * @return createdByBusinessId
  */
  @JsonProperty("created_by_business_id")
  public String getCreatedByBusinessId() {
    return createdByBusinessId;
  }

  /**
   * Sets the <code>createdByBusinessId</code> property.
   */
 public void setCreatedByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

  /**
   * Sets the <code>createdByBusinessId</code> property.
   */
  public InviteBusinessRoleBinding createdByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
    return this;
  }

 /**
  * Unique identifier for the user that created the invite/request.
  * @return createdByUserId
  */
  @JsonProperty("created_by_user_id")
  public String getCreatedByUserId() {
    return createdByUserId;
  }

  /**
   * Sets the <code>createdByUserId</code> property.
   */
 public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  /**
   * Sets the <code>createdByUserId</code> property.
   */
  public InviteBusinessRoleBinding createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

 /**
  * Unique identifier of the invite/request.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public InviteBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get inviteData
  * @return inviteData
  */
  @JsonProperty("invite_data")
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
 public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
  public InviteBusinessRoleBinding inviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
  * Indicates whether the invite/request was received.
  * @return isReceivedInvite
  */
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
 public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
  public InviteBusinessRoleBinding isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

 /**
  * Metadata for the member/partner that was sent the invite/request.
  * @return user
  */
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public InviteBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

