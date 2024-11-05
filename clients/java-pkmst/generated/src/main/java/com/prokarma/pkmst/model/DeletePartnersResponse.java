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
 * An object with a list of partners that were deleted.
 */
@ApiModel(description = "An object with a list of partners that were deleted.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersResponse   {
  @JsonProperty("deleted_partners")
  
  private List<String> deletedPartners = null;

  public DeletePartnersResponse deletedPartners(List<String> deletedPartners) {
    this.deletedPartners = deletedPartners;
    return this;
  }

  public DeletePartnersResponse addDeletedPartnersItem(String deletedPartnersItem) {
    if (this.deletedPartners == null) {
      this.deletedPartners = new ArrayList<>();
    }
    this.deletedPartners.add(deletedPartnersItem);
    return this;
  }

  /**
   * List of partners whose business partnership have been terminated.
   * @return deletedPartners
   */
  @ApiModelProperty(example = "[\"809944451643622187\",\"383791336903426391\"]", value = "List of partners whose business partnership have been terminated.")
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

