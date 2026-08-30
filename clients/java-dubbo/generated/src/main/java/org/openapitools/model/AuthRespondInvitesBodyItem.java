package org.openapitools.model;

import org.openapitools.model.AuthRespondInviteAction;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AuthRespondInvitesBodyItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("action")
  private AuthRespondInviteAction action;

  /**
   * Unique identifier of an invite.
   */
  @JsonProperty("invite_id")
  private String inviteId;

  /**
   * 
   * @return action
   */
  public AuthRespondInviteAction getAction() {
    return action;
  }

  public void setAction(AuthRespondInviteAction action) {
    this.action = action;
  }

  /**
   * Unique identifier of an invite.
   * @return inviteId
   */
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
