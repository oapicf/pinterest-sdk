package apimodels;

import apimodels.GenderDemographics;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductCategoriesDemographic   {
  @JsonProperty("age")
  @NotNull
@Valid

  private Map<String, BigDecimal> age = new HashMap<>();

  @JsonProperty("gender")
  @NotNull
@Valid

  private GenderDemographics gender;

  public ProductCategoriesDemographic age(Map<String, BigDecimal> age) {
    this.age = age;
    return this;
  }

  public ProductCategoriesDemographic putAgeItem(String key, BigDecimal ageItem) {
    if (this.age == null) {
      this.age = new HashMap<>();
    }
    this.age.put(key, ageItem);
    return this;
  }

   /**
   * Age demographic distribution
   * @return age
  **/
  public Map<String, BigDecimal> getAge() {
    return age;
  }

  public void setAge(Map<String, BigDecimal> age) {
    this.age = age;
  }

  public ProductCategoriesDemographic gender(GenderDemographics gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

