package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Country;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupMultipleCountriesCriteria  {
  
  @ApiModelProperty(required = true, value = "")
  private List<Country> values = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Boolean negated = false;
 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public List<Country> getValues() {
    return values;
  }

  public void setValues(List<Country> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultipleCountriesCriteria values(List<Country> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleCountriesCriteria addValuesItem(Country valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

 /**
   * Get negated
   * @return negated
  **/
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public CatalogsProductGroupMultipleCountriesCriteria negated(Boolean negated) {
    this.negated = negated;
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
    CatalogsProductGroupMultipleCountriesCriteria catalogsProductGroupMultipleCountriesCriteria = (CatalogsProductGroupMultipleCountriesCriteria) o;
    return Objects.equals(this.values, catalogsProductGroupMultipleCountriesCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupMultipleCountriesCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleCountriesCriteria {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
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

