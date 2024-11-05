package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SharedAudienceResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SharedAudienceResponse   {
  private String audienceId;
  private @Valid List<Role> permissions = new ArrayList<>();
  private @Valid List<String> recipientAccountIds = new ArrayList<>();

  /**
   * Audience ID that was shared
   **/
  public SharedAudienceResponse audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }

  @JsonProperty("audience_id")
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  public SharedAudienceResponse permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", value = "")
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  public SharedAudienceResponse addPermissionsItem(Role permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public SharedAudienceResponse removePermissionsItem(Role permissionsItem) {
    if (permissionsItem != null && this.permissions != null) {
      this.permissions.remove(permissionsItem);
    }

    return this;
  }
  /**
   * Account IDs that received the audience
   **/
  public SharedAudienceResponse recipientAccountIds(List<String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"549755885175\"]", value = "Account IDs that received the audience")
  @JsonProperty("recipient_account_ids")
  public List<String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  @JsonProperty("recipient_account_ids")
  public void setRecipientAccountIds(List<String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }

  public SharedAudienceResponse addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    if (this.recipientAccountIds == null) {
      this.recipientAccountIds = new ArrayList<>();
    }

    this.recipientAccountIds.add(recipientAccountIdsItem);
    return this;
  }

  public SharedAudienceResponse removeRecipientAccountIdsItem(String recipientAccountIdsItem) {
    if (recipientAccountIdsItem != null && this.recipientAccountIds != null) {
      this.recipientAccountIds.remove(recipientAccountIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

