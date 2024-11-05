/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;



/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */

@ApiModel(description = "An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteBusinessRoleBinding   {
  
  private String createdByBusinessId;
  private String createdByUserId;
  private BusinessAccessUserSummary user;
  private String id;
  private BaseInviteDataResponseInviteData inviteData;
  private Boolean isReceivedInvite;

  /**
   * Unique identifier for the business that created the invite/request.
   */
  public InviteBusinessRoleBinding createdByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the business that created the invite/request.")
  @JsonProperty("created_by_business_id")
  public String getCreatedByBusinessId() {
    return createdByBusinessId;
  }
  public void setCreatedByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

  /**
   * Unique identifier for the user that created the invite/request.
   */
  public InviteBusinessRoleBinding createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890123", value = "Unique identifier for the user that created the invite/request.")
  @JsonProperty("created_by_user_id")
  public String getCreatedByUserId() {
    return createdByUserId;
  }
  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  /**
   * Metadata for the user that updated the invite/request.
   */
  public InviteBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "Metadata for the user that updated the invite/request.")
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }
  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  /**
   * Unique identifier of the invite/request.
   */
  public InviteBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public InviteBusinessRoleBinding inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Indicates whether the invite/request was received.
   */
  public InviteBusinessRoleBinding isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
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

