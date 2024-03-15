package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AvailabilityFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityFilter   {
  private @Valid CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  /**
   **/
  public AvailabilityFilter AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("AVAILABILITY")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }

  @JsonProperty("AVAILABILITY")
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
    return Objects.equals(this.AVAILABILITY, availabilityFilter.AVAILABILITY);
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

