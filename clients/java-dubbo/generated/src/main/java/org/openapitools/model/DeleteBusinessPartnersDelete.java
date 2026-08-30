package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullablePartnerType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DeleteBusinessPartnersDelete implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of partner ids to be deleted
   */
  @JsonProperty("partner_ids")
  private List<String> partnerIds = new ArrayList<>();

  @JsonProperty("partner_type")
  private NullablePartnerType partnerType;

  /**
   * A list of partner ids to be deleted
   * @return partnerIds
   */
  public List<String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  /**
   * 
   * @return partnerType
   */
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
