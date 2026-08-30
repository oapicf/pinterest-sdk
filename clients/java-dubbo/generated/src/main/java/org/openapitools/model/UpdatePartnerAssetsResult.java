package org.openapitools.model;

import org.openapitools.model.AssetTypeResponse;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An object containing the permissions a business partner has on the asset.
 */
public class UpdatePartnerAssetsResult implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of a business asset.
   */
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("asset_type")
  private AssetTypeResponse assetType;

  /**
   * Unique identifier of a business partner.
   */
  @JsonProperty("partner_id")
  private String partnerId;

  /**
   * Permission levels member or partner has on an asset.
   */
  @JsonProperty("permissions")
  private List<String> permissions = new ArrayList<>();

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
   * Unique identifier of a business partner.
   * @return partnerId
   */
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Permission levels member or partner has on an asset.
   * @return permissions
   */
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
    UpdatePartnerAssetsResult updatePartnerAssetsResult = (UpdatePartnerAssetsResult) o;
    return Objects.equals(this.assetId, updatePartnerAssetsResult.assetId) &&
        Objects.equals(this.assetType, updatePartnerAssetsResult.assetType) &&
        Objects.equals(this.partnerId, updatePartnerAssetsResult.partnerId) &&
        Objects.equals(this.permissions, updatePartnerAssetsResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
