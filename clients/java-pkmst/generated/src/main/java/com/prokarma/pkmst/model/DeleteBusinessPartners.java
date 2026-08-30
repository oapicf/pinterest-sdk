package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeleteBusinessPartners
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessPartners   {
  @JsonProperty("deleted_partners")
  
  private List<String> deletedPartners = null;

  public DeleteBusinessPartners deletedPartners(List<String> deletedPartners) {
    this.deletedPartners = deletedPartners;
    return this;
  }

  public DeleteBusinessPartners addDeletedPartnersItem(String deletedPartnersItem) {
    if (this.deletedPartners == null) {
      this.deletedPartners = new ArrayList<>();
    }
    this.deletedPartners.add(deletedPartnersItem);
    return this;
  }

  /**
   * Get deletedPartners
   * @return deletedPartners
   */
  @ApiModelProperty(readOnly = true, value = "")
  public List<String> getDeletedPartners() {
    return deletedPartners;
  }

  public void setDeletedPartners(List<String> deletedPartners) {
    this.deletedPartners = deletedPartners;
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

