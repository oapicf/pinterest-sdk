package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SharedAudienceResponse  {
  
 /**
  * Audience ID that was shared
  */
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
  private String audienceId;

  @ApiModelProperty(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", value = "")
  @Valid
  private List<Role> permissions = new ArrayList<>();

 /**
  * Account IDs that received the audience
  */
  @ApiModelProperty(example = "[\"549755885175\"]", value = "Account IDs that received the audience")
  private List<String> recipientAccountIds = new ArrayList<>();
 /**
  * Audience ID that was shared
  * @return audienceId
  */
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
 public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
  public SharedAudienceResponse audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
  * Get permissions
  * @return permissions
  */
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public SharedAudienceResponse permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public SharedAudienceResponse addPermissionsItem(Role permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
  * Account IDs that received the audience
  * @return recipientAccountIds
  */
  @JsonProperty("recipient_account_ids")
  public List<String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  /**
   * Sets the <code>recipientAccountIds</code> property.
   */
 public void setRecipientAccountIds(List<String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }

  /**
   * Sets the <code>recipientAccountIds</code> property.
   */
  public SharedAudienceResponse recipientAccountIds(List<String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  /**
   * Adds a new item to the <code>recipientAccountIds</code> list.
   */
  public SharedAudienceResponse addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    this.recipientAccountIds.add(recipientAccountIdsItem);
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
    SharedAudienceResponse sharedAudienceResponse = (SharedAudienceResponse) o;
    return Objects.equals(this.audienceId, sharedAudienceResponse.audienceId) &&
        Objects.equals(this.permissions, sharedAudienceResponse.permissions) &&
        Objects.equals(this.recipientAccountIds, sharedAudienceResponse.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudienceResponse {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    recipientAccountIds: ").append(toIndentedString(recipientAccountIds)).append("\n");
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

