package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata for the invite/request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseInviteDataResponseInviteData   {
  
  private Integer inviteExpiration;
  private String inviteStatus;
  private String inviteType;
  private Integer lastUpdatedTime;
  private Integer sentAt;

  public BaseInviteDataResponseInviteData () {

  }

  public BaseInviteDataResponseInviteData (Integer inviteExpiration, String inviteStatus, String inviteType, Integer lastUpdatedTime, Integer sentAt) {
    this.inviteExpiration = inviteExpiration;
    this.inviteStatus = inviteStatus;
    this.inviteType = inviteType;
    this.lastUpdatedTime = lastUpdatedTime;
    this.sentAt = sentAt;
  }

    
  @JsonProperty("invite_expiration")
  public Integer getInviteExpiration() {
    return inviteExpiration;
  }
  public void setInviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
  }

    
  @JsonProperty("invite_status")
  public String getInviteStatus() {
    return inviteStatus;
  }
  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

    
  @JsonProperty("invite_type")
  public String getInviteType() {
    return inviteType;
  }
  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

    
  @JsonProperty("last_updated_time")
  public Integer getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Integer lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

    
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
    return Objects.equals(inviteExpiration, baseInviteDataResponseInviteData.inviteExpiration) &&
        Objects.equals(inviteStatus, baseInviteDataResponseInviteData.inviteStatus) &&
        Objects.equals(inviteType, baseInviteDataResponseInviteData.inviteType) &&
        Objects.equals(lastUpdatedTime, baseInviteDataResponseInviteData.lastUpdatedTime) &&
        Objects.equals(sentAt, baseInviteDataResponseInviteData.sentAt);
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
