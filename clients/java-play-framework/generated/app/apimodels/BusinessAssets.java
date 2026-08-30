package apimodels;

import apimodels.AssetGroupBinding;
import apimodels.AssetTypeResponse;
import apimodels.CatalogBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BusinessAssets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessAssets   {
  @JsonProperty("asset_group_info")
  @Valid

  private AssetGroupBinding assetGroupInfo;

  @JsonProperty("asset_id")
  @Pattern(regexp="^\\d+$")
@Size(min=1,max=20)

  private String assetId;

  @JsonProperty("asset_type")
  @Valid

  private AssetTypeResponse assetType;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  @JsonProperty("catalog_info")
  @Valid

  private CatalogBinding catalogInfo;

  public BusinessAssets assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

   /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
   * @return assetGroupInfo
  **/
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  public BusinessAssets assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public BusinessAssets assetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  public AssetTypeResponse getAssetType() {
    return assetType;
  }

  public void setAssetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
  }

  public BusinessAssets permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BusinessAssets addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permission levels the requesting business has on an asset.
   * @return permissions
  **/
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public BusinessAssets catalogInfo(CatalogBinding catalogInfo) {
    this.catalogInfo = catalogInfo;
    return this;
  }

   /**
   * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
   * @return catalogInfo
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

