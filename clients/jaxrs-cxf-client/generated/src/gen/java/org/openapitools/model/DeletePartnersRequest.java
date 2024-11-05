package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePartnersRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private List<String> partnerIds = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String partnerType;
 /**
   * Get partnerIds
   * @return partnerIds
  **/
  @JsonProperty("partner_ids")
  public List<String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeletePartnersRequest partnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public DeletePartnersRequest addPartnerIdsItem(String partnerIdsItem) {
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

 /**
   * Get partnerType
   * @return partnerType
  **/
  @JsonProperty("partner_type")
  public String getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(String partnerType) {
    this.partnerType = partnerType;
  }

  public DeletePartnersRequest partnerType(String partnerType) {
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
    DeletePartnersRequest deletePartnersRequest = (DeletePartnersRequest) o;
    return Objects.equals(this.partnerIds, deletePartnersRequest.partnerIds) &&
        Objects.equals(this.partnerType, deletePartnersRequest.partnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerIds, partnerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnersRequest {\n");
    
    sb.append("    partnerIds: ").append(toIndentedString(partnerIds)).append("\n");
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

