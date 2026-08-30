package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullablePartnerType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteBusinessPartnersDelete  {
  
 /**
  * A list of partner ids to be deleted
  */
  @ApiModelProperty(required = true, value = "A list of partner ids to be deleted")

  private List<String> partnerIds = new ArrayList<>();

  @ApiModelProperty(value = "")

  private NullablePartnerType partnerType;
 /**
   * A list of partner ids to be deleted
   * @return partnerIds
  **/
  @JsonProperty("partner_ids")
  public List<String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeleteBusinessPartnersDelete partnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public DeleteBusinessPartnersDelete addPartnerIdsItem(String partnerIdsItem) {
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

 /**
   * Get partnerType
   * @return partnerType
  **/
  @JsonProperty("partner_type")
  public NullablePartnerType getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(NullablePartnerType partnerType) {
    this.partnerType = partnerType;
  }

  public DeleteBusinessPartnersDelete partnerType(NullablePartnerType partnerType) {
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
    DeleteBusinessPartnersDelete deleteBusinessPartnersDelete = (DeleteBusinessPartnersDelete) o;
    return Objects.equals(this.partnerIds, deleteBusinessPartnersDelete.partnerIds) &&
        Objects.equals(this.partnerType, deleteBusinessPartnersDelete.partnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerIds, partnerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBusinessPartnersDelete {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

