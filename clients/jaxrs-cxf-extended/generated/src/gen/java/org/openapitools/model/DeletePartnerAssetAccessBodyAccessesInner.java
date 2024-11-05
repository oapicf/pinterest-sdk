package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePartnerAssetAccessBodyAccessesInner  {
  
 /**
  * Unique identifier of a business partner to update asset access to.
  */
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
  private String partnerId;

 /**
  * Unique identifier of the business asset.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
  private String assetId;

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
  * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  */
  @ApiModelProperty(example = "INTERNAL", value = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
  private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;
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
  public DeletePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

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
  public DeletePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
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
  public DeletePartnerAssetAccessBodyAccessesInner partnerType(PartnerTypeEnum partnerType) {
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
    DeletePartnerAssetAccessBodyAccessesInner deletePartnerAssetAccessBodyAccessesInner = (DeletePartnerAssetAccessBodyAccessesInner) o;
    return Objects.equals(this.partnerId, deletePartnerAssetAccessBodyAccessesInner.partnerId) &&
        Objects.equals(this.assetId, deletePartnerAssetAccessBodyAccessesInner.assetId) &&
        Objects.equals(this.partnerType, deletePartnerAssetAccessBodyAccessesInner.partnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, assetId, partnerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessBodyAccessesInner {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

