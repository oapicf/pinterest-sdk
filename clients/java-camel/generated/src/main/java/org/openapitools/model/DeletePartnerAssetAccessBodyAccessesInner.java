package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeletePartnerAssetAccessBodyAccessesInner
 */

@JsonTypeName("DeletePartnerAssetAccessBody_accesses_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetAccessBodyAccessesInner {

  private String partnerId;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  public DeletePartnerAssetAccessBodyAccessesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeletePartnerAssetAccessBodyAccessesInner(String partnerId, String assetId) {
    this.partnerId = partnerId;
    this.assetId = assetId;
  }

  public DeletePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "partner_id", example = "1234567890123", description = "Unique identifier of a business partner to update asset access to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partner_id")
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
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "asset_id", example = "549755885175", description = "Unique identifier of the business asset.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id")
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
  
  @Schema(name = "partner_type", example = "INTERNAL", description = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_type")
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

