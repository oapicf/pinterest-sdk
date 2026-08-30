package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AssetGroupBinding;
import org.openapitools.vertxweb.server.model.AssetTypeResponse;
import org.openapitools.vertxweb.server.model.CatalogBinding;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessAssets   {
  
  private AssetGroupBinding assetGroupInfo;
  private String assetId;
  private AssetTypeResponse assetType;
  private List<String> permissions = new ArrayList<>();
  private CatalogBinding catalogInfo;

  public BusinessAssets () {

  }

  public BusinessAssets (AssetGroupBinding assetGroupInfo, String assetId, AssetTypeResponse assetType, List<String> permissions, CatalogBinding catalogInfo) {
    this.assetGroupInfo = assetGroupInfo;
    this.assetId = assetId;
    this.assetType = assetType;
    this.permissions = permissions;
    this.catalogInfo = catalogInfo;
  }

    
  @JsonProperty("asset_group_info")
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }
  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

    
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

    
  @JsonProperty("asset_type")
  public AssetTypeResponse getAssetType() {
    return assetType;
  }
  public void setAssetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
  }

    
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

    
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
    return Objects.equals(assetGroupInfo, businessAssets.assetGroupInfo) &&
        Objects.equals(assetId, businessAssets.assetId) &&
        Objects.equals(assetType, businessAssets.assetType) &&
        Objects.equals(permissions, businessAssets.permissions) &&
        Objects.equals(catalogInfo, businessAssets.catalogInfo);
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
