package apimodels;

import apimodels.AssetGroupBinding;
import apimodels.GetBusinessAssetsResponseCatalogInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object containing the permissions a business has on the asset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetBusinessAssetsResponse   {
  @JsonProperty("asset_group_info")
  @Valid

  private AssetGroupBinding assetGroupInfo;

  @JsonProperty("asset_id")
  @Pattern(regexp="^\\d+$")
@Size(min=1,max=20)

  private String assetId;

  @JsonProperty("asset_type")
  
  private String assetType;

  @JsonProperty("catalog_info")
  @Valid

  private GetBusinessAssetsResponseCatalogInfo catalogInfo;

  public GetBusinessAssetsResponse assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

   /**
   * Get assetGroupInfo
   * @return assetGroupInfo
  **/
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  public GetBusinessAssetsResponse assetId(String assetId) {
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

  public GetBusinessAssetsResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   * @return assetType
  **/
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public GetBusinessAssetsResponse catalogInfo(GetBusinessAssetsResponseCatalogInfo catalogInfo) {
    this.catalogInfo = catalogInfo;
    return this;
  }

   /**
   * Get catalogInfo
   * @return catalogInfo
  **/
  public GetBusinessAssetsResponseCatalogInfo getCatalogInfo() {
    return catalogInfo;
  }

  public void setCatalogInfo(GetBusinessAssetsResponseCatalogInfo catalogInfo) {
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
    GetBusinessAssetsResponse getBusinessAssetsResponse = (GetBusinessAssetsResponse) o;
    return Objects.equals(assetGroupInfo, getBusinessAssetsResponse.assetGroupInfo) &&
        Objects.equals(assetId, getBusinessAssetsResponse.assetId) &&
        Objects.equals(assetType, getBusinessAssetsResponse.assetType) &&
        Objects.equals(catalogInfo, getBusinessAssetsResponse.catalogInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, catalogInfo);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessAssetsResponse {\n");
    
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    catalogInfo: ").append(toIndentedString(catalogInfo)).append("\n");
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

