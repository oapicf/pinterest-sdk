package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.GetBusinessAssetsResponseCatalogInfo;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object containing the permissions a business has on the asset.
 */
@ApiModel(description="An object containing the permissions a business has on the asset.")

public class GetBusinessAssetsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AssetGroupBinding assetGroupInfo;

 /**
  * Unique identifier of a business asset.
  */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  private String assetId;

 /**
  * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  */
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.")
  private String assetType;

  @ApiModelProperty(value = "")
  @Valid
  private GetBusinessAssetsResponseCatalogInfo catalogInfo;
 /**
  * Get assetGroupInfo
  * @return assetGroupInfo
  */
  @JsonProperty("asset_group_info")
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  /**
   * Sets the <code>assetGroupInfo</code> property.
   */
 public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  /**
   * Sets the <code>assetGroupInfo</code> property.
   */
  public GetBusinessAssetsResponse assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

 /**
  * Unique identifier of a business asset.
  * @return assetId
  */
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$") @Size(min=1,max=20)  public String getAssetId() {
    return assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
 public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
  public GetBusinessAssetsResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  * @return assetType
  */
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  /**
   * Sets the <code>assetType</code> property.
   */
 public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * Sets the <code>assetType</code> property.
   */
  public GetBusinessAssetsResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
  * Get catalogInfo
  * @return catalogInfo
  */
  @JsonProperty("catalog_info")
  public GetBusinessAssetsResponseCatalogInfo getCatalogInfo() {
    return catalogInfo;
  }

  /**
   * Sets the <code>catalogInfo</code> property.
   */
 public void setCatalogInfo(GetBusinessAssetsResponseCatalogInfo catalogInfo) {
    this.catalogInfo = catalogInfo;
  }

  /**
   * Sets the <code>catalogInfo</code> property.
   */
  public GetBusinessAssetsResponse catalogInfo(GetBusinessAssetsResponseCatalogInfo catalogInfo) {
    this.catalogInfo = catalogInfo;
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
    return Objects.equals(this.assetGroupInfo, getBusinessAssetsResponse.assetGroupInfo) &&
        Objects.equals(this.assetId, getBusinessAssetsResponse.assetId) &&
        Objects.equals(this.assetType, getBusinessAssetsResponse.assetType) &&
        Objects.equals(this.catalogInfo, getBusinessAssetsResponse.catalogInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, catalogInfo);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

