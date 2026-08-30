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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConditionFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConditionFilter   {
  private CatalogsProductGroupMultipleStringCriteria CONDITION;

  public ConditionFilter() {
  }

  @JsonCreator
  public ConditionFilter(
    @JsonProperty(required = true, value = "CONDITION") CatalogsProductGroupMultipleStringCriteria CONDITION
  ) {
    this.CONDITION = CONDITION;
  }

  /**
   **/
  public ConditionFilter CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "CONDITION")
  @NotNull @Valid public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  @JsonProperty(required = true, value = "CONDITION")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
