package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.GetBusinessAssetsResponseCatalogInfo;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object containing the permissions a business has on the asset.
 */

@Schema(name = "GetBusinessAssetsResponse", description = "An object containing the permissions a business has on the asset.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GetBusinessAssetsResponse {

  private @Nullable AssetGroupBinding assetGroupInfo;

  private @Nullable String assetId;

  private @Nullable String assetType;

  private JsonNullable<GetBusinessAssetsResponseCatalogInfo> catalogInfo = JsonNullable.<GetBusinessAssetsResponseCatalogInfo>undefined();

  public GetBusinessAssetsResponse assetGroupInfo(@Nullable AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  /**
   * Get assetGroupInfo
   * @return assetGroupInfo
   */
  @Valid 
  @Schema(name = "asset_group_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_info")
  public @Nullable AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(@Nullable AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  public GetBusinessAssetsResponse assetId(@Nullable String assetId) {
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

  public void setAssetId(@Nullable String assetId) {
    this.assetId = assetId;
  }

  public GetBusinessAssetsResponse assetType(@Nullable String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   * @return assetType
   */
  
  @Schema(name = "asset_type", example = "AD_ACCOUNT", description = "Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_type")
  public @Nullable String getAssetType() {
    return assetType;
  }

  public void setAssetType(@Nullable String assetType) {
    this.assetType = assetType;
  }

  public GetBusinessAssetsResponse catalogInfo(GetBusinessAssetsResponseCatalogInfo catalogInfo) {
    this.catalogInfo = JsonNullable.of(catalogInfo);
    return this;
  }

  /**
   * Get catalogInfo
   * @return catalogInfo
   */
  @Valid 
  @Schema(name = "catalog_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_info")
  public JsonNullable<GetBusinessAssetsResponseCatalogInfo> getCatalogInfo() {
    return catalogInfo;
  }

  public void setCatalogInfo(JsonNullable<GetBusinessAssetsResponseCatalogInfo> catalogInfo) {
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
    GetBusinessAssetsResponse getBusinessAssetsResponse = (GetBusinessAssetsResponse) o;
    return Objects.equals(this.assetGroupInfo, getBusinessAssetsResponse.assetGroupInfo) &&
        Objects.equals(this.assetId, getBusinessAssetsResponse.assetId) &&
        Objects.equals(this.assetType, getBusinessAssetsResponse.assetType) &&
        equalsNullable(this.catalogInfo, getBusinessAssetsResponse.catalogInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, hashCodeNullable(catalogInfo));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessAssetsResponse {\n");
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    catalogInfo: ").append(toIndentedString(catalogInfo)).append("\n");
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

