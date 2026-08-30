package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessItem   {
  
  private String assetId;
  private String partnerId;

  /**
   * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
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
  }

  private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;

  /**
   * Unique identifier of the business asset.
   **/
  
  @ApiModelProperty(required = true, value = "Unique identifier of the business asset.")
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   **/
  
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to update asset access to.")
  @JsonProperty("partner_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
   **/
  
  @ApiModelProperty(value = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
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

