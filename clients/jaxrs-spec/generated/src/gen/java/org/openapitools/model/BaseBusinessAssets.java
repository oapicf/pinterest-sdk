package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An object containing the permissions a business has on the asset.
 **/
@ApiModel(description = "An object containing the permissions a business has on the asset.")
@JsonTypeName("BaseBusinessAssets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BaseBusinessAssets   {
  private AssetGroupBinding assetGroupInfo;
  private String assetId;
  private AssetTypeResponse assetType;
  private @Valid List<String> permissions = new ArrayList<>();

  public BaseBusinessAssets() {
  }

  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
   **/
  public BaseBusinessAssets assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  
  @ApiModelProperty(value = "An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.")
  @JsonProperty("asset_group_info")
  @Valid public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  @JsonProperty("asset_group_info")
  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  /**
   * Unique identifier of a business asset.
   **/
  public BaseBusinessAssets assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
   @Pattern(regexp="^\\d+$") @Size(min=1,max=20)public String getAssetId() {
    return assetId;
  }

  @JsonProperty("asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   **/
  public BaseBusinessAssets assetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("asset_type")
  public AssetTypeResponse getAssetType() {
    return assetType;
  }

  @JsonProperty("asset_type")
  public void setAssetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
  }

  /**
   * Permission levels the requesting business has on an asset.
   **/
  public BaseBusinessAssets permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels the requesting business has on an asset.")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public BaseBusinessAssets addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public BaseBusinessAssets removePermissionsItem(String permissionsItem) {
    if (permissionsItem != null && this.permissions != null) {
      this.permissions.remove(permissionsItem);
    }

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
    BaseBusinessAssets baseBusinessAssets = (BaseBusinessAssets) o;
    return Objects.equals(this.assetGroupInfo, baseBusinessAssets.assetGroupInfo) &&
        Objects.equals(this.assetId, baseBusinessAssets.assetId) &&
        Objects.equals(this.assetType, baseBusinessAssets.assetType) &&
        Objects.equals(this.permissions, baseBusinessAssets.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseBusinessAssets {\n");
    
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
