package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class DeleteBusinessPartners   {
  
  private List<@Pattern(regexp = "^\\d+$")String> deletedPartners = new ArrayList<>();

  /**
   **/
  public DeleteBusinessPartners deletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted_partners")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedPartners() {
    return deletedPartners;
  }
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

