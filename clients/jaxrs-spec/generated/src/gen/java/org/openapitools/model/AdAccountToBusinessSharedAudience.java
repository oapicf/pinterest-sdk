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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdAccountToBusinessSharedAudience")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountToBusinessSharedAudience   {
  private String audienceId;
  private @Valid List<Role> permissions = new ArrayList<>();
  private @Valid List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();

  public AdAccountToBusinessSharedAudience() {
  }

  @JsonCreator
  public AdAccountToBusinessSharedAudience(
    @JsonProperty(required = true, value = "audience_id") String audienceId,
    @JsonProperty(required = true, value = "recipient_business_ids") List< @Pattern(regexp="^\\d+$")String> recipientBusinessIds
  ) {
    this.audienceId = audienceId;
    this.recipientBusinessIds = recipientBusinessIds;
  }

  /**
   * Unique identifier of an audience
   **/
  public AdAccountToBusinessSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  @JsonProperty(required = true, value = "audience_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAudienceId() {
    return audienceId;
  }

  @JsonProperty(required = true, value = "audience_id")
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * Permissions granted to the recipients.
   **/
  public AdAccountToBusinessSharedAudience permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"RESOURCE_PINNER_LIST_READER\",\"RESOURCE_PINNER_LIST_OWNER\"]", value = "Permissions granted to the recipients.")
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  public AdAccountToBusinessSharedAudience addPermissionsItem(Role permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public AdAccountToBusinessSharedAudience removePermissionsItem(Role permissionsItem) {
    if (permissionsItem != null && this.permissions != null) {
      this.permissions.remove(permissionsItem);
    }

    return this;
  }
  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   **/
  public AdAccountToBusinessSharedAudience recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Business IDs to share with or revoke from (request) / that received the audience (response).")
  @JsonProperty(required = true, value = "recipient_business_ids")
  @NotNull public List< @Pattern(regexp="^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  @JsonProperty(required = true, value = "recipient_business_ids")
  public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  public AdAccountToBusinessSharedAudience addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (this.recipientBusinessIds == null) {
      this.recipientBusinessIds = new ArrayList<>();
    }

    this.recipientBusinessIds.add(recipientBusinessIdsItem);
    return this;
  }

  public AdAccountToBusinessSharedAudience removeRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (recipientBusinessIdsItem != null && this.recipientBusinessIds != null) {
      this.recipientBusinessIds.remove(recipientBusinessIdsItem);
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
    AdAccountToBusinessSharedAudience adAccountToBusinessSharedAudience = (AdAccountToBusinessSharedAudience) o;
    return Objects.equals(this.audienceId, adAccountToBusinessSharedAudience.audienceId) &&
        Objects.equals(this.permissions, adAccountToBusinessSharedAudience.permissions) &&
        Objects.equals(this.recipientBusinessIds, adAccountToBusinessSharedAudience.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountToBusinessSharedAudience {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
