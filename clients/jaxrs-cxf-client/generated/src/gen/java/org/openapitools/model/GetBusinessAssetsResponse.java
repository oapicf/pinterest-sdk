package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.AssetGroupBinding;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An object containing the permissions a business has on the asset.
 **/
@ApiModel(description="An object containing the permissions a business has on the asset.")

public class GetBusinessAssetsResponse  {
  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
 /**
   * Unique identifier of a business asset.
  **/
  private String assetId;

  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
 /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  **/
  private String assetType;

  @ApiModelProperty(value = "")
  private AssetGroupBinding assetGroupInfo;
 /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public GetBusinessAssetsResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   * @return assetType
  **/
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public GetBusinessAssetsResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
   * Get assetGroupInfo
   * @return assetGroupInfo
  **/
  @JsonProperty("asset_group_info")
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  public GetBusinessAssetsResponse assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

