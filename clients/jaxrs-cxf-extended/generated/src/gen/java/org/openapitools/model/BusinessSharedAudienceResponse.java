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


public class BusinessSharedAudienceResponse  {
  
 /**
  * Audience ID that was shared
  */
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
  private String audienceId;

  @ApiModelProperty(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", value = "")
  @Valid
  private List<Role> permissions = new ArrayList<>();

 /**
  * Business IDs that received the audience
  */
  @ApiModelProperty(example = "[\"549755885175\"]", value = "Business IDs that received the audience")
  private List<String> recipientBusinessIds = new ArrayList<>();
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
  public BusinessSharedAudienceResponse audienceId(String audienceId) {
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
  public BusinessSharedAudienceResponse permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public BusinessSharedAudienceResponse addPermissionsItem(Role permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
  * Business IDs that received the audience
  * @return recipientBusinessIds
  */
  @JsonProperty("recipient_business_ids")
  public List<String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  /**
   * Sets the <code>recipientBusinessIds</code> property.
   */
 public void setRecipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  /**
   * Sets the <code>recipientBusinessIds</code> property.
   */
  public BusinessSharedAudienceResponse recipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  /**
   * Adds a new item to the <code>recipientBusinessIds</code> list.
   */
  public BusinessSharedAudienceResponse addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    this.recipientBusinessIds.add(recipientBusinessIdsItem);
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
    BusinessSharedAudienceResponse businessSharedAudienceResponse = (BusinessSharedAudienceResponse) o;
    return Objects.equals(this.audienceId, businessSharedAudienceResponse.audienceId) &&
        Objects.equals(this.permissions, businessSharedAudienceResponse.permissions) &&
        Objects.equals(this.recipientBusinessIds, businessSharedAudienceResponse.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSharedAudienceResponse {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    recipientBusinessIds: ").append(toIndentedString(recipientBusinessIds)).append("\n");
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

