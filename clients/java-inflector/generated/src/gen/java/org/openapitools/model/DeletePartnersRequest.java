package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersRequest   {
  @JsonProperty("partner_ids")
  private List<String> partnerIds = new ArrayList<>();

  @JsonProperty("partner_type")
  private String partnerType;

  /**
   **/
  public DeletePartnersRequest partnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partner_ids")
  public List<String> getPartnerIds() {
    return partnerIds;
  }
  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  /**
   **/
  public DeletePartnersRequest partnerType(String partnerType) {
    this.partnerType = partnerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_type")
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
    return Objects.equals(partnerIds, deletePartnersRequest.partnerIds) &&
        Objects.equals(partnerType, deletePartnersRequest.partnerType);
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

