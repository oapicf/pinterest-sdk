package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object containing the permissions a business member has on the asset.
 */
@ApiModel(description="An object containing the permissions a business member has on the asset.")

public class AssetIdPermissions  {
  
 /**
  * Unique identifier of a business asset.
  */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  private String assetId;

 /**
  * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  */
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  private String assetType;

 /**
  * Permission levels member or partner has on an asset.
  */
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  private List<String> permissions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private AssetGroupBinding assetGroupInfo;
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
  public AssetIdPermissions assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
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
  public AssetIdPermissions assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
  * Permission levels member or partner has on an asset.
  * @return permissions
  */
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public AssetIdPermissions permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public AssetIdPermissions addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

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
  public AssetIdPermissions assetGroupInfo(AssetGroupBinding assetGroupInfo) {
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
    AssetIdPermissions assetIdPermissions = (AssetIdPermissions) o;
    return Objects.equals(this.assetId, assetIdPermissions.assetId) &&
        Objects.equals(this.assetType, assetIdPermissions.assetType) &&
        Objects.equals(this.permissions, assetIdPermissions.permissions) &&
        Objects.equals(this.assetGroupInfo, assetIdPermissions.assetGroupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, assetGroupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetIdPermissions {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

