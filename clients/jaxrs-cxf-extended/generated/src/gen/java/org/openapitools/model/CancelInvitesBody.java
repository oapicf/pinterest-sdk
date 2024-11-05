package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request body used to cancel invites
 */
@ApiModel(description="Request body used to cancel invites")

public class CancelInvitesBody  {
  
 /**
  * List of invite/request ids to be cancelled
  */
  @ApiModelProperty(example = "[\"1234567890123456789\",\"1122334455667788991\"]", required = true, value = "List of invite/request ids to be cancelled")
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds = new ArrayList<>();
 /**
  * List of invite/request ids to be cancelled
  * @return inviteIds
  */
  @JsonProperty("invite_ids")
  @NotNull
 @Size(min=1,max=50)  public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getInviteIds() {
    return inviteIds;
  }

  /**
   * Sets the <code>inviteIds</code> property.
   */
 public void setInviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
    this.inviteIds = inviteIds;
  }

  /**
   * Sets the <code>inviteIds</code> property.
   */
  public CancelInvitesBody inviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  /**
   * Adds a new item to the <code>inviteIds</code> list.
   */
  public CancelInvitesBody addInviteIdsItem(String inviteIdsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

