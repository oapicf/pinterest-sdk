package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupPricingCriteria   {
  
  private Boolean inclusion = true;
  private Boolean negated;
  private BigDecimal values;

  public CatalogsProductGroupPricingCriteria () {

  }

  public CatalogsProductGroupPricingCriteria (Boolean inclusion, Boolean negated, BigDecimal values) {
    this.inclusion = inclusion;
    this.negated = negated;
    this.values = values;
  }

    
  @JsonProperty("inclusion")
  public Boolean getInclusion() {
    return inclusion;
  }
  public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

    
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

    
  @JsonProperty("values")
  public BigDecimal getValues() {
    return values;
  }
  public void setValues(BigDecimal values) {
    this.values = values;
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
    return Objects.equals(inclusion, catalogsProductGroupPricingCriteria.inclusion) &&
        Objects.equals(negated, catalogsProductGroupPricingCriteria.negated) &&
        Objects.equals(values, catalogsProductGroupPricingCriteria.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusion, negated, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPricingCriteria {\n");
    
    sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
