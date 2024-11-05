package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInner;



/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 **/

@ApiModel(description = "An object with a list of all the invites the user would like to respond to and the action to take.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AuthRespondInvitesBody   {
  @JsonProperty("invites")
  private List<AuthRespondInvitesBodyInvitesInner> invites = new ArrayList<>();

  /**
   **/
  public AuthRespondInvitesBody invites(List<AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("invites")
  public List<AuthRespondInvitesBodyInvitesInner> getInvites() {
    return invites;
  }
  public void setInvites(List<AuthRespondInvitesBodyInvitesInner> invites) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

