package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Metadata for the invite/request.
 */

@Schema(name = "InviteDataResponse", description = "Metadata for the invite/request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteDataResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer inviteExpiration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String inviteStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String inviteType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer lastUpdatedTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer sentAt;

  public InviteDataResponse inviteExpiration(@Nullable Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
    return this;
  }

  /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   * @return inviteExpiration
   */
  
  @Schema(name = "invite_expiration", description = "The date and time when the invite/request will expire. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_expiration")
  public @Nullable Integer getInviteExpiration() {
    return inviteExpiration;
  }

  @JsonProperty("invite_expiration")
  public void setInviteExpiration(@Nullable Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  public InviteDataResponse inviteStatus(@Nullable String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

  /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   * @return inviteStatus
   */
  
  @Schema(name = "invite_status", description = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_status")
  public @Nullable String getInviteStatus() {
    return inviteStatus;
  }

  @JsonProperty("invite_status")
  public void setInviteStatus(@Nullable String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  public InviteDataResponse inviteType(@Nullable String inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
   * @return inviteType
   */
  
  @Schema(name = "invite_type", description = "The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_type")
  public @Nullable String getInviteType() {
    return inviteType;
  }

  @JsonProperty("invite_type")
  public void setInviteType(@Nullable String inviteType) {
    this.inviteType = inviteType;
  }

  public InviteDataResponse lastUpdatedTime(@Nullable Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   * @return lastUpdatedTime
   */
  
  @Schema(name = "last_updated_time", description = "The date and time the invite/request was last updated. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_updated_time")
  public @Nullable Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  @JsonProperty("last_updated_time")
  public void setLastUpdatedTime(@Nullable Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public InviteDataResponse sentAt(@Nullable Integer sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   * @return sentAt
   */
  
  @Schema(name = "sent_at", description = "The date and time the invite/request was sent/created. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sent_at")
  public @Nullable Integer getSentAt() {
    return sentAt;
  }

  @JsonProperty("sent_at")
  public void setSentAt(@Nullable Integer sentAt) {
    this.sentAt = sentAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteDataResponse inviteDataResponse = (InviteDataResponse) o;
    return Objects.equals(this.inviteExpiration, inviteDataResponse.inviteExpiration) &&
        Objects.equals(this.inviteStatus, inviteDataResponse.inviteStatus) &&
        Objects.equals(this.inviteType, inviteDataResponse.inviteType) &&
        Objects.equals(this.lastUpdatedTime, inviteDataResponse.lastUpdatedTime) &&
        Objects.equals(this.sentAt, inviteDataResponse.sentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteExpiration, inviteStatus, inviteType, lastUpdatedTime, sentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteDataResponse {\n");
    sb.append("    inviteExpiration: ").append(toIndentedString(inviteExpiration)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

