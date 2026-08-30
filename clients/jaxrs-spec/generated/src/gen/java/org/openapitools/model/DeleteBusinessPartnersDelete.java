package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullablePartnerType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("DeleteBusinessPartnersDelete")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessPartnersDelete   {
  private @Valid List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();
  private NullablePartnerType partnerType;

  public DeleteBusinessPartnersDelete() {
  }

  @JsonCreator
  public DeleteBusinessPartnersDelete(
    @JsonProperty(required = true, value = "partner_ids") List< @Pattern(regexp="^\\d+$") @Size(max=22)String> partnerIds
  ) {
    this.partnerIds = partnerIds;
  }

  /**
   * A list of partner ids to be deleted
   **/
  public DeleteBusinessPartnersDelete partnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of partner ids to be deleted")
  @JsonProperty(required = true, value = "partner_ids")
  @NotNull  @Size(min=1,max=50)public List< @Pattern(regexp="^\\d+$") @Size(max=22)String> getPartnerIds() {
    return partnerIds;
  }

  @JsonProperty(required = true, value = "partner_ids")
  public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeleteBusinessPartnersDelete addPartnerIdsItem(String partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }

    this.partnerIds.add(partnerIdsItem);
    return this;
  }

  public DeleteBusinessPartnersDelete removePartnerIdsItem(String partnerIdsItem) {
    if (partnerIdsItem != null && this.partnerIds != null) {
      this.partnerIds.remove(partnerIdsItem);
    }

    return this;
  }
  /**
   **/
  public DeleteBusinessPartnersDelete partnerType(NullablePartnerType partnerType) {
    this.partnerType = partnerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_type")
  public NullablePartnerType getPartnerType() {
    return partnerType;
  }

  @JsonProperty("partner_type")
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
