package apimodels;

import apimodels.AuthRespondInviteAction;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AuthRespondInvitesBodyItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuthRespondInvitesBodyItem   {
  @JsonProperty("action")
  @NotNull
@Valid

  private AuthRespondInviteAction action;

  @JsonProperty("invite_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(min=1,max=25)

  private String inviteId;

  public AuthRespondInvitesBodyItem action(AuthRespondInviteAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

