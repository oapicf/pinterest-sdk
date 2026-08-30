package org.openapitools.model;

import org.openapitools.model.AuthRespondInviteAction;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthRespondInvitesBodyItem  {
  
  @ApiModelProperty(required = true, value = "")

  private AuthRespondInviteAction action;

 /**
  * Unique identifier of an invite.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of an invite.")

  private String inviteId;
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public AuthRespondInviteAction getAction() {
    return action;
  }

  public void setAction(AuthRespondInviteAction action) {
    this.action = action;
  }

  public AuthRespondInvitesBodyItem action(AuthRespondInviteAction action) {
    this.action = action;
    return this;
  }

 /**
   * Unique identifier of an invite.
   * @return inviteId
  **/
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public AuthRespondInvitesBodyItem inviteId(String inviteId) {
    this.inviteId = inviteId;
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
    AuthRespondInvitesBodyItem authRespondInvitesBodyItem = (AuthRespondInvitesBodyItem) o;
    return Objects.equals(this.action, authRespondInvitesBodyItem.action) &&
        Objects.equals(this.inviteId, authRespondInvitesBodyItem.inviteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, inviteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInvitesBodyItem {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
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

