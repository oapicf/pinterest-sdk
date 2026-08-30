package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DeletePartnerAssetAccessItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of the business asset.
   */
  @JsonProperty("asset_id")
  private String assetId;

  /**
   * Unique identifier of a business partner to update asset access to.
   */
  @JsonProperty("partner_id")
  private String partnerId;

  /**
   * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
   */
  @JsonProperty("partner_type")
  private String partnerType = PartnerTypeEnum.INTERNAL;

  /**
   * Unique identifier of the business asset.
   * @return assetId
   */
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
   */
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
   * @return partnerType
   */
  public String getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(String partnerType) {
    this.partnerType = partnerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePartnerAssetAccessItem deletePartnerAssetAccessItem = (DeletePartnerAssetAccessItem) o;
    return Objects.equals(this.assetId, deletePartnerAssetAccessItem.assetId) &&
        Objects.equals(this.partnerId, deletePartnerAssetAccessItem.partnerId) &&
        Objects.equals(this.partnerType, deletePartnerAssetAccessItem.partnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, partnerId, partnerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessItem {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
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
