package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.GenderDemographics;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */
public class ProductCategoriesDemographic implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Age demographic distribution
   */
  @JsonProperty("age")
  private Map<String, BigDecimal> age = new HashMap<>();

  @JsonProperty("gender")
  private GenderDemographics gender;

  /**
   * Age demographic distribution
   * @return age
   */
  public Map<String, BigDecimal> getAge() {
    return age;
  }

  public void setAge(Map<String, BigDecimal> age) {
    this.age = age;
  }

  /**
   * 
   * @return gender
   */
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
