/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;



/**
 * An object containing the permissions a business member has on the asset.
 */

@ApiModel(description = "An object containing the permissions a business member has on the asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssetIdPermissions   {
  
  private String assetId;
  private String assetType;
  private List<String> permissions = new ArrayList<>();
  private AssetGroupBinding assetGroupInfo;

  /**
   * Unique identifier of a business asset.
   */
  public AssetIdPermissions assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   */
  public AssetIdPermissions assetType(String assetType) {
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
   * Permission levels member or partner has on an asset.
   */
  public AssetIdPermissions permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   */
  public AssetIdPermissions assetGroupInfo(AssetGroupBinding assetGroupInfo) {
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
    AssetIdPermissions assetIdPermissions = (AssetIdPermissions) o;
    return Objects.equals(assetId, assetIdPermissions.assetId) &&
        Objects.equals(assetType, assetIdPermissions.assetType) &&
        Objects.equals(permissions, assetIdPermissions.permissions) &&
        Objects.equals(assetGroupInfo, assetIdPermissions.assetGroupInfo);
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

