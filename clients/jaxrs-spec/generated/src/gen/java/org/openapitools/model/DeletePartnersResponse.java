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

/**
 * An object with a list of partners that were deleted.
 **/
@ApiModel(description = "An object with a list of partners that were deleted.")
@JsonTypeName("DeletePartnersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersResponse   {
  private @Valid List<@Pattern(regexp = "^\\d+$")String> deletedPartners = new ArrayList<>();

  /**
   * List of partners whose business partnership have been terminated.
   **/
  public DeletePartnersResponse deletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
    return this;
  }

  
  @ApiModelProperty(example = "[\"809944451643622187\",\"383791336903426391\"]", value = "List of partners whose business partnership have been terminated.")
  @JsonProperty("deleted_partners")
  public List< @Pattern(regexp="^\\d+$")String> getDeletedPartners() {
    return deletedPartners;
  }

  @JsonProperty("deleted_partners")
  public void setDeletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
    this.deletedPartners = deletedPartners;
  }

  public DeletePartnersResponse addDeletedPartnersItem(String deletedPartnersItem) {
    if (this.deletedPartners == null) {
      this.deletedPartners = new ArrayList<>();
    }

    this.deletedPartners.add(deletedPartnersItem);
    return this;
  }

  public DeletePartnersResponse removeDeletedPartnersItem(String deletedPartnersItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

