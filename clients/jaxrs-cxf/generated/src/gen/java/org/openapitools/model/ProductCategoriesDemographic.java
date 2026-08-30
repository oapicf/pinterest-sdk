package org.openapitools.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.GenderDemographics;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */
@ApiModel(description="Age and gender distribution who engaged with this product category in the past 3 months")

public class ProductCategoriesDemographic  {
  
 /**
  * Age demographic distribution
  */
  @ApiModelProperty(required = true, value = "Age demographic distribution")

  @Valid

  private Map<String, BigDecimal> age = new HashMap<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private GenderDemographics gender;
 /**
   * Age demographic distribution
   * @return age
  **/
  @JsonProperty("age")
  @NotNull
  public Map<String, BigDecimal> getAge() {
    return age;
  }

  public void setAge(Map<String, BigDecimal> age) {
    this.age = age;
  }

  public ProductCategoriesDemographic age(Map<String, BigDecimal> age) {
    this.age = age;
    return this;
  }

  public ProductCategoriesDemographic putAgeItem(String key, BigDecimal ageItem) {
    this.age.put(key, ageItem);
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  @NotNull
  public GenderDemographics getGender() {
    return gender;
  }

  public void setGender(GenderDemographics gender) {
    this.gender = gender;
  }

  public ProductCategoriesDemographic gender(GenderDemographics gender) {
    this.gender = gender;
    return this;
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
    return Objects.equals(this.age, productCategoriesDemographic.age) &&
        Objects.equals(this.gender, productCategoriesDemographic.gender);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

