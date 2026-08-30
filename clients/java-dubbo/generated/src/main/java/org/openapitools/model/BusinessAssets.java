package org.openapitools.model;

import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetTypeResponse;
import org.openapitools.model.CatalogBinding;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BusinessAssets implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
   */
  @JsonProperty("asset_group_info")
  private AssetGroupBinding assetGroupInfo;

  /**
   * Unique identifier of a business asset.
   */
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("asset_type")
  private AssetTypeResponse assetType;

  /**
   * Permission levels the requesting business has on an asset.
   */
  @JsonProperty("permissions")
  private List<String> permissions = new ArrayList<>();

  /**
   * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
   */
  @JsonProperty("catalog_info")
  private CatalogBinding catalogInfo;

  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
   * @return assetGroupInfo
   */
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  /**
   * Unique identifier of a business asset.
   * @return assetId
   */
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * 
   * @return assetType
   */
  public AssetTypeResponse getAssetType() {
    return assetType;
  }

  public void setAssetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
  }

  /**
   * Permission levels the requesting business has on an asset.
   * @return permissions
   */
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
   * @return catalogInfo
   */
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
