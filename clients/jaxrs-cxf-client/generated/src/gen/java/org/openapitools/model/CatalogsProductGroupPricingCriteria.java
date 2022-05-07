package org.openapitools.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsProductGroupPricingCriteria  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean inclusion;

  @ApiModelProperty(required = true, value = "")
  private BigDecimal values;

  @ApiModelProperty(required = true, value = "")
  private Boolean negated;
 /**
   * Get inclusion
   * @return inclusion
  **/
  @JsonProperty("inclusion")
  public Boolean getInclusion() {
    return inclusion;
  }

  public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

  public CatalogsProductGroupPricingCriteria inclusion(Boolean inclusion) {
    this.inclusion = inclusion;
    return this;
  }

 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public BigDecimal getValues() {
    return values;
  }

  public void setValues(BigDecimal values) {
    this.values = values;
  }

  public CatalogsProductGroupPricingCriteria values(BigDecimal values) {
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

  public CatalogsProductGroupPricingCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
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

