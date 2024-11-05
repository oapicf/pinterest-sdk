package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.AuthRespondInvitesBodyInvitesInnerAction;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthRespondInvitesBodyInvitesInner   {
  
  private AuthRespondInvitesBodyInvitesInnerAction action;
  private String inviteId;

  public AuthRespondInvitesBodyInvitesInner () {

  }

  public AuthRespondInvitesBodyInvitesInner (AuthRespondInvitesBodyInvitesInnerAction action, String inviteId) {
    this.action = action;
    this.inviteId = inviteId;
  }

    
  @JsonProperty("action")
  public AuthRespondInvitesBodyInvitesInnerAction getAction() {
    return action;
  }
  public void setAction(AuthRespondInvitesBodyInvitesInnerAction action) {
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
    AuthRespondInvitesBodyInvitesInner authRespondInvitesBodyInvitesInner = (AuthRespondInvitesBodyInvitesInner) o;
    return Objects.equals(action, authRespondInvitesBodyInvitesInner.action) &&
        Objects.equals(inviteId, authRespondInvitesBodyInvitesInner.inviteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, inviteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInvitesBodyInvitesInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
