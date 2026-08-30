package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetTypeResponse;
import org.openapitools.model.CatalogBinding;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BusinessAssets
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAssets {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AssetGroupBinding assetGroupInfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String assetId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AssetTypeResponse assetType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> permissions = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogBinding catalogInfo;

  public BusinessAssets assetGroupInfo(@Nullable AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
   * @return assetGroupInfo
   */
  @Valid 
  @Schema(name = "asset_group_info", description = "An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_info")
  public @Nullable AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  @JsonProperty("asset_group_info")
  public void setAssetGroupInfo(@Nullable AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  public BusinessAssets assetId(@Nullable String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of a business asset.
   * @return assetId
   */
  @Pattern(regexp = "^\\d+$") @Size(min = 1, max = 20) 
  @Schema(name = "asset_id", example = "549755885175", description = "Unique identifier of a business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_id")
  public @Nullable String getAssetId() {
    return assetId;
  }

  @JsonProperty("asset_id")
  public void setAssetId(@Nullable String assetId) {
    this.assetId = assetId;
  }

  public BusinessAssets assetType(@Nullable AssetTypeResponse assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Get assetType
   * @return assetType
   */
  @Valid 
  @Schema(name = "asset_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_type")
  public @Nullable AssetTypeResponse getAssetType() {
    return assetType;
  }

  @JsonProperty("asset_type")
  public void setAssetType(@Nullable AssetTypeResponse assetType) {
    this.assetType = assetType;
  }

  public BusinessAssets permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BusinessAssets addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permission levels the requesting business has on an asset.
   * @return permissions
   */
  
  @Schema(name = "permissions", example = "[FINANCE_MANAGER, CATALOGS_MANAGER, AUDIENCE_MANAGER]", description = "Permission levels the requesting business has on an asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public BusinessAssets catalogInfo(@Nullable CatalogBinding catalogInfo) {
    this.catalogInfo = catalogInfo;
    return this;
  }

  /**
   * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
   * @return catalogInfo
   */
  @Valid 
  @Schema(name = "catalog_info", description = "An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_info")
  public @Nullable CatalogBinding getCatalogInfo() {
    return catalogInfo;
  }

  @JsonProperty("catalog_info")
  public void setCatalogInfo(@Nullable CatalogBinding catalogInfo) {
    this.catalogInfo = catalogInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAssets businessAssets = (BusinessAssets) o;
    return Objects.equals(this.assetGroupInfo, businessAssets.assetGroupInfo) &&
        Objects.equals(this.assetId, businessAssets.assetId) &&
        Objects.equals(this.assetType, businessAssets.assetType) &&
        Objects.equals(this.permissions, businessAssets.permissions) &&
        Objects.equals(this.catalogInfo, businessAssets.catalogInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, permissions, catalogInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssets {\n");
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    catalogInfo: ").append(toIndentedString(catalogInfo)).append("\n");
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

