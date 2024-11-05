package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Metadata for the invite/request.
 */
@ApiModel(description="Metadata for the invite/request.")

public class BaseInviteDataResponseInviteData  {
  
 /**
  * The date and time when the invite/request will expire. Returned in milliseconds.
  */
  @ApiModelProperty(example = "1709748104775", value = "The date and time when the invite/request will expire. Returned in milliseconds.")
  private Integer inviteExpiration;

 /**
  * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
  */
  @ApiModelProperty(example = "PENDING", value = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.")
  private String inviteStatus;

 /**
  * The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
  */
  @ApiModelProperty(example = "MEMBER_INVITE", value = "The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.")
  private String inviteType;

 /**
  * The date and time the invite/request was last updated. Returned in milliseconds.
  */
  @ApiModelProperty(example = "1646767577816", value = "The date and time the invite/request was last updated. Returned in milliseconds.")
  private Integer lastUpdatedTime;

 /**
  * The date and time the invite/request was sent/created. Returned in milliseconds.
  */
  @ApiModelProperty(example = "1646767577816", value = "The date and time the invite/request was sent/created. Returned in milliseconds.")
  private Integer sentAt;
 /**
  * The date and time when the invite/request will expire. Returned in milliseconds.
  * @return inviteExpiration
  */
  @JsonProperty("invite_expiration")
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }

  /**
   * Sets the <code>inviteExpiration</code> property.
   */
 public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  /**
   * Sets the <code>inviteExpiration</code> property.
   */
  public BaseInviteDataResponseInviteData inviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
    return this;
  }

 /**
  * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
  * @return inviteStatus
  */
  @JsonProperty("invite_status")
  public String getInviteStatus() {
    return inviteStatus;
  }

  /**
   * Sets the <code>inviteStatus</code> property.
   */
 public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  /**
   * Sets the <code>inviteStatus</code> property.
   */
  public BaseInviteDataResponseInviteData inviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

 /**
  * The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
  * @return inviteType
  */
  @JsonProperty("invite_type")
  public String getInviteType() {
    return inviteType;
  }

  /**
   * Sets the <code>inviteType</code> property.
   */
 public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * Sets the <code>inviteType</code> property.
   */
  public BaseInviteDataResponseInviteData inviteType(String inviteType) {
    this.inviteType = inviteType;
    return this;
  }

 /**
  * The date and time the invite/request was last updated. Returned in milliseconds.
  * @return lastUpdatedTime
  */
  @JsonProperty("last_updated_time")
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  /**
   * Sets the <code>lastUpdatedTime</code> property.
   */
 public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * Sets the <code>lastUpdatedTime</code> property.
   */
  public BaseInviteDataResponseInviteData lastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

 /**
  * The date and time the invite/request was sent/created. Returned in milliseconds.
  * @return sentAt
  */
  @JsonProperty("sent_at")
  public Integer getSentAt() {
    return sentAt;
  }

  /**
   * Sets the <code>sentAt</code> property.
   */
 public void setSentAt(Integer sentAt) {
    this.sentAt = sentAt;
  }

  /**
   * Sets the <code>sentAt</code> property.
   */
  public BaseInviteDataResponseInviteData sentAt(Integer sentAt) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

