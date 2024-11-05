package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DeletePartnersRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersRequest   {
  private @Valid List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();
  private String partnerType;

  /**
   **/
  public DeletePartnersRequest partnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partner_ids")
  @NotNull  @Size(min=1,max=50)public List< @Pattern(regexp="^\\d+$") @Size(max=22)String> getPartnerIds() {
    return partnerIds;
  }

  @JsonProperty("partner_ids")
  public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeletePartnersRequest addPartnerIdsItem(String partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }

    this.partnerIds.add(partnerIdsItem);
    return this;
  }

  public DeletePartnersRequest removePartnerIdsItem(String partnerIdsItem) {
    if (partnerIdsItem != null && this.partnerIds != null) {
      this.partnerIds.remove(partnerIdsItem);
    }

    return this;
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

  @JsonProperty("partner_type")
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

