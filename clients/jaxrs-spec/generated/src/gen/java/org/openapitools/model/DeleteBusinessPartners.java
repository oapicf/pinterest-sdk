package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("DeleteBusinessPartners")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-03T06:16:03.582968295Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class DeleteBusinessPartners   {
  private List<@Pattern(regexp = "^\\d+$")String> deletedPartners = new ArrayList<>();

  public DeleteBusinessPartners() {
  }

  /**
   **/
  public DeleteBusinessPartners deletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted_partners")
  public List< @Pattern(regexp="^\\d+$")String> getDeletedPartners() {
    return deletedPartners;
  }

  @JsonProperty("deleted_partners")
  public void setDeletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
  }

  public DeleteBusinessPartners addDeletedPartnersItem(String deletedPartnersItem) {
    if (this.deletedPartners == null) {
      this.deletedPartners = new ArrayList<>();
    }

    this.deletedPartners.add(deletedPartnersItem);
    return this;
  }

  public DeleteBusinessPartners removeDeletedPartnersItem(String deletedPartnersItem) {
    if (deletedPartnersItem != null && this.deletedPartners != null) {
      this.deletedPartners.remove(deletedPartnersItem);
    }

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
    DeleteBusinessPartners deleteBusinessPartners = (DeleteBusinessPartners) o;
    return Objects.equals(this.deletedPartners, deleteBusinessPartners.deletedPartners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPartners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBusinessPartners {\n");
    
    sb.append("    deletedPartners: ").append(toIndentedString(deletedPartners)).append("\n");
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
