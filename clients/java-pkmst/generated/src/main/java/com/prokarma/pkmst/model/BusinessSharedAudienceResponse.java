package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.Role;
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
 * BusinessSharedAudienceResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessSharedAudienceResponse   {
  @JsonProperty("audience_id")
  private String audienceId;

  @JsonProperty("permissions")
  
  private List<Role> permissions = null;

  @JsonProperty("recipient_business_ids")
  
  private List<String> recipientBusinessIds = null;

  public BusinessSharedAudienceResponse audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Audience ID that was shared
   * @return audienceId
   */
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public BusinessSharedAudienceResponse permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BusinessSharedAudienceResponse addPermissionsItem(Role permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @ApiModelProperty(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", value = "")
  public List<Role> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  public BusinessSharedAudienceResponse recipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  public BusinessSharedAudienceResponse addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (this.recipientBusinessIds == null) {
      this.recipientBusinessIds = new ArrayList<>();
    }
    this.recipientBusinessIds.add(recipientBusinessIdsItem);
    return this;
  }

  /**
   * Business IDs that received the audience
   * @return recipientBusinessIds
   */
  @ApiModelProperty(example = "[\"549755885175\"]", value = "Business IDs that received the audience")
  public List<String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  public void setRecipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

