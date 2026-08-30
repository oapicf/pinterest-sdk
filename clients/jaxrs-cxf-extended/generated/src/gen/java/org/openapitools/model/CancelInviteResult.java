package org.openapitools.model;

import org.openapitools.model.CancelInviteResultUser;
import org.openapitools.model.InviteDataResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelInviteResult  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private InviteDataResponse inviteData;

  @ApiModelProperty(value = "")
  private Boolean isReceivedInvite;

  @ApiModelProperty(value = "")
  @Valid
  private CancelInviteResultUser user;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CancelInviteResult id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get inviteData
  * @return inviteData
  */
  @JsonProperty("invite_data")
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
 public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
  public CancelInviteResult inviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
  * Get isReceivedInvite
  * @return isReceivedInvite
  */
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
 public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
  public CancelInviteResult isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

 /**
  * Get user
  * @return user
  */
  @JsonProperty("user")
  public CancelInviteResultUser getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(CancelInviteResultUser user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public CancelInviteResult user(CancelInviteResultUser user) {
    this.user = user;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

