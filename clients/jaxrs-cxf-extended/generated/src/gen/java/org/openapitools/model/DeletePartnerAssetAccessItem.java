package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePartnerAssetAccessItem  {
  
 /**
  * Unique identifier of the business asset.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the business asset.")
  private String assetId;

 /**
  * Unique identifier of a business partner to update asset access to.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to update asset access to.")
  private String partnerId;

public enum PartnerTypeEnum {

    @JsonProperty("INTERNAL") INTERNAL(String.valueOf("INTERNAL")),
    @JsonProperty("EXTERNAL") EXTERNAL(String.valueOf("EXTERNAL"));

    private String value;

    PartnerTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PartnerTypeEnum fromValue(String value) {
        for (PartnerTypeEnum b : PartnerTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  */
  @ApiModelProperty(value = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
  private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;
 /**
  * Unique identifier of the business asset.
  * @return assetId
  */
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
 public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
  public DeletePartnerAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Unique identifier of a business partner to update asset access to.
  * @return partnerId
  */
  @JsonProperty("partner_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getPartnerId() {
    return partnerId;
  }

  /**
   * Sets the <code>partnerId</code> property.
   */
 public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Sets the <code>partnerId</code> property.
   */
  public DeletePartnerAssetAccessItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

 /**
  * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
  * @return partnerType
  */
  @JsonProperty("partner_type")
  public String getPartnerType() {
    return partnerType == null ? null : partnerType.value();
  }

  /**
   * Sets the <code>partnerType</code> property.
   */
 public void setPartnerType(PartnerTypeEnum partnerType) {
    this.partnerType = partnerType;
  }

  /**
   * Sets the <code>partnerType</code> property.
   */
  public DeletePartnerAssetAccessItem partnerType(PartnerTypeEnum partnerType) {
    this.partnerType = partnerType;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

