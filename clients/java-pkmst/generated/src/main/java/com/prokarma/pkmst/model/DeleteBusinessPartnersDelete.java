package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.NullablePartnerType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeleteBusinessPartnersDelete
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessPartnersDelete   {
  @JsonProperty("partner_ids")
  
  private List<String> partnerIds = new ArrayList<>();

  @JsonProperty("partner_type")
  private NullablePartnerType partnerType;

  public DeleteBusinessPartnersDelete partnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public DeleteBusinessPartnersDelete addPartnerIdsItem(String partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

  /**
   * A list of partner ids to be deleted
   * @return partnerIds
   */
  @ApiModelProperty(required = true, value = "A list of partner ids to be deleted")
  public List<String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeleteBusinessPartnersDelete partnerType(NullablePartnerType partnerType) {
    this.partnerType = partnerType;
    return this;
  }

  /**
   * Get partnerType
   * @return partnerType
   */
  @ApiModelProperty(value = "")
  public NullablePartnerType getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(NullablePartnerType partnerType) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

