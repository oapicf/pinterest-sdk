package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BusinessAccessUserSummary;
import com.prokarma.pkmst.model.InviteDataResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
@ApiModel(description = "An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteBusinessRoleBinding   {
  @JsonProperty("created_by_business_id")
  private String createdByBusinessId;

  @JsonProperty("created_by_user_id")
  private String createdByUserId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("invite_data")
  private InviteDataResponse inviteData;

  @JsonProperty("is_received_invite")
  private Boolean isReceivedInvite;

  @JsonProperty("user")
  private BusinessAccessUserSummary user;

  public InviteBusinessRoleBinding createdByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
    return this;
  }

  /**
   * Unique identifier for the business that created the invite/request.
   * @return createdByBusinessId
   */
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the business that created the invite/request.")
  public String getCreatedByBusinessId() {
    return createdByBusinessId;
  }

  public void setCreatedByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

  public InviteBusinessRoleBinding createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  /**
   * Unique identifier for the user that created the invite/request.
   * @return createdByUserId
   */
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the user that created the invite/request.")
  public String getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public InviteBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the invite/request.
   * @return id
   */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteBusinessRoleBinding inviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  /**
   * Get inviteData
   * @return inviteData
   */
  @ApiModelProperty(value = "")
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  public InviteBusinessRoleBinding isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
   */
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public InviteBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
   */
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
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

