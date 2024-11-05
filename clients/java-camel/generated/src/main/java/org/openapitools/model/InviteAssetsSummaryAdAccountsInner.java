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
 * InviteAssetsSummaryAdAccountsInner
 */

@JsonTypeName("InviteAssetsSummary_ad_accounts_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteAssetsSummaryAdAccountsInner {

  private String id;

  @Valid
  private List<String> permissions = new ArrayList<>();

  public InviteAssetsSummaryAdAccountsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a business ad account.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "549755885175", description = "Unique identifier of a business ad account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteAssetsSummaryAdAccountsInner permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public InviteAssetsSummaryAdAccountsInner addPermissionsItem(String permissionsItem) {
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
    InviteAssetsSummaryAdAccountsInner inviteAssetsSummaryAdAccountsInner = (InviteAssetsSummaryAdAccountsInner) o;
    return Objects.equals(this.id, inviteAssetsSummaryAdAccountsInner.id) &&
        Objects.equals(this.permissions, inviteAssetsSummaryAdAccountsInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAssetsSummaryAdAccountsInner {\n");
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

