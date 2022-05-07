/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-07T06:40:09.212272Z[Etc/UTC]")
public class ConditionFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria CONDITION;

  /**
   */
  public ConditionFilter CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CONDITION")
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
    return Objects.equals(CONDITION, conditionFilter.CONDITION);
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

