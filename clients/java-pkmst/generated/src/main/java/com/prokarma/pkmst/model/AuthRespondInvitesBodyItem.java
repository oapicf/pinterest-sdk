package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AuthRespondInviteAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AuthRespondInvitesBodyItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuthRespondInvitesBodyItem   {
  @JsonProperty("action")
  private AuthRespondInviteAction action;

  @JsonProperty("invite_id")
  private String inviteId;

  public AuthRespondInvitesBodyItem action(AuthRespondInviteAction action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @ApiModelProperty(required = true, value = "")
  public AuthRespondInviteAction getAction() {
    return action;
  }

  public void setAction(AuthRespondInviteAction action) {
    this.action = action;
  }

  public AuthRespondInvitesBodyItem inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  /**
   * Unique identifier of an invite.
   * @return inviteId
   */
  @ApiModelProperty(required = true, value = "Unique identifier of an invite.")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

