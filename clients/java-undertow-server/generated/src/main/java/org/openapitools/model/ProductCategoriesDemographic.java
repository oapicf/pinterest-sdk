/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.GenderDemographics;



/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */

@ApiModel(description = "Age and gender distribution who engaged with this product category in the past 3 months")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductCategoriesDemographic   {
  
  private Map<String, BigDecimal> age = new HashMap<>();
  private GenderDemographics gender;

  /**
   * Age demographic distribution
   */
  public ProductCategoriesDemographic age(Map<String, BigDecimal> age) {
    this.age = age;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Age demographic distribution")
  @JsonProperty("age")
  public Map<String, BigDecimal> getAge() {
    return age;
  }
  public void setAge(Map<String, BigDecimal> age) {
    this.age = age;
  }

  /**
   */
  public ProductCategoriesDemographic gender(GenderDemographics gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("gender")
  public GenderDemographics getGender() {
    return gender;
  }
  public void setGender(GenderDemographics gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCategoriesDemographic productCategoriesDemographic = (ProductCategoriesDemographic) o;
    return Objects.equals(age, productCategoriesDemographic.age) &&
        Objects.equals(gender, productCategoriesDemographic.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCategoriesDemographic {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

