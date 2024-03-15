/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  /**
   */
  public AvailabilityFilter AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

