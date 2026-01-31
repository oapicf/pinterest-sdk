package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AssetGroupBinding;
import org.openapitools.vertxweb.server.model.GetBusinessAssetsResponseCatalogInfo;

/**
 * An object containing the permissions a business has on the asset.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBusinessAssetsResponse   {
  
  private AssetGroupBinding assetGroupInfo;
  private String assetId;
  private String assetType;
  private GetBusinessAssetsResponseCatalogInfo catalogInfo;

  public GetBusinessAssetsResponse () {

  }

  public GetBusinessAssetsResponse (AssetGroupBinding assetGroupInfo, String assetId, String assetType, GetBusinessAssetsResponseCatalogInfo catalogInfo) {
    this.assetGroupInfo = assetGroupInfo;
    this.assetId = assetId;
    this.assetType = assetType;
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
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

    
  @JsonProperty("catalog_info")
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
