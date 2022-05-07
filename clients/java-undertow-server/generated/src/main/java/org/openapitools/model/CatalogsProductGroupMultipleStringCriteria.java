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
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-07T06:40:09.212272Z[Etc/UTC]")
public class CatalogsProductGroupMultipleStringCriteria   {
  
  private List<String> values = new ArrayList<String>();
  private Boolean negated;

  /**
   */
  public CatalogsProductGroupMultipleStringCriteria values(List<String> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   */
  public CatalogsProductGroupMultipleStringCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupMultipleStringCriteria catalogsProductGroupMultipleStringCriteria = (CatalogsProductGroupMultipleStringCriteria) o;
    return Objects.equals(values, catalogsProductGroupMultipleStringCriteria.values) &&
        Objects.equals(negated, catalogsProductGroupMultipleStringCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleStringCriteria {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
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

