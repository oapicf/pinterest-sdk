/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessSharedAudienceResponse   {
  
  private String audienceId;
  private List<Role> permissions = new ArrayList<>();
  private List<String> recipientBusinessIds = new ArrayList<>();

  /**
   * Audience ID that was shared
   */
  public BusinessSharedAudienceResponse audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   */
  public BusinessSharedAudienceResponse permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", value = "")
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  /**
   * Business IDs that received the audience
   */
  public BusinessSharedAudienceResponse recipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"549755885175\"]", value = "Business IDs that received the audience")
  @JsonProperty("recipient_business_ids")
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
    return Objects.equals(audienceId, businessSharedAudienceResponse.audienceId) &&
        Objects.equals(permissions, businessSharedAudienceResponse.permissions) &&
        Objects.equals(recipientBusinessIds, businessSharedAudienceResponse.recipientBusinessIds);
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

