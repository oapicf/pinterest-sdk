package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CancelInviteResultUser;
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
 * CancelInviteResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInviteResult {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable InviteDataResponse inviteData;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isReceivedInvite;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CancelInviteResultUser user;

  public CancelInviteResult id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public CancelInviteResult inviteData(@Nullable InviteDataResponse inviteData) {
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

  public CancelInviteResult isReceivedInvite(@Nullable Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  /**
   * Get isReceivedInvite
   * @return isReceivedInvite
   */
  
  @Schema(name = "is_received_invite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_received_invite")
  public @Nullable Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  @JsonProperty("is_received_invite")
  public void setIsReceivedInvite(@Nullable Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public CancelInviteResult user(@Nullable CancelInviteResultUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable CancelInviteResultUser getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(@Nullable CancelInviteResultUser user) {
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
    CancelInviteResult cancelInviteResult = (CancelInviteResult) o;
    return Objects.equals(this.id, cancelInviteResult.id) &&
        Objects.equals(this.inviteData, cancelInviteResult.inviteData) &&
        Objects.equals(this.isReceivedInvite, cancelInviteResult.isReceivedInvite) &&
        Objects.equals(this.user, cancelInviteResult.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInviteResult {\n");
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

