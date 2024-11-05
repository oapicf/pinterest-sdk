package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInnerAction;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AuthRespondInvitesBodyInvitesInner   {
  
  private AuthRespondInvitesBodyInvitesInnerAction action;

  private String inviteId;

  /**
   **/
  public AuthRespondInvitesBodyInvitesInner action(AuthRespondInvitesBodyInvitesInnerAction action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("action")
  @NotNull
  public AuthRespondInvitesBodyInvitesInnerAction getAction() {
    return action;
  }
  public void setAction(AuthRespondInvitesBodyInvitesInnerAction action) {
    this.action = action;
  }


  /**
   * Unique identifier of an invite.
   **/
  public AuthRespondInvitesBodyInvitesInner inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of an invite.")
  @JsonProperty("invite_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(min=1,max=25)  public String getInviteId() {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

