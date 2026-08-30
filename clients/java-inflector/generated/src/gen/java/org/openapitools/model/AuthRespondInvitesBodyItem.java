package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuthRespondInviteAction;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuthRespondInvitesBodyItem   {
  @JsonProperty("action")
  private AuthRespondInviteAction action;

  @JsonProperty("invite_id")
  private String inviteId;

  /**
   **/
  public AuthRespondInvitesBodyItem action(AuthRespondInviteAction action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("action")
  public AuthRespondInviteAction getAction() {
    return action;
  }
  public void setAction(AuthRespondInviteAction action) {
    this.action = action;
  }

  /**
   * Unique identifier of an invite.
   **/
  public AuthRespondInvitesBodyItem inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of an invite.")
  @JsonProperty("invite_id")
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
    return Objects.equals(action, authRespondInvitesBodyItem.action) &&
        Objects.equals(inviteId, authRespondInvitesBodyItem.inviteId);
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

