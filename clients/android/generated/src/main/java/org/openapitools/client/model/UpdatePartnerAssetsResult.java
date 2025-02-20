/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An object containing the permissions a business partner has on the asset.
 **/
@ApiModel(description = "An object containing the permissions a business partner has on the asset.")
public class UpdatePartnerAssetsResult {
  
  @SerializedName("asset_id")
  private String assetId = null;
  @SerializedName("asset_type")
  private String assetType = null;
  @SerializedName("partner_id")
  private String partnerId = null;
  @SerializedName("permissions")
  private List<String> permissions = null;

  /**
   * Unique identifier of a business asset.
   **/
  @ApiModelProperty(value = "Unique identifier of a business asset.")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   **/
  @ApiModelProperty(value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * Unique identifier of a business partner.
   **/
  @ApiModelProperty(value = "Unique identifier of a business partner.")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Permission levels member or partner has on an asset.
   **/
  @ApiModelProperty(value = "Permission levels member or partner has on an asset.")
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
    UpdatePartnerAssetsResult updatePartnerAssetsResult = (UpdatePartnerAssetsResult) o;
    return (this.assetId == null ? updatePartnerAssetsResult.assetId == null : this.assetId.equals(updatePartnerAssetsResult.assetId)) &&
        (this.assetType == null ? updatePartnerAssetsResult.assetType == null : this.assetType.equals(updatePartnerAssetsResult.assetType)) &&
        (this.partnerId == null ? updatePartnerAssetsResult.partnerId == null : this.partnerId.equals(updatePartnerAssetsResult.partnerId)) &&
        (this.permissions == null ? updatePartnerAssetsResult.permissions == null : this.permissions.equals(updatePartnerAssetsResult.permissions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.assetId == null ? 0: this.assetId.hashCode());
    result = 31 * result + (this.assetType == null ? 0: this.assetType.hashCode());
    result = 31 * result + (this.partnerId == null ? 0: this.partnerId.hashCode());
    result = 31 * result + (this.permissions == null ? 0: this.permissions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResult {\n");
    
    sb.append("  assetId: ").append(assetId).append("\n");
    sb.append("  assetType: ").append(assetType).append("\n");
    sb.append("  partnerId: ").append(partnerId).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
