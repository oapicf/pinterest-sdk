package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An object with a list of all the invites the user would like to respond to and the action to take.
 **/
@ApiModel(description="An object with a list of all the invites the user would like to respond to and the action to take.")

public class AuthRespondInvitesBody  {
  
  @ApiModelProperty(required = true, value = "")
  private List<AuthRespondInvitesBodyInvitesInner> invites = new ArrayList<>();
 /**
   * Get invites
   * @return invites
  **/
  @JsonProperty("invites")
  public List<AuthRespondInvitesBodyInvitesInner> getInvites() {
    return invites;
  }

  public void setInvites(List<AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
  }

  public AuthRespondInvitesBody invites(List<AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
    return this;
  }

  public AuthRespondInvitesBody addInvitesItem(AuthRespondInvitesBodyInvitesInner invitesItem) {
    this.invites.add(invitesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

