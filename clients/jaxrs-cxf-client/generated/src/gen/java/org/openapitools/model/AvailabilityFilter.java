package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AvailabilityFilter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;
 /**
   * Get AVAILABILITY
   * @return AVAILABILITY
  **/
  @JsonProperty("AVAILABILITY")
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }

  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

  public AvailabilityFilter AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

