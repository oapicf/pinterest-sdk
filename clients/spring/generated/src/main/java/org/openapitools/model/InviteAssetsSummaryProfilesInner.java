package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InviteAssetsSummaryProfilesInner
 */

@JsonTypeName("InviteAssetsSummary_profiles_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteAssetsSummaryProfilesInner {

  private String id;

  @Valid
  private List<String> permissions = new ArrayList<>();

  public InviteAssetsSummaryProfilesInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a business profile.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of a business profile.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteAssetsSummaryProfilesInner permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public InviteAssetsSummaryProfilesInner addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permission levels member or partner has on an asset.
   * @return permissions
   */
  
  @Schema(name = "permissions", example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner = (InviteAssetsSummaryProfilesInner) o;
    return Objects.equals(this.id, inviteAssetsSummaryProfilesInner.id) &&
        Objects.equals(this.permissions, inviteAssetsSummaryProfilesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAssetsSummaryProfilesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

