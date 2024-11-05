package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Metadata for the invite/request.
 */

@Schema(name = "BaseInviteDataResponse_invite_data", description = "Metadata for the invite/request.")
@JsonTypeName("BaseInviteDataResponse_invite_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BaseInviteDataResponseInviteData {

  private Integer inviteExpiration;

  private String inviteStatus;

  private String inviteType;

  private Integer lastUpdatedTime;

  private Integer sentAt;

  public BaseInviteDataResponseInviteData inviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
    return this;
  }

  /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   * @return inviteExpiration
   */
  
  @Schema(name = "invite_expiration", example = "1709748104775", description = "The date and time when the invite/request will expire. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_expiration")
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }

  public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  public BaseInviteDataResponseInviteData inviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

  /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   * @return inviteStatus
   */
  
  @Schema(name = "invite_status", example = "PENDING", description = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_status")
  public String getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  public BaseInviteDataResponseInviteData inviteType(String inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
   * @return inviteType
   */
  
  @Schema(name = "invite_type", example = "MEMBER_INVITE", description = "The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_type")
  public String getInviteType() {
    return inviteType;
  }

  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  public BaseInviteDataResponseInviteData lastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   * @return lastUpdatedTime
   */
  
  @Schema(name = "last_updated_time", example = "1646767577816", description = "The date and time the invite/request was last updated. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_updated_time")
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public BaseInviteDataResponseInviteData sentAt(Integer sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   * @return sentAt
   */
  
  @Schema(name = "sent_at", example = "1646767577816", description = "The date and time the invite/request was sent/created. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sent_at")
  public Integer getSentAt() {
    return sentAt;
  }

  public void setSentAt(Integer sentAt) {
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
    BaseInviteDataResponseInviteData baseInviteDataResponseInviteData = (BaseInviteDataResponseInviteData) o;
    return Objects.equals(this.inviteExpiration, baseInviteDataResponseInviteData.inviteExpiration) &&
        Objects.equals(this.inviteStatus, baseInviteDataResponseInviteData.inviteStatus) &&
        Objects.equals(this.inviteType, baseInviteDataResponseInviteData.inviteType) &&
        Objects.equals(this.lastUpdatedTime, baseInviteDataResponseInviteData.lastUpdatedTime) &&
        Objects.equals(this.sentAt, baseInviteDataResponseInviteData.sentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteExpiration, inviteStatus, inviteType, lastUpdatedTime, sentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseInviteDataResponseInviteData {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

