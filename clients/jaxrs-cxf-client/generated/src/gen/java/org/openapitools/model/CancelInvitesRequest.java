package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object with the list of invite/request ids to cancel.
 */
@ApiModel(description="An object with the list of invite/request ids to cancel.")

public class CancelInvitesRequest  {
  
 /**
  * A list of invite/request ids to cancel.
  */
  @ApiModelProperty(required = true, value = "A list of invite/request ids to cancel.")

  private List<String> inviteIds = new ArrayList<>();
 /**
   * A list of invite/request ids to cancel.
   * @return inviteIds
  **/
  @JsonProperty("invite_ids")
  public List<String> getInviteIds() {
    return inviteIds;
  }

  public void setInviteIds(List<String> inviteIds) {
    this.inviteIds = inviteIds;
  }

  public CancelInvitesRequest inviteIds(List<String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  public CancelInvitesRequest addInviteIdsItem(String inviteIdsItem) {
    this.inviteIds.add(inviteIdsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

