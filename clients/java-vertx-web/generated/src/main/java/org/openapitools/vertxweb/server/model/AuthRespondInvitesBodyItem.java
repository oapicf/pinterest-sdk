package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AuthRespondInviteAction;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthRespondInvitesBodyItem   {
  
  private AuthRespondInviteAction action;
  private String inviteId;

  public AuthRespondInvitesBodyItem () {

  }

  public AuthRespondInvitesBodyItem (AuthRespondInviteAction action, String inviteId) {
    this.action = action;
    this.inviteId = inviteId;
  }

    
  @JsonProperty("action")
  public AuthRespondInviteAction getAction() {
    return action;
  }
  public void setAction(AuthRespondInviteAction action) {
    this.action = action;
  }

    
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
