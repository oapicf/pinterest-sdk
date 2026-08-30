package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An object with the list of invite/request ids to cancel.
 */
public class CancelInvitesRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of invite/request ids to cancel.
   */
  @JsonProperty("invite_ids")
  private List<String> inviteIds = new ArrayList<>();

  /**
   * A list of invite/request ids to cancel.
   * @return inviteIds
   */
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
    CancelInvitesRequest cancelInvitesRequest = (CancelInvitesRequest) o;
    return Objects.equals(this.inviteIds, cancelInvitesRequest.inviteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInvitesRequest {\n");
    
    sb.append("    inviteIds: ").append(toIndentedString(inviteIds)).append("\n");
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
