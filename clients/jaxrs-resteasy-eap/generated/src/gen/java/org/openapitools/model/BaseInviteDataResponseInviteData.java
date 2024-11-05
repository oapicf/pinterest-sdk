package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Metadata for the invite/request.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BaseInviteDataResponseInviteData   {
  
  private Integer inviteExpiration;
  private String inviteStatus;
  private String inviteType;
  private Integer lastUpdatedTime;
  private Integer sentAt;

  /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   **/
  
  @ApiModelProperty(example = "1709748104775", value = "The date and time when the invite/request will expire. Returned in milliseconds.")
  @JsonProperty("invite_expiration")
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }
  public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

  /**
   * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
   **/
  
  @ApiModelProperty(example = "PENDING", value = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.")
  @JsonProperty("invite_status")
  public String getInviteStatus() {
    return inviteStatus;
  }
  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  /**
   * The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
   **/
  
  @ApiModelProperty(example = "MEMBER_INVITE", value = "The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.")
  @JsonProperty("invite_type")
  public String getInviteType() {
    return inviteType;
  }
  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * The date and time the invite/request was last updated. Returned in milliseconds.
   **/
  
  @ApiModelProperty(example = "1646767577816", value = "The date and time the invite/request was last updated. Returned in milliseconds.")
  @JsonProperty("last_updated_time")
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * The date and time the invite/request was sent/created. Returned in milliseconds.
   **/
  
  @ApiModelProperty(example = "1646767577816", value = "The date and time the invite/request was sent/created. Returned in milliseconds.")
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

