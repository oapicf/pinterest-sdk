package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 **/
@ApiModel(description="An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.")

public class InviteBusinessRoleBinding  {
  
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the business that created the invite/request.")
 /**
   * Unique identifier for the business that created the invite/request.
  **/
  private String createdByBusinessId;

  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the user that created the invite/request.")
 /**
   * Unique identifier for the user that created the invite/request.
  **/
  private String createdByUserId;

  @ApiModelProperty(value = "Metadata for the user that updated the invite/request.")
  @Valid
 /**
   * Metadata for the user that updated the invite/request.
  **/
  private BusinessAccessUserSummary user;

  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
 /**
   * Unique identifier of the invite/request.
  **/
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private BaseInviteDataResponseInviteData inviteData;

  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
 /**
   * Indicates whether the invite/request was received.
  **/
  private Boolean isReceivedInvite;
 /**
   * Unique identifier for the business that created the invite/request.
   * @return createdByBusinessId
  **/
  @JsonProperty("created_by_business_id")
  public String getCreatedByBusinessId() {
    return createdByBusinessId;
  }

  public void setCreatedByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

  public InviteBusinessRoleBinding createdByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
    return this;
  }

 /**
   * Unique identifier for the user that created the invite/request.
   * @return createdByUserId
  **/
  @JsonProperty("created_by_user_id")
  public String getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public InviteBusinessRoleBinding createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

 /**
   * Metadata for the user that updated the invite/request.
   * @return user
  **/
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  public InviteBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

 /**
   * Unique identifier of the invite/request.
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get inviteData
   * @return inviteData
  **/
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }

  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  public InviteBusinessRoleBinding inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
  **/
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public InviteBusinessRoleBinding isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
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
        Objects.equals(this.user, inviteBusinessRoleBinding.user) &&
        Objects.equals(this.id, inviteBusinessRoleBinding.id) &&
        Objects.equals(this.inviteData, inviteBusinessRoleBinding.inviteData) &&
        Objects.equals(this.isReceivedInvite, inviteBusinessRoleBinding.isReceivedInvite);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

