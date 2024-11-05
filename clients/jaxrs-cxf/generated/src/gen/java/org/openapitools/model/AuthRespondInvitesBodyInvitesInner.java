package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInnerAction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthRespondInvitesBodyInvitesInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AuthRespondInvitesBodyInvitesInnerAction action;

  @ApiModelProperty(required = true, value = "Unique identifier of an invite.")
 /**
   * Unique identifier of an invite.
  **/
  private String inviteId;
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  @NotNull
  public AuthRespondInvitesBodyInvitesInnerAction getAction() {
    return action;
  }

  public void setAction(AuthRespondInvitesBodyInvitesInnerAction action) {
    this.action = action;
  }

  public AuthRespondInvitesBodyInvitesInner action(AuthRespondInvitesBodyInvitesInnerAction action) {
    this.action = action;
    return this;
  }

 /**
   * Unique identifier of an invite.
   * @return inviteId
  **/
  @JsonProperty("invite_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(min=1,max=25)  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public AuthRespondInvitesBodyInvitesInner inviteId(String inviteId) {
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
    AuthRespondInvitesBodyInvitesInner authRespondInvitesBodyInvitesInner = (AuthRespondInvitesBodyInvitesInner) o;
    return Objects.equals(this.action, authRespondInvitesBodyInvitesInner.action) &&
        Objects.equals(this.inviteId, authRespondInvitesBodyInvitesInner.inviteId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

