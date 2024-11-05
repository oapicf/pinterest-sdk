package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An object with a list of partners that were deleted.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePartnersResponse   {
  
  private List<String> deletedPartners = new ArrayList<>();

  public DeletePartnersResponse () {

  }

  public DeletePartnersResponse (List<String> deletedPartners) {
    this.deletedPartners = deletedPartners;
  }

    
  @JsonProperty("deleted_partners")
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
    return Objects.equals(deletedPartners, deletePartnersResponse.deletedPartners);
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
