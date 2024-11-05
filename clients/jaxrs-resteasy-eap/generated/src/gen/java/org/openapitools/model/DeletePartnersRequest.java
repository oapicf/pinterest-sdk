package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersRequest   {
  
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();
  private String partnerType;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partner_ids")
  @NotNull
 @Size(min=1,max=50)  public List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> getPartnerIds() {
    return partnerIds;
  }
  public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  /**
   **/
  
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

