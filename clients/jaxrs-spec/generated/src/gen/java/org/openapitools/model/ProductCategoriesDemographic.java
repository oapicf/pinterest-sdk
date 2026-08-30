package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.GenderDemographics;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 **/
@ApiModel(description = "Age and gender distribution who engaged with this product category in the past 3 months")
@JsonTypeName("ProductCategoriesDemographic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductCategoriesDemographic   {
  private @Valid Map<String, BigDecimal> age = new HashMap<>();
  private GenderDemographics gender;

  public ProductCategoriesDemographic() {
  }

  @JsonCreator
  public ProductCategoriesDemographic(
    @JsonProperty(required = true, value = "age") Map<String, BigDecimal> age,
    @JsonProperty(required = true, value = "gender") GenderDemographics gender
  ) {
    this.age = age;
    this.gender = gender;
  }

  /**
   * Age demographic distribution
   **/
  public ProductCategoriesDemographic age(Map<String, BigDecimal> age) {
    this.age = age;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Age demographic distribution")
  @JsonProperty(required = true, value = "age")
  @NotNull @Valid public Map<String, BigDecimal> getAge() {
    return age;
  }

  @JsonProperty(required = true, value = "age")
  public void setAge(Map<String, BigDecimal> age) {
    this.age = age;
  }

  public ProductCategoriesDemographic putAgeItem(String key, BigDecimal ageItem) {
    if (this.age == null) {
      this.age = new HashMap<>();
    }

    this.age.put(key, ageItem);
    return this;
  }

  public ProductCategoriesDemographic removeAgeItem(String key) {
    if (this.age != null) {
      this.age.remove(key);
    }

    return this;
  }
  /**
   **/
  public ProductCategoriesDemographic gender(GenderDemographics gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "gender")
  @NotNull @Valid public GenderDemographics getGender() {
    return gender;
  }

  @JsonProperty(required = true, value = "gender")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
