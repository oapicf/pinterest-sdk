package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetGroupBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object containing the permissions a business has on the asset.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object containing the permissions a business has on the asset.")
public class GetBusinessAssetsResponse   {
  
  private String assetId;

  private String assetType;

  private AssetGroupBinding assetGroupInfo;

  /**
   * Unique identifier of a business asset.
   **/
  public GetBusinessAssetsResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$") @Size(min=1,max=20)  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   **/
  public GetBusinessAssetsResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  /**
   **/
  public GetBusinessAssetsResponse assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

