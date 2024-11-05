package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeletePartnerAssetAccessBodyAccessesInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetAccessBodyAccessesInner   {
  @JsonProperty("partner_id")
  private String partnerId;

  @JsonProperty("asset_id")
  private String assetId;

  /**
   * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
   */
  public enum PartnerTypeEnum {
    INTERNAL("INTERNAL"),
    
    EXTERNAL("EXTERNAL");

    private String value;

    PartnerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PartnerTypeEnum fromValue(String text) {
      for (PartnerTypeEnum b : PartnerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("partner_type")
  private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;

  public DeletePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
   */
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public DeletePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of the business asset.
   * @return assetId
   */
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeletePartnerAssetAccessBodyAccessesInner partnerType(PartnerTypeEnum partnerType) {
    this.partnerType = partnerType;
    return this;
  }

  /**
   * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
   * @return partnerType
   */
  @ApiModelProperty(example = "INTERNAL", value = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
  public PartnerTypeEnum getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(PartnerTypeEnum partnerType) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

