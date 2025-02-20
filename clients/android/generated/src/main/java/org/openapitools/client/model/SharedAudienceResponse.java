/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.Role;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SharedAudienceResponse {
  
  @SerializedName("audience_id")
  private String audienceId = null;
  @SerializedName("permissions")
  private List<Role> permissions = null;
  @SerializedName("recipient_account_ids")
  private List<String> recipientAccountIds = null;

  /**
   * Audience ID that was shared
   **/
  @ApiModelProperty(value = "Audience ID that was shared")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Role> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  /**
   * Account IDs that received the audience
   **/
  @ApiModelProperty(value = "Account IDs that received the audience")
  public List<String> getRecipientAccountIds() {
    return recipientAccountIds;
  }
  public void setRecipientAccountIds(List<String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAudienceResponse sharedAudienceResponse = (SharedAudienceResponse) o;
    return (this.audienceId == null ? sharedAudienceResponse.audienceId == null : this.audienceId.equals(sharedAudienceResponse.audienceId)) &&
        (this.permissions == null ? sharedAudienceResponse.permissions == null : this.permissions.equals(sharedAudienceResponse.permissions)) &&
        (this.recipientAccountIds == null ? sharedAudienceResponse.recipientAccountIds == null : this.recipientAccountIds.equals(sharedAudienceResponse.recipientAccountIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.audienceId == null ? 0: this.audienceId.hashCode());
    result = 31 * result + (this.permissions == null ? 0: this.permissions.hashCode());
    result = 31 * result + (this.recipientAccountIds == null ? 0: this.recipientAccountIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudienceResponse {\n");
    
    sb.append("  audienceId: ").append(audienceId).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("  recipientAccountIds: ").append(recipientAccountIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
