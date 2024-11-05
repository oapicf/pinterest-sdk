package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePartnersRequest   {
  
  private List<String> partnerIds = new ArrayList<>();
  private String partnerType;

  public DeletePartnersRequest () {

  }

  public DeletePartnersRequest (List<String> partnerIds, String partnerType) {
    this.partnerIds = partnerIds;
    this.partnerType = partnerType;
  }

    
  @JsonProperty("partner_ids")
  public List<String> getPartnerIds() {
    return partnerIds;
  }
  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

    
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
