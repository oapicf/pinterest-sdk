package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetGroupBinding;
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
 * An object containing the permissions a business member has on the asset.
 */
@ApiModel(description = "An object containing the permissions a business member has on the asset.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssetIdPermissions   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("asset_type")
  private String assetType;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  @JsonProperty("asset_group_info")
  private AssetGroupBinding assetGroupInfo;

  public AssetIdPermissions assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of a business asset.
   * @return assetId
   */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public AssetIdPermissions assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   * @return assetType
   */
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AssetIdPermissions permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AssetIdPermissions addPermissionsItem(String permissionsItem) {
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

  public AssetIdPermissions assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  /**
   * Get assetGroupInfo
   * @return assetGroupInfo
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

