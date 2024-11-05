package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request body used to cancel invites
 */
@ApiModel(description = "Request body used to cancel invites")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CancelInvitesBody   {
  @JsonProperty("invite_ids")
  
  private List<String> inviteIds = new ArrayList<>();

  public CancelInvitesBody inviteIds(List<String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  public CancelInvitesBody addInviteIdsItem(String inviteIdsItem) {
    if (this.inviteIds == null) {
      this.inviteIds = new ArrayList<>();
    }
    this.inviteIds.add(inviteIdsItem);
    return this;
  }

  /**
   * List of invite/request ids to be cancelled
   * @return inviteIds
   */
  @ApiModelProperty(example = "[\"1234567890123456789\",\"1122334455667788991\"]", required = true, value = "List of invite/request ids to be cancelled")
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
    return Objects.equals(this.inviteIds, cancelInvitesBody.inviteIds);
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

