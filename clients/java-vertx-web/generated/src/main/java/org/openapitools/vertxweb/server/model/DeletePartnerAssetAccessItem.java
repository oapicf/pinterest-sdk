package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePartnerAssetAccessItem   {
  
  private String assetId;
  private String partnerId;


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
      return value;
    }
  }

  private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;

  public DeletePartnerAssetAccessItem () {

  }

  public DeletePartnerAssetAccessItem (String assetId, String partnerId, PartnerTypeEnum partnerType) {
    this.assetId = assetId;
    this.partnerId = partnerId;
    this.partnerType = partnerType;
  }

    
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

    
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

    
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
    return Objects.equals(assetId, deletePartnerAssetAccessItem.assetId) &&
        Objects.equals(partnerId, deletePartnerAssetAccessItem.partnerId) &&
        Objects.equals(partnerType, deletePartnerAssetAccessItem.partnerType);
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
