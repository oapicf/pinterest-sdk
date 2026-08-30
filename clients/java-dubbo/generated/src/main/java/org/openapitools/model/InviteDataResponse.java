package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Metadata for the invite/request.
 */
public class InviteDataResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   */
  @JsonProperty("invite_expiration")
  private Integer inviteExpiration;

  /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   */
  @JsonProperty("invite_status")
  private String inviteStatus;

  /**
   * The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
   */
  @JsonProperty("invite_type")
  private String inviteType;

  /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   */
  @JsonProperty("last_updated_time")
  private Integer lastUpdatedTime;

  /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   */
  @JsonProperty("sent_at")
  private Integer sentAt;

  /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   * @return inviteExpiration
   */
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }

  public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   * @return inviteStatus
   */
  public String getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  /**
   * The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
   * @return inviteType
   */
  public String getInviteType() {
    return inviteType;
  }

  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   * @return lastUpdatedTime
   */
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   * @return sentAt
   */
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
