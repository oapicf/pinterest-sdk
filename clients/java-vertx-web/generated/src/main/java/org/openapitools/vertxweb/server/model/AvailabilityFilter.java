package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupMultipleStringCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvailabilityFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  public AvailabilityFilter () {

  }

  public AvailabilityFilter (CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

    
  @JsonProperty("AVAILABILITY")
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }
  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityFilter availabilityFilter = (AvailabilityFilter) o;
    return Objects.equals(AVAILABILITY, availabilityFilter.AVAILABILITY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AVAILABILITY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityFilter {\n");
    
    sb.append("    AVAILABILITY: ").append(toIndentedString(AVAILABILITY)).append("\n");
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
