package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata for the invite/request.
 */
@ApiModel(description="Metadata for the invite/request.")

public class InviteDataResponse  {
  
 /**
  * The date and time when the invite/request will expire. Returned in milliseconds.
  */
  @ApiModelProperty(value = "The date and time when the invite/request will expire. Returned in milliseconds.")

  private Integer inviteExpiration;

 /**
  * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
  */
  @ApiModelProperty(value = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.")

  private String inviteStatus;

 /**
  * The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
  */
  @ApiModelProperty(value = "The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.")

  private String inviteType;

 /**
  * The date and time the invite/request was last updated. Returned in milliseconds.
  */
  @ApiModelProperty(value = "The date and time the invite/request was last updated. Returned in milliseconds.")

  private Integer lastUpdatedTime;

 /**
  * The date and time the invite/request was sent/created. Returned in milliseconds.
  */
  @ApiModelProperty(value = "The date and time the invite/request was sent/created. Returned in milliseconds.")

  private Integer sentAt;
 /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   * @return inviteExpiration
  **/
  @JsonProperty("invite_expiration")
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }

  public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  public InviteDataResponse inviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
    return this;
  }

 /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   * @return inviteStatus
  **/
  @JsonProperty("invite_status")
  public String getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  public InviteDataResponse inviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

 /**
   * The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
   * @return inviteType
  **/
  @JsonProperty("invite_type")
  public String getInviteType() {
    return inviteType;
  }

  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  public InviteDataResponse inviteType(String inviteType) {
    this.inviteType = inviteType;
    return this;
  }

 /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   * @return lastUpdatedTime
  **/
  @JsonProperty("last_updated_time")
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public InviteDataResponse lastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

 /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   * @return sentAt
  **/
  @JsonProperty("sent_at")
  public Integer getSentAt() {
    return sentAt;
  }

  public void setSentAt(Integer sentAt) {
    this.sentAt = sentAt;
  }

  public InviteDataResponse sentAt(Integer sentAt) {
    this.sentAt = sentAt;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

