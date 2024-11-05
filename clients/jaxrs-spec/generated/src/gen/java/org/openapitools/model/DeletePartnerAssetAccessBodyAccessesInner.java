package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DeletePartnerAssetAccessBody_accesses_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetAccessBodyAccessesInner   {
  private String partnerId;
  private String assetId;
  public enum PartnerTypeEnum {

    INTERNAL(String.valueOf("INTERNAL")), EXTERNAL(String.valueOf("EXTERNAL"));


    private String value;

    PartnerTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static PartnerTypeEnum fromString(String s) {
        for (PartnerTypeEnum b : PartnerTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static PartnerTypeEnum fromValue(String value) {
        for (PartnerTypeEnum b : PartnerTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;

  /**
   * Unique identifier of a business partner to update asset access to.
   **/
  public DeletePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
  @JsonProperty("partner_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getPartnerId() {
    return partnerId;
  }

  @JsonProperty("partner_id")
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Unique identifier of the business asset.
   **/
  public DeletePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
  @JsonProperty("asset_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getAssetId() {
    return assetId;
  }

  @JsonProperty("asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
   **/
  public DeletePartnerAssetAccessBodyAccessesInner partnerType(PartnerTypeEnum partnerType) {
    this.partnerType = partnerType;
    return this;
  }

  
  @ApiModelProperty(example = "INTERNAL", value = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
  @JsonProperty("partner_type")
  public PartnerTypeEnum getPartnerType() {
    return partnerType;
  }

  @JsonProperty("partner_type")
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

