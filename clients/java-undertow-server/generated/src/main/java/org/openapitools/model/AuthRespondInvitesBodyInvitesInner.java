/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInnerAction;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AuthRespondInvitesBodyInvitesInner   {
  
  private AuthRespondInvitesBodyInvitesInnerAction action;
  private String inviteId;

  /**
   */
  public AuthRespondInvitesBodyInvitesInner action(AuthRespondInvitesBodyInvitesInnerAction action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("action")
  public AuthRespondInvitesBodyInvitesInnerAction getAction() {
    return action;
  }
  public void setAction(AuthRespondInvitesBodyInvitesInnerAction action) {
    this.action = action;
  }

  /**
   * Unique identifier of an invite.
   */
  public AuthRespondInvitesBodyInvitesInner inviteId(String inviteId) {
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

