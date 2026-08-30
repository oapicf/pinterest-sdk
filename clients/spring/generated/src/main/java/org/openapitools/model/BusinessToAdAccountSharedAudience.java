package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BusinessToAdAccountSharedAudience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessToAdAccountSharedAudience {

  private String audienceId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Role> permissions = new ArrayList<>();

  private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();

  public BusinessToAdAccountSharedAudience() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessToAdAccountSharedAudience(String audienceId, List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.audienceId = audienceId;
    this.recipientAccountIds = recipientAccountIds;
  }

  public BusinessToAdAccountSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Unique identifier of an audience
   * @return audienceId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "audience_id", example = "2542621871096", description = "Unique identifier of an audience", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }

  @JsonProperty("audience_id")
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public BusinessToAdAccountSharedAudience permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BusinessToAdAccountSharedAudience addPermissionsItem(Role permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permissions granted to the recipients.
   * @return permissions
   */
  @Valid 
  @Schema(name = "permissions", accessMode = Schema.AccessMode.READ_ONLY, example = "[\"RESOURCE_PINNER_LIST_READER\",\"RESOURCE_PINNER_LIST_OWNER\"]", description = "Permissions granted to the recipients.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  public BusinessToAdAccountSharedAudience recipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  public BusinessToAdAccountSharedAudience addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    if (this.recipientAccountIds == null) {
      this.recipientAccountIds = new ArrayList<>();
    }
    this.recipientAccountIds.add(recipientAccountIdsItem);
    return this;
  }

  /**
   * Ad account IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientAccountIds
   */
  @NotNull 
  @Schema(name = "recipient_account_ids", description = "Ad account IDs to share with or revoke from (request) / that received the audience (response).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recipient_account_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  @JsonProperty("recipient_account_ids")
  public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
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
    BusinessToAdAccountSharedAudience businessToAdAccountSharedAudience = (BusinessToAdAccountSharedAudience) o;
    return Objects.equals(this.audienceId, businessToAdAccountSharedAudience.audienceId) &&
        Objects.equals(this.permissions, businessToAdAccountSharedAudience.permissions) &&
        Objects.equals(this.recipientAccountIds, businessToAdAccountSharedAudience.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessToAdAccountSharedAudience {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

