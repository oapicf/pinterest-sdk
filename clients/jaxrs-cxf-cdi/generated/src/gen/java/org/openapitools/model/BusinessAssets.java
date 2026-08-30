package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetTypeResponse;
import org.openapitools.model.CatalogBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BusinessAssets   {
  
  private AssetGroupBinding assetGroupInfo;

  private String assetId;

  private AssetTypeResponse assetType;

  private List<String> permissions = new ArrayList<>();

  private CatalogBinding catalogInfo;

  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
   **/
  public BusinessAssets assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  
  @ApiModelProperty(value = "An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.")
  @JsonProperty("asset_group_info")
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }
  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }


  /**
   * Unique identifier of a business asset.
   **/
  public BusinessAssets assetId(String assetId) {
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
   **/
  public BusinessAssets assetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("asset_type")
  public AssetTypeResponse getAssetType() {
    return assetType;
  }
  public void setAssetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
  }


  /**
   * Permission levels the requesting business has on an asset.
   **/
  public BusinessAssets permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[FINANCE_MANAGER, CATALOGS_MANAGER, AUDIENCE_MANAGER]", value = "Permission levels the requesting business has on an asset.")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public BusinessAssets addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }


  /**
   * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
   **/
  public BusinessAssets catalogInfo(CatalogBinding catalogInfo) {
    this.catalogInfo = catalogInfo;
    return this;
  }

  
  @ApiModelProperty(value = "An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.")
  @JsonProperty("catalog_info")
  public CatalogBinding getCatalogInfo() {
    return catalogInfo;
  }
  public void setCatalogInfo(CatalogBinding catalogInfo) {
    this.catalogInfo = catalogInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAssets businessAssets = (BusinessAssets) o;
    return Objects.equals(this.assetGroupInfo, businessAssets.assetGroupInfo) &&
        Objects.equals(this.assetId, businessAssets.assetId) &&
        Objects.equals(this.assetType, businessAssets.assetType) &&
        Objects.equals(this.permissions, businessAssets.permissions) &&
        Objects.equals(this.catalogInfo, businessAssets.catalogInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, permissions, catalogInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssets {\n");
    
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    catalogInfo: ").append(toIndentedString(catalogInfo)).append("\n");
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

