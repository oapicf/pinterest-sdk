package apimodels;

import apimodels.AuthRespondInvitesBodyInvitesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuthRespondInvitesBody   {
  @JsonProperty("invites")
  @NotNull
@Size(min=1,max=100)
@Valid

  private List<@Valid AuthRespondInvitesBodyInvitesInner> invites = new ArrayList<>();

  public AuthRespondInvitesBody invites(List<@Valid AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
    return this;
  }

  public AuthRespondInvitesBody addInvitesItem(AuthRespondInvitesBodyInvitesInner invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }
    this.invites.add(invitesItem);
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  public List<@Valid AuthRespondInvitesBodyInvitesInner> getInvites() {
    return invites;
  }

  public void setInvites(List<@Valid AuthRespondInvitesBodyInvitesInner> invites) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

