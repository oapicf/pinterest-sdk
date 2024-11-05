package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Request body used to cancel invites
 **/

@ApiModel(description = "Request body used to cancel invites")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CancelInvitesBody   {
  @JsonProperty("invite_ids")
  private List<String> inviteIds = new ArrayList<>();

  /**
   * List of invite/request ids to be cancelled
   **/
  public CancelInvitesBody inviteIds(List<String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"1234567890123456789\",\"1122334455667788991\"]", required = true, value = "List of invite/request ids to be cancelled")
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

