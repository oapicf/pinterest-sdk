package apimodels;

import apimodels.AssetGroupBinding;
import apimodels.AssetTypeResponse;
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
 * An object containing the permissions a business has on the asset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BaseBusinessAssets   {
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

  public BaseBusinessAssets assetGroupInfo(AssetGroupBinding assetGroupInfo) {
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

  public BaseBusinessAssets assetId(String assetId) {
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

  public BaseBusinessAssets assetType(AssetTypeResponse assetType) {
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

  public BaseBusinessAssets permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BaseBusinessAssets addPermissionsItem(String permissionsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseBusinessAssets baseBusinessAssets = (BaseBusinessAssets) o;
    return Objects.equals(assetGroupInfo, baseBusinessAssets.assetGroupInfo) &&
        Objects.equals(assetId, baseBusinessAssets.assetId) &&
        Objects.equals(assetType, baseBusinessAssets.assetType) &&
        Objects.equals(permissions, baseBusinessAssets.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

