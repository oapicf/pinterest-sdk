package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteDataResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */

@Schema(name = "InviteBusinessRoleBinding", description = "An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteBusinessRoleBinding {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String createdByBusinessId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String createdByUserId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable InviteDataResponse inviteData;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isReceivedInvite;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BusinessAccessUserSummary user;

  public InviteBusinessRoleBinding createdByBusinessId(@Nullable String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
    return this;
  }

  /**
   * Unique identifier for the business that created the invite/request.
   * @return createdByBusinessId
   */
  
  @Schema(name = "created_by_business_id", example = "1234567890123", description = "Unique identifier for the business that created the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_business_id")
  public @Nullable String getCreatedByBusinessId() {
    return createdByBusinessId;
  }

  @JsonProperty("created_by_business_id")
  public void setCreatedByBusinessId(@Nullable String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

  public InviteBusinessRoleBinding createdByUserId(@Nullable String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  /**
   * Unique identifier for the user that created the invite/request.
   * @return createdByUserId
   */
  
  @Schema(name = "created_by_user_id", example = "1234567890123", description = "Unique identifier for the user that created the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_user_id")
  public @Nullable String getCreatedByUserId() {
    return createdByUserId;
  }

  @JsonProperty("created_by_user_id")
  public void setCreatedByUserId(@Nullable String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public InviteBusinessRoleBinding id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the invite/request.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public InviteBusinessRoleBinding inviteData(@Nullable InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  /**
   * Get inviteData
   * @return inviteData
   */
  @Valid 
  @Schema(name = "invite_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_data")
  public @Nullable InviteDataResponse getInviteData() {
    return inviteData;
  }

  @JsonProperty("invite_data")
  public void setInviteData(@Nullable InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  public InviteBusinessRoleBinding isReceivedInvite(@Nullable Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
   */
  
  @Schema(name = "is_received_invite", description = "Indicates whether the invite/request was received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_received_invite")
  public @Nullable Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  @JsonProperty("is_received_invite")
  public void setIsReceivedInvite(@Nullable Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public InviteBusinessRoleBinding user(@Nullable BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
   */
  @Valid 
  @Schema(name = "user", description = "Metadata for the member/partner that was sent the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable BusinessAccessUserSummary getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(@Nullable BusinessAccessUserSummary user) {
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

