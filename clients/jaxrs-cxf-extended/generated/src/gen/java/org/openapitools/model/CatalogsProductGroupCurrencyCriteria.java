package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.NonNullableCatalogsCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A currency filter. This filter cannot be negated
 */
@ApiModel(description="A currency filter. This filter cannot be negated")

public class CatalogsProductGroupCurrencyCriteria  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableCatalogsCurrency values;

  @ApiModelProperty(value = "")
  private Boolean negated = false;
 /**
  * Get values
  * @return values
  */
  @JsonProperty("values")
  @NotNull
  public NonNullableCatalogsCurrency getValues() {
    return values;
  }

  /**
   * Sets the <code>values</code> property.
   */
 public void setValues(NonNullableCatalogsCurrency values) {
    this.values = values;
  }

  /**
   * Sets the <code>values</code> property.
   */
  public CatalogsProductGroupCurrencyCriteria values(NonNullableCatalogsCurrency values) {
    this.values = values;
    return this;
  }

 /**
  * Get negated
  * @return negated
  */
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  /**
   * Sets the <code>negated</code> property.
   */
 public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   * Sets the <code>negated</code> property.
   */
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

