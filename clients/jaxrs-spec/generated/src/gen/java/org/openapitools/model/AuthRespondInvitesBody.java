package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuthRespondInvitesBodyItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 **/
@ApiModel(description = "An object with a list of all the invites the user would like to respond to and the action to take.")
@JsonTypeName("AuthRespondInvitesBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuthRespondInvitesBody   {
  private @Valid List<@Valid AuthRespondInvitesBodyItem> invites = new ArrayList<>();

  public AuthRespondInvitesBody() {
  }

  @JsonCreator
  public AuthRespondInvitesBody(
    @JsonProperty(required = true, value = "invites") List<@Valid AuthRespondInvitesBodyItem> invites
  ) {
    this.invites = invites;
  }

  /**
   **/
  public AuthRespondInvitesBody invites(List<@Valid AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "invites")
  @NotNull @Valid  @Size(min=1,max=100)public List<@Valid AuthRespondInvitesBodyItem> getInvites() {
    return invites;
  }

  @JsonProperty(required = true, value = "invites")
  public void setInvites(List<@Valid AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
  }

  public AuthRespondInvitesBody addInvitesItem(AuthRespondInvitesBodyItem invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }

    this.invites.add(invitesItem);
    return this;
  }

  public AuthRespondInvitesBody removeInvitesItem(AuthRespondInvitesBodyItem invitesItem) {
    if (invitesItem != null && this.invites != null) {
      this.invites.remove(invitesItem);
    }

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
    AuthRespondInvitesBody authRespondInvitesBody = (AuthRespondInvitesBody) o;
    return Objects.equals(this.invites, authRespondInvitesBody.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInvitesBody {\n");
    
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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
