package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupPricingCriteria  {
  
  @ApiModelProperty(value = "")
  private Boolean inclusion = true;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal values;

  @ApiModelProperty(value = "")
  private Boolean negated = false;
 /**
  * Get inclusion
  * @return inclusion
  */
  @JsonProperty("inclusion")
  public Boolean getInclusion() {
    return inclusion;
  }

  /**
   * Sets the <code>inclusion</code> property.
   */
 public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

  /**
   * Sets the <code>inclusion</code> property.
   */
  public CatalogsProductGroupPricingCriteria inclusion(Boolean inclusion) {
    this.inclusion = inclusion;
    return this;
  }

 /**
  * Get values
  * minimum: 0
  * @return values
  */
  @JsonProperty("values")
  @NotNull
 @DecimalMin("0")  public BigDecimal getValues() {
    return values;
  }

  /**
   * Sets the <code>values</code> property.
   */
 public void setValues(BigDecimal values) {
    this.values = values;
  }

  /**
   * Sets the <code>values</code> property.
   */
  public CatalogsProductGroupPricingCriteria values(BigDecimal values) {
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
  public CatalogsProductGroupPricingCriteria negated(Boolean negated) {
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
    CatalogsProductGroupPricingCriteria catalogsProductGroupPricingCriteria = (CatalogsProductGroupPricingCriteria) o;
    return Objects.equals(this.inclusion, catalogsProductGroupPricingCriteria.inclusion) &&
        Objects.equals(this.values, catalogsProductGroupPricingCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupPricingCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusion, values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPricingCriteria {\n");
    
    sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
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

