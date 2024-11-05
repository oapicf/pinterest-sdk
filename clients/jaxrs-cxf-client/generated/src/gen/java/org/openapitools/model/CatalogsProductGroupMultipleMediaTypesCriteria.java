package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MediaType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupMultipleMediaTypesCriteria  {
  
  @ApiModelProperty(required = true, value = "")
  private List<MediaType> values = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Boolean negated = false;
 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public List<MediaType> getValues() {
    return values;
  }

  public void setValues(List<MediaType> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultipleMediaTypesCriteria values(List<MediaType> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleMediaTypesCriteria addValuesItem(MediaType valuesItem) {
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

  public CatalogsProductGroupMultipleMediaTypesCriteria negated(Boolean negated) {
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
    CatalogsProductGroupMultipleMediaTypesCriteria catalogsProductGroupMultipleMediaTypesCriteria = (CatalogsProductGroupMultipleMediaTypesCriteria) o;
    return Objects.equals(this.values, catalogsProductGroupMultipleMediaTypesCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupMultipleMediaTypesCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleMediaTypesCriteria {\n");
    
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

