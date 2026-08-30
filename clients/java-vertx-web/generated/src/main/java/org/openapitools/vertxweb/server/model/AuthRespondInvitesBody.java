package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AuthRespondInvitesBodyItem;

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthRespondInvitesBody   {
  
  private List<AuthRespondInvitesBodyItem> invites = new ArrayList<>();

  public AuthRespondInvitesBody () {

  }

  public AuthRespondInvitesBody (List<AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
  }

    
  @JsonProperty("invites")
  public List<AuthRespondInvitesBodyItem> getInvites() {
    return invites;
  }
  public void setInvites(List<AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
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
    return Objects.equals(invites, authRespondInvitesBody.invites);
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
