package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Asset ID with permission levels.
 */
@ApiModel(description = "Asset ID with permission levels.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetIdWithPermissions   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  public AssetIdWithPermissions id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a business asset.
   * @return id
   */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssetIdWithPermissions permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AssetIdWithPermissions addPermissionsItem(String permissionsItem) {
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
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
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
    AssetIdWithPermissions assetIdWithPermissions = (AssetIdWithPermissions) o;
    return Objects.equals(this.id, assetIdWithPermissions.id) &&
        Objects.equals(this.permissions, assetIdWithPermissions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetIdWithPermissions {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

