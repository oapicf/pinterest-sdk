package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.NonNullableCatalogsCurrency;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A currency filter. This filter cannot be negated
 **/
@ApiModel(description="A currency filter. This filter cannot be negated")

public class CatalogsProductGroupCurrencyCriteria  {
  
  @ApiModelProperty(required = true, value = "")
  private NonNullableCatalogsCurrency values;

  @ApiModelProperty(value = "")
  private Boolean negated = false;
 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public NonNullableCatalogsCurrency getValues() {
    return values;
  }

  public void setValues(NonNullableCatalogsCurrency values) {
    this.values = values;
  }

  public CatalogsProductGroupCurrencyCriteria values(NonNullableCatalogsCurrency values) {
    this.values = values;
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

  public CatalogsProductGroupCurrencyCriteria negated(Boolean negated) {
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
    CatalogsProductGroupCurrencyCriteria catalogsProductGroupCurrencyCriteria = (CatalogsProductGroupCurrencyCriteria) o;
    return Objects.equals(this.values, catalogsProductGroupCurrencyCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupCurrencyCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupCurrencyCriteria {\n");
    
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

