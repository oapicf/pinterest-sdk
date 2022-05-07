package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConditionFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CONDITION;
 /**
   * Get CONDITION
   * @return CONDITION
  **/
  @JsonProperty("CONDITION")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }

  public ConditionFilter CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionFilter {\n");
    
    sb.append("    CONDITION: ").append(toIndentedString(CONDITION)).append("\n");
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

