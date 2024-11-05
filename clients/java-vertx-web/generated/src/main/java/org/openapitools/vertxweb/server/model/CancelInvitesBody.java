package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Request body used to cancel invites
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelInvitesBody   {
  
  private List<String> inviteIds = new ArrayList<>();

  public CancelInvitesBody () {

  }

  public CancelInvitesBody (List<String> inviteIds) {
    this.inviteIds = inviteIds;
  }

    
  @JsonProperty("invite_ids")
  public List<String> getInviteIds() {
    return inviteIds;
  }
  public void setInviteIds(List<String> inviteIds) {
    this.inviteIds = inviteIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelInvitesBody cancelInvitesBody = (CancelInvitesBody) o;
    return Objects.equals(inviteIds, cancelInvitesBody.inviteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInvitesBody {\n");
    
    sb.append("    inviteIds: ").append(toIndentedString(inviteIds)).append("\n");
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
