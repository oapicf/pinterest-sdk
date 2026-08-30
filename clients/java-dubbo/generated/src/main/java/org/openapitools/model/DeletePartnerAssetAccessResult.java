package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The terminated asset access.
 */
public class DeletePartnerAssetAccessResult implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of a business asset.
   */
  @JsonProperty("asset_id")
  private String assetId;

  /**
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   */
  @JsonProperty("asset_type")
  private String assetType;

  /**
   * If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
   */
  @JsonProperty("is_shared_partner")
  private Boolean isSharedPartner;

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
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   * @return assetType
   */
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
   * @return isSharedPartner
   */
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
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
    DeletePartnerAssetAccessResult deletePartnerAssetAccessResult = (DeletePartnerAssetAccessResult) o;
    return Objects.equals(this.assetId, deletePartnerAssetAccessResult.assetId) &&
        Objects.equals(this.assetType, deletePartnerAssetAccessResult.assetType) &&
        Objects.equals(this.isSharedPartner, deletePartnerAssetAccessResult.isSharedPartner) &&
        Objects.equals(this.partnerId, deletePartnerAssetAccessResult.partnerId) &&
        Objects.equals(this.permissions, deletePartnerAssetAccessResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, isSharedPartner, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
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
