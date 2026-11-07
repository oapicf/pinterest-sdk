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
 * An object with the list of invite/request ids to cancel.
 **/

@ApiModel(description = "An object with the list of invite/request ids to cancel.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-07T04:05:13.632954680Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CancelInvitesRequest   {
  @JsonProperty("invite_ids")
  private List<String> inviteIds = new ArrayList<>();

  /**
   * A list of invite/request ids to cancel.
   **/
  public CancelInvitesRequest inviteIds(List<String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of invite/request ids to cancel.")
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
    CancelInvitesRequest cancelInvitesRequest = (CancelInvitesRequest) o;
    return Objects.equals(inviteIds, cancelInvitesRequest.inviteIds);
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

