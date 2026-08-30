package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullablePartnerType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteBusinessPartnersDelete  {
  
 /**
  * A list of partner ids to be deleted
  */
  @ApiModelProperty(required = true, value = "A list of partner ids to be deleted")
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private NullablePartnerType partnerType;
 /**
  * A list of partner ids to be deleted
  * @return partnerIds
  */
  @JsonProperty("partner_ids")
  @NotNull
 @Size(min=1,max=50)  public List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> getPartnerIds() {
    return partnerIds;
  }

  /**
   * Sets the <code>partnerIds</code> property.
   */
 public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  /**
   * Sets the <code>partnerIds</code> property.
   */
  public DeleteBusinessPartnersDelete partnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  /**
   * Adds a new item to the <code>partnerIds</code> list.
   */
  public DeleteBusinessPartnersDelete addPartnerIdsItem(String partnerIdsItem) {
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

 /**
  * Get partnerType
  * @return partnerType
  */
  @JsonProperty("partner_type")
  public NullablePartnerType getPartnerType() {
    return partnerType;
  }

  /**
   * Sets the <code>partnerType</code> property.
   */
 public void setPartnerType(NullablePartnerType partnerType) {
    this.partnerType = partnerType;
  }

  /**
   * Sets the <code>partnerType</code> property.
   */
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

