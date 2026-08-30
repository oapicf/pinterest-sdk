package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuthRespondInviteAction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AuthRespondInvitesBodyItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuthRespondInvitesBodyItem   {
  private AuthRespondInviteAction action;
  private String inviteId;

  public AuthRespondInvitesBodyItem() {
  }

  @JsonCreator
  public AuthRespondInvitesBodyItem(
    @JsonProperty(required = true, value = "action") AuthRespondInviteAction action,
    @JsonProperty(required = true, value = "invite_id") String inviteId
  ) {
    this.action = action;
    this.inviteId = inviteId;
  }

  /**
   **/
  public AuthRespondInvitesBodyItem action(AuthRespondInviteAction action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "action")
  @NotNull @Valid public AuthRespondInviteAction getAction() {
    return action;
  }

  @JsonProperty(required = true, value = "action")
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
  @JsonProperty(required = true, value = "invite_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(min=1,max=25)public String getInviteId() {
    return inviteId;
  }

  @JsonProperty(required = true, value = "invite_id")
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
