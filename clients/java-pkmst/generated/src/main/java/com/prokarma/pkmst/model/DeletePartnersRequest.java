package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DeletePartnersRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersRequest   {
  @JsonProperty("partner_ids")
  
  private List<String> partnerIds = new ArrayList<>();

  @JsonProperty("partner_type")
  private String partnerType;

  public DeletePartnersRequest partnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public DeletePartnersRequest addPartnerIdsItem(String partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

  /**
   * Get partnerIds
   * @return partnerIds
   */
  @ApiModelProperty(required = true, value = "")
  public List<String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeletePartnersRequest partnerType(String partnerType) {
    this.partnerType = partnerType;
    return this;
  }

  /**
   * Get partnerType
   * @return partnerType
   */
  @ApiModelProperty(value = "")
  public String getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(String partnerType) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

