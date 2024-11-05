package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetGroupBinding;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetBusinessAssetsResponse {

  private String assetId;

  private String assetType;

  private AssetGroupBinding assetGroupInfo;

  public GetBusinessAssetsResponse assetId(String assetId) {
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
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public GetBusinessAssetsResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   * @return assetType
   */
  
  @Schema(name = "asset_type", example = "AD_ACCOUNT", description = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public GetBusinessAssetsResponse assetGroupInfo(AssetGroupBinding assetGroupInfo) {
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
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
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
    return Objects.equals(this.assetId, getBusinessAssetsResponse.assetId) &&
        Objects.equals(this.assetType, getBusinessAssetsResponse.assetType) &&
        Objects.equals(this.assetGroupInfo, getBusinessAssetsResponse.assetGroupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, assetGroupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessAssetsResponse {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
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

