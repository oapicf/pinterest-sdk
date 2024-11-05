package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object with a list of partners that were deleted.
 */
@ApiModel(description="An object with a list of partners that were deleted.")

public class DeletePartnersResponse  {
  
 /**
  * List of partners whose business partnership have been terminated.
  */
  @ApiModelProperty(example = "[\"809944451643622187\",\"383791336903426391\"]", value = "List of partners whose business partnership have been terminated.")
  private List<@Pattern(regexp = "^\\d+$")String> deletedPartners = new ArrayList<>();
 /**
  * List of partners whose business partnership have been terminated.
  * @return deletedPartners
  */
  @JsonProperty("deleted_partners")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedPartners() {
    return deletedPartners;
  }

  /**
   * Sets the <code>deletedPartners</code> property.
   */
 public void setDeletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
  }

  /**
   * Sets the <code>deletedPartners</code> property.
   */
  public DeletePartnersResponse deletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
    return this;
  }

  /**
   * Adds a new item to the <code>deletedPartners</code> list.
   */
  public DeletePartnersResponse addDeletedPartnersItem(String deletedPartnersItem) {
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
    DeletePartnersResponse deletePartnersResponse = (DeletePartnersResponse) o;
    return Objects.equals(this.deletedPartners, deletePartnersResponse.deletedPartners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPartners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnersResponse {\n");
    
    sb.append("    deletedPartners: ").append(toIndentedString(deletedPartners)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

