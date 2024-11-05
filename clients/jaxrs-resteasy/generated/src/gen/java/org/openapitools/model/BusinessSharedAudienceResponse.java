package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessSharedAudienceResponse   {
  
  private String audienceId;
  private List<Role> permissions = new ArrayList<>();
  private List<String> recipientBusinessIds = new ArrayList<>();

  /**
   * Audience ID that was shared
   **/
  
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  
  @ApiModelProperty(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", value = "")
  @JsonProperty("permissions")
  @Valid
  public List<Role> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  /**
   * Business IDs that received the audience
   **/
  
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

