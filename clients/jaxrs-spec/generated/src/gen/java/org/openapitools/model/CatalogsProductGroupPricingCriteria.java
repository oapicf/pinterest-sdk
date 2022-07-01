package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CatalogsProductGroupPricingCriteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-07-01T12:01:13.464712Z[Etc/UTC]")public class CatalogsProductGroupPricingCriteria   {
  
  private @Valid Boolean inclusion;
  private @Valid BigDecimal values;
  private @Valid Boolean negated;

  /**
   **/
  public CatalogsProductGroupPricingCriteria inclusion(Boolean inclusion) {
    this.inclusion = inclusion;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("inclusion")
  @NotNull
  public Boolean getInclusion() {
    return inclusion;
  }

  @JsonProperty("inclusion")
  public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

/**
   **/
  public CatalogsProductGroupPricingCriteria values(BigDecimal values) {
    this.values = values;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  @NotNull
  public BigDecimal getValues() {
    return values;
  }

  @JsonProperty("values")
  public void setValues(BigDecimal values) {
    this.values = values;
  }

/**
   **/
  public CatalogsProductGroupPricingCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("negated")
  @NotNull
  public Boolean getNegated() {
    return negated;
  }

  @JsonProperty("negated")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

