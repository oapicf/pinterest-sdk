package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An object containing the permissions a business member has on the asset.
 **/
@ApiModel(description="An object containing the permissions a business member has on the asset.")

public class AssetIdPermissions  {
  
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

  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
 /**
   * Permission levels member or partner has on an asset.
  **/
  private List<String> permissions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private AssetGroupBinding assetGroupInfo;
 /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$") @Size(min=1,max=20)  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public AssetIdPermissions assetId(String assetId) {
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

  public AssetIdPermissions assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
   * Permission levels member or partner has on an asset.
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public AssetIdPermissions permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AssetIdPermissions addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
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

