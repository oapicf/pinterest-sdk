package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupPricingCriteria   {
  @JsonProperty("inclusion")
  private Boolean inclusion = true;

  @JsonProperty("values")
  private BigDecimal values;

  @JsonProperty("negated")
  private Boolean negated = false;

  /**
   **/
  public CatalogsProductGroupPricingCriteria inclusion(Boolean inclusion) {
    this.inclusion = inclusion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("inclusion")
  public Boolean getInclusion() {
    return inclusion;
  }
  public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

  /**
   * minimum: 0
   **/
  public CatalogsProductGroupPricingCriteria values(BigDecimal values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  public BigDecimal getValues() {
    return values;
  }
  public void setValues(BigDecimal values) {
    this.values = values;
  }

  /**
   **/
  public CatalogsProductGroupPricingCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
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
        Objects.equals(values, catalogsProductGroupPricingCriteria.values) &&
        Objects.equals(negated, catalogsProductGroupPricingCriteria.negated);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

