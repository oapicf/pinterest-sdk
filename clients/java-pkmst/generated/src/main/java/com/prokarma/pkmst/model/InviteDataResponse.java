package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Metadata for the invite/request.
 */
@ApiModel(description = "Metadata for the invite/request.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteDataResponse   {
  @JsonProperty("invite_expiration")
  private Integer inviteExpiration;

  @JsonProperty("invite_status")
  private String inviteStatus;

  @JsonProperty("invite_type")
  private String inviteType;

  @JsonProperty("last_updated_time")
  private Integer lastUpdatedTime;

  @JsonProperty("sent_at")
  private Integer sentAt;

  public InviteDataResponse inviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
    return this;
  }

  /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   * @return inviteExpiration
   */
  @ApiModelProperty(value = "The date and time when the invite/request will expire. Returned in milliseconds.")
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }

  public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  public InviteDataResponse inviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

  /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   * @return inviteStatus
   */
  @ApiModelProperty(value = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.")
  public String getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  public InviteDataResponse inviteType(String inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
   * @return inviteType
   */
  @ApiModelProperty(value = "The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.")
  public String getInviteType() {
    return inviteType;
  }

  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  public InviteDataResponse lastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   * @return lastUpdatedTime
   */
  @ApiModelProperty(value = "The date and time the invite/request was last updated. Returned in milliseconds.")
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public InviteDataResponse sentAt(Integer sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   * @return sentAt
   */
  @ApiModelProperty(value = "The date and time the invite/request was sent/created. Returned in milliseconds.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

