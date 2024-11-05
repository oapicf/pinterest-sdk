package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Metadata for the invite/request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BaseInviteDataResponseInviteData   {
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

  public BaseInviteDataResponseInviteData inviteExpiration(Integer inviteExpiration) {
    this.inviteExpiration = inviteExpiration;
    return this;
  }

   /**
   * The date and time when the invite/request will expire. Returned in milliseconds.
   * @return inviteExpiration
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

