/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ConditionFilter
 */
@JsonPropertyOrder({
  ConditionFilter.JSON_PROPERTY_C_O_N_D_I_T_I_O_N
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConditionFilter   {
  public static final String JSON_PROPERTY_C_O_N_D_I_T_I_O_N = "CONDITION";
  @JsonProperty(JSON_PROPERTY_C_O_N_D_I_T_I_O_N)
  private CatalogsProductGroupMultipleStringCriteria CONDITION;

  public ConditionFilter CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  /**
   * Get CONDITION
   * @return CONDITION
   **/
  @JsonProperty(value = "CONDITION")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionFilter conditionFilter = (ConditionFilter) o;
    return Objects.equals(this.CONDITION, conditionFilter.CONDITION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CONDITION);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

